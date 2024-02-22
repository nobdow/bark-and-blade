package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.*;

public class DefaultSetup extends SuperLocation{

    public DefaultSetup(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void defaultSetup(){
        player.hp = 100;
        player.maxHP = 100;
        ui.hpNumberLabel.setText("" + player.hp);
        VetVisitQuest = 0;
        BlackBerriesQuest = 0;
        CoatQuest = 0;
        snugglePoint = false;
        bush = false;
        hasCherries = false;
        dogPoints = 0;
        coins = 0;
        ui.coinCountLabel.setText(coins + "");
        spouseGift = false;
        bearDead = false;
        birthdayQuest = 0;
        deathCounter = 0;
        drunkMoney = 30;
        snuggleCount = 0;
        boughtCoat = false;
        SuperWeapon.equippedWeapon = 0;



        //player.setCurrentWeapon(Weapon_Knife);
        weaponList.add(none);
        ui.weaponNameLabel.setText(weaponList.getFirst().name);

        //player.currentWeapon = new Weapon_None();
        //ui.weaponNameLabel.setText(player.currentWeapon.name);
        soundEffect.setFile(0);
        soundEffect.play();
    }
}
