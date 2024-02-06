package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class ForestBanditWin extends SuperLocation{

    public ForestBanditWin(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void forestBanditWin(){
        int coinFlip = new java.util.Random().nextInt(2);

        if(coinFlip == 0) {
            coins = coins + 5;
            ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and he dropped some coins as he ran away!\n[You obtained 5 coins]");

        }
        else if (coinFlip == 1) {
            coins = coins + 10;
            ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and he dropped some coins as he ran away!\n[You obtained 10 coins]");
        }

        ui.coinCountLabel.setText(coins + "");
        stopSoundEffect();
        playSoundEffect(6);

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "forest";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
