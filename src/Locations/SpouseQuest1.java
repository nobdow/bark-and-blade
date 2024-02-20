package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class SpouseQuest1 extends SuperLocation {

    public SpouseQuest1(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void spouseQuest1() {
        stopSoundEffect();
        playSoundEffect(1);
        BlackBerriesQuest = 1;
        ui.blackberriesQuestTitleLabel.setText("Ye Olde Grocer");
        ui.blackberriesQuestObjectiveLabel.setText("  + obtain blackberries");

        ui.mainTextArea.setText(player.spouseName + ":\n\"Oh, also, I need black berries for cobbler tonight. Can you swing by the market and get some for me?\"");
        ui.choice1.setText("Oops, now \"Accept Quest\"");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "spouseQuest2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
