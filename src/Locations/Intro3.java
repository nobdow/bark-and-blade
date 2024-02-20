package Locations;

import Base_Elements.*;

public class Intro3 extends SuperLocation{

    public Intro3(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }



    public static void intro3(){
        ui.mainTextArea.setText("You are a humble peasant in the kingdom, having recently earned the money to buy a plot of land and start your very own farm with your lovely spouse who you married last summer.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "farmHouse";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void intro3Trigger() {
        vm.showUserInput();
    }
}
