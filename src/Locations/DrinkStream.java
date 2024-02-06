package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class DrinkStream extends SuperLocation{

    public DrinkStream(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void drinkStream(){
        playSoundEffect(5);

        if (player.hp <= 70) {
            player.hp = player.hp + 30;
            ui.hpNumberLabel.setText("" + player.hp);
            ui.mainTextArea.setText("You drank some of the water from the stream and it refreshes you.\n(+ 30HP)");
        }

        else if (player.hp > 70 && player.hp < 100) {
            ui.mainTextArea.setText("You drank some of the water from the stream and it refreshes you.\n(+ " + ((player.hp - 100) * -1) + "HP)");
            player.hp = 100;
            ui.hpNumberLabel.setText("" + player.hp);
        }

        else if (player.hp == 100) {
            ui.mainTextArea.setText("You drank some of the water from the stream and it refreshes you.");
        }

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "forest";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
