package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class DebugSetup extends SuperLocation{

    public DebugSetup(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void debugSetup(){
        player.hp = 100;
        player.maxHP = 100;
        ui.hpNumberLabel.setText("" + player.hp);
        coins = 0;
        ui.coinCountLabel.setText(coins + "");
//        player.currentWeapon = new Weapon_Knife();
//        ui.weaponNameLabel.setText(player.currentWeapon.name);
        stopSoundEffect();
        coins = 20;
        spouseGift = true;
        boughtCoat = true;
        Mountains.mountains();
    }
}
