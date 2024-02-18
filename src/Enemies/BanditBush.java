package Enemies;

public class BanditBush extends SuperEnemy {

    public BanditBush(){
        name = "Bandit";
        hp = new java.util.Random().nextInt(2) + 3;
        hp = hp * 10;
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(2) + 1;
        attack = attack * 10;
        if(attack == 10) {
            attackMessage = "The bandit swung at you with his dagger!";
        }
        else if(attack == 20) {
            attackMessage = "The bandit stabbed you with his dagger!";
        }
    }
}
