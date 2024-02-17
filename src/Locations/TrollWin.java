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
        ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and collect one of his horns as a trophy. You see past his cave what looks like a bandit hideout.\n[You obtained a troll horn]");
        trollDead = true;
        trollHorn = true;
        stopSoundEffect();
        playSoundEffect(4);

        ui.choice1.setText("Sneak up to the bandit hideout");
        ui.choice2.setText("Climb down the mountain");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "hideout";
        game.nextPosition2 = "mountains";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
