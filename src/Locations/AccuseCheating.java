package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class AccuseCheating extends SuperLocation{

    public AccuseCheating(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void accuseCheating(){
        ui.mainTextArea.setText("Drunk:\n\"How dare you! I'm gonna beat you up.\"\n\n" + enemy.name + ": " + enemy.hp + " HP");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run away");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "drunkFight";
        game.nextPosition2 = "backAlley";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
