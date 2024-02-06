package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BushCoins extends SuperLocation{

    public BushCoins(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void bushCoins(){
        coins = coins + 10;
        ui.coinCountLabel.setText(coins + "");
        playSoundEffect(6);

        ui.mainTextArea.setText("A small bag of loot falls out of the bush, you open it to find some gold pieces\n[You obtain 10 coins]");
        ui.choice1.setText("Retrieve your plunder");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "forest";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
