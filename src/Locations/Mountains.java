package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.Weapon_HeavyMace;
import Equipment.Weapon_PointyStick;

public class Mountains extends SuperLocation{

    public Mountains(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void mountains(){
        if(dogPoints == 3) {
            player.currentWeapon = new Weapon_HeavyMace();
            ui.weaponNameLabel.setText(player.currentWeapon.name);
            stopSoundEffect();
            playSoundEffect(4);
            dogPoints = dogPoints + 1;

            ui.mainTextArea.setText(player.dogName + ":\n\"Woof woof!\"\n\nIt looks like your dog has found a new weapon. It is a shiny silver mace!\n[You obtained a heavy mace]");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "mountains";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(dogPoints != 3) {
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
}
