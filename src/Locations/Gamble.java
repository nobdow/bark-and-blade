package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Gamble extends SuperLocation{

    public Gamble(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void gamble(){
        if(coins >= 10) {
            ui.mainTextArea.setText("Drunk:\n\"I've got a dice and if it rolls 1 or 6 I will give you back double your bet. If it rolls 2-5, I keep your money. You in?\"");
            ui.choice1.setText("Make a small bet (5 coin)");
            ui.choice2.setText("Make a large bet (10 coin)");
            ui.choice3.setText("Decline to play the devil's game");
            ui.choice4.setText("");

            game.nextPosition1 = "betSmall";
            game.nextPosition2 = "betLarge";
            game.nextPosition3 = "backAlley";
            game.nextPosition4 = "";
        }
        else if (coins >= 5 && coins < 10){
            ui.mainTextArea.setText("Drunk:\n\"I've got a dice and if it rolls 1 or 6 I will give you back double your bet. If it rolls 2-5, I keep your money. You in?\"");
            ui.choice1.setText("Make a small bet (5 coin)");
            ui.choice2.setText("Decline to play the devil's game");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "betSmall";
            game.nextPosition2 = "backAlley";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(coins < 5){
            ui.mainTextArea.setText("Drunk:\n\"No money, no game. Come back when you find some coin.\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "backAlley";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
