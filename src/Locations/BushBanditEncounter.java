package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.BanditBush;

public class BushBanditEncounter extends SuperLocation{

    public BushBanditEncounter(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void bushBanditEncounter(){
        enemy = new BanditBush();

        ui.mainTextArea.setText("You shake it and a gnarly looking bandit appears. He says he is here to rob you.\n\n" + enemy.name + ": " + enemy.hp + " HP");
        ui.choice1.setText("Fight him");
        ui.choice2.setText("Give him your coins");
        ui.choice3.setText("Run Away");
        ui.choice4.setText("");

        game.nextPosition1 = "forestBanditFight";
        game.nextPosition2 = "robbed";
        game.nextPosition3 = "forest";
        game.nextPosition4 = "";
    }
}
