package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.Weapon_ChaosWand;

public class OldHagHelpRefuse extends SuperLocation{

    public OldHagHelpRefuse(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void oldHagHelpRefuse(){
        player.maxHP = 120;
        player.hp = player.hp + 20;
        ui.hpNumberLabel.setText("" + player.hp);
        stopSoundEffect();
        playSoundEffect(4);

        ui.mainTextArea.setText("Sweet Old Woman:\n\"Oh you sweet old thing. Then if you won't take my coins, have this old amulet of mine.\"\n[You obtained the Elderheart Amulet and increased your max health to 120]");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "town";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
