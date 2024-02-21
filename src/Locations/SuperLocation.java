package Locations;

import Base_Elements.*;
import Enemies.SuperEnemy;
import Equipment.*;

import java.util.ArrayList;

public class SuperLocation {
    static Game game;
    static UI ui;
    static VisibilityManager vm;
    static Sound soundEffect;
    static Sound music;

    public static Player player = new Player();
    public static SuperEnemy enemy;

    // ALl the variables used in the different locations
    public static int dogPoints, coins, deathCounter, diceRoll, drunkMoney, jailTime, snuggleCount, questNoiseCount;
    public static boolean snugglePoint, bush, spouseGift, splashPoint, hasCherries, bearDead, boughtCoat, boughtFormalAttire, trollDead, trollHorn, boughtDice, boughtKeyBlade, boughtRubberChicken, hasBlackBerries, thiefDead, drunkDead, hasCrown, banditLeaderCompanion, banditLeaderDead, fetchPoint, banditGruntOneDead, banditGruntTwoDead;

    // Quest tracking, 0 = not given, 1 = in progress, 2 = complete, 3 = over and not tracking
    public static int VetVisitQuest, BlackBerriesQuest, CoatQuest, birthdayQuest, cherriesQuest, oldHagQuest;

    public static ArrayList<String> spouseTips = new ArrayList<String>();

    //Adding the weapons objects and the ArrayList
    public static ArrayList<SuperWeapon> weaponList = new ArrayList<>(2);
    public static Weapon_None none = new Weapon_None();
    public static Weapon_Knife knife = new Weapon_Knife();
    public static Weapon_ChaosWand chaosWand = new Weapon_ChaosWand();
    public static Weapon_DiceSet diceSet = new Weapon_DiceSet();
    public static Weapon_HeavyMace heavyMace = new Weapon_HeavyMace();
    public static Weapon_KeyBlade keyBlade = new Weapon_KeyBlade();
    public static Weapon_PointyStick pointyStick = new Weapon_PointyStick();

    public SuperLocation(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {
        game = g;
        ui = userInterface;
        vm = vManager;
        soundEffect = sndfft;
        music = msc;

        // Adding the spouses tips to the ArrayList
        spouseTips.add(("\n\"Don't forget the blackberries! I always have luck when looking in the forest.\""));
        spouseTips.add("\n\"If you feel worn out, try snuggling with " + player.dogName + ".\"");
        spouseTips.add("\n\"Remember, you need a new coat. It is already snowing in the mountains. It should be easy to find one at market.\"");
        spouseTips.add("\n\"If it helps, I wear a medium, and there are only 14 hours left until my birthday.\"");
    }

    // The methods to play and stop both sound effects and music
    public static void playMusic(int i) {
        music.setFile(i);
        music.play();
        music.loop();
    }

    public static void stopMusic() {
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

