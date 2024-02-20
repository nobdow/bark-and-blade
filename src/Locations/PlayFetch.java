package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class PlayFetch extends SuperLocation{

    public PlayFetch(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void playFetch(){
        if (fetchPoint == false) {
            dogPoints = dogPoints + 1;
            fetchPoint = true;
            if(dogPoints == 3) {
                ui.mainTextArea.setText("Fetch has to be " + player.dogName + "'s favorite game. He is now more loyal to you but is barking and trying to get your attention. It seems like he is on the scent trail for something. He wants you to go to either the forest or the mountains, you cannot tell.\n[Companion point earned]");
            }
            else if(dogPoints != 3){
                ui.mainTextArea.setText("Fetch has to be " + player.dogName + "'s favorite game. He is now more loyal to you.\n[Companion point earned]");
            }
        }
        else if (fetchPoint == true) {
            ui.mainTextArea.setText("Fetch has to be " + player.dogName + "'s favorite game.");
        }

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "mountains";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
