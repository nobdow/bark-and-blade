package Equipment;

public class Weapon_ChaosWand extends SuperWeapon {

    public Weapon_ChaosWand(){

        name = "Chaos Wand";
        attackSpeed = 1;
    }

    @Override
    public int Damage() {
        //Does either 0, 20, 40, 60,or 80 damage
        damage = new java.util.Random().nextInt(5) + 1;
        if (damage == 1) {
            damage = 0;
            attackMessage = ("You cast your wand but it just fizzled dealing " + damage + " damage.");
        } else if (damage == 2) {
            damage = 20;
            attackMessage = ("You cast magic missile dealing " + damage + " damage.");
        } else if (damage == 3) {
            damage = 40;
            attackMessage = ("You cast fireball dealing " + damage + " damage.");
        } else if (damage == 4) {
            damage = 60;
            attackMessage = ("You cast meteor swarm dealing " + damage + " damage.");
        } else if (damage == 5) {
            damage = 80;
            attackMessage = ("You cast disintegrate dealing " + damage + " damage.");
        }
        return damage;
    }
}