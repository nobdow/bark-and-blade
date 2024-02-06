package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.Troll;

public class TrollEncounter extends SuperLocation{

    public TrollEncounter(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void trollEncounter(){
        enemy = new Troll();
        ui.mainTextArea.setText("As you ascend the mountain, you run across a large troll!\n\n" + enemy.name + ": " + enemy.hp + " HP");
        ui.choice1.setText("Fight him");
        ui.choice2.setText("Run Away");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "trollFight";
        game.nextPosition2 = "mountain";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
