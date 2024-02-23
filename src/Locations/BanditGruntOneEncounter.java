package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.BanditGrunt;

import java.util.Random;

import static Locations.BanditLeaderEncounter.banditLeaderEncounter;

public class BanditGruntOneEncounter extends SuperLocation{

    public BanditGruntOneEncounter(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void banditGruntOneEncounter(){
        if(banditGruntsDead <= 1) {
            enemy = new BanditGrunt();
            ui.mainTextArea.setText("Bandit Leader:\n\"Who are you? Get him lads!\n\n" + enemy.name + ": " + enemy.hp + " HP");
            ui.choice1.setText("Fight");
            ui.choice2.setText("Run Away");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "banditGruntFight";
            game.nextPosition2 = "hideout";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(banditGruntsDead == 2) {
            banditLeaderEncounter();
        }
    }
}
