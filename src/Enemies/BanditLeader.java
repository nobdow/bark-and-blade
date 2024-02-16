package Enemies;

public class BanditLeader extends SuperEnemy {

    public BanditLeader(){
        name = "Bandit Leader";
        hp = new java.util.Random().nextInt(2) + 8;
        hp = hp * 10;
        attackMessage = "The bandit leader slashed his sword at you!";
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(2) + 5;
        attack = attack * 10;
    }
}
