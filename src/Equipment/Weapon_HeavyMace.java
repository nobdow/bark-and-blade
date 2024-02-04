package Equipment;

public class Weapon_HeavyMace extends SuperWeapon {

    public Weapon_HeavyMace(){

        name = "Heavy Mace";
        attackSpeed = 0.5;

    }

    @Override
    public void Damage(){
        //Does 100 damage
        damage  = 100;

        attackMessage = ("You bludgeon with your mace and it dealt " + damage + " damage.");
    }
}

