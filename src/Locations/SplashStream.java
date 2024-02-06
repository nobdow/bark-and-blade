package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class SplashStream extends SuperLocation{

    public SplashStream(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void splashStream(){
        if (splashPoint == false) {
            dogPoints = dogPoints + 1;
            splashPoint = true;
            ui.mainTextArea.setText("Your dog loved paying in the water. He is now more loyal to you.");
        }
        else if (splashPoint == true) {
            ui.mainTextArea.setText("Your dog loved paying in the water.");
        }

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
