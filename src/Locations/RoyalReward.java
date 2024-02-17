package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class RoyalReward extends SuperLocation{

    public RoyalReward(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void royalReward(){
        if (banditLeaderCompanion == false) {
            ui.mainTextArea.setText("King Oswin the Noble:\n\"To show my gratitude, I herby knight you and your dog into my royal service. This privilege means your farm is now exempt from taxes and you are welcome to procure the services of the royal vet at no charge.\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "royalVet";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(banditLeaderCompanion == true) {
            ui.mainTextArea.setText("King Oswin the Noble:\n\"What did the bandit mean by betrayal? Hmm, never mind. Thank you for returning my crown, but maybe try not to keep such bad company. The royal vet tells me he has an appointment with you so you better be on your way.\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "royalVet";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
