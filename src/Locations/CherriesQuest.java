package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class CherriesQuest extends SuperLocation{

    public CherriesQuest(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void cherriesQuest(){
        if(cherriesQuest == 0){
            cherriesQuest = 1;
            ui.mainTextArea.setText("\"Baker:\n\"Oh excellent! Please hurry as she is expecting this cake soon.\"");
            ui.choice1.setText("Hand over cherries");
            ui.choice2.setText("Return to marketplace");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "cherriesQuest";
            game.nextPosition2 = "marketplace";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(hasCherries == false && cherriesQuest == 1) {
            ui.mainTextArea.setText("\"Baker:\n\"Please, this is no time to joke. I need cherries!\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "baker";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(hasCherries == true && cherriesQuest == 1) {
            cherriesQuest = 2;
            dogPoints = dogPoints + 1;
            coins = coins + 10;
            ui.coinCountLabel.setText(coins + "");
            ui.blackberriesQuestObjectiveLabel.setText("  + return to wife");
            hasBlackBerries = true;
            BlackBerriesQuest = 2;
            stopSoundEffect();
            playSoundEffect(1);

            ui.mainTextArea.setText("\"Baker:\n\"I am in your debt! Here are my leftover blackberries, some coins, and even a treat for your pup!\"\n\n" + player.dogName + " is more loyal to you and seems like he is on the scent trail for something.\n[You obtained 10 coins, blackberries and earned a companion point]");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "marketplace";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
