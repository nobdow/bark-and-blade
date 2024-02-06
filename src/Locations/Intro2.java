package Locations;

import Base_Elements.*;

public class Intro2 extends SuperLocation{

    public Intro2(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void intro2(){
        ui.mainTextArea.setText("But that is someone else's problem! Your eyes flick open to a mellow orange glow peeking through your window. Your favorite little furball is curled between your feet, claiming a more than their share of the covers.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "intro3";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
