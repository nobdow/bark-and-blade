package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class OldHagHelpAccept extends SuperLocation{

    public OldHagHelpAccept(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void oldHagHelpAccept(){
        coins = coins + 15;
        ui.coinCountLabel.setText(coins + "");
        stopSoundEffect();
        playSoundEffect(6);

        ui.mainTextArea.setText("[You obtained 15 coins]");
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
