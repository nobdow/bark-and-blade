package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Town extends SuperLocation{

    public Town(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void town(){
        ui.mainTextArea.setText("You walk into the center of town.");
        ui.choice1.setText("Go to the marketplace");
        ui.choice2.setText("Go to the castle");
        ui.choice3.setText("Look for trouble");
        ui.choice4.setText("Go to the crossroads");

        game.nextPosition1 = "marketplace";
        game.nextPosition2 = "castleGate";
        game.nextPosition3 = "backAlley";
        game.nextPosition4 = "crossroads";
    }
}
