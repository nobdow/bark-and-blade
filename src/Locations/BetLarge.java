package Locations;

import Base_Elements.Game;
import Base_Elements.Sound;
import Base_Elements.UI;
import Base_Elements.VisibilityManager;
import Enemies.Drunk;

import java.util.Random;

public class BetLarge extends SuperLocation{

    public BetLarge(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        super(g, userInterface, vManager, sndfft, msc);
    }

    public static void betLarge(){
        diceRoll = new Random().nextInt(6) + 1;
        enemy = new Drunk();

        // If you win the bet
        if(diceRoll == 1 || diceRoll == 6) {
            // If the drunk is broke
            if(drunkMoney <= 10) {
                coins = coins + 10;
                ui.coinCountLabel.setText(coins + "");
                drunkMoney = drunkMoney - 10;
                stopSoundEffect();
                playSoundEffect(6);

                ui.mainTextArea.setText("The drunk rolled a " + diceRoll + " and you won.\n[You obtained 10 coins]\n\nDrunk:\n\"That was all my drinking money! I'm gonna beat you up and take that back.\"\n\n" + enemy.name + ": " + enemy.hp + " HP");
                ui.choice1.setText("Fight");
                ui.choice2.setText("Run away");
                ui.choice3.setText("");
                ui.choice4.setText("");

                game.nextPosition1 = "drunkFight";
                game.nextPosition2 = "backAlley";
                game.nextPosition3 = "";
                game.nextPosition4 = "";
            }
            // If the drunk still has money
            else if(drunkMoney > 10) {
                coins = coins + 10;
                ui.coinCountLabel.setText(coins + "");
                drunkMoney = drunkMoney - 10;
                stopSoundEffect();
                playSoundEffect(6);

                ui.mainTextArea.setText("The drunk rolled a " + diceRoll + " and you won.\n[You obtained 10 coins]");
                ui.choice1.setText("Bet the same again (5 coin)");
                ui.choice2.setText("Bet more (10 coins)");
                ui.choice3.setText("Stop before your luck runs out");
                ui.choice4.setText("");

                game.nextPosition1 = "betSmall";
                game.nextPosition2 = "betLarge";
                game.nextPosition3 = "backAlley";
                game.nextPosition4 = "";
            }
        }
        // If you lost the bet
        else if (diceRoll > 1 && diceRoll < 6) {
            // If you are out of coins
            if(coins == 10) {
                coins = coins - 10;
                ui.coinCountLabel.setText(coins + "");
                drunkMoney = drunkMoney + 10;

                ui.mainTextArea.setText("The drunk rolled a " + diceRoll + " and you lost.\n[You lost 10 coins]\n\nDrunk:\n\"Better luck next time!\"");
                ui.choice1.setText("Accuse him of cheating");
                ui.choice2.setText("Leave the drunk");
                ui.choice3.setText("");
                ui.choice4.setText("");

                game.nextPosition1 = "accuseCheating";
                game.nextPosition2 = "backAlley";
                game.nextPosition3 = "";
                game.nextPosition4 = "";
            }
            // If you have 10+ coins
            else if(coins >= 20) {
                coins = coins - 10;
                ui.coinCountLabel.setText(coins + "");
                drunkMoney = drunkMoney + 10;

                ui.mainTextArea.setText("The drunk rolled a " + diceRoll + " and you lost.\n[You lost 10 coins]");
                ui.choice1.setText("Bet the same again (5 coin)");
                ui.choice2.setText("Bet more (10 coins)");
                ui.choice3.setText("Accuse him of cheating");
                ui.choice4.setText("Stop while you can");

                game.nextPosition1 = "betSmall";
                game.nextPosition2 = "betLarge";
                game.nextPosition3 = "accuseCheating";
                game.nextPosition4 = "backAlley";
            }
            // If you have 5-9 coins
            else if (coins >= 15 && coins < 20) {
                coins = coins - 10;
                ui.coinCountLabel.setText(coins + "");
                drunkMoney = drunkMoney + 10;

                ui.mainTextArea.setText("The drunk rolled a " + diceRoll + " and you lost.\n[You lost 10 coins]");
                ui.choice1.setText("Make a small bet (5 coin)");
                ui.choice2.setText("Accuse him of cheating");
                ui.choice3.setText("Stop while you can");
                ui.choice4.setText("");

                game.nextPosition1 = "betSmall";
                game.nextPosition2 = "accuseCheating";
                game.nextPosition3 = "backAlley";
                game.nextPosition4 = "";
            }
        }
    }
}
