package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;

public class ToTitle extends SuperLocation{

    public ToTitle(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void toTitle(){
        playSoundEffect(5);

        DefaultSetup.defaultSetup();
        vm.showTitleScreen();
    }
}
