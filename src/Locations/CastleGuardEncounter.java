package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.Bear;
import Enemies.CastleGuard;

public class CastleGuardEncounter extends SuperLocation{

    public CastleGuardEncounter(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void castleGuardEncounter(){
            enemy = new CastleGuard();
            ui.mainTextArea.setText("As you slay the previous guard, another rushes forward to take his place.\n\n" + enemy.name + ": " + enemy.hp + " HP");
            ui.choice1.setText("Fight him");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "castleGuardFight";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
    }
}
