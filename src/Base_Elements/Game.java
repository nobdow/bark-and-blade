package Base_Elements;

import Locations.DefaultSetup;
import Locations.Intro1;
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
                case "c1": story.selectPosition(nextPosition1); break;
                case "c2": story.selectPosition(nextPosition2); break;
                case "c3": story.selectPosition(nextPosition3); break;
                case "c4": story.selectPosition(nextPosition4); break;
            }
        }
    }
}

// TO DO LIST:
// - Balance audio levels
// - End game after 5 snuggles with dog?
// - Hide spouse quests if quests complete
// - finish troll fight locations
// - add spouse receive blackberries & formal attire
// -
// -
// -