package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Forest extends SuperLocation{

    public Forest(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void forest(){
        playSoundEffect(5);

        ui.mainTextArea.setText("You hear the pleasant gurgling of a mountain stream. Soon, the small river crosses your path and a simple bridge lies before you.");
        ui.choice1.setText("Cross the bridge");
        ui.choice2.setText("Drink the fresh water");
        ui.choice3.setText("Let DOGNAME go for a swim");
        ui.choice4.setText("Go to the crossroads");

        game.nextPosition1 = "clearing";
        game.nextPosition2 = "drinkStream";
        game.nextPosition3 = "splashStream";
        game.nextPosition4 = "crossroads";
    }
}
