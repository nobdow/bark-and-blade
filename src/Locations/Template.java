package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Template extends SuperLocation{

    public Template(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void TEMPLATE(){
        //The story text display
        ui.mainTextArea.setText("");
        //Choices for the player
        ui.choice1.setText("");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        //Where the player will go next
        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
