package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.SuperWeapon;
import Equipment.Weapon_ChaosWand;
import Equipment.Weapon_KeyBlade;

public class BuyKeyBlade extends SuperLocation{

    public BuyKeyBlade(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void buyKeyBlade(){
        if(coins >= 15) {
            boughtKeyBlade = true;
            coins = coins - 15;
            ui.coinCountLabel.setText(coins + "");
            weaponList.add(keyBlade);
            weaponList.getLast().isEquipped(true);
            ui.weaponNameLabel.setText(weaponList.getLast().name);
            SuperWeapon.equippedWeapon += 1;
            stopSoundEffect();
            playSoundEffect(4);

            ui.mainTextArea.setText("Blacksmith:\n\"Excellent choice! Here you go.\"\n[Obtained the key shaped blade]");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "blacksmith";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(coins < 15){
            ui.mainTextArea.setText("Blacksmith:\n\"I will need 15 coins to part with this blade.\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "blacksmith";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
