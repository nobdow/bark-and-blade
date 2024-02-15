package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class DrunkWin extends SuperLocation{

    public DrunkWin(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void drunkWin(){
        ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + "\n\nGuard:\n\"Hey you, why did you beat up that innocent man? Your coming with me to jail!\"");
        drunkDead = true;

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "jail";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
