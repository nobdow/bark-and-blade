package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.BanditLeader;

public class BanditBetray extends SuperLocation{

    public BanditBetray(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void banditBetray(){
        enemy = new BanditLeader();

        ui.mainTextArea.setText("Bandit Leader:\n\"How dare you, we had a deal! I am going to kill you for this.\"\n\n" + enemy.name + ": " + enemy.hp + " HP");
        ui.choice1.setText("Fight");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "banditLeaderFight";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
