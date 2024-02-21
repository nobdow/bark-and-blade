package Equipment;

public class Weapon_PointyStick extends SuperWeapon {

    public Weapon_PointyStick(){

        name = "Really Pointy Stick";
        attackSpeed = 1;
    }

    @Override
    public int Damage(){
        //Does 50 damage
        damage  = 50;
        attackMessage = ("You poked with your stick and it dealt " + damage + " damage.");
        return 0;
    }
}

