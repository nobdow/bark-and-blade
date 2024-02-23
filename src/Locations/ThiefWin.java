package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.SuperEnemy;
import Enemies.Thief;
import Equipment.*;

public class ThiefWin extends SuperLocation{

    public ThiefWin(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void thiefWin(){
        ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and got your " + Thief.stolenWeapon + " back.\n[You obtained your " + Thief.stolenWeapon + "]");
        thiefDead = true;
        if(Thief.stolenWeapon == knife.name) {
            weaponList.add(knife);
        }
        else if(Thief.stolenWeapon == chaosWand.name){
            weaponList.add(chaosWand);
        }
        else if(Thief.stolenWeapon == diceSet.name){
            weaponList.add(diceSet);
        }
        else if(Thief.stolenWeapon == heavyMace.name){
            weaponList.add(heavyMace);
        }
        else if(Thief.stolenWeapon == keyBlade.name){
            weaponList.add(keyBlade);
        }
        else if(Thief.stolenWeapon == pointyStick.name){
            weaponList.add(pointyStick);
        }
        SuperWeapon.equippedWeapon += 1;
        //ui.weaponNameLabel.setText(SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).name);
        SuperWeapon.equippedWeapon = (weaponList.size() - 1);
        ui.weaponNameLabel.setText(SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).name);

        System.out.println("----------------");
        System.out.println("AFTER WIN");
        System.out.println("Index #" + SuperWeapon.equippedWeapon);
        System.out.println("ArrayList size: " + SuperLocation.weaponList.size());
        System.out.println("Weapon: " + SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).name);
        System.out.println("Damage: " + SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).Damage());

        stopSoundEffect();
        playSoundEffect(4);

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "backAlley";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
