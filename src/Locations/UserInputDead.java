package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class UserInputDead extends SuperLocation{

    public UserInputDead(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void userInputDead(){
        stopSoundEffect();

        vm.showUserInput();
        player.playerName = ui.inputPlayerNameField.getText();

        ui.mainTextArea.setText("Doc. Milton:\n\"Let's start with your name, and the names of any other important people you can remember.\"");

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
