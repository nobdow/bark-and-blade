package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class EndCredits extends SuperLocation{

    public EndCredits(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void endCredits(){
        ui.mainTextArea.setText("The End\n\nThank you for playing!\n\nTechnical Director - Nobdow\n\nCreative Director - CouchMagician");
        ui.choice1.setText("Main menu");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
