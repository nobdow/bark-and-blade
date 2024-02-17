package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.Weapon_ChaosWand;
import Equipment.Weapon_HeavyMace;
import Equipment.Weapon_Knife;
import Equipment.Weapon_None;

import java.lang.reflect.Constructor;

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

//        weaponList.add(Weapon_None.class);
//        Class<?> weaponName = weaponList.get(0)
//        try {
//            Constructor<?> constructor = weaponName.getDeclaredConstructor();
//            Object instance = constructor.newInstance();
//            if (instance instanceof MyClass) {
//                storage.currentWeapon = (MyClass) instance;
//            }
//
//            player.currentWeapon = new instance;
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        //int weaponIndex = weaponList.indexOf("Weapon_None.class");
        //String weaponName = weaponList.get(weaponIndex);
        //Class<?> weaponClass = Class.forName(weaponName);
        // Object instance = weaponClass.newInstance();
        player.currentWeapon = new Weapon_None();
        ui.weaponNameLabel.setText(player.currentWeapon.name);
        soundEffect.setFile(0);
        soundEffect.play();
    }
}
