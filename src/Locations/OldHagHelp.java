package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class OldHagHelp extends SuperLocation{

    public OldHagHelp(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void oldHagHelp(){
        oldHagQuest = 2;
        ui.mainTextArea.setText("Sweet Old Woman:\n\"Thank you for helping me! Here are the last of my coins as a reward.\"");
        ui.choice1.setText("Accept reward");
        ui.choice2.setText("Refuse reward");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "oldHagHelpAccept";
        game.nextPosition2 = "oldHagHelpRefuse";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
