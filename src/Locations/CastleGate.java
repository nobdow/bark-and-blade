package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class CastleGate extends SuperLocation{

    public CastleGate(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void castleGate(){
        if(hasCrown == false) {
            ui.mainTextArea.setText("Guard:\n\"Hello adventurer. I'm sorry but the castle is closed. The kings crown was stolen and taken to the mountains so he has closed the gate until it is returned.");
            ui.choice1.setText("Return to town");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "town";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(hasCrown == true) {
            ui.mainTextArea.setText("Guard:\n\"Hello farmer. I'm sorry but the castle is closed. The kings crown was stolen and taken to the mountains so he has closed the gate until it is returned.");
            ui.choice1.setText("Show him the crown");
            ui.choice2.setText("Return to town");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "showCrown";
            game.nextPosition2 = "town";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
