package Enemies;

public class Drunk extends SuperEnemy {

    public Drunk(){
        name = "Drunk";
        hp = new java.util.Random().nextInt(2) + 1;
        hp = hp * 10;
        attackMessage = "The drunk swung his fist at you.";
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(1) + 1;
        attack = attack * 10;
    }
}
