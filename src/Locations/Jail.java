package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Jail extends SuperLocation{

    public Jail(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void jail(){
        if(jailTime < 26 && coins >= 30) {
            jailTime = jailTime + 1;

            ui.mainTextArea.setText("Guard:\n\"The king has passed sentence on your crime. You will serve either one year in jail or pay a 30 coin fine.");
            ui.choice1.setText("Wait a fortnight");
            ui.choice2.setText("Pay fine");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "jail";
            game.nextPosition2 = "bailBond";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(jailTime < 26 && coins < 30) {
            jailTime = jailTime + 1;

            ui.mainTextArea.setText("Guard:\n\"The king has passed sentence on your crime. You will serve one year in jail. You could also pay a 30 coin fine but you don't seem to have the coin.");
            ui.choice1.setText("Wait a fortnight");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "jail";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(jailTime == 26){
            ui.mainTextArea.setText("Guard:\n\"Can you believe its already been 365 days. I guess you are free to go.");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "town";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
