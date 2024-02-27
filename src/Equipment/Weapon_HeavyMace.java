package Equipment;

public class Weapon_HeavyMace extends SuperWeapon {

    public int chargeUp = 0;

    public Weapon_HeavyMace(){

        name = "Heavy Mace";
        attackSpeed = 0.5;
        description = "100 damage but with a charge up before each swing.";
    }

    @Override
    public int Damage(){
        if(chargeUp == 0){
            chargeUp = chargeUp + 1;
            damage = 0;
            attackMessage = ("You pull back your mace to swing...");
        }
        else if(chargeUp == 1) {
            chargeUp = chargeUp - 1;
            damage  = 100;
            attackMessage = ("You bludgeon with your mace and it dealt " + damage + " damage.");
        }
        return damage;
    }
}

