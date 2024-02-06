package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Spouse extends SuperLocation{

    public Spouse(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void spouse() {

        if (BlackBerriesQuest == 0 && CoatQuest == 0 && VetVisitQuest == 0) {
            VetVisitQuest = 1;
            ui.vetQuestTitleLabel.setText("Pup-uprofen");
            ui.vetQuestObjectiveLabel.setText("  + visit the royal vet");
            playSoundEffect(1);

            ui.mainTextArea.setText("Spouse:\n\"Good morning dear! I hate to be a bother but don't forget that DOGNAME has an appointment in the castle with the King's Vet. It is important to get his medicine so he gets over this cold. DOGNAME loves riding in your knapsack so he should be no trouble to bring along\"");
            ui.choice1.setText("Accept Quest");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "spouseQuest1";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if (BlackBerriesQuest > 0 && CoatQuest > 0 && VetVisitQuest > 0) {
            int spouseTips = new java.util.Random().nextInt(3) + 1;
            playSoundEffect(5);

            if (spouseTips == 1) {
                ui.mainTextArea.setText("Spouse:\n\"Don't forget the blackberries! I always have luck when looking in the forest.\"");
            } else if (spouseTips == 2) {
                ui.mainTextArea.setText("Spouse:\n\"If you feel worn out, try snuggling with your dog.\"");
            } else if (spouseTips == 3) {
                ui.mainTextArea.setText("Spouse:\n\"Remember, you need a new coat. It is already snowing in the mountains. It should be easy to find one at market.\"");
            }

            ui.choice1.setText("Thank for hint");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "farmHouse";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
