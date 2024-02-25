package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class SnuggleDogMax extends SuperLocation{

    public SnuggleDogMax(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void snuggleDogMax(){
        ui.mainTextArea.setText("Snuggles with " + player.dogName + " really are the best. You got so cozy, you fell asleep, and just kept sleeping...");
        ui.choice1.setText("Zzzzzzzzzzzz");
        ui.choice2.setText("Zzzzzzzzzzzz");
        ui.choice3.setText("Zzzzzzzzzzzz");
        ui.choice4.setText("Zzzzzzzzzzzz");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
