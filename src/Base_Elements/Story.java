package Base_Elements;

import Enemies.*;
import Equipment.*;
import Locations.*;

public class Story {

    Game game;
    UI ui;
    VisibilityManager vm;
    Sound soundEffect;
    Sound music;

    Player player = new Player();
    SuperEnemy enemy;
    public int VetVisitQuest, BlackBerriesQuest, CoatQuest, dogPoints, coins, birthdayQuest, deathCounter;
    public boolean snugglePoint, bush, spouseGift, splashPoint, hasBerries, bearDead;

    public Story(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {

        game = g;
        ui = userInterface;
        vm = vManager;
        soundEffect = sndfft;
        music = msc;
    }

//    public void playMusic(int i) {
//        music.setFile(i);
//        music.play();
//        music.loop();
//    }
//
//    public void stopMusic() {
//        music.stop();
//    }
//
//    public void playSoundEffect(int i) {
//        soundEffect.setFile(i);
//        soundEffect.play();
//    }
//
//    public void stopSoundEffect(int i) {
//        soundEffect.stop();
//    }

    public void defaultSetup(){
        player.hp = 100;
        ui.hpNumberLabel.setText("" + player.hp);
        VetVisitQuest = 0;
        BlackBerriesQuest = 0;
        CoatQuest = 0;
        snugglePoint = false;
        bush = false;
        hasBerries = false;
        dogPoints = 0;
        coins = 0;
        ui.coinCountLabel.setText(coins + "");
        spouseGift = false;
        bearDead = false;
        birthdayQuest = 0;
        deathCounter = 0;
        player.currentWeapon = new Weapon_None();
        ui.weaponNameLabel.setText(player.currentWeapon.name);
        soundEffect.setFile(0);
        soundEffect.play();
    }

    public void selectPosition(String nextPosition){
            switch(nextPosition){
                case "intro1": intro1(); break;
                case "intro2": Intro2.intro2(); break;
                case "intro3": Intro3.intro3(); break;
                case "snuggleDog": SnuggleDog.snuggleDog(); break;
                case "farmHouse": FarmHouse.farmHouse(); break;
                case "spouse": Spouse.spouse(); break;
                case "spouseQuest1": SpouseQuest1.spouseQuest1(); break;
                case "spouseQuest2": SpouseQuest2.spouseQuest2(); break;
                case "spouseQuest3": SpouseQuest3.spouseQuest3(); break;
                case "spouseGift": SpouseGift.spouseGift(); break;
                case "crossroads": Crossroads.crossroads(); break;
                case "forest": Forest.forest(); break;
                case "bush": Bush.bush(); break;
                case "bushWand": BushWand.bushWand(); break;
                case "bushCoins": BushCoins.bushCoins(); break;
                case "bushBandit": BushBandit.bushBandit(); break;
                case "robbed": Robbed.robbed(); break;
                case "forestBanditFight": ForestBanditFight.forestBanditFight(); break;
                case "forestBanditWin": ForestBanditWin.forestBanditWin(); break;
                case "clearing": Clearing.clearing(); break;
                case "drinkStream": DrinkStream.drinkStream(); break;
                case "splashStream": SplashStream.splashStream(); break;
                case "berries": Berries.berries(); break;
                case "bearEncounter": BearEncounter.bearEncounter(); break;
                case "bearFight": BearFight.bearFight(); break;
                case "bearWin": BearWin.bearWin(); break;
                case "noHealth": NoHealth.noHealth(); break;
                case "death": Death.death(); break;
                case "testQuestion1": TestQuestion1.testQuestion1(); break;
                case "testQuestion2": TestQuestion2.testQuestion2(); break;
                case "testQuestion3": TestQuestion3.testQuestion3(); break;
                case "testResults": TestResults.testResults(); break;
                case "lose": Lose.lose(); break;
                case "toTitle": ToTitle.toTitle(); break;
                //case "mountain": mountain(); break;
                case "trollEncounter": TrollEncounter.trollEncounter(); break;
                case "trollFight": TrollFight.trollFight(); break;
            }
    }

//    public void template(){
////        playSoundEffect(5);
//
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

    public void intro1(){
       soundEffect.stop();
       soundEffect.setFile(5);
       soundEffect.play();

        ui.mainTextArea.setText("In the kingdom of Eriduun, a peaceful realm ruled by King Oswin the Noble, a dark shadow looms over the land. The legendary Crown of Radiance has been stolen!");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "intro2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

//    public void intro2(){
//        playSoundEffect(5);
//
//        ui.mainTextArea.setText("But that is someone else's problem! Your eyes flick open to a mellow orange glow peeking through your window. Your favorite little furball is curled between your feet, claiming a more than their share of the covers.");
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "intro3";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void intro3(){
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("You are a humble peasant in the kingdom, having recently earned the money to buy a plot of land and start your very own farm with your lovely spouse, SPOUSENAME, who you married last summer.");
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "farmHouse";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//
//    }

//    public void snuggleDog(){
//        //playSoundEffect(5);
//
//        if (player.hp <= 99 && snugglePoint == false){
//            player.hp = 100;
//            ui.hpNumberLabel.setText("" + player.hp);
//            snugglePoint = true;
//            dogPoints = dogPoints + 1;
//
//            ui.mainTextArea.setText("A quick rest can't hurt.\n\nDOGNAME:\n*Woof in agreeance*\n\nYou wake up feeling fantastic and your dog seems more loyal for the affection.\n[HP restored and companion point earned]");
//
//        }
//        else if(player.hp >= 100 & snugglePoint == false){
//            snugglePoint = true;
//            dogPoints = dogPoints + 1;
//
//            ui.mainTextArea.setText("You feel great and your dog feels more loyal for the snuggles\n[companion point earned]");
//
//        }
//        else if(player.hp < 100 && snugglePoint == true){
//            player.hp = 100;
//            ui.hpNumberLabel.setText("" + player.hp);
//            snugglePoint = true;
//            dogPoints = dogPoints + 1;
//
//            ui.mainTextArea.setText("You feel revived and your health is restored.");
//        }
//        else if(player.hp >= 100 && snugglePoint == true){
//            ui.mainTextArea.setText("Snuggles with [DOGNAME] are the best!");
//            ui.choice1.setText("Continue");
//        }
//
//        ui.choice1.setText("Oops, you fell asleep");
//        ui.choice2.setText("You and DOGNAME stretch");
//        ui.choice3.setText("Get off the couch");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "farmHouse";
//        game.nextPosition2 = "farmHouse";
//        game.nextPosition3 = "farmHouse";
//        game.nextPosition4 = "";
//    }
//
//    public void farmHouse(){
//        //playSoundEffect(5);
//
//        if(VetVisitQuest == 0 && BlackBerriesQuest == 0 && CoatQuest == 0 && birthdayQuest == 0) {
//            ui.mainTextArea.setText("You are at your cozy farm house in the living room.");
//            ui.choice1.setText("Talk to spouse");
//            ui.choice2.setText("Snuggle with your dog");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "spouse";
//            game.nextPosition2 = "snuggleDog";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//        else if (VetVisitQuest != 0 && BlackBerriesQuest != 0 && CoatQuest != 0 && birthdayQuest != 0 && spouseGift == false) {
//            ui.mainTextArea.setText("You are at your cozy farm house in the living room. DOGNAME crawls into your knapsack and you hoist it onto your back.");
//            ui.choice1.setText("Talk to spouse");
//            ui.choice2.setText("Snuggle with your dog");
//            ui.choice3.setText("Leave");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "spouse";
//            game.nextPosition2 = "snuggleDog";
//            game.nextPosition3 = "spouseGift";
//            game.nextPosition4 = "";
//        }
//
//        else if (VetVisitQuest != 0 && BlackBerriesQuest != 0 && CoatQuest != 0 && birthdayQuest != 0 && spouseGift == true) {
//            ui.mainTextArea.setText("You are at your cozy farm house in the living room.");
//            ui.choice1.setText("Talk to spouse");
//            ui.choice2.setText("Snuggle with your dog");
//            ui.choice3.setText("Leave");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "spouse";
//            game.nextPosition2 = "snuggleDog";
//            game.nextPosition3 = "crossroads";
//            game.nextPosition4 = "";
//        }
//    }

//    public void spouse(){
//        //playSoundEffect(5);
//
//        if (BlackBerriesQuest == 0 && CoatQuest == 0 && VetVisitQuest == 0) {
//            VetVisitQuest = 1;
//            ui.vetQuestTitleLabel.setText("Pup-uprofen");
//            ui.vetQuestObjectiveLabel.setText("  + visit the royal vet");
//            //playSoundEffect(1);
//
//            ui.mainTextArea.setText("Spouse:\n\"Good morning dear! I hate to be a bother but don't forget that DOGNAME has an appointment in the castle with the King's Vet. It is important to get his medicine so he gets over this cold. DOGNAME loves riding in your knapsack so he should be no trouble to bring along\"");
//            ui.choice1.setText("Accept Quest");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "spouseQuest1";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//        else if(BlackBerriesQuest > 0 && CoatQuest > 0 && VetVisitQuest > 0){
//            int spouseTips = new java.util.Random().nextInt(3)+1;
//            if(spouseTips == 1){
//                ui.mainTextArea.setText("Spouse:\n\"Don't forget the blackberries! I always have luck when looking in the forest.\"");
//            }
//            else if(spouseTips == 2){
//                ui.mainTextArea.setText("Spouse:\n\"If you feel worn out, try snuggling with your dog.\"");
//            }
//            else if(spouseTips == 3) {
//                ui.mainTextArea.setText("Spouse:\n\"Remember, you need a new coat. It is already snowing in the mountains. It should be easy to find one at market.\"");
//            }
//
//            ui.choice1.setText("Thank for hint");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "farmHouse";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//    }

//    public void spouseQuest1(){
//        BlackBerriesQuest = 1;
//        //playSoundEffect(1);
//        ui.blackberriesQuestTitleLabel.setText("Ye Olde Grocer");
//        ui.blackberriesQuestObjectiveLabel.setText("  + obtain blackberries");
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Spouse:\n\"Oh, also, I need black berries for cobbler tonight. Can you swing by the market and get some for me?\"");
//        ui.choice1.setText("Oops, now \"Accept Quest\"");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "spouseQuest2";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void spouseQuest2(){
//        CoatQuest = 1;
//        //playSoundEffect(1);
//        ui.coatQuestTitleLabel.setText("Winter is Coming");
//        ui.coatQuestObjectiveLabel.setText("  + obtain a coat");
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Spouse:\n\"By the way, winter is coming, so you need a new coat! It is already snowing in the mountains. Brr. The tailor mentioned a new merch drop this week. Check it out!\"");
//        ui.choice1.setText("No problem, \"Accept Quest(s)\"");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "spouseQuest3";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void spouseQuest3(){
//        birthdayQuest = 1;
//        //playSoundEffect(1);
//        ui.presentQuestTitleLabel.setText("That's tomorrow!?!");
//        ui.presentQuestObjectiveLabel.setText("  + obtain a gift");
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Spouse:\n\"Last thing! While grabbing your coat, if you see something I'd like, it wouldn't hurt my feelings if you got me something fun and new! It is my birthday tomorrow.\"");
//        ui.choice1.setText("Birthday Quest!");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "farmHouse";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void spouseGift(){
//        spouseGift = true;
//        player.currentWeapon = new Weapon_Knife();
//        ui.weaponNameLabel.setText(player.currentWeapon.name);
//        coins = coins + 10;
//        ui.coinCountLabel.setText(coins + "");
//        //playSoundEffect(4);
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Spouse:\n\"Wait, its dangerous to go alone. Have my " + player.currentWeapon.name.toLowerCase() + " and a few coins to run your errands!\"\n(You obtained a knife and 10 coins)");
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "crossroads";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void crossroads(){
//        //playSoundEffect(5);
//        ui.mainTextArea.setText("You notice a sharp chill as the wind rushes down from the mountains. You find yourself at a crossroads");
//
//        if(bush == false) {
//            ui.choice1.setText("Mosey over to town");
//            ui.choice2.setText("Head into the forest");
//            ui.choice3.setText("Scramble up the mountains");
//            ui.choice4.setText("Return to your farmhouse");
//
//            game.nextPosition1 = "town";
//            game.nextPosition2 = "bush";
//            game.nextPosition3 = "mountains";
//            game.nextPosition4 = "farmHouse";
//        }
//        else if(bush == true){
//            ui.choice1.setText("Go into town");
//            ui.choice2.setText("Go to the forest");
//            ui.choice3.setText("Go up to the mountains");
//            ui.choice4.setText("Go to your farmhouse");
//
//            game.nextPosition1 = "town";
//            game.nextPosition2 = "forest";
//            game.nextPosition3 = "mountains";
//            game.nextPosition4 = "farmHouse";
//        }
//    }

//    public void forest(){
//        ui.mainTextArea.setText("You hear the pleasant gurgling of a mountain stream. Soon, the small river crosses your path and a simple bridge lies before you.");
//        ui.choice1.setText("Cross the bridge");
//        ui.choice2.setText("Drink the fresh water");
//        ui.choice3.setText("Let DOGNAME go for a swim");
//        ui.choice4.setText("Go to the crossroads");
//
//        game.nextPosition1 = "clearing";
//        game.nextPosition2 = "drinkStream";
//        game.nextPosition3 = "splashStream";
//        game.nextPosition4 = "crossroads";
//    }

//    public void bush(){
//        bush = true;
//        int bushFind = new java.util.Random().nextInt(3);
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Dog:\n\"Woof woof!\"\n\nYour dog seems to be barking at a bush.");
//        ui.choice1.setText("Shake the bush");
//        ui.choice2.setText("Avoid the bush");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//
//        if(bushFind == 0){
//            game.nextPosition1 = "bushWand";
//        }
//        else if(bushFind == 1){
//            game.nextPosition1 = "bushCoins";
//        }
//        else if(bushFind == 2){
//            game.nextPosition1 = "bushBandit";
//        }
//    }

