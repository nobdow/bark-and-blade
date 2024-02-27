package Equipment;

public class Weapon_Fists extends SuperWeapon {

    public Weapon_Fists(){

        name = "Fists";
        description = "Not the best weapon, but they do 10 damage per hit.";
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

