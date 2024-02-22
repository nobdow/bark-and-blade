package Enemies;

import Equipment.Weapon_Knife;

public class Thief extends SuperEnemy {

    public static String stolenWeapon;

    public Thief(){
        name = "Cloaked Figure";
        hp = new java.util.Random().nextInt(2) + 3;
        hp = hp * 10;
    }

    @Override
    public void Damage(){
                attack = new java.util.Random().nextInt(2) + 1;
        attack = attack * 10;
        if(attack == 10) {
            attackMessage = "The thief swung at you with his dagger!";
        }
        else if(attack == 20) {
            attackMessage = "The thief stabbed you with his dagger!";
        }
    }
}
