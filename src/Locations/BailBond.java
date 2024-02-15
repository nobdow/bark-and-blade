package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BailBond extends SuperLocation{

    public BailBond(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void bailBond(){
        coins = coins - 30;
        ui.coinCountLabel.setText(coins + "");

        ui.mainTextArea.setText("Guard:\n\"That will do, you are free to go. But don't be assaulting anyone like that again.\"\n[You lost 30 coins]");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "town";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
