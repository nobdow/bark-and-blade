package Enemies;

public class Bear extends SuperEnemy {

    public Bear(){
        name = "Bear";
        hp = new java.util.Random().nextInt(3) + 5;
        hp = hp * 10;

    }

    @Override
    public void Damage(){
        attack = new java.util.Random().nextInt(3) + 2;
        attack = attack * 10;
        if(attack == 20) {
            attackMessage = "The bear slashed at you with his claws!";
        }
        else if(attack == 30) {
            attackMessage = "The bear slugged you with his ginormous paw!";
        }
        else if(attack == 40) {
            attackMessage = "The bear smashed his giant paw into you!";
        }
    }
}
