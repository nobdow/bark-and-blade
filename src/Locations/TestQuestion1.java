package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class TestQuestion1 extends SuperLocation{

    public TestQuestion1(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void testQuestion1(){
        ui.mainTextArea.setText("Doc. Milton:\n\"All right. I'm gonna say a word. I want you to say the first thing that comes to mind. Hound.\"");
        ui.choice1.setText("Feline");
        ui.choice2.setText("Feed");
        ui.choice3.setText("Kick");
        ui.choice4.setText("Supper");

        game.nextPosition1 = "testQuestion2";
        game.nextPosition2 = "testQuestion2";
        game.nextPosition3 = "testQuestion2";
        game.nextPosition4 = "testQuestion2";
    }
}
