package Base_Elements;

public class VisibilityManager {

    UI ui;

    public VisibilityManager (UI userInterface){

        ui = userInterface;
    }

    public void showTitleScreen(){

        //Show title elements
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
        ui.debugButtonPanel.setVisible(true);

        //Hide game elements
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
        ui.exampleImagePanel.setVisible(false);
        ui.questLogPanel.setVisible(false);

        //Hide user input elements
        ui.inputPanel.setVisible(false);
        ui.inputButtonPanel.setVisible(false);
    }

    public void showMainScreen(){

        //Hide title elements
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.debugButtonPanel.setVisible(false);

        //Show game elements
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
        ui.exampleImagePanel.setVisible(true);
        ui.questLogPanel.setVisible(true);

        //Hide user input elements
        ui.inputPanel.setVisible(false);
        ui.inputButtonPanel.setVisible(false);
    }

    public void showUserInput() {
        //Hide title elements
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.debugButtonPanel.setVisible(false);

        //Show some game elements
        ui.mainTextPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
        ui.exampleImagePanel.setVisible(true);
        ui.questLogPanel.setVisible(true);

        //Hide some game elements
        ui.choiceButtonPanel.setVisible(false);

        //Show user input elements
        ui.inputPanel.setVisible(true);
        ui.inputButtonPanel.setVisible(true);
    }
}
