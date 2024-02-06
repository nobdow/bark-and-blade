package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class TestQuestion2 extends SuperLocation{

    public TestQuestion2(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void testQuestion2(){
        ui.mainTextArea.setText("Doc. Milton:\n\"House.\"");
        ui.choice1.setText("Shelter");
        ui.choice2.setText("Burglarize");
        ui.choice3.setText("Target");
        ui.choice4.setText("Demolish");

        game.nextPosition1 = "testQuestion3";
        game.nextPosition2 = "testQuestion3";
        game.nextPosition3 = "testQuestion3";
        game.nextPosition4 = "testQuestion3";
    }
}
