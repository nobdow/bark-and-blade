package Enemies;

public class CastleGuard extends SuperEnemy {

    public CastleGuard(){
        name = "Castle Guard";
        hp = new java.util.Random().nextInt(2) + 5;
        hp = hp * 10;
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(2) + 2;
        attack = attack * 10;
        if(attack == 20) {
            attackMessage = "The guard thrust his sword at you!";
        }
        else if(attack == 30) {
            attackMessage = "The guard smacked you with the end of his sword!";
        }
    }
}
