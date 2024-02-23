package Enemies;

import Equipment.*;
import Locations.SuperLocation;

public class Thief extends SuperEnemy {

    public static String stolenWeapon;

    public Thief() {
        name = "Cloaked Figure";
        hp = new java.util.Random().nextInt(2) + 3;
        hp = hp * 10;
    }

    @Override
    public void Damage() {
//        if(Thief.stolenWeapon == SuperLocation.knife.name) {
//            attack = Weapon_Knife.Damage();
//        }
//        else if(Thief.stolenWeapon == SuperLocation.chaosWand.name){
//            attack = Weapon_ChaosWand.Damage();
//        }
//        else if(Thief.stolenWeapon == SuperLocation.diceSet.name){
//            attack = Weapon_DiceSet.Damage();
//        }
//        else if(Thief.stolenWeapon == SuperLocation.heavyMace.name){
//            attack = Weapon_HeavyMace.Damage();
//        }
//        else if(Thief.stolenWeapon == SuperLocation.keyBlade.name){
//            attack = Weapon_KeyBlade.Damage();
//        }
//        else if(Thief.stolenWeapon == SuperLocation.pointyStick.name){
//            attack = Weapon_PointyStick.Damage();
//        }
        attack = new java.util.Random().nextInt(2) + 2;
        attack = attack * 10;
        if (attack == 20) {
            attackMessage = "The thief whacked you in the chest with his club!";
        } else if (attack == 30) {
            attackMessage = "The thief smashed your head with his club!";
        }
    }
}
