package Base_Elements;

import Locations.*;

public class LocationSwitch {

    Game game;
    UI ui;
    VisibilityManager vm;
    Sound soundEffect;
    Sound music;

    public LocationSwitch(Game g, UI userInterface, VisibilityManager vManager, Sound sndfft, Sound msc) {

        game = g;
        ui = userInterface;
        vm = vManager;
        soundEffect = sndfft;
        music = msc;
    }

    public void selectPosition(String nextPosition){
        switch(nextPosition){
            case "intro1": Intro1.intro1(); break;
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
            case "bushBandit": BushBanditEncounter.bushBanditEncounter(); break;
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
            case "town": Town.town(); break;
            case "marketplace": Marketplace.marketplace(); break;
            case "tailor": Tailor.tailor(); break;
            case "buyCoat": BuyCoat.buyCoat(); break;
            case "buyFormalAttire": BuyFormalAttire.buyFormalAttire(); break;

        }
    }
}
