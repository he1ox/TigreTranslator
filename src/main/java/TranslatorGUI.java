import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class TranslatorGUI {

    private static boolean isSpanishSelected = false;
    private static boolean isEnglishSelected = false;
    private static Map<String,String> allTokens;
    private static Map<String, String> allErrors;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Translator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel inputLabel = new JLabel("Input:");
        inputLabel.setBounds(10, 10, 80, 25);
        panel.add(inputLabel);

        JTextArea inputTextArea = new JTextArea();
        inputTextArea.setBounds(100, 10, 450, 100);
        panel.add(inputTextArea);

        JLabel outputLabel = new JLabel("Output:");
        outputLabel.setBounds(10, 150, 80, 25);
        panel.add(outputLabel);

        JTextArea outputTextArea = new JTextArea();
        outputTextArea.setBounds(100, 150, 450, 100);
        outputTextArea.setEditable(false);
        panel.add(outputTextArea);

        JButton translateButton = new JButton("Translate");
        translateButton.setBounds(250, 270, 100, 25);
        panel.add(translateButton);

        JButton speakButton = new JButton("Speak");
        speakButton.setBounds(400, 270, 100, 25);
        panel.add(speakButton);

        JToggleButton languageSpanish = new JToggleButton("Español", false);
        languageSpanish.setBounds(10, 270, 100, 25);
        panel.add(languageSpanish);

        JToggleButton languageEnglish = new JToggleButton("English", false);
        languageEnglish.setBounds(120, 270, 100, 25);
        panel.add(languageEnglish);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(languageSpanish);
        buttonGroup.add(languageEnglish);

        Translator translator = new Translator();

        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTable tables = new AddTable();
                String inputText = inputTextArea.getText().toLowerCase();
                if(isEnglishSelected){
                    boolean fromEnglishToSpanish = true; // Cambie este valor según el idioma de entrada deseado
                    String translatedText = translator.translate(inputText, fromEnglishToSpanish);
                    outputTextArea.setText(translatedText);

                    // Carga de datos y mostrarlos en la tabla
                    allErrors = translator.allErrors();
                    allTokens = translator.returnTokens();
                    tables.addTableTokens(panel,allTokens,"Token","Information");
                    tables.addTableErrors(panel,allErrors,"Error","Message");

                }
                else if (isSpanishSelected){
                    boolean fromEnglishToSpanish = false; // Cambie este valor según el idioma de entrada deseado
                    String translatedText = translator.translate(inputText, fromEnglishToSpanish);
                    outputTextArea.setText(translatedText);
                    
                    // Carga de datos y mostrarlos en la tabla
                    allErrors = translator.allErrors();
                    allTokens = translator.returnTokens();
                    tables.addTableTokens(panel,allTokens,"Token","Information");
                    tables.addTableErrors(panel,allErrors,"Error","Message");
                }

            }
        });
        speakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startVoiceInput(inputTextArea);
            }

            private static void startVoiceInput(JTextArea inputTextArea) {
                // La implementación del reconocimiento de voz debería estar aquí.
                // Utiliza la API de reconocimiento de voz de Google Cloud o cualquier otra API de tu elección.
            }
        });


        languageSpanish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (languageSpanish.isSelected()) {
                    isSpanishSelected = true;
                    isEnglishSelected = false;
                } else {
                    isSpanishSelected = false;
                }
            }
        });

        languageEnglish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (languageEnglish.isSelected()) {
                    isEnglishSelected = true;
                    isSpanishSelected = false;
                } else {
                    isEnglishSelected = false;
                }
            }
        });


    }
}

