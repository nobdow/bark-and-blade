package Base_Elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;

public class UI {

    JFrame window;
    Container con;
    public JPanel titleNamePanel, startButtonPanel, debugButtonPanel, mainTextPanel, choiceButtonPanel, playerHpPanel, playerCoinsPanel, questLogPanel,inputPanel, inputButtonPanel, switchButtonPanel, mainScreenImagePanel, titleScreenImagePanel, weaponNamePanel,weaponDescriptionPanel;
    public JLabel titleNameLabel, hpLabel, hpNumberLabel, coinLabel, coinCountLabel, questLogLabel, vetQuestTitleLabel, vetQuestObjectiveLabel, blackberriesQuestTitleLabel, blackberriesQuestObjectiveLabel, coatQuestTitleLabel, coatQuestObjectiveLabel, presentQuestTitleLabel, presentQuestObjectiveLabel, mainScreenImageLabel, titleScreenImageLabel;
    public JButton startButton, debugButton, inputButton, choice1, choice2, choice3, choice4, switchButton;
    public JTextArea mainTextArea, weaponNameArea, weaponDescriptionArea;
    public JTextField inputPlayerNameField, inputSpouseNameField, inputDogNameField;
    Font titleFont;
    Font startFont;
    Font debugFont;
    Font normalFont;
    Font weaponDescriptionFont;

    ImageIcon titleScreenImage = new ImageIcon(getClass().getResource("/images/titleScreenImage.png"));
    ImageIcon mainScreenImage = new ImageIcon(getClass().getResource("/images/mainScreenImage.png"));
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/Example Logo.png"));

    GraphicsDevice gDevice;

    int screenHeight = 1080;
    int screenWidth = 1920;

    public void createUI(Game.ChoiceHandler cHandler){

        GraphicsEnvironment gEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        gDevice = gEnvironment.getDefaultScreenDevice();

        createFont();

        //Add fonts
        try{
            InputStream isFont = getClass().getResourceAsStream("/fonts/rainyhearts.ttf");
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, isFont));
        }
        catch(IOException | FontFormatException e){

        }

        // Window
        window = new JFrame();
//        window.setSize(1920,1080);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setTitle("Bark & Blade");
        window.setIconImage(icon.getImage());

        setFullScreen();

        //Title screen
            //Background image Panel and label
            titleScreenImagePanel = new JPanel();
            int tSIP_X = (int)Math.round(0);
            int tSIP_Y = (int)Math.round(0);
            int tSIP_H = (int)Math.round(screenHeight);
            int tSIP_W = (int)Math.round(screenWidth);
            titleScreenImagePanel.setBounds(tSIP_X,tSIP_Y,tSIP_W,tSIP_H);
//          titleScreenImagePanel.setBounds(0,0,1920,1080);

            titleScreenImageLabel = new JLabel();
                //Scale image
                int titleScreenImageScaledWidth = (int) (window.getWidth() / titleScreenImage.getIconWidth() * titleScreenImage.getIconWidth());
                int titleScreenImageScaledHeight = (int) (window.getHeight() / titleScreenImage.getIconHeight() * titleScreenImage.getIconHeight());
                ImageIcon scaledTitleScreenImage = new ImageIcon(titleScreenImage.getImage().getScaledInstance(titleScreenImageScaledWidth, titleScreenImageScaledHeight, Image.SCALE_SMOOTH));
            titleScreenImageLabel.setIcon(scaledTitleScreenImage);
            titleScreenImagePanel.add(titleScreenImageLabel);

            //Title panel and label
            titleNamePanel = new JPanel();
            int tNP_X = (int)Math.round(screenWidth * 0.23958);
            int tNP_Y = (int)Math.round(screenHeight * 0.23148);
            int tNP_W = (int)Math.round(screenWidth * 0.52083);
            int tNP_H = (int)Math.round(screenHeight * 0.37037);
            titleNamePanel.setBounds(tNP_X,tNP_Y,tNP_W,tNP_H);
//          titleNamePanel.setBounds(460,250,1000,400);
            titleNamePanel.setBackground(Color.black);
            titleNamePanel.setOpaque(false);
            titleNameLabel = new JLabel("Bark & Blade");
            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);

            //Start button panel and label
            startButtonPanel = new JPanel();
            int sBP_X = (int)Math.round(screenWidth * 0.42187);
            int sBP_Y = (int)Math.round(screenHeight * 0.60185);
            int sBP_W = (int)Math.round(screenWidth * 0.15625);
            int sBP_H = (int)Math.round(screenHeight * 0.09722);
            startButtonPanel.setBounds(sBP_X,sBP_Y,sBP_W,sBP_H);
