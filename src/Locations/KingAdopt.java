package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class KingAdopt extends SuperLocation{

    public KingAdopt(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void kingAdopt(){
        stopSoundEffect();
        playSoundEffect(3);

        ui.mainTextArea.setText("You feel very weak and dizzy...\n\nKing Oswin the Noble:\n\"What scum and villainy that farmer was. The dog seems pure hearted though, I will adopt and take care of him.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "lose";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
