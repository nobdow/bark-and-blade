package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.Bear;

public class BearEncounter extends SuperLocation{

    public BearEncounter(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void bearEncounter(){
        playSoundEffect(5);

        if(bearDead == false) {
            enemy = new Bear();
            ui.mainTextArea.setText("You look inside the den and see a large brown bear!\n\n" + enemy.name + ": " + enemy.hp + " HP");
            ui.choice1.setText("Fight him");
            ui.choice2.setText("Run Away");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "bearFight";
            game.nextPosition2 = "clearing";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(bearDead == true) {
            ui.mainTextArea.setText("You look inside the den but now that the bear is gone, there is nothing to see here.");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "clearing";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