//          startButtonPanel.setBounds(810,650,300,105);
            startButtonPanel.setBackground(Color.black);
            startButtonPanel.setOpaque(false);
            startButton = new JButton("Start");
            startButton.setPreferredSize(new Dimension(sBP_W,sBP_H));
            startButton.setBackground(Color.black);
            startButton.setOpaque(false);
            startButton.setForeground(Color.white);
            startButton.setFont(startFont);
            startButton.setFocusPainted(false);
            startButton.setBorderPainted(false);
            startButton.addActionListener(cHandler);
            startButton.setActionCommand("start");
            startButtonPanel.add(startButton);

            //Debug button panel and label
            debugButtonPanel = new JPanel();
            debugButtonPanel.setBounds(810,765,300,150);
            debugButtonPanel.setBackground(Color.black);
            debugButton = new JButton("Debug");
            debugButton.setBackground(Color.black);
            debugButton.setForeground(Color.white);
            debugButton.setFont(debugFont);
            debugButton.setFocusPainted(false);
            debugButton.addActionListener(cHandler);
            debugButton.setActionCommand("debug");
            debugButtonPanel.add(debugButton);

            window.add(titleNamePanel);
            window.add(startButtonPanel);
            window.add(debugButtonPanel);
            window.add(titleScreenImagePanel);

        //Input screen
        inputButtonPanel = new JPanel();
        int iBP_X = (int)Math.round(screenWidth * 0.42187);
        int iBP_Y = (int)Math.round(screenHeight * 0.73148);
        int iBP_W = (int)Math.round(screenWidth * 0.15625);
        int iBP_H = (int)Math.round(screenHeight * 0.13888);
        inputButtonPanel.setBounds(iBP_X,iBP_Y,iBP_W,iBP_H);
//      inputButtonPanel.setBounds(810,790,300,150);
        inputButtonPanel.setBackground(Color.black);
        inputButtonPanel.setOpaque(false);
        inputButton = new JButton("Submit");
        inputButton.setBackground(Color.black);
        inputButton.setOpaque(false);
        inputButton.setForeground(Color.white);
        inputButton.setFont(debugFont);
        inputButton.setFocusPainted(false);
        inputButton.addActionListener(cHandler);
        inputButton.setActionCommand("submit");
        inputButtonPanel.add(inputButton);

        inputPanel = new JPanel();
        int iP_X = (int)Math.round(screenWidth * 0.39583);
        int iP_Y = (int)Math.round(screenHeight * 0.32407);
        int iP_W = (int)Math.round(screenWidth * 0.20833);
        int iP_H = (int)Math.round(screenHeight * 0.34722);
        inputPanel.setBounds(iP_X,iP_Y,iP_W,iP_H);
//      inputPanel.setBounds(760,350,400,375);
        inputPanel.setBackground(Color.black);
        inputPanel.setOpaque(false);
        inputPanel.setLayout(new GridLayout(3,1));

        inputPlayerNameField = new JTextField();
        inputPlayerNameField.setBorder(BorderFactory.createLineBorder(Color.black, 15));
        inputPlayerNameField.setFont(weaponDescriptionFont);
        inputPlayerNameField.setText("Your Name");
        inputPlayerNameField.setHorizontalAlignment(SwingConstants.CENTER);
        inputPlayerNameField.setBackground(Color.white);
        inputPlayerNameField.setForeground(Color.black);
        inputPlayerNameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (inputPlayerNameField.getText().equals("Your Name")) {
                    inputPlayerNameField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (inputPlayerNameField.getText().isEmpty()) {
                    inputPlayerNameField.setText("Your Name");
                }
            }
        });
        inputPanel.add(inputPlayerNameField);

        inputSpouseNameField = new JTextField();
        inputSpouseNameField.setBorder(BorderFactory.createLineBorder(Color.black, ((int) Math.round(screenWidth * 0.0078125))));
        inputSpouseNameField.setFont(weaponDescriptionFont);
        inputSpouseNameField.setText("Spouse Name");
        inputSpouseNameField.setHorizontalAlignment(SwingConstants.CENTER);
        inputSpouseNameField.setBackground(Color.white);
        inputSpouseNameField.setForeground(Color.black);
        inputSpouseNameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (inputSpouseNameField.getText().equals("Spouse Name")) {
                    inputSpouseNameField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (inputSpouseNameField.getText().isEmpty()) {
                    inputSpouseNameField.setText("Spouse Name");
                }
            }
        });
        inputPanel.add(inputSpouseNameField);

        inputDogNameField = new JTextField();
        inputDogNameField.setBorder(BorderFactory.createLineBorder(Color.black, 15));
        inputDogNameField.setFont(weaponDescriptionFont);
        inputDogNameField.setText("Dog Name");
        inputDogNameField.setHorizontalAlignment(SwingConstants.CENTER);
        inputDogNameField.setBackground(Color.white);
        inputDogNameField.setForeground(Color.black);
        inputDogNameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (inputDogNameField.getText().equals("Dog Name")) {
                    inputDogNameField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (inputDogNameField.getText().isEmpty()) {
                    inputDogNameField.setText("Dog Name");
                }
            }
        });
        inputPanel.add(inputDogNameField);

        window.add(inputPanel);
        window.add(inputButtonPanel);

        //Game screen
        mainScreenImagePanel = new JPanel();
        int mSIP_X = (int)Math.round(0);
        int mSIP_Y = (int)Math.round(0);
        int mSIP_H = (int)Math.round(screenHeight);
        int mSIP_W = (int)Math.round(screenWidth);
        mainScreenImagePanel.setBounds(mSIP_X,mSIP_Y,mSIP_W,mSIP_H);
