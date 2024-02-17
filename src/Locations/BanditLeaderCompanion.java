package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BanditLeaderCompanion extends SuperLocation{

    public BanditLeaderCompanion(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void banditLeaderCompanion(){
        banditLeaderCompanion = true;
        hasCrown = true;
        ui.mainTextArea.setText("Bandit Leader:\n\"Excellent. Lets head to the castle.\"");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "mountainPass";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
