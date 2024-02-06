package Locations;

import Base_Elements.*;
import Enemies.SuperEnemy;

public class SuperLocation {
    static Game game;
    static UI ui;
    static VisibilityManager vm;
    static Sound soundEffect;
    Sound music;

    public static Player player = new Player();
    public static SuperEnemy enemy;
    public static int VetVisitQuest, BlackBerriesQuest, CoatQuest, dogPoints, coins, birthdayQuest, deathCounter;
    public static boolean snugglePoint, bush, spouseGift, splashPoint, hasBerries, bearDead, boughtCoat, boughtFormalAttire;

    public SuperLocation(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        game = g;
        ui = userInterface;
        vm = vManager;
        soundEffect = sndfft;
        music = msc;
    }

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

