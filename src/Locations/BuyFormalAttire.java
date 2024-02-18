package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BuyFormalAttire extends SuperLocation{

    public BuyFormalAttire(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void buyFormalAttire(){
        if(coins >= 10) {
            boughtFormalAttire = true;
            ui.presentQuestObjectiveLabel.setText("  + return to wife");
            coins = coins - 10;
            ui.coinCountLabel.setText(coins + "");
            stopSoundEffect();
            playSoundEffect(4);
            birthdayQuest = 2;

            ui.mainTextArea.setText("Tailor:\n\"Whoever you are going to give this too is going to really like it.\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "tailor";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(coins < 10){
            ui.mainTextArea.setText("Tailor:\n\"I'm sorry but you need more coins to buy that.\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "tailor";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
