package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.BanditGrunt;

public class BanditGruntTwoEncounter extends SuperLocation{

    public BanditGruntTwoEncounter(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void banditGruntTwoEncounter(){
            enemy = new BanditGrunt();
            ui.mainTextArea.setText("Bandit Grunt:\n\"My turn!\n\n" + enemy.name + ": " + enemy.hp + " HP");
            ui.choice1.setText("Fight");
            ui.choice2.setText("Run Away");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "banditGruntFight";
            game.nextPosition2 = "mountainPass";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
    }
}
