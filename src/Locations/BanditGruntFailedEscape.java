package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

import java.util.Random;

public class BanditGruntFailedEscape extends SuperLocation{

    public BanditGruntFailedEscape(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void banditGruntFailedEscape(){
        ui.mainTextArea.setText("You tried to escape but it failed.\n\n" + enemy.attackMessage + " You received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
        ui.choice1.setText("Attack again");
        ui.choice2.setText("Run Away");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "banditGruntFight";

        int escapeChange = new Random().nextInt(5) + 1;
        if(escapeChange <= 2) {
            game.nextPosition2 = "banditGruntFailedEscape";
        }

        else if(escapeChange >= 3) {
            game.nextPosition2 = "hideout";
        }

        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
