package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Bush extends SuperLocation{

    public Bush(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void bush(){
        bush = true;
        int bushFind = new java.util.Random().nextInt(3);
        playSoundEffect(5);

        ui.mainTextArea.setText("Dog:\n\"Woof woof!\"\n\nYour dog seems to be barking at a bush.");
        ui.choice1.setText("Shake the bush");
        ui.choice2.setText("Avoid the bush");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

        if(bushFind == 0){
            game.nextPosition1 = "bushWand";
        }
        else if(bushFind == 1){
            game.nextPosition1 = "bushCoins";
        }
        else if(bushFind == 2){
            game.nextPosition1 = "bushBandit";
        }
    }
}
