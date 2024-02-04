package Equipment;

public class Weapon_Knife extends SuperWeapon {

    public Weapon_Knife(){
        name = "Knife";
        attackSpeed = 1;
    }

    @Override
    public void Damage(){
        //Does 10-20 damage
        damage = new java.util.Random().nextInt(2) + 1;
        damage  = damage * 10;
        attackMessage = ("You stabbed with your knife and it dealt " + damage + " damage.");
    }
}

