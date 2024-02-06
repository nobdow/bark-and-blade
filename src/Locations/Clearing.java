package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Clearing extends SuperLocation{

    public Clearing(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void clearing(){
        playSoundEffect(5);

        ui.mainTextArea.setText("You come into a clearing and on your left are some berry bushes and on your right looks to be a den of some large animal.");
        ui.choice1.setText("Pick berries");
        ui.choice2.setText("Explore den");
        ui.choice3.setText("Go back into the forest");
        ui.choice4.setText("");

        game.nextPosition1 = "berries";
        game.nextPosition2 = "bearEncounter";
        game.nextPosition3 = "forest";
        game.nextPosition4 = "";
    }
}
