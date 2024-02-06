package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Berries extends SuperLocation{

    public Berries(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void berries(){
        if(hasBerries == false) {
            hasBerries = true;
            ui.mainTextArea.setText("You collect some deliciously ripe cherries but find no blackberries.\n(You obtained cherries)");
            //playSoundEffect(4);
        }
        else if (hasBerries == true){
            ui.mainTextArea.setText("It looks like you have picked all of the berries for now. Maybe some will grow back later.");
        }

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "clearing";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
