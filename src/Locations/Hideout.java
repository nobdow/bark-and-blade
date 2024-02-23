package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Hideout extends SuperLocation{

    public Hideout(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void hideout(){
        if(banditLeaderDead == false && banditLeaderCompanion == false) {
            ui.mainTextArea.setText("Stepping up to the door of the hideout, you hear some voices inside talking.");
            ui.choice1.setText("Run in shouting your name");
            ui.choice2.setText("Sneak around back");
            ui.choice3.setText("Knock like a normal person");
            ui.choice4.setText("Return to the pass");


            game.nextPosition1 = "banditGruntOneEncounter";
            game.nextPosition2 = "banditGruntOneEncounter";
            game.nextPosition3 = "noSoliciting";
            game.nextPosition4 = "mountainPass";
        }
        else if(banditLeaderDead == false && banditLeaderCompanion == true) {
            ui.mainTextArea.setText("Bandit Leader:\n\"What are we doing back here? We get to get to the castle to kill the king.\"");
            ui.choice1.setText("Return to the pass");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "mountainPass";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

        else if(banditLeaderDead == true) {
            ui.mainTextArea.setText("You look around the bandit leader's camp but it appears you got everything from it the first time you were here.");
            ui.choice1.setText("Return to the pass");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "mountainPass";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