//    public void bushWand(){
//        //playSoundEffect(5);
//        player.currentWeapon = new Weapon_ChaosWand();
//        ui.weaponNameLabel.setText(player.currentWeapon.name);
//        //playSoundEffect(4);
//
//        ui.mainTextArea.setText("A beautiful maple wand falls out of the bush. It seems to be humming with magic. You have read about magic wands before, now you have one of your own! If only you could predict what it could do...\n[You obtained the chaos wand]");
//        ui.choice1.setText("You're is a wizard PLAYERNAME!");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "forest";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void bushCoins(){
//        //playSoundEffect(5);
//        coins = coins + 10;
//        ui.coinCountLabel.setText(coins + "");
//        //playSoundEffect(6);
//
//        ui.mainTextArea.setText("A small bag of loot falls out of the bush, you open it to find some gold pieces\n[You obtain 10 coins]");
//        ui.choice1.setText("Retrieve your plunder");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "forest";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void bushBandit(){
//        enemy = new Bandit_Bush();
//        //playSoundEffect(5);
//
//
//        ui.mainTextArea.setText("You shake it and a gnarly looking bandit appears. He says he is here to rob you.\n\n" + enemy.name + ": " + enemy.hp + " HP");
//        ui.choice1.setText("Fight him");
//        ui.choice2.setText("Give him your coins");
//        ui.choice3.setText("Run Away");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "forestBanditFight";
//        game.nextPosition2 = "robbed";
//        game.nextPosition3 = "forest";
//        game.nextPosition4 = "";
//    }

