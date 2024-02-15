package Locations;

import Base_Elements.*;
import Enemies.SuperEnemy;
import java.util.ArrayList;

public class SuperLocation {
    static Game game;
    static UI ui;
    static VisibilityManager vm;
    static Sound soundEffect;
    Sound music;

    // ALl the variables used in the different locations
    public static Player player = new Player();
    public static SuperEnemy enemy;
    public static int dogPoints, coins, deathCounter, diceRoll, drunkMoney, jailTime;
    // Quest tracking, 0 = not given, 1 = in progress, 2 = complete
    public static int VetVisitQuest, BlackBerriesQuest, CoatQuest, birthdayQuest, cherriesQuest, oldHagQuest;
    public static boolean snugglePoint, bush, spouseGift, splashPoint, hasCherries, bearDead, boughtCoat, boughtFormalAttire, trollDead, trollHorn, boughtDice, boughtKeyBlade, boughtRubberChicken, hasBlackBerries, thiefDead, drunkDead;

    public static ArrayList<Class<?>> weaponList = new ArrayList<>();

    public SuperLocation(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        game = g;
        ui = userInterface;
        vm = vManager;
        soundEffect = sndfft;
        music = msc;
    }

    // The methods to play and stop both sound effects and music
    public void playMusic(int i) {
        music.setFile(i);
        music.play();
        music.loop();
    }

    public void stopMusic() {
        music.stop();
    }

    public static void playSoundEffect(int i) {
        soundEffect.setFile(i);
        soundEffect.play();
    }

    public static void stopSoundEffect() {
        soundEffect.stop();
    }
}

