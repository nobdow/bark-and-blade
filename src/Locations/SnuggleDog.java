package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class SnuggleDog extends SuperLocation{

    public SnuggleDog(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void snuggleDog(){
        playSoundEffect(5);

        if (player.hp <= 99 && snugglePoint == false){
            player.hp = 100;
            ui.hpNumberLabel.setText("" + player.hp);
            snugglePoint = true;
            dogPoints = dogPoints + 1;

            ui.mainTextArea.setText("A quick rest can't hurt.\n\nDOGNAME:\n*Woof in agreeance*\n\nYou wake up feeling fantastic and your dog seems more loyal for the affection.\n[HP restored and companion point earned]");

        }
        else if(player.hp >= 100 & snugglePoint == false){
            snugglePoint = true;
            dogPoints = dogPoints + 1;

            ui.mainTextArea.setText("You feel great and your dog feels more loyal for the snuggles\n[companion point earned]");

        }
        else if(player.hp < 100 && snugglePoint == true){
            player.hp = 100;
            ui.hpNumberLabel.setText("" + player.hp);
            snugglePoint = true;
            dogPoints = dogPoints + 1;

            ui.mainTextArea.setText("You feel revived and your health is restored.");
        }
        else if(player.hp >= 100 && snugglePoint == true){
            ui.mainTextArea.setText("Snuggles with [DOGNAME] are the best!");
            ui.choice1.setText("Continue");
        }

        ui.choice1.setText("Oops, you fell asleep");
        ui.choice2.setText("You and DOGNAME stretch");
        ui.choice3.setText("Get off the couch");
        ui.choice4.setText("");

        game.nextPosition1 = "farmHouse";
        game.nextPosition2 = "farmHouse";
        game.nextPosition3 = "farmHouse";
        game.nextPosition4 = "";
    }

}
