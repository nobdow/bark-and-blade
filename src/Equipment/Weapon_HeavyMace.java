package Equipment;

public class Weapon_HeavyMace extends SuperWeapon {

    int chargeUp = 0;

    public Weapon_HeavyMace(){

        name = "Heavy Mace";
        attackSpeed = 0.5;
    }

    @Override
    public void Damage(){
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
    }
}

