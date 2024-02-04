package Equipment;

public class Weapon_None extends SuperWeapon {

    public Weapon_None(){

        name = "None";
        attackSpeed = 1;
    }

    @Override
    public void Damage(){
        //Does 10 damage
        damage  = 10;
        attackMessage = ("You punched for " + damage + " damage.");
    }
}

