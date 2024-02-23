package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.*;

public class SpouseGift extends SuperLocation{

    public SpouseGift(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void spouseGift(){
        spouseGift = true;
        weaponList.add(knife);
        //weaponList.getLast().isEquipped(true);
        ui.weaponNameLabel.setText(weaponList.getLast().name);
        SuperWeapon.equippedWeapon += 1;
        coins = coins + 15;
        ui.coinCountLabel.setText(coins + "");
        stopSoundEffect();
        playSoundEffect(4);

        ui.mainTextArea.setText(player.spouseName + ":\n\"Wait, its dangerous to go alone. Have my " + weaponList.getLast().name.toLowerCase() + " and a few coins to run your errands!\"\n[You obtained a knife and 15 coins]");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "crossroads";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
