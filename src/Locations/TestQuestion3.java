package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class TestQuestion3 extends SuperLocation{

    public TestQuestion3(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void testQuestion3(){
        ui.mainTextArea.setText("Doc. Milton:\n\"Night.\"");
        ui.choice1.setText("Campfire");
        ui.choice2.setText("Dream");
        ui.choice3.setText("Sleep");
        ui.choice4.setText("Treasure");

        game.nextPosition1 = "testResults";
        game.nextPosition2 = "testResults";
        game.nextPosition3 = "testResults";
        game.nextPosition4 = "testResults";
    }
}
