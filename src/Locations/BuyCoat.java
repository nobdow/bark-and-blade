package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BuyCoat extends SuperLocation{

    public BuyCoat(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void buyCoat(){
        if(bearDead == true && coins >= 10) {
            boughtCoat = true;
            CoatQuest = 2;
            coins = coins - 10;
            ui.coinCountLabel.setText(coins + "");
            ui.coatQuestObjectiveLabel.setText("");
            spouseTips.remove("Spouse:\n\"Remember, you need a new coat. It is already snowing in the mountains. It should be easy to find one at market.\"");
            stopSoundEffect();
            playSoundEffect(1);

            ui.mainTextArea.setText("Tailor:\n\"Here you go! Should help you withstand the toughest winters.\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "tailor";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(bearDead == false || coins < 10){
            ui.mainTextArea.setText("Tailor:\n\"I'm sorry but you lack what I need to make the coat.\"");
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