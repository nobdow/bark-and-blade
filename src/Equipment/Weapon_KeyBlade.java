package Equipment;

public class Weapon_KeyBlade extends SuperWeapon {

    public Weapon_KeyBlade(){

            name = "Key Shaped Blade";
            attackSpeed = 1;
            description = "Funny looking but does between 30-50 damage per hit.";
    }

        @Override
        public int Damage(){
            //Does 30-50 damage
            damage = new java.util.Random().nextInt(3) + 3;
            damage  = damage * 10;
            attackMessage = ("You slashed with your blade and it dealt " + damage + " damage.");

            return damage;
        }
    }

