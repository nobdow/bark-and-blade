package Enemies;

public class Bandit_Bush extends SuperEnemy {

    public Bandit_Bush(){
        name = "Bandit";
        hp = new java.util.Random().nextInt(2) + 3;
        hp = hp * 100;
        attackMessage = "The bandit swung at you with his dagger!";
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(2) + 1;
        attack = attack * 100;
    }
}
