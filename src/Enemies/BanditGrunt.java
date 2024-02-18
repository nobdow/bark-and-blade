package Enemies;

public class BanditGrunt extends SuperEnemy {

    public BanditGrunt(){
        name = "Bandit Grunt";
        hp = new java.util.Random().nextInt(2) + 2;
        hp = hp * 10;
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(2) + 1;
        attack = attack * 10;
        if(attack == 10) {
            attackMessage = "The bandit stabbed you with his knife!";
        }
        else if(attack == 20) {
            attackMessage = "The bandit slashed you with his knife!";
        }
    }
}
