package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class SpouseQuest3 extends SuperLocation{

    public SpouseQuest3(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void spouseQuest3(){
        birthdayQuest = 1;
        stopSoundEffect();
        playSoundEffect(1);
        ui.presentQuestTitleLabel.setText("That's tomorrow!?!");
        ui.presentQuestObjectiveLabel.setText("  + obtain a gift");

        ui.mainTextArea.setText("Spouse:\n\"Last thing! While grabbing your coat, if you see something I'd like, it wouldn't hurt my feelings if you got me something fun and new! It is my birthday tomorrow.\"");
        ui.choice1.setText("Birthday Quest!");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "farmHouse";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
