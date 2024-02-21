package Base_Elements;

import Equipment.SuperWeapon;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class UI {

    JFrame window;
    Container con;
    public JPanel titleNamePanel, startButtonPanel, debugButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, exampleImagePanel, questLogPanel,inputPanel, inputButtonPanel;
    public JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel, coinLabel, coinCountLabel, exampleImageLabel, questLogLabel, vetQuestTitleLabel, vetQuestObjectiveLabel, blackberriesQuestTitleLabel, blackberriesQuestObjectiveLabel, coatQuestTitleLabel, coatQuestObjectiveLabel, presentQuestTitleLabel, presentQuestObjectiveLabel;
    public JButton startButton, debugButton, inputButton, choice1, choice2, choice3, choice4;
    public JTextArea mainTextArea;
    public JTextField inputPlayerNameField, inputSpouseNameField, inputDogNameField, number4;
    Font titleFont = new Font("Alagard", Font.PLAIN,150);
    Font startFont = new Font("Alagard", Font.PLAIN,70);
    Font debugFont = new Font("Alagard", Font.PLAIN,57);
    Font normalFont = new Font("Alagard", Font.PLAIN,45);
    Font statFont = new Font("Alagard", Font.PLAIN,35);

    ImageIcon icon = new ImageIcon(getClass().getResource("/images/Example Logo.png"));
    ImageIcon exampleImage;

    public void createUI(Game.ChoiceHandler cHandler){

        //Add fonts
        try{
            InputStream isFont = getClass().getResourceAsStream("/fonts/alagard.ttf");
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, isFont));
        }
        catch(IOException | FontFormatException e){

        }

        // Window
        window = new JFrame();
        window.setSize(1920,1080);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setTitle("Bark & Blade");
        window.setIconImage(icon.getImage());

        //Title screen
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(460,250,1000,400);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Bark & Blade");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(810,650,300,100);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(startFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);

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

        //Input screen
        inputButtonPanel = new JPanel();
        inputButtonPanel.setBounds(810,790,300,150);
        inputButtonPanel.setBackground(Color.black);
        inputButton = new JButton("Submit");
        inputButton.setBackground(Color.black);
        inputButton.setForeground(Color.white);
        inputButton.setFont(debugFont);
        inputButton.setFocusPainted(false);
        inputButton.addActionListener(cHandler);
        inputButton.setActionCommand("submit");
        inputButtonPanel.add(inputButton);

        inputPanel = new JPanel();
        inputPanel.setBounds(760,350,400,375);
        inputPanel.setBackground(Color.black);
        inputPanel.setLayout(new GridLayout(3,1));

        inputPlayerNameField = new JTextField();
        inputPlayerNameField.setBorder(BorderFactory.createLineBorder(Color.black, 15));
        inputPlayerNameField.setFont(statFont);
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
        inputSpouseNameField.setBorder(BorderFactory.createLineBorder(Color.black, 15));
        inputSpouseNameField.setFont(statFont);
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
        inputDogNameField.setFont(statFont);
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
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(560,150,900,450);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(0,0,900,450);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);


        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(585,600,750,350);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        choice1 = new JButton("choice1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("choice2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("choice3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("choice4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        //Quest log panel & labels
        questLogPanel = new JPanel();
        questLogPanel.setBounds(1500,500,380,450);
        questLogPanel.setBackground(Color.black);
        questLogPanel.setLayout(new GridLayout(9,1));
        window.add(questLogPanel);

        questLogLabel = new JLabel("Quest Log:");
        questLogLabel.setFont(statFont);
        questLogLabel.setForeground(Color.white);
        questLogPanel.add(questLogLabel);
        vetQuestTitleLabel = new JLabel();
        vetQuestTitleLabel.setForeground(Color.white);
        vetQuestTitleLabel.setFont(statFont);
        questLogPanel.add(vetQuestTitleLabel);
        vetQuestObjectiveLabel = new JLabel();
        vetQuestObjectiveLabel.setForeground(Color.white);
        vetQuestObjectiveLabel.setFont(statFont);
        questLogPanel.add(vetQuestObjectiveLabel);
        blackberriesQuestTitleLabel = new JLabel();
        blackberriesQuestTitleLabel.setForeground(Color.white);
        blackberriesQuestTitleLabel.setFont(statFont);
        questLogPanel.add(blackberriesQuestTitleLabel);
        blackberriesQuestObjectiveLabel = new JLabel();
        blackberriesQuestObjectiveLabel.setForeground(Color.white);
        blackberriesQuestObjectiveLabel.setFont(statFont);
        questLogPanel.add(blackberriesQuestObjectiveLabel);
        coatQuestTitleLabel = new JLabel();
        coatQuestTitleLabel.setForeground(Color.white);
        coatQuestTitleLabel.setFont(statFont);
        questLogPanel.add(coatQuestTitleLabel);
        coatQuestObjectiveLabel = new JLabel();
        coatQuestObjectiveLabel.setForeground(Color.white);
        coatQuestObjectiveLabel.setFont(statFont);
        questLogPanel.add(coatQuestObjectiveLabel);
        presentQuestTitleLabel = new JLabel();
        presentQuestTitleLabel.setForeground(Color.white);
        presentQuestTitleLabel.setFont(statFont);
        questLogPanel.add(presentQuestTitleLabel);
        presentQuestObjectiveLabel = new JLabel();
        presentQuestObjectiveLabel.setForeground(Color.white);
        presentQuestObjectiveLabel.setFont(statFont);
        questLogPanel.add(presentQuestObjectiveLabel);

        // Player stats panel and labels
        playerPanel = new JPanel();
        playerPanel.setBounds(1500,140,380,450);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(9,1));
        window.add(playerPanel);

        hpLabel = new JLabel("HP:");
        hpLabel.setFont(statFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpNumberLabel = new JLabel();
        hpNumberLabel.setForeground(Color.white);
        hpNumberLabel.setFont(statFont);
        playerPanel.add(hpNumberLabel);
        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setForeground(Color.white);
        weaponLabel.setFont(statFont);
        playerPanel.add(weaponLabel);
        weaponNameLabel = new JLabel();
        weaponNameLabel.setForeground(Color.white);
        weaponNameLabel.setFont(statFont);
        playerPanel.add(weaponNameLabel);
        coinLabel = new JLabel("Coins:");
        coinLabel.setForeground(Color.white);
        coinLabel.setFont(statFont);
        playerPanel.add(coinLabel);
        coinCountLabel = new JLabel();
        coinCountLabel.setForeground(Color.white);
        coinCountLabel.setFont(statFont);
        playerPanel.add(coinCountLabel);

        exampleImagePanel = new JPanel();
        exampleImagePanel.setBounds(75,150,350,800);
        exampleImagePanel.setBackground(Color.black);

        exampleImageLabel = new JLabel();
        exampleImage = new ImageIcon(getClass().getResource("/images/Example.png"));
        exampleImageLabel.setIcon(exampleImage);
        exampleImagePanel.add(exampleImageLabel);
        window.add(exampleImagePanel);


//        ArrayList<SuperWeapon> weaponList = new ArrayList<>();
//
//        int weaponIndex = 2; // Assuming you want to edit the flag of the item at index 2
//        SuperWeapon weaponToEquipped = weaponList.get(weaponIndex);
//        weaponToEquipped.isEquipped(true); // Set the flag to true
//
//        Iterator<SuperWeapon> weaponIterator = weaponList.iterator();
//        while (weaponIterator.hasNext()) {
//            SuperWeapon weapon = weaponIterator.next();
//            if(weapon.isEquipped(true)) {
//                // Do something with the selected item
//            }
//        }

        window.setVisible(true);

    }
}
