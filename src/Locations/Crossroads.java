package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Crossroads extends SuperLocation{

    public Crossroads(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void crossroads(){
        ui.mainTextArea.setText("You notice a sharp chill as the wind rushes down from the mountains. You find yourself at a crossroads");
        snuggleCount = 0;

        if(bush == false) {
            ui.choice1.setText("Mosey over to town");
            ui.choice2.setText("Head into the forest");
            ui.choice3.setText("Scramble up the mountains");
            ui.choice4.setText("Return to your farmhouse");

            game.nextPosition1 = "town";
            game.nextPosition2 = "bush";
            game.nextPosition3 = "mountains";
            game.nextPosition4 = "farmHouse";
        }
        else if(bush == true){
            ui.choice1.setText("Go into town");
            ui.choice2.setText("Go to the forest");
            ui.choice3.setText("WIP // Go up to the mountains");
            ui.choice4.setText("Go to your farmhouse");

            game.nextPosition1 = "town";
            game.nextPosition2 = "forest";
            game.nextPosition3 = "mountains";
            game.nextPosition4 = "farmHouse";
        }
    }
}
