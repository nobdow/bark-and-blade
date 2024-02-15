package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class OldHag extends SuperLocation{

    public OldHag(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void oldHag(){
        oldHagQuest = 1;
        ui.mainTextArea.setText("Sweet Old Woman:\n\"Hello young one. Can you please help get get back to the center of town? I seem to be lost and I am getting scared.\"");
        ui.choice1.setText("Offer to help");
        ui.choice2.setText("Refuse");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "oldHagHelp";
        game.nextPosition2 = "backAlley";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
