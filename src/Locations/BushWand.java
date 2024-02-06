package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.Weapon_ChaosWand;

public class BushWand extends SuperLocation{

    public BushWand(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void bushWand(){
        player.currentWeapon = new Weapon_ChaosWand();
        ui.weaponNameLabel.setText(player.currentWeapon.name);
        playSoundEffect(4);

        ui.mainTextArea.setText("A beautiful maple wand falls out of the bush. It seems to be humming with magic. You have read about magic wands before, now you have one of your own! If only you could predict what it could do...\n[You obtained the chaos wand]");
        ui.choice1.setText("You're a wizard PLAYERNAME!");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "forest";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
