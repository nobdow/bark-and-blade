package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.Weapon_Knife;
import Equipment.Weapon_PointyStick;

public class Forest extends SuperLocation{

    public Forest(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void forest(){
        if(dogPoints == 3) {
            player.currentWeapon = new Weapon_PointyStick();
            ui.weaponNameLabel.setText(player.currentWeapon.name);
            stopSoundEffect();
            playSoundEffect(4);
            dogPoints = dogPoints + 1;

            ui.mainTextArea.setText("DOGNAME:\n\"Woof woof!\"\n\nIt looks like your dog has found a new weapon. It is a super sharp stick!\n[You obtained a really pointy stick]");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "forest";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

        else if(dogPoints != 3) {
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
}
