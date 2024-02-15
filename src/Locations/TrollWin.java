package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class TrollWin extends SuperLocation{

    public TrollWin(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void trollWin(){
        ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and collect one of his horns as a trophy.\n(You obtained a troll horn)");
        trollDead = true;
        trollHorn = true;
        stopSoundEffect();
        playSoundEffect(4);

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "mountain";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
