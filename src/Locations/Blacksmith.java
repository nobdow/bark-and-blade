package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Blacksmith extends SuperLocation{

    public Blacksmith(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void blacksmith(){
        if(boughtDice == false && boughtKeyBlade == false && boughtRubberChicken == false) {
            ui.mainTextArea.setText("Blacksmith:\n\"Welcome! I have a fine key shaped blade for sale for 15 coins, or if you bring me something to make it with, I can make you a set of really sharp dice for 10 coins. I also have this a rubber chicken for 5 coins, but...\"");
            ui.choice1.setText("Buy key shaped blade");
            ui.choice2.setText("Order custom dice");
            ui.choice3.setText("Buy rubber chicken");
            ui.choice4.setText("Return to marketplace");

            game.nextPosition1 = "buyKeyBlade";
            game.nextPosition2 = "buyDice";
            game.nextPosition3 = "buyRubberChicken";
            game.nextPosition4 = "marketplace";
        }
        else if(boughtDice == true && boughtKeyBlade == false && boughtRubberChicken == false){
            ui.mainTextArea.setText("Blacksmith:\n\"Welcome! I have a fine key shaped blade for sale for 15 coins. I also have this a rubber chicken for 5 coins, but...\"");
            ui.choice1.setText("Buy key shaped blade");
            ui.choice2.setText("Buy rubber chicken");
            ui.choice3.setText("Return to marketplace");
            ui.choice4.setText("");

            game.nextPosition1 = "buyKeyBlade";
            game.nextPosition2 = "buyRubberChicken";
            game.nextPosition3 = "marketplace";
            game.nextPosition4 = "";
        }
        else if(boughtDice == false && boughtKeyBlade == true && boughtRubberChicken == false){
            ui.mainTextArea.setText("Blacksmith:\n\"Welcome! If you bring me something to make it with, I can make you a set of really sharp dice for 10 coins. I also have this a rubber chicken for 5 coins, but...\"");
            ui.choice1.setText("Order custom dice");
            ui.choice2.setText("Buy rubber chicken");
            ui.choice3.setText("Return to marketplace");
            ui.choice4.setText("");

            game.nextPosition1 = "buyDice";
            game.nextPosition2 = "buyRubberChicken";
            game.nextPosition3 = "marketplace";
            game.nextPosition4 = "";
        }
        else if(boughtDice == false && boughtKeyBlade == false && boughtRubberChicken == true) {
            ui.mainTextArea.setText("Blacksmith:\n\"Welcome! I have a fine key shaped blade for sale for 15 coins, or if you bring me something to make it with, I can make you a set of really sharp dice for 10 coins.\"");
            ui.choice1.setText("Buy key shaped blade");
            ui.choice2.setText("Order custom dice");
            ui.choice3.setText("Return to marketplace");
            ui.choice4.setText("");

            game.nextPosition1 = "buyKeyBlade";
            game.nextPosition2 = "buyDice";
            game.nextPosition3 = "marketplace";
            game.nextPosition4 = "";
        }
        else if(boughtDice == true && boughtKeyBlade == true && boughtRubberChicken == false) {
            ui.mainTextArea.setText("Blacksmith:\n\"Welcome! I have this a rubber chicken for 5 coins, but...\"");
            ui.choice1.setText("Buy rubber chicken");
            ui.choice2.setText("Return to marketplace");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "buyRubberChicken";
            game.nextPosition2 = "marketplace";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(boughtDice == true && boughtKeyBlade == false && boughtRubberChicken == true) {
            ui.mainTextArea.setText("Blacksmith:\n\"Welcome! I have a fine key shaped blade for sale for 15 coins.\"");
            ui.choice1.setText("Buy key shaped blade");
            ui.choice2.setText("Return to marketplace");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "buyKeyBlade";
            game.nextPosition2 = "marketplace";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(boughtDice == false && boughtKeyBlade == true && boughtRubberChicken == true) {
            ui.mainTextArea.setText("Blacksmith:\n\"Welcome! If you bring me something to make it with, I can make you a set of really sharp dice for 10 coins.\"");
            ui.choice1.setText("Order custom dice");
            ui.choice2.setText("Return to marketplace");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "buyDice";
            game.nextPosition2 = "marketplace";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(boughtDice == true && boughtKeyBlade == true && boughtRubberChicken == true) {
            ui.mainTextArea.setText("Blacksmith:\n\"Welcome! I am currently out of stock, but thank you for all of your patronage!\"");
            ui.choice1.setText("Return to marketplace");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "marketplace";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
