package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class TestResults extends SuperLocation{

    public TestResults(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void testResults(){
        ui.mainTextArea.setText("Doc. Milton:\n\"I don't have nothing to compare it to, so maybe you'd better go home and get some more rest.\"");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "farmHouse";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
