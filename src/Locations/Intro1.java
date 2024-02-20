package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Intro1 extends SuperLocation{

    public Intro1(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void intro1(){
        stopSoundEffect();

        ui.mainTextArea.setText("Hello " + Game.ChoiceHandler + "\n\nIn the kingdom of Eriduun, a peaceful realm ruled by King Oswin the Noble, a dark shadow looms over the land. The legendary Crown of Radiance has been stolen!");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "intro2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
