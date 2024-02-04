package Base_Elements;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, exampleImagePanel;
    JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel, coinLabel, coinCountLabel, exampleImageLabel;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Alagard", Font.PLAIN,150);
    Font startFont = new Font("Alagard", Font.PLAIN,70);
    Font normalFont = new Font("Alagard", Font.PLAIN,45);
    Font statFont = new Font("Alagard", Font.PLAIN,35);
    Font alagard;
    ImageIcon icon = new ImageIcon(".//resources//images//Example Logo.png");
    ImageIcon exampleImage;

    public void createUI(Game.ChoiceHandler cHandler){

        //Add fonts
        try{
            alagard = Font.createFont(Font.TRUETYPE_FONT, new File(".//resources//fonts//alagard.ttf")).deriveFont(90f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(".//resources//fonts//alagard.ttf")));
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
        startButtonPanel.setBounds(810,650,300,150);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(startFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        //Game screen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(510,150,900,450);
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

        playerPanel = new JPanel();
        playerPanel.setBounds(1500,140,380,500);
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
        exampleImage = new ImageIcon(".//resources//images//Example.png");
        exampleImageLabel.setIcon(exampleImage);
        exampleImagePanel.add(exampleImageLabel);
        window.add(exampleImagePanel);

        window.setVisible(true);
    }
}
