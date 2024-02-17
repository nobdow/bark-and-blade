package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class PlayFetch extends SuperLocation{

    public PlayFetch(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void playFetch(){
        if (fetchPoint == false) {
            dogPoints = dogPoints + 1;
            fetchPoint = true;
            ui.mainTextArea.setText("Fetch has to be DOGNAME's favorite game. He is now more loyal to you.");
        }
        else if (fetchPoint == true) {
            ui.mainTextArea.setText("Fetch has to be DOGNAME's favorite game.");
        }

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "mountains";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
