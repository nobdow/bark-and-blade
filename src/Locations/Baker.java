package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Baker extends SuperLocation{

    public Baker(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void baker() {
        if(cherriesQuest == 0) {
            ui.mainTextArea.setText("Baker:\n\"Welcome to my shop adventurer! Oh you are looking for blackberries? Well, can you help me with something and then I will give you some? I tried to make the queen my special cherry cake but I only had blackberries so this cake is a lie! Can you pick me some cherries so I can remake it?\"");
            ui.choice1.setText("Offer to help");
            ui.choice2.setText("Return to marketplace");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "cherriesQuest";
            game.nextPosition2 = "marketplace";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(cherriesQuest == 1) {
            ui.mainTextArea.setText("Baker:\n\"Have you found some cherries yet?\"");
            ui.choice1.setText("Hand over cherries");
            ui.choice2.setText("Return to marketplace");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "cherriesQuest";
            game.nextPosition2 = "marketplace";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(cherriesQuest == 2) {
            ui.mainTextArea.setText("Baker:\n\"The queen will be so excited, I must get to work.\"");
            ui.choice1.setText("Return to marketplace");
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
