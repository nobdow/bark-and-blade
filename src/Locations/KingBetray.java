package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.Bear;
import Enemies.CastleGuard;

public class KingBetray extends SuperLocation{

    public KingBetray(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void kingBetray(){
        enemy = new CastleGuard();

        ui.mainTextArea.setText("King Oswin the Noble:\n\"How dare you! Guards, get them!\"\n\n" + enemy.name + ": " + enemy.hp + " HP");
        ui.choice1.setText("Fight");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "castleGuardFight";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
