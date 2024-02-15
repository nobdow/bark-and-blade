package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Marketplace extends SuperLocation{

    public Marketplace(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void marketplace(){
        ui.mainTextArea.setText("There are lots of merchants working on their trades.");
        ui.choice1.setText("Talk to the tailor");
        ui.choice2.setText("Talk to the blacksmith");
        ui.choice3.setText("Talk to the baker");
        ui.choice4.setText("Return to the town center");

        game.nextPosition1 = "tailor";
        game.nextPosition2 = "blacksmith";
        game.nextPosition3 = "baker";
        game.nextPosition4 = "town";
    }
}
