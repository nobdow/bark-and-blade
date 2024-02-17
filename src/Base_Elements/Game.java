package Base_Elements;

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

   public String nextPosition1;
   public String nextPosition2;
   public String nextPosition3;
   public String nextPosition4;

    public static void main(String[] args) {

        new Game();
    }

    public Game() {

        ui.createUI(cHandler);
        DefaultSetup.defaultSetup();
        vm.showTitleScreen();
    }

    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            soundEffect.setFile(5);
            soundEffect.play();

            switch(yourChoice){
                case "start": vm.titleToMainScreen(); Intro1.intro1(); break;
                case "debug": vm.titleToMainScreen(); DebugSetup.debugSetup(); break;
                case "c1": story.selectPosition(nextPosition1); break;
                case "c2": story.selectPosition(nextPosition2); break;
                case "c3": story.selectPosition(nextPosition3); break;
                case "c4": story.selectPosition(nextPosition4); break;
            }
        }
    }
}

// ALPHA TO DO LIST:
// - Hide spouse hints if quests complete
// - finish troll fight locations
// - add spouse receive quests (fixes broken vet at end of game)
// - add changing enemy attack messages that are tied to damage
// - add weapon cycling system
// - add look for trouble thug who steals weapon and fights you with it
// - add dog finds special weapon if you have enough companion points
// - add random dog coughs?
// - add run away fail chance to enemy encounters
// -
// -
// -

// BETA TO DO LIST:
// -
// -
// -
// -

// FINAL TO DO LIST:
// - update default set up to have starting values so upon reset the game wipes
// - Balance audio levels
// -
// -
// -
// -
// -