//      mainScreenImagePanel.setBounds(0,0,1920,1080);

        mainScreenImageLabel = new JLabel();
        //Scale image
        int mainScreenImageScaledWidth = (int) (window.getWidth() / mainScreenImage.getIconWidth() * mainScreenImage.getIconWidth());
        int mainScreenImageScaledHeight = (int) (window.getHeight() / mainScreenImage.getIconHeight() * mainScreenImage.getIconHeight());
        ImageIcon scaledMainScreenImage = new ImageIcon(mainScreenImage.getImage().getScaledInstance(mainScreenImageScaledWidth, mainScreenImageScaledHeight, Image.SCALE_SMOOTH));
        mainScreenImageLabel.setIcon(scaledMainScreenImage);
        mainScreenImagePanel.add(mainScreenImageLabel);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(690,65,540,610);
        mainTextPanel.setBackground(Color.black);
        mainTextPanel.setOpaque(false);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(0,0,540,610);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setOpaque(false);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextArea.getCaret().setVisible(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(690,700,540,320);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setOpaque(false);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        choice1 = new JButton("choice1");
        choice1.setBackground(Color.black);
        choice1.setOpaque(false);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.setBorderPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("choice2");
        choice2.setBackground(Color.black);
        choice2.setOpaque(false);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.setBorderPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("choice3");
        choice3.setBackground(Color.black);
        choice3.setOpaque(false);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.setBorderPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("choice4");
        choice4.setBackground(Color.black);
        choice4.setOpaque(false);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.setBorderPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        //Quest log panel & labels
        questLogPanel = new JPanel();
        questLogPanel.setBounds(1500,500,380,450);
        questLogPanel.setBackground(Color.black);
        questLogPanel.setOpaque(false);
        questLogPanel.setLayout(new GridLayout(9,1));
        //window.add(questLogPanel);

        questLogLabel = new JLabel("Quest Log:");
        questLogLabel.setFont(weaponDescriptionFont);
        questLogLabel.setForeground(Color.white);
        questLogPanel.add(questLogLabel);
        vetQuestTitleLabel = new JLabel();
        vetQuestTitleLabel.setForeground(Color.white);
        vetQuestTitleLabel.setFont(weaponDescriptionFont);
        questLogPanel.add(vetQuestTitleLabel);
        vetQuestObjectiveLabel = new JLabel();
        vetQuestObjectiveLabel.setForeground(Color.white);
        vetQuestObjectiveLabel.setFont(weaponDescriptionFont);
        questLogPanel.add(vetQuestObjectiveLabel);
        blackberriesQuestTitleLabel = new JLabel();
        blackberriesQuestTitleLabel.setForeground(Color.white);
        blackberriesQuestTitleLabel.setFont(weaponDescriptionFont);
        questLogPanel.add(blackberriesQuestTitleLabel);
        blackberriesQuestObjectiveLabel = new JLabel();
        blackberriesQuestObjectiveLabel.setForeground(Color.white);
        blackberriesQuestObjectiveLabel.setFont(weaponDescriptionFont);
        questLogPanel.add(blackberriesQuestObjectiveLabel);
        coatQuestTitleLabel = new JLabel();
        coatQuestTitleLabel.setForeground(Color.white);
        coatQuestTitleLabel.setFont(weaponDescriptionFont);
        questLogPanel.add(coatQuestTitleLabel);
        coatQuestObjectiveLabel = new JLabel();
        coatQuestObjectiveLabel.setForeground(Color.white);
        coatQuestObjectiveLabel.setFont(weaponDescriptionFont);
        questLogPanel.add(coatQuestObjectiveLabel);
        presentQuestTitleLabel = new JLabel();
        presentQuestTitleLabel.setForeground(Color.white);
        presentQuestTitleLabel.setFont(weaponDescriptionFont);
        questLogPanel.add(presentQuestTitleLabel);
        presentQuestObjectiveLabel = new JLabel();
        presentQuestObjectiveLabel.setForeground(Color.white);
        presentQuestObjectiveLabel.setFont(weaponDescriptionFont);
        questLogPanel.add(presentQuestObjectiveLabel);

        // Player stats panel and labels
        playerHpPanel = new JPanel();
        playerHpPanel.setBounds(1340,620,50,50);
        playerHpPanel.setBackground(Color.black);
        playerHpPanel.setOpaque(false);
        window.add(playerHpPanel);
        hpNumberLabel = new JLabel();
        hpNumberLabel.setForeground(Color.white);
        hpNumberLabel.setFont(normalFont);
        playerHpPanel.add(hpNumberLabel);

        playerCoinsPanel = new JPanel();
        playerCoinsPanel.setBounds(1632,620,50,50);
        playerCoinsPanel.setBackground(Color.black);
        playerCoinsPanel.setOpaque(false);
        window.add(playerCoinsPanel);
        coinCountLabel = new JLabel();
        coinCountLabel.setForeground(Color.white);
        coinCountLabel.setFont(normalFont);
        playerCoinsPanel.add(coinCountLabel);

        weaponNamePanel = new JPanel();
        weaponNamePanel.setBounds(1340,753,405,50);
        weaponNamePanel.setBackground(Color.black);
        weaponNamePanel.setOpaque(false);
        window.add(weaponNamePanel);

        weaponNameArea = new JTextArea();
        weaponNameArea.setBounds(0,0,405,50);
        weaponNameArea.setBackground(Color.black);
        weaponNameArea.setOpaque(false);
        weaponNameArea.setForeground(Color.white);
        weaponNameArea.setFont(normalFont);
        weaponNameArea.setLineWrap(true);
        weaponNameArea.setWrapStyleWord(true);
        weaponNameArea.setEditable(false);
        weaponNameArea.getCaret().setVisible(false);
        weaponNamePanel.add(weaponNameArea);

        weaponDescriptionPanel = new JPanel();
        weaponDescriptionPanel.setBounds(1340,800,405,85);
        weaponDescriptionPanel.setBackground(Color.black);
        weaponDescriptionPanel.setOpaque(false);
        window.add(weaponDescriptionPanel);


        weaponDescriptionArea = new JTextArea();
        weaponDescriptionArea.setBounds(0,0,405,85);
        weaponDescriptionArea.setBackground(Color.black);
        weaponDescriptionArea.setOpaque(false);
        weaponDescriptionArea.setForeground(Color.white);
        weaponDescriptionArea.setFont(weaponDescriptionFont);
        weaponDescriptionArea.setLineWrap(true);
        weaponDescriptionArea.setWrapStyleWord(true);
        weaponDescriptionArea.setEditable(false);
        weaponDescriptionArea.getCaret().setVisible(false);
        weaponDescriptionPanel.add(weaponDescriptionArea);

//        hpLabel = new JLabel("HP:");
//        hpLabel.setFont(statFont);
//        hpLabel.setForeground(Color.white);
//        playerHpPanel.add(hpLabel);


//        coinLabel = new JLabel("Coins:");
//        coinLabel.setForeground(Color.white);
//        coinLabel.setFont(weaponDescriptionFont);
//        playerHpPanel.add(coinLabel);


        switchButtonPanel = new JPanel();
        switchButtonPanel.setBounds(1756,740,80,150);
        switchButtonPanel.setBackground(Color.black);
        switchButtonPanel.setOpaque(false);
        switchButton = new JButton();
        switchButton.setBackground(Color.red);
        switchButton.setOpaque(false);
        switchButton.setPreferredSize(new Dimension(80,145));
        switchButton.setFocusPainted(false);
        switchButton.setBorderPainted(false);
        switchButton.addActionListener(cHandler);
        switchButton.setActionCommand("switch");
        switchButtonPanel.add(switchButton);
        window.add(switchButtonPanel);

        window.add(mainScreenImagePanel);

        window.setVisible(true);

        setFullScreen();
    }

    public void createFont() {

        int titleFontSize = (int)Math.round(screenWidth * 0.08854);
        int startFontSize = (int)Math.round(screenWidth * 0.03645);
        int debugFontSize = (int)Math.round(screenWidth * 0.02968);
        int normalFontSize = (int)Math.round(screenWidth * 0.02343);
        int weaponDescriptionFontFontSize = (int)Math.round(screenWidth * 0.01700);

        titleFont = new Font("rainyhearts", Font.PLAIN,titleFontSize);
        startFont = new Font("rainyhearts", Font.PLAIN,startFontSize);
        debugFont = new Font("rainyhearts", Font.PLAIN,debugFontSize);
        normalFont = new Font("rainyhearts", Font.PLAIN,normalFontSize);
        weaponDescriptionFont = new Font("rainyhearts", Font.PLAIN,weaponDescriptionFontFontSize);
    }

    public void setFullScreen() {
        gDevice.setFullScreenWindow(window);
        screenHeight = window.getHeight();
        screenWidth = window.getWidth();
    }
}
