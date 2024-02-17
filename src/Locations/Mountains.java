package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Mountains extends SuperLocation{

    public Mountains(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void mountains(){
        ui.choice1.setText("Climb the pass");
        ui.choice2.setText("Play fetch with the bones");
        ui.choice3.setText("Go to the crossroads");
        ui.choice4.setText("");

        game.nextPosition1 = "mountainPass";
        game.nextPosition2 = "playFetch";
        game.nextPosition3 = "crossroads";
        game.nextPosition4 = "";

        if(trollDead == false) {
            ui.mainTextArea.setText("You arrive at the foot of the mountains. It looks like there is a snow covered pass that goes up towards the top. There are also some bones at your feet which make you wonder if something dangerous lives up in the pass.");
        }

        else if(trollDead == true) {
            ui.mainTextArea.setText("You arrive at the foot of the mountains. There is a snow covered pass that goes up towards the top and there are also some bones at your feet.");
        }
    }
}
