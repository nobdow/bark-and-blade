package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.Troll;

public class MountainPass extends SuperLocation{

    public MountainPass(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void mountainPass(){
        if(boughtCoat == false) {
            ui.mainTextArea.setText("The snow is bitter cold and deep. You try to ascend the pass but you have to turn around. Maybe if you had warmer gear you could make it up.");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "mountains";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

        else if(boughtCoat == true && trollDead == false) {
            enemy = new Troll();
            ui.mainTextArea.setText("As you climb the pass, you see a cave and from inside a troll roars.\n\n" + enemy.name + ": " + enemy.hp + " HP");
            ui.choice1.setText("Fight");
            ui.choice2.setText("Run away");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "trollFight";
            game.nextPosition2 = "mountains";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

        else if(boughtCoat == true && trollDead == true) {
            ui.mainTextArea.setText("As you climb the pass, you see a cave where the troll you defeated used to live and just past it, the bandit hideout.");
            ui.choice1.setText("Enter the hideout");
            ui.choice2.setText("Climb down the mountain");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "hideout";
            game.nextPosition2 = "mountains";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
