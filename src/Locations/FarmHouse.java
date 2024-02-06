package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class FarmHouse extends SuperLocation{

    public FarmHouse(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void farmHouse(){
        playSoundEffect(5);

        if(VetVisitQuest == 0 && BlackBerriesQuest == 0 && CoatQuest == 0 && birthdayQuest == 0) {
            ui.mainTextArea.setText("You are at your cozy farm house in the living room.");
            ui.choice1.setText("Talk to spouse");
            ui.choice2.setText("Snuggle with your dog");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "spouse";
            game.nextPosition2 = "snuggleDog";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if (VetVisitQuest != 0 && BlackBerriesQuest != 0 && CoatQuest != 0 && birthdayQuest != 0 && spouseGift == false) {
            ui.mainTextArea.setText("You are at your cozy farm house in the living room. DOGNAME crawls into your knapsack and you hoist it onto your back.");
            ui.choice1.setText("Talk to spouse");
            ui.choice2.setText("Snuggle with your dog");
            ui.choice3.setText("Leave");
            ui.choice4.setText("");

            game.nextPosition1 = "spouse";
            game.nextPosition2 = "snuggleDog";
            game.nextPosition3 = "spouseGift";
            game.nextPosition4 = "";
        }

        else if (VetVisitQuest != 0 && BlackBerriesQuest != 0 && CoatQuest != 0 && birthdayQuest != 0 && spouseGift == true) {
            ui.mainTextArea.setText("You are at your cozy farm house in the living room.");
            ui.choice1.setText("Talk to spouse");
            ui.choice2.setText("Snuggle with your dog");
            ui.choice3.setText("Leave");
            ui.choice4.setText("");

            game.nextPosition1 = "spouse";
            game.nextPosition2 = "snuggleDog";
            game.nextPosition3 = "crossroads";
            game.nextPosition4 = "";
        }
    }
}
