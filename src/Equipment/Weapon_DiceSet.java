package Equipment;

public class Weapon_DiceSet extends SuperWeapon {

    public Weapon_DiceSet() {

        name = "Set of Sharp Dice";
        attackSpeed = 1;
    }

    @Override
    public int Damage(){
        //Does 6-60 damage
        int d4, d6, d8, d10, d12, d20;
        d4 = new java.util.Random().nextInt(4) + 1;
        d6 = new java.util.Random().nextInt(6) + 1;
        d8 = new java.util.Random().nextInt(8) + 1;
        d10 = new java.util.Random().nextInt(10) + 1;
        d12 = new java.util.Random().nextInt(12) + 1;
        d20 = new java.util.Random().nextInt(20) + 1;
        damage = (d4 + d6 + d8 + d10 + d12 + d20);

        attackMessage = ("You rolled a " + d4 + ", " + d6 + ", " + d8 + ", " + d10 + ", " + d12 + ", and " + d20 + " totalling " + damage + " damage.");

        return d4;
    }
}