//    public void robbed(){
//        coins = 0;
//        ui.coinCountLabel.setText(coins + "");
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("He takes your money and runs away into the forest.");
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "forest";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void forestBanditFight(){
//        player.currentWeapon.Damage();
//        enemy.hp = enemy.hp - player.currentWeapon.damage;
//        //playSoundEffect(5);
//
//        enemy.Damage();
//        player.hp = player.hp - enemy.attack;
//        ui.hpNumberLabel.setText("" + player.hp);
//
//        //Enemy dead & player alive
//        if(enemy.hp < 1 && player.hp > 0){
//            enemy.hp = 0;
//            ui.mainTextArea.setText(player.currentWeapon.attackMessage + "\n\nYou received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//
//            ui.choice1.setText("Continue");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "forestBanditWin";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//
//        // Enemy alive & player dead
//        else if(enemy.hp > 0 && player.hp < 1){
//            player.hp = 0;
//            ui.hpNumberLabel.setText("" + player.hp);
//
//            ui.mainTextArea.setText(player.currentWeapon.attackMessage + "\n\nYou received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//            ui.choice1.setText("Continue");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "noHealth";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//
//        // Enemy alive & player alive
//        else if(enemy.hp > 0 && player.hp > 0) {
//            ui.mainTextArea.setText(player.currentWeapon.attackMessage + "\n\nYou received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//            ui.choice1.setText("Attack again");
//            ui.choice2.setText("Run Away");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "forestBanditFight";
//            game.nextPosition2 = "forest";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//
//        // Enemy dead & player dead
//        else if(enemy.hp < 1 && player.hp < 1) {
//            player.hp = 0;
//            ui.hpNumberLabel.setText("" + player.hp);
//            noHealth();
//        }
//    }

//    public void forestBanditWin(){
//        int coinFlip = new java.util.Random().nextInt(2);
//        if(coinFlip == 0) {
//            coins = coins + 5;
//            ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and he dropped some coins as he ran away!\n[You obtained 5 coins]");
//
//        }
//        else if (coinFlip == 1) {
//            coins = coins + 10;
//            ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and he dropped some coins as he ran away!\n[You obtained 10 coins]");
//        }
//        ui.coinCountLabel.setText(coins + "");
//        //playSoundEffect(5);
//        //playSoundEffect(6);
//
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "forest";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void clearing(){
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("You come into a clearing and on your left are some berry bushes and on your right looks to be a den of some large animal.");
//        ui.choice1.setText("Pick berries");
//        ui.choice2.setText("Explore den");
//        ui.choice3.setText("Go back into the forest");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "berries";
//        game.nextPosition2 = "bearEncounter";
//        game.nextPosition3 = "forest";
//        game.nextPosition4 = "";
//    }

//    public void drinkStream(){
//        //playSoundEffect(5);
//
//        if (player.hp <= 70) {
//            player.hp = player.hp + 30;
//            ui.hpNumberLabel.setText("" + player.hp);
//            ui.mainTextArea.setText("You drank some of the water from the stream and it refreshes you.\n(+ 30HP)");
//        }
//
//        else if (player.hp > 70 && player.hp < 100) {
//            ui.mainTextArea.setText("You drank some of the water from the stream and it refreshes you.\n(+ " + ((player.hp - 100) * -1) + "HP)");
//            player.hp = 100;
//            ui.hpNumberLabel.setText("" + player.hp);
//        }
//
//        else if (player.hp == 100) {
//            ui.mainTextArea.setText("You drank some of the water from the stream and it refreshes you.");
//        }
//
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "forest";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void splashStream(){
//        //playSoundEffect(5);
//
//        if (splashPoint == false) {
//            dogPoints = dogPoints + 1;
//            splashPoint = true;
//            ui.mainTextArea.setText("Your dog loved paying in the water. He is now more loyal to you.");
//        }
//        else if (splashPoint == true) {
//            ui.mainTextArea.setText("Your dog loved paying in the water.");
//        }
//
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "forest";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void berries(){
//        //playSoundEffect(5);
//
//        if(hasBerries == false) {
//            hasBerries = true;
//            ui.mainTextArea.setText("You collect some deliciously ripe cherries but find no blackberries.\n(You obtained cherries)");
//            //playSoundEffect(4);
//        }
//        else if (hasBerries == true){
//            ui.mainTextArea.setText("It looks like you have picked all of the berries for now. Maybe some will grow back later.");
//        }
//
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "clearing";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void bearEncounter(){
//        //playSoundEffect(5);
//
//        if(bearDead == false) {
//            enemy = new Bear();
//            ui.mainTextArea.setText("You look inside the den and see a large brown bear!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//            ui.choice1.setText("Fight him");
//            ui.choice2.setText("Run Away");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "bearFight";
//            game.nextPosition2 = "clearing";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//        else if(bearDead == true) {
//            ui.mainTextArea.setText("You look inside the den but now that the bear is gone, there is nothing to see here.");
//            ui.choice1.setText("Continue");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "clearing";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//    }

//    public void bearFight(){
//        //playSoundEffect(5);
//
//        player.currentWeapon.Damage();
//        enemy.hp = enemy.hp - player.currentWeapon.damage;
//
//        enemy.Damage();
//        player.hp = player.hp - enemy.attack;
//        ui.hpNumberLabel.setText("" + player.hp);
//
//        //Enemy dead & player alive
//        if(enemy.hp < 1 && player.hp > 0){
//            enemy.hp = 0;
//            ui.mainTextArea.setText(player.currentWeapon.attackMessage + "\n\nYou received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//
//            ui.choice1.setText("Continue");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "bearWin";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//
//        // Enemy alive & player dead
//        else if(enemy.hp > 0 && player.hp < 1){
//            player.hp = 0;
//            ui.hpNumberLabel.setText("" + player.hp);
//            NoHealth.noHealth();
//        }
//
//        // Enemy alive & player alive
//        else if(enemy.hp > 0 && player.hp > 0) {
//            ui.mainTextArea.setText(player.currentWeapon.attackMessage + "\n\nYou received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//            ui.choice1.setText("Attack again");
//            ui.choice2.setText("Run Away");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "bearFight";
//            game.nextPosition2 = "clearing";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//
//            // Enemy dead & player dead
//        else if(enemy.hp < 1 && player.hp < 1) {
//            player.hp = 0;
//            ui.hpNumberLabel.setText("" + player.hp);
//            NoHealth.noHealth();
//        }
//    }

//    public void bearWin(){
//        ui.mainTextArea.setText("You defeated the " + enemy.name.toLowerCase() + " and skin the animal to collect his coat.\n(You obtained a fur pelt)");
//        bearDead = true;
//        //playSoundEffect(5);
//        //playSoundEffect(4);
//
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "clearing";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void noHealth(){
//        //playSoundEffect(5);
//        //playSoundEffect(3);
//
//        ui.mainTextArea.setText("You feel very weak and dizzy...");
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "death";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void death(){
//        if(deathCounter < 2) {
//            deathCounter = deathCounter + 1;
//            player.hp = 25;
//            ui.hpNumberLabel.setText("" + player.hp);
//            //playSoundEffect(5);
//
//
//            ui.mainTextArea.setText("Doc. Milton:\n\"Whoa, easy there. You have been out cold a couple of days now. I am proud of my needle work, but what do you say we go through a couple questions? See if your hounds are still howling.\"");
//            ui.choice1.setText("Continue");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "testQuestion1";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//        else if(deathCounter == 2){
//            lose();
//        }
//    }

//    public void testQuestion1(){
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Doc. Milton:\n\"All right. I'm gonna say a word. I want you to say the first thing that comes to mind. Hound.\"");
//        ui.choice1.setText("Feline");
//        ui.choice2.setText("Feed");
//        ui.choice3.setText("Kick");
//        ui.choice4.setText("Supper");
//
//        game.nextPosition1 = "testQuestion2";
//        game.nextPosition2 = "testQuestion2";
//        game.nextPosition3 = "testQuestion2";
//        game.nextPosition4 = "testQuestion2";
//    }

//    public void testQuestion2(){
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Doc. Milton:\n\"House.\"");
//        ui.choice1.setText("Shelter");
//        ui.choice2.setText("Burglarize");
//        ui.choice3.setText("Target");
//        ui.choice4.setText("Demolish");
//
//        game.nextPosition1 = "testQuestion3";
//        game.nextPosition2 = "testQuestion3";
//        game.nextPosition3 = "testQuestion3";
//        game.nextPosition4 = "testQuestion3";
//    }

//    public void testQuestion3(){
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Doc. Milton:\n\"Night.\"");
//        ui.choice1.setText("Campfire");
//        ui.choice2.setText("Dream");
//        ui.choice3.setText("Sleep");
//        ui.choice4.setText("Treasure");
//
//        game.nextPosition1 = "testResults";
//        game.nextPosition2 = "testResults";
//        game.nextPosition3 = "testResults";
//        game.nextPosition4 = "testResults";
//    }

//    public void testResults(){
//        //playSoundEffect(5);
//
//        ui.mainTextArea.setText("Doc. Milton:\n\"I don't have nothing to compare it to, so maybe you'd better go home and get some more rest.\"");
//        ui.choice1.setText("Continue");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "farmHouse";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void lose(){
//        //playSoundEffect(5);
//
//        //playSoundEffect(2);
//
//        ui.mainTextArea.setText("Thanks for playing. Try again and see if you can finish all the quests.");
//        ui.choice1.setText("Restart");
//        ui.choice2.setText("");
//        ui.choice3.setText("");
//        ui.choice4.setText("");
//
//        game.nextPosition1 = "toTitle";
//        game.nextPosition2 = "";
//        game.nextPosition3 = "";
//        game.nextPosition4 = "";
//    }

//    public void toTitle(){
//        defaultSetup();
//        vm.showTitleScreen();
//    }

//    public void troll(){
//        //playSoundEffect(5);
//
//        if(bearDead == false) {
//            enemy = new Troll();
//            ui.mainTextArea.setText("As you ascend the mountain, you run across a large troll!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//            ui.choice1.setText("Fight him");
//            ui.choice2.setText("Run Away");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "trollFight";
//            game.nextPosition2 = "mountain";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//        else if(bearDead == true) {
//            ui.mainTextArea.setText("You look inside the den but now that the bear is gone, there is nothing to see here.");
//            ui.choice1.setText("Continue");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "mountain";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//    }

//    public void trollFight(){
//        player.currentWeapon.Damage();
//        enemy.hp = enemy.hp - player.currentWeapon.damage;
//        //playSoundEffect(5);
//
//        enemy.Damage();
//        player.hp = player.hp - enemy.attack;
//        ui.hpNumberLabel.setText("" + player.hp);
//
//        //Enemy dead & player alive
//        if(enemy.hp < 1 && player.hp > 0){
//            enemy.hp = 0;
//            ui.mainTextArea.setText(player.currentWeapon.attackMessage + "\n\n" + enemy.attackMessage + " You received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//
//            ui.choice1.setText("Continue");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "trollWin";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//
//        // Enemy alive & player dead
//        else if(enemy.hp > 0 && player.hp < 1){
//            player.hp = 0;
//            ui.hpNumberLabel.setText("" + player.hp);
//
//            ui.mainTextArea.setText(player.currentWeapon.attackMessage + "\n\n" + enemy.attackMessage + " You received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//            ui.choice1.setText("Continue");
//            ui.choice2.setText("");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "noHealth";
//            game.nextPosition2 = "";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//
//        // Enemy alive & player alive
//        else if(enemy.hp > 0 && player.hp > 0) {
//            ui.mainTextArea.setText(player.currentWeapon.attackMessage + "\n\n" + enemy.attackMessage + " You received " + enemy.attack + " damage!\n\n" + enemy.name + ": " + enemy.hp + " HP");
//            ui.choice1.setText("Attack again");
//            ui.choice2.setText("Run Away");
//            ui.choice3.setText("");
//            ui.choice4.setText("");
//
//            game.nextPosition1 = "trollFight";
//            game.nextPosition2 = "forest";
//            game.nextPosition3 = "";
//            game.nextPosition4 = "";
//        }
//
//        // Enemy dead & player dead
//        else if(enemy.hp < 1 && player.hp < 1) {
//            player.hp = 0;
//            ui.hpNumberLabel.setText("" + player.hp);
//            NoHealth.noHealth();
//        }
//    }

}
