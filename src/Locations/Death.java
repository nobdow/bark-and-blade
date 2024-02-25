package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class Death extends SuperLocation{

    public Death(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void death(){
        if(deathCounter < 2) {
            deathCounter = deathCounter + 1;
            player.hp = player.maxHP - 80;
            ui.hpNumberLabel.setText("" + player.hp);

            ui.mainTextArea.setText("Doc. Milton:\n\"Whoa, easy there. You have been out cold a couple of hours now. I am proud of my needle work, but what do you say we go through a couple questions? See if your hounds are still howling.\"");
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "userInputDead";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(deathCounter == 2){
            Lose.lose();
        }
    }
}
