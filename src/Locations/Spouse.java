package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import java.util.ArrayList;

public class Spouse extends SuperLocation{

    public static int i = 0;

    public Spouse(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void spouse() {
        ui.choice1.setText("");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";


        if (BlackBerriesQuest == 0 && CoatQuest == 0 && VetVisitQuest == 0) {
            VetVisitQuest = 1;
            ui.vetQuestTitleLabel.setText("Pup-uprofen");
            ui.vetQuestObjectiveLabel.setText("  + visit the royal vet");

            ui.mainTextArea.setText(player.spouseName + ":\n\"Good morning dear! I hate to be a bother but don't forget that " + player.dogName + " has an appointment in the castle with the King's Vet. It is important to get his medicine so he gets over this cold. " + player.dogName + " loves riding in your knapsack so he should be no trouble to bring along\"");
            ui.choice1.setText("Accept Quest");

            game.nextPosition1 = "spouseQuest1";

        }
        else if (BlackBerriesQuest > 0 && CoatQuest > 0 && VetVisitQuest > 0) {
            ui.choice1.setText("Thank for hint");

            game.nextPosition1 = "farmHouse";

            ui.mainTextArea.setText(player.spouseName + ":" + spouseTips.get(i));
            i = i + 1;
            if(i >= spouseTips.size()){
                i = 0;
            }

            if(BlackBerriesQuest == 2 && birthdayQuest != 2){
                ui.blackberriesQuestObjectiveLabel.setText("");
                BlackBerriesQuest = 3;
                spouseTips.remove(player.spouseName + ":\n\"Don't forget the blackberries! I always have luck when looking in the forest.\"");

                ui.mainTextArea.setText(player.spouseName + ":\n\"Thank you so much for getting these blackberries. You are the best!\"");
                ui.choice1.setText("Continue");

                game.nextPosition1 = "farmHouse";
            }

            if(birthdayQuest == 2 && BlackBerriesQuest != 2){
                birthdayQuest = 3;
                ui.presentQuestObjectiveLabel.setText("");

                ui.mainTextArea.setText(player.spouseName + ":\n\"Oh you shouldn't have! What a wonderful birthday gift. You know me so well!\"");
                ui.choice1.setText("Continue");
                game.nextPosition1 = "farmHouse";
            }

            if(birthdayQuest == 2 && BlackBerriesQuest == 2){
                ui.presentQuestObjectiveLabel.setText("");
                ui.blackberriesQuestObjectiveLabel.setText("");
                birthdayQuest = 3;
                BlackBerriesQuest = 3;
                spouseTips.remove(player.spouseName + ":\n\"Don't forget the blackberries! I always have luck when looking in the forest.\"");

                ui.mainTextArea.setText(player.spouseName + ":\n\"Oh you shouldn't have! What a wonderful birthday gift. You know me so well! Oh and thank you so much for getting these blackberries. You are the best!\"");
                ui.choice1.setText("Continue");
                game.nextPosition1 = "farmHouse";
            }
        }
    }
}
