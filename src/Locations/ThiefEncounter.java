package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.CastleGuard;
import Enemies.Thief;
import Equipment.SuperWeapon;

public class ThiefEncounter extends SuperLocation{

    public ThiefEncounter(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void thiefEncounter(){
        enemy = new Thief();
        ui.mainTextArea.setText("Cloaked Figure:\n\"That's a nice weapon you got there. Mind if I have it?\n[You lost your " + weaponList.get(SuperWeapon.equippedWeapon).name.toLowerCase() + "]\n\n" + enemy.name + ": " + enemy.hp + " HP");
        Thief.stolenWeapon = weaponList.get(SuperWeapon.equippedWeapon).name;

        weaponList.remove(SuperWeapon.equippedWeapon);
        SuperWeapon.equippedWeapon -= 1;
        ui.weaponNameLabel.setText(SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).name);

            ui.choice1.setText("Fight him");
            ui.choice2.setText("Run away");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "thiefFight";
            game.nextPosition2 = "backAlley";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
    }
}
