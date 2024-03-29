package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class BanditLeaderWin extends SuperLocation{

    public BanditLeaderWin(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void banditLeaderWin(){
        if(banditLeaderCompanion == false) {
            ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and collect the king's crown off of his body.\n[You obtained the king's crown]");
            banditLeaderDead = true;
            hasCrown = true;
            stopSoundEffect();
            playSoundEffect(4);

            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "mountainPass";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(banditLeaderCompanion == true) {
            ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase());
            banditLeaderDead = true;

            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "royalReward";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
