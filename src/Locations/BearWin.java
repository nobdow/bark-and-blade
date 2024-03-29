package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BearWin extends SuperLocation{

    public BearWin(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void bearWin(){
        ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and skin the animal to collect his coat.\n(You obtained a fur pelt)");
        bearDead = true;
        stopSoundEffect();
        playSoundEffect(4);

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "clearing";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
