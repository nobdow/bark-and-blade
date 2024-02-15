package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BuyRubberChicken extends SuperLocation{

    public BuyRubberChicken(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void buyRubberChicken(){
        boughtRubberChicken = true;

        ui.mainTextArea.setText("Blacksmith:\n\"Haha my apologies, that was a cruel joke. What self respecting blacksmith would sell a rubber chicken?\"");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "blacksmith";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
