package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class ThroneRoom extends SuperLocation{

    public ThroneRoom(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void throneRoom(){
        if(banditLeaderCompanion == false) {
            ui.mainTextArea.setText("King Oswin the Noble:\n\"Thank you for searching out and returning my crown. You have proved to be far braver and more heroic than your farm lifestyle might indicate.\"");
            ui.choice1.setText("Hand over crown");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "royalReward";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(banditLeaderCompanion == true) {
            ui.mainTextArea.setText("King Oswin the Noble:\n\"Thank you for searching out and returning my crown. You have proved to be far braver and more heroic than your farm lifestyle might indicate.\"");
            ui.choice1.setText("Betray bandit, return crown");
            ui.choice2.setText("Betray king, keep crown");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "banditBetray";
            game.nextPosition2 = "kingBetray";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
