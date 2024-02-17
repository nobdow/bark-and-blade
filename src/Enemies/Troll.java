package Enemies;

public class Troll extends SuperEnemy {

    public Troll(){
        name = "Mountain Troll";
        hp = 80;
    }

    @Override
    public void Damage(){
        int chance = new java.util.Random().nextInt(4);

        if(chance < 2 || chance >= 2 && hp > 40) {
            attack = new java.util.Random().nextInt(2) + 1;
            attack = attack * 10;
            attackMessage = "The troll smashed his club into you!";
        }
        else if (chance >= 2 && hp <= 40) {
            attack = 0;
            hp = hp + 30;
            attackMessage = "The troll recovered 30HP!";
        }
//        else if (chance >= 2 && hp > 40) {
//            attack = new java.util.Random().nextInt(2) + 1;
//            attack = attack * 10;
//            attackMessage = "The troll smashed his club into you!";
//        }
    }
}
