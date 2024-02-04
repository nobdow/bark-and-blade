package Enemies;

public class Bear extends SuperEnemy {

    public Bear(){
        name = "Bear";
        hp = new java.util.Random().nextInt(3) + 5;
        hp = hp * 10;
        attackMessage = "The bear slugged you with his ginormous paw!";
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(3) + 2;
        attack = attack * 10;
    }
}
