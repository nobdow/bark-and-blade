package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Tailor extends SuperLocation{

    public Tailor(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void tailor(){
        if(boughtCoat == false && boughtFormalAttire == false) {
            ui.mainTextArea.setText("Tailor:\n\"Hello! I've just run out of all my stock except this formal attire which costs 10 coins. If you happen upon an fur pelt, I could make you a warm coat for only 10 coins.\"");
            ui.choice1.setText("Order a coat");
            ui.choice2.setText("Buy formal attire");
            ui.choice3.setText("Return to marketplace");
            ui.choice4.setText("");

            game.nextPosition1 = "buyCoat";
            game.nextPosition2 = "buyFormalAttire";
            game.nextPosition3 = "marketplace";
            game.nextPosition4 = "";
        }
        else if(boughtCoat == true && boughtFormalAttire == false){
            ui.mainTextArea.setText("Tailor:\n\"Thanks for your patronage. I've still got the formal attire if you are interested.\"");
            ui.choice1.setText("Buy formal attire");
            ui.choice2.setText("Return to marketplace");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "buyFormalAttire";
            game.nextPosition2 = "marketplace";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(boughtCoat == false && boughtFormalAttire == true){
            ui.mainTextArea.setText("Tailor:\n\"Thanks for your patronage. I can still make you a coat if you get me a pelt and 10 coins.\"");
            ui.choice1.setText("Order a coat");
            ui.choice2.setText("Return to marketplace");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "buyCoat";
            game.nextPosition2 = "marketplace";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(boughtCoat == true && boughtFormalAttire == true){
            ui.mainTextArea.setText("Tailor:\n\"You are the best customer I've had all day!\"");
            ui.choice1.setText("Continue");
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
