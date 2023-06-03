package utilidades;

import com.google.cloud.texttospeech.v1beta1.*;
import com.google.protobuf.ByteString;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TextToSpeech {
    public static ByteString reproducirVoz(String text, String idioma) throws Exception {
        // Instantiates a client
        try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
            // Set the text input to be synthesized
            SynthesisInput input = SynthesisInput.newBuilder().setText(text).build();


            VoiceSelectionParams voice = null;

            if (idioma.equals("english")){
                // Build the voice request
                 voice =
                    VoiceSelectionParams.newBuilder()
                            .setLanguageCode("en-US") // languageCode = "en_us"
                            .setSsmlGender(SsmlVoiceGender.FEMALE) // ssmlVoiceGender = SsmlVoiceGender.FEMALE
                            .build();
            }else{
                // Build the voice request
                 voice =
                    VoiceSelectionParams.newBuilder()
                            .setLanguageCode("es-US") // languageCode = "en_us"
                            .setSsmlGender(SsmlVoiceGender.MALE) // ssmlVoiceGender = SsmlVoiceGender.MALE
                            .build();
            }


            // Select the type of audio file you want returned
            AudioConfig audioConfig =
                    AudioConfig.newBuilder()
                            .setAudioEncoding(AudioEncoding.LINEAR16) // MP3 audio.
                            .build();

            // Perform the text-to-speech request
            SynthesizeSpeechResponse response =
                    textToSpeechClient.synthesizeSpeech(input, voice, audioConfig);

            // Get the audio contents from the response
            ByteString audioContents = response.getAudioContent();

            // Write the response to the output file.
            try (OutputStream out = new FileOutputStream("audio_generado")) {
                out.write(audioContents.toByteArray());
                System.out.println("Se ha creado un archivo de audio: \"audio_generado\"");
                reproducirAudio("audio_generado");
                return audioContents;
            }
        }
    }

    private static void reproducirAudio(String filename) {
        try {
            File file = new File(filename);
            if (file.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

                Thread.sleep(clip.getMicrosecondLength()/1000);
            } else {
                System.out.println("No se pudo encontrar el archivo: " + filename);
            }
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
