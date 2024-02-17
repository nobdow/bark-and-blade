package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class RoyalVet extends SuperLocation{

    public RoyalVet(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void royalVet(){
        VetVisitQuest = 2;
        ui.vetQuestObjectiveLabel.setText("  + return to wife");
        stopSoundEffect();
        playSoundEffect(1);

        ui.mainTextArea.setText("Royal Vet:\n\"Hello NAME! I have been expecting you. I have the medicine that DOGNAME needs. Here you go, I hope he feels better soon.\"\n[You obtained dog medicine]");
        ui.choice1.setText("Return to farmhouse");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "farmHouse";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
