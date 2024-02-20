package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class SpouseQuest2 extends SuperLocation{

    public SpouseQuest2(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void spouseQuest2(){
        CoatQuest = 1;
        stopSoundEffect();
        playSoundEffect(1);
        ui.coatQuestTitleLabel.setText("Winter is Coming");
        ui.coatQuestObjectiveLabel.setText("  + obtain a coat");

        ui.mainTextArea.setText(player.spouseName + ":\n\"By the way, winter is coming, so you need a new coat! It is already snowing in the mountains. Brr. The tailor mentioned a new merch drop this week. Check it out!\"");
        ui.choice1.setText("No problem, \"Accept Quest(s)\"");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "spouseQuest3";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
