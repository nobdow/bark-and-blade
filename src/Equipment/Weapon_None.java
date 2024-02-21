package Equipment;

public class Weapon_None extends SuperWeapon {

    public Weapon_None(){

        name = "None";
        attackSpeed = 1;
        equipped = false;
    }

    @Override
    public int Damage(){
        //Does 10 damage
        damage  = 10;
        attackMessage = ("You punched for " + damage + " damage.");
        return damage;
    }
}

