package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.BanditGrunt;
import Enemies.BanditLeader;

public class BanditLeaderEncounter extends SuperLocation{

    public BanditLeaderEncounter(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void banditLeaderEncounter(){
        enemy = new BanditLeader();
        ui.mainTextArea.setText("Bandit Leader:\n\"Wow, that was some quick work of my men. I would hate to kill someone with such talent. What would you say about helping me? I've got the king's crown and if you wanted to team up with me, we can \"return it\" to him.\n\n" + enemy.name + ": " + enemy.hp + " HP");
        ui.choice1.setText("Team up with the bandit leader");
        ui.choice2.setText("Fight him");
        ui.choice3.setText("Run Away");
        ui.choice4.setText("");

        game.nextPosition1 = "banditLeaderCompanion";
        game.nextPosition2 = "banditLeaderFight";
        game.nextPosition3 = "hideout";
        game.nextPosition4 = "";
    }
}
