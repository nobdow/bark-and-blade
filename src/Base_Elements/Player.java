package Base_Elements;

import Equipment.*;

//public class Player {
//
//    public static int hp;
//    public static int maxHP;
//    public SuperWeapon currentWeapon;
//}

import java.util.ArrayList;

public class Player {

    public static String playerName;
    public static String spouseName;
    public static String dogName;
    public static int hp;
    public static int maxHP;
    public int weaponCapacity;
    public SuperWeapon currentWeapon;
    public ArrayList<SuperWeapon> weapons;

    public boolean isOverburdened() {
        // -1 accounts for the 0 index
        return (this.weapons.size() >= (this.weaponCapacity - 1));
    }

    public void setCurrentWeapon(SuperWeapon w){
        this.currentWeapon = w;
    }

    // returns true if weapon was added successfully
    public boolean addWeapon(SuperWeapon w) {
        if (!this.isOverburdened()) {
            weapons.add(w);
            return true;
        }
        return false;
    }

    public SuperWeapon getCurrentWeapon() {
        return this.currentWeapon;
    }
}