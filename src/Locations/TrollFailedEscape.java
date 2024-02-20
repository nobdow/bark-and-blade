package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

import java.util.Random;

public class TrollFailedEscape extends SuperLocation{

    public TrollFailedEscape(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void trollFailedEscape(){
        ui.mainTextArea.setText("You tried to escape but it failed.\n\n" + enemy.attackMessage + " You received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
        ui.choice1.setText("Attack again");
        ui.choice2.setText("Run Away");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "trollFight";

        int escapeChange = new Random().nextInt(5) + 1;
        if(escapeChange <= 2) {
            game.nextPosition2 = "trollFailedEscape";
        }

        else if(escapeChange >= 3) {
            game.nextPosition2 = "mountains";
        }

        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
