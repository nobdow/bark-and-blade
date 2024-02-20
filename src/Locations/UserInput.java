package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class UserInput extends SuperLocation{

    public UserInput(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void userInput(){
        stopSoundEffect();

        vm.showUserInput();
        player.playerName = ui.inputPlayerNameField.getText();

        ui.mainTextArea.setText("Hello adventurer! Before we dive into the story, tell us a little about yourself and your family...");

        ui.choice1.setText("");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
