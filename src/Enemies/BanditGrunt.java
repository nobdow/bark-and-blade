package Enemies;

public class BanditGrunt extends SuperEnemy {

    public BanditGrunt(){
        name = "Bandit Grunt";
        hp = new java.util.Random().nextInt(2) + 2;
        hp = hp * 10;
        attackMessage = "The bandit swung at you with his dagger!";
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(2) + 1;
        attack = attack * 10;
    }
}
