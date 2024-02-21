package Equipment;

public class Weapon_Knife extends SuperWeapon {

    public Weapon_Knife(){
        name = "Knife";
        attackSpeed = 1;
        equipped = false;
    }

    @Override
    public int Damage(){
        //Does 10-20 damage
        attackMessage = ("You stabbed with your knife and it dealt " + damage + " damage.");
        damage = new java.util.Random().nextInt(2) + 1;
        damage  = damage * 10;
        return damage;
    }
}

