package Enemies;

public class BanditLeader extends SuperEnemy {

    public BanditLeader(){
        name = "Bandit Leader";
        hp = new java.util.Random().nextInt(2) + 8;
        hp = hp * 10;
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(2) + 4;
        attack = attack * 10;
        if(attack == 40) {
            attackMessage = "The bandit leader slashed you with his sword!";
        }
        else if(attack == 50) {
            attackMessage = "The bandit leader hacked at you with his sword!";
        }
    }
}
