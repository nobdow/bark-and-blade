package Enemies;

public class CastleGuard extends SuperEnemy {

    public CastleGuard(){
        name = "Castle Guard";
        hp = new java.util.Random().nextInt(2) + 5;
        hp = hp * 10;
        int attackMessageRandomizer = new java.util.Random().nextInt(3) + 1;
        if (attackMessageRandomizer == 1) {
            attackMessage = "The guard struck you with his spear!";
        }
        else if (attackMessageRandomizer == 2) {
            attackMessage = "The guard thrust his sword at you!";
        }
        else if (attackMessageRandomizer == 3) {
            attackMessage = "The guard smacked you with the end of his sword!";
        }
    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(2) + 2;
        attack = attack * 10;
    }
}
