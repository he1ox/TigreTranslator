import utilidades.TextToSpeech;
import utilidades.TigreAI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class TranslatorGUI {
    private static boolean isSpanishSelected = false;
    private static boolean isEnglishSelected = false;
    private static Map<String,String> allTokens;
    private static Map<String, String> allErrors;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Translator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(new GridBagLayout());

        JLabel inputLabel = new JLabel("Entrada:");
        JTextArea inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JLabel outputLabel = new JLabel("Salida:");
        JTextArea outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setLineWrap(true);
        outputTextArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.PAGE_AXIS));
        topPanel.add(inputLabel);
        topPanel.add(new JScrollPane(inputTextArea));
        topPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        topPanel.add(outputLabel);
        topPanel.add(new JScrollPane(outputTextArea));

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.PAGE_AXIS));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton translateButton = new JButton("Traducir");
        JButton speakButton = new JButton("Rec. por Voz");
        JButton browserButton = new JButton("Buscador");
        JButton reproducirAudioBtn = new JButton("Escuchar");
        JButton explicacionBtn = new JButton("Explicacion");

        buttonPanel.add(translateButton);
        buttonPanel.add(speakButton);
        buttonPanel.add(browserButton);
        buttonPanel.add(reproducirAudioBtn);
        buttonPanel.add(explicacionBtn);

        JToggleButton languageSpanish = new JToggleButton("Español", false);
        JToggleButton languageEnglish = new JToggleButton("English", false);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(languageSpanish);
        buttonGroup.add(languageEnglish);

        JPanel toggleButtonPanel = new JPanel();
        toggleButtonPanel.setLayout(new FlowLayout());

        toggleButtonPanel.add(languageSpanish);
        toggleButtonPanel.add(languageEnglish);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        southPanel.add(buttonPanel, BorderLayout.NORTH);
        southPanel.add(toggleButtonPanel, BorderLayout.CENTER);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;

        gbc.weighty = 0.5;  // El panel superior recibe 60% del espacio vertical disponible
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(topPanel, gbc);

        gbc.weighty = 0.4;  // El panel del medio recibe 20% del espacio vertical disponible
        gbc.gridy = 1;
        panel.add(middlePanel, gbc);

        gbc.weighty = 0.1;  // El panel inferior recibe 20% del espacio vertical disponible
        gbc.gridy = 2;
        panel.add(southPanel, gbc);

        Translator translator = new Translator();


        explicacionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (isSpanishSelected){
                    boolean fromEnglishToSpanish = false;
                    try {
                        String textoTraducido = translator.translate(inputTextArea.getText(), fromEnglishToSpanish);
                        TextToSpeech.reproducirVoz(TigreAI.explicacion(textoTraducido),"español");
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        reproducirAudioBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String textoExtraido = outputTextArea.getText();

                if (isEnglishSelected){
                    boolean fromEnglishToSpanish = true;
                    try {
                        String textoTraducido = translator.translate(inputTextArea.getText(), fromEnglishToSpanish);
                        TextToSpeech.reproducirVoz(textoTraducido, "español");
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                } else if (isSpanishSelected){
                    boolean fromEnglishToSpanish = false;
                    try {
                        TextToSpeech.reproducirVoz(translator.translate(inputTextArea.getText(), fromEnglishToSpanish), "english");
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }

            }

        });


        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTable tables = new AddTable();
                String inputText = inputTextArea.getText().toLowerCase();
                //De ingles a español, en el panel para traducir tiene que seleccionar el boton al que se va a traducir.
                if(isSpanishSelected){
                    boolean fromEnglishToSpanish = true; // Cambie este valor según el idioma de entrada deseado
                    String translatedText = translator.translate(inputText, fromEnglishToSpanish);
                    outputTextArea.setText(translatedText);

                    // Limpieza del panel antes de agregar las tablas
                    middlePanel.removeAll();
                    middlePanel.revalidate();
                    middlePanel.repaint();

                    // Carga de datos y mostrarlos en la tabla
                    allErrors = translator.allErrors();
                    allTokens = translator.returnTokens();
                    tables.addTableTokens(middlePanel,allTokens,"Token","Information");
                    tables.addTableErrors(middlePanel,allErrors,"Error","Message");;

                }
                // De Español a ingles
                else if (isEnglishSelected){
                    boolean fromEnglishToSpanish = false; // Cambie este valor según el idioma de entrada deseado
                    String translatedText = translator.translate(inputText, fromEnglishToSpanish);
                    outputTextArea.setText(translatedText + "\n" + TigreAI.explicacion(translatedText));

                    // Limpieza del panel antes de agregar las tablas
                    middlePanel.removeAll();
                    middlePanel.revalidate();
                    middlePanel.repaint();

                    // Carga de datos y mostrarlos en la tabla
                    allErrors = translator.allErrors();
                    allTokens = translator.returnTokens();
                    tables.addTableTokens(middlePanel,allTokens,"Token","Information");
                    tables.addTableErrors(middlePanel,allErrors,"Error","Message");
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

        browserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    try {
                        Scanner scanner = new Scanner(selectedFile);
                        StringBuilder sb = new StringBuilder();

                        while (scanner.hasNext()) {
                            sb.append(scanner.nextLine());
                        }

                        String fileContent = sb.toString();
                        // Haz algo con el contenido del archivo aquí
                        inputTextArea.setText(fileContent);
                    } catch (FileNotFoundException ex) {
                        System.out.println("Hay algo malo en el boton"+ ex );
                    }
                }

            }
        });
    }
}





