package Base_Elements;

import Equipment.SuperWeapon;
import Locations.DefaultSetup;
import Locations.*;
import Locations.SuperLocation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

   Sound music = new Sound();
   Sound soundEffect = new Sound();

   ChoiceHandler cHandler = new ChoiceHandler();
   UI ui = new UI();
   VisibilityManager vm = new VisibilityManager(ui);
   SuperLocation superLocation = new SuperLocation(this, ui, vm, music, soundEffect);
   LocationSwitch story = new LocationSwitch(this, ui, vm, music, soundEffect);

   public static Player player = new Player();

   public String nextPosition1;
   public String nextPosition2;
   public String nextPosition3;
   public String nextPosition4;

    public static void main(String[] args) {

        new Game();
    }

    public Game() {

        ui.createUI(cHandler);
        vm.showTitleScreen();
        DefaultSetup.defaultSetup();
    }

    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            soundEffect.setFile(5);
            soundEffect.play();

            switch(yourChoice){
                case "start":
                    vm.showMainScreen();
                    UserInput.userInput();
                    break;
                case "debug":
                    vm.showMainScreen();
                    DebugSetup.debugSetup();
                    break;
                case "submit":
                    vm.showMainScreen();
                    player.playerName = ui.inputPlayerNameField.getText();
                    player.spouseName = ui.inputSpouseNameField.getText();
                    player.dogName = ui.inputDogNameField.getText();
                    if (SuperLocation.deathCounter == 0) {
                        Intro1.intro1();
                    }
                    else if(SuperLocation.deathCounter >= 1) {
                        TestQuestion1.testQuestion1();
                    }
                    break;
                case "c1":
                    story.selectPosition(nextPosition1);
                    break;
                case "c2":
                    story.selectPosition(nextPosition2);
                    break;
                case "c3":
                    story.selectPosition(nextPosition3);
                    break;
                case "c4":
                    story.selectPosition(nextPosition4);
                    break;
                case "switch":
                    System.out.println("----------------");
                    System.out.println("WHEN SWITCHING");
                    System.out.println("Before index # " + SuperWeapon.equippedWeapon);
                    System.out.println("Before ArrayList size: " + SuperLocation.weaponList.size());
                    System.out.println("Before weapon: " + SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).name);
                    System.out.println("Before damage: " + SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).Damage());

                    if (SuperWeapon.equippedWeapon < (SuperLocation.weaponList.size() - 1)) {
                        SuperWeapon.equippedWeapon += 1;
                    }
                    else if(SuperWeapon.equippedWeapon == (SuperLocation.weaponList.size() - 1)) {
                        SuperWeapon.equippedWeapon = 0;
                    }
                    System.out.println("---");
                    System.out.println("After index #" + SuperWeapon.equippedWeapon);
                    System.out.println("After ArrayList size: " + SuperLocation.weaponList.size());
                    ui.weaponNameArea.setText(SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).name);
                    ui.weaponDescriptionArea.setText(SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).description);
                    System.out.println("After weapon: " + SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).name);
                    System.out.println("After damage: " + SuperLocation.weaponList.get(SuperWeapon.equippedWeapon).Damage());

                    break;
            }
        }
    }
}

// ALPHA TO DO LIST:
// - remove coat hint after buying coat, collecting blackberries, and buying birthday gift
// - fix null dog name in spouse hint
// - fix inability to continue to bandit leader if bandit 2 dead and player has health and after first death to them?
// - prevent thief from stealing your none

// BETA TO DO LIST:
// - add light and heavy attacks with stamina
// - add classes and abilities
// - update all dialog options
// - add key listener for "enter" on user input screen
// - add armor defensive value
// - add dog message when hitting dog points at snuggle
// - add coin or item drops to bandit grunts, castle guards, and to drunk
// - make the stream heal only once
// - make enemy damage read on screen before player damage
// - name bandits jessy and james
// - remove coat check but add 10 snow damage each turn in the mountains without it
// - fix missing thief attack dialog
// - test switching weapon while charging up mace
// - team up with bandit leader puts you out at mountain, not pass or hideout
// - fix castle guard negative health

// FINAL TO DO LIST:
// - update default set up to have starting values so upon reset the game wipes
// - balance audio levels
// - implement new gui
// - spell check all text
// - balance coin rate, item costs, weapon damage, enemy health and damage
// - bug test
// - remove enemy hp during encounter but not combat
