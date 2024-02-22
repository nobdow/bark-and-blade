package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Equipment.SuperWeapon;

import java.util.Random;

public class BanditGruntFight extends SuperLocation{

    public BanditGruntFight(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void banditGruntFight(){
        enemy.hp = enemy.hp - weaponList.get(SuperWeapon.equippedWeapon).Damage();

        enemy.Damage();
        player.hp = player.hp - enemy.attack;
        ui.hpNumberLabel.setText("" + player.hp);

        //Enemy dead & player alive
        if(enemy.hp < 1 && player.hp > 0){
            enemy.hp = 0;
            banditGruntsDead = banditGruntsDead + 1;
            ui.mainTextArea.setText(weaponList.get(SuperWeapon.equippedWeapon).attackMessage + "\n\n" + enemy.attackMessage + " You received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");

            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            if (banditGruntsDead == 1) {
                game.nextPosition1 = "banditGruntTwoEncounter";
            }
            else if(banditGruntsDead == 2) {
                game.nextPosition1 = "banditLeaderEncounter";
            }
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

        // Enemy alive & player dead OR Enemy dead & player dead
        else if(enemy.hp > 0 && player.hp < 1 || enemy.hp < 1 && player.hp < 1){
            if(enemy.hp < 1){
                enemy.hp = 0;
            }
            player.hp = 0;
            ui.hpNumberLabel.setText("" + player.hp);

            ui.mainTextArea.setText(weaponList.get(SuperWeapon.equippedWeapon).attackMessage + "\n\n" + enemy.attackMessage + " You received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "noHealth";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

        // Enemy alive & player alive
        else if(enemy.hp > 0 && player.hp > 0) {
            ui.mainTextArea.setText(weaponList.get(SuperWeapon.equippedWeapon).attackMessage + "\n\n" + enemy.attackMessage + " You received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
            ui.choice1.setText("Attack again");
            ui.choice2.setText("Run Away");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "banditGruntFight";

            int escapeChange = new Random().nextInt(5) + 1;
            if(escapeChange <= 2) {
                game.nextPosition2 = "banditGruntFailedEscape";
            }

            else if(escapeChange >= 3) {
                game.nextPosition2 = "hideout";
            }

            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
}
