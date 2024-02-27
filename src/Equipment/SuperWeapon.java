package Equipment;

public class SuperWeapon {

    public String name;
    public String attackMessage;
    public double attackSpeed;
    public int damage;
    public boolean equipped;
    public static int equippedWeapon;
    public String description;

    public int Damage(){
        return damage;
    }
}

//    None = 10
//    Knife = 20-30
//    Wand = 0, 20 (magic missile), 40 (fireball),  60 (meteor swarm), 80 (disintegrate)
//    Dice = 6-60
//    Pointy Stick = 50
//    Key Blade = 30-50
//    Heavy Mace = 100