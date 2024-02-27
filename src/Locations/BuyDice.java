package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.SuperWeapon;
import Equipment.Weapon_ChaosWand;
import Equipment.Weapon_DiceSet;

public class BuyDice extends SuperLocation{

    public BuyDice(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void buyDice(){
        if(trollHorn == true && coins >= 10) {
            boughtDice = true;
            coins = coins - 10;
            ui.coinCountLabel.setText(coins + "");
            trollHorn = false;
            weaponList.add(diceSet);
            //weaponList.getLast().isEquipped(true);
            ui.weaponNameArea.setText(weaponList.getLast().name);
            ui.weaponDescriptionArea.setText(weaponList.getLast().description);
            SuperWeapon.equippedWeapon += 1;
            stopSoundEffect();
            playSoundEffect(4);

            ui.mainTextArea.setText("Blacksmith:\n\"Oh a troll horn! That will make some very sharp dice!\"\n[Obtained a set of very sharp dice]");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "blacksmith";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(trollHorn == false || coins < 10){
            ui.mainTextArea.setText("Blacksmith:\n\"Hmm, I will need both something to make the dice with and 10 coins for my crafting services.\"");
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
