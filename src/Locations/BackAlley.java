package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BackAlley extends SuperLocation{

    public BackAlley(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void backAlley(){
        ui.mainTextArea.setText("In one of the town's back alleys you see some seedy looking things going on.");

        if(oldHagQuest < 2 && thiefDead == false && drunkDead == false) {
            ui.choice1.setText("Gamble with the town drunk");
            ui.choice2.setText("Approach the dark cloaked figure");
            ui.choice3.setText("Approach the mysterious old hag");
            ui.choice4.setText("Return to the town center");

            game.nextPosition1 = "gamble";
            game.nextPosition2 = "thiefEncounter";
            game.nextPosition3 = "oldHag";
            game.nextPosition4 = "town";
        }
        else if (oldHagQuest == 2 && thiefDead == false && drunkDead == false){
            ui.choice1.setText("Gamble with the town drunk");
            ui.choice2.setText("Approach the dark cloaked figure");
            ui.choice3.setText("Return to the town center");
            ui.choice4.setText("");

            game.nextPosition1 = "gamble";
            game.nextPosition2 = "thiefEncounter";
            game.nextPosition3 = "town";
            game.nextPosition4 = "";
        }
        else if(oldHagQuest < 2 && thiefDead == true && drunkDead == false) {
            ui.choice1.setText("Gamble with the town drunk");
            ui.choice2.setText("Approach the mysterious old hag");
            ui.choice3.setText("Return to the town center");
            ui.choice4.setText("");

            game.nextPosition1 = "gamble";
            game.nextPosition2 = "oldHag";
            game.nextPosition3 = "town";
            game.nextPosition4 = "";
        }
        else if(oldHagQuest == 2 && thiefDead == true && drunkDead == false) {
            ui.choice1.setText("Gamble with the town drunk");
            ui.choice2.setText("Return to the town center");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "drunk";
            game.nextPosition2 = "town";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(oldHagQuest < 2 && thiefDead == false && drunkDead == true) {
            ui.choice1.setText("Approach the dark cloaked figure");
            ui.choice2.setText("Approach the mysterious old hag");
            ui.choice3.setText("Return to the town center");
            ui.choice4.setText("");

            game.nextPosition1 = "thiefEncounter";
            game.nextPosition2 = "oldHag";
            game.nextPosition3 = "town";
            game.nextPosition4 = "";
        }
        else if (oldHagQuest == 2 && thiefDead == false && drunkDead == true){
            ui.choice1.setText("Approach the dark cloaked figure");
            ui.choice2.setText("Return to the town center");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "thiefEncounter";
            game.nextPosition2 = "town";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(oldHagQuest < 2 && thiefDead == true && drunkDead == true) {
            ui.choice1.setText("Approach the mysterious old hag");
            ui.choice2.setText("Return to the town center");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "oldHag";
            game.nextPosition2 = "town";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(oldHagQuest == 2 && thiefDead == true && drunkDead == true) {
            ui.mainTextArea.setText("As you go through the back alley, it seems things have calmed down.");
            ui.choice1.setText("Return to the town center");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "town";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
