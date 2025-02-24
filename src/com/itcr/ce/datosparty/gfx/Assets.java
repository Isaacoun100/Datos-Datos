package com.itcr.ce.datosparty.gfx;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * This class is in charge of storing all graphical assets for the game
 */
public class Assets {

    /**
     * Loads all images, animations and fonts to be managed easily on code
     */
    public static BufferedImage blueBox,greenBox,yellowBox,redBox, player1Static, player2Static, player3Static,
                                player4Static, starSeller, noCoinsMsg, enoughCoins, mapGuide, eventBackDrop,
                                secondPLaceImg, thirdPlaceImg,paintgun1, endGamePodium2, endGamePodium3,
                                playerSelectionTitle, loginWallpaper, roundWallpaper, selectionWallpaper, redSelectorL,
                                redSelectorR, blueSelectorL, blueSelectorR, yellowSelectorL,yellowSelectorR,
                                greenSelectorL, paintgun4,paintgun3, paintgun2, greenSelectorR, memoryWallpaper,
                                stoneRubble, stoneStatue, paintBallLogo, stoneLogo, clickerBG, paintBallBG,
                                spaceWallpaper, firstShip, secondShip, thirdShip,fourthShip, rock, paper, scissors,
                                number1,number2,number3,rpcTitle, leftPlayer, rightPlayer, playerIndicator1,
                                playerIndicator2, playerIndicator3, playerIndicator4, blackScope, target, openFieldBG,
                                clearSkyBG;
    public static BufferedImage[] settingsButton, playButton, creditsButton, backButton, titleImage, pressEnterImage,
                                  notOKComputer,  notOKComputerIcon,  nothingHereMessage,  boton1,  diceButton,
                                  upArrow, downArrow, leftArrow, rightArrow,  player1Button, player2Button, duel,
                                  stealCoins, giveCoins, loseStar, win2Stars, win5Stars, stealStar, teleport, swapPlace,
                                  player3Button, player4Button, creditsButtonMenu, volumeUp, volumeDown, gameMusic,
                                  soundEffects, starPurchaseBackDrop, yesBtn, noBtn, purchaseMsg, buyMsg, endTurnBtn,
                                  coin, star, noviceButton, proButton, eliteButton, roundTitle, okBtn, stealCoins1,
                                  stealCoins2, stealCoins3, stealCoins4, titanCard, ghostCard, koichiCard, samCard,
                                  tuxCard, backCard, checkButton, congratulationsTitle, twoPlayerAnim, threePlayerAnim,
                                  fourPlayerAnim, firstPlaceAnim, lastPlaceAnim, damageRedR, damageRedL, damageBlueR,
                                  damageBlueL, damageYellowR, damageYellowL,damageGreenR, damageGreenL, stoneButton,
                                  dustAnimation, bornStar, shootingStar, redScope;

    public static Font bitArtFont, retroComputer, threeDventure, upHeavett, pixelInversions, astalemtim, fourB30,
                        acientModernTales, swyrtd;



    /**
     * This Method initializes all assets that are used in the game, for them to load properly
     * it uses the crop method to initialize sections of an image as separate objects
     */
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet-Sheet.png"));
        SpriteSheet buttonSheet = new SpriteSheet(ImageLoader.loadImage("/textures/ButtonSprite-Sheet.png"));
        SpriteSheet shootingStarSheet = new SpriteSheet(ImageLoader.loadImage("/textures/shooting-star-nobg-Sheet.png"));

        titleImage = new BufferedImage[2];
        titleImage[0] = sheet.crop(0,0,20,3);
        titleImage[1] = sheet.crop(20,0,20,3);

        pressEnterImage = new BufferedImage[2];
        pressEnterImage[0] = sheet.crop(0,3,7,1);
        pressEnterImage[1] = sheet.crop(0,3,7,1);

        playButton = new BufferedImage[2];
        playButton[0] = sheet.crop(7,3,3,1);
        playButton[1] = sheet.crop(27,3,3,1);

        settingsButton = new BufferedImage[2];
        settingsButton[0] = sheet.crop(10,3,5,1);
        settingsButton[1] = sheet.crop(30,3,5,1);

        creditsButtonMenu = new BufferedImage[2];
        creditsButtonMenu[0] = sheet.crop(15,3,5,1);
        creditsButtonMenu[1] = sheet.crop(35,3,5,1);

        backButton = new BufferedImage[2];
        backButton[0] = sheet.crop(0,4,3,1);
        backButton[1] = sheet.crop(20,4,3,1);

        notOKComputer = new BufferedImage[2];
        notOKComputer[0] = sheet.crop(5,5,9,1);
        notOKComputer[1] = sheet.crop(5,5,9,1);

        notOKComputerIcon = new BufferedImage[2];
        notOKComputerIcon[0] = sheet.crop(3,4,2,2);
        notOKComputerIcon[1] = sheet.crop(23,4,2,2);

        nothingHereMessage = new BufferedImage[2];
        nothingHereMessage[0] = sheet.crop(5,4,9,1);
        nothingHereMessage[1] = sheet.crop(5,4,9,1);

        diceButton = new BufferedImage[2];
        diceButton[0] = buttonSheet.crop(0,0,4,4);
        diceButton[1] = buttonSheet.crop(19,0,4,4);

        upArrow = new BufferedImage[2];
        upArrow[0] = sheet.crop(14,4,1,1);
        upArrow[1] = sheet.crop(15,4,1,1);

        downArrow = new BufferedImage[2];
        downArrow[0] = sheet.crop(16,4,1,1);
        downArrow[1] = sheet.crop(17,4,1,1);

        rightArrow = new BufferedImage[2];
        rightArrow[0] = sheet.crop(14,5,1,1);
        rightArrow[1] = sheet.crop(15,5,1,1);

        leftArrow = new BufferedImage[2];
        leftArrow[0] = sheet.crop(16,5,1,1);
        leftArrow[1] = sheet.crop(17,5,1,1);


        creditsButton= new BufferedImage[2];
        creditsButton[0] = buttonSheet.crop(0,17,7,2);
        creditsButton[1] = buttonSheet.crop(19,17,7,2);

        player4Button= new BufferedImage[2];
        player4Button[0] = buttonSheet.crop(0,14,7,2);
        player4Button[1] = buttonSheet.crop(19,14,7,2);

        player3Button= new BufferedImage[2];
        player3Button[0] = buttonSheet.crop(0,11,7,2);
        player3Button[1] = buttonSheet.crop(19,11,7,2);

        player2Button= new BufferedImage[2];
        player2Button[0] = buttonSheet.crop(0,8,7,2);
        player2Button[1] = buttonSheet.crop(19,8,7,2);

        player1Button= new BufferedImage[2];
        player1Button[0] = buttonSheet.crop(0,5,7,2);
        player1Button[1] = buttonSheet.crop(19,5,7,2);

        volumeUp = new BufferedImage[2];
        volumeUp[0] = buttonSheet.crop(5,0,3,3);
        volumeUp[1] = buttonSheet.crop(24,0,3,3);

        volumeDown = new BufferedImage[2];
        volumeDown[0] = buttonSheet.crop(9,0,3,3);
        volumeDown[1] = buttonSheet.crop(28,0,3,3);

        noviceButton = new BufferedImage[2];
        noviceButton[0] = buttonSheet.crop(7,17,7,2);
        noviceButton[1] = buttonSheet.crop(26,17,7,2);

        proButton = new BufferedImage[2];
        proButton[0] = buttonSheet.crop(7,19,7,2);
        proButton[1] = buttonSheet.crop(26,19,7,2);

        eliteButton = new BufferedImage[2];
        eliteButton[0] = buttonSheet.crop(0,19,7,2);
        eliteButton[1] = buttonSheet.crop(19,19,7,2);

        roundTitle = new BufferedImage[1];
        roundTitle[0]= buttonSheet.crop(7,10,12,6);

        boton1 = new BufferedImage[2];
        boton1[0] = sheet.crop(14,4,5,1);
        boton1[1] = sheet.crop(34,4,5,1);

        blueBox = sheet.crop(3,6,1,1);
        greenBox = sheet.crop(3,7,1,1);
        yellowBox = sheet.crop(4,6,1,1);
        redBox = sheet.crop(4,7,1,1);

        player1Static = sheet.crop(0,6,1,2);
        player2Static = sheet.crop(7,6,1,2);
        player3Static = sheet.crop(10,6,1,2);
        player4Static = sheet.crop(13,6,1,2);
        starSeller = sheet.crop(16,6,2,2);

        gameMusic= new BufferedImage[1];
        gameMusic[0]= buttonSheet.crop(8,5,8,2);

        soundEffects= new BufferedImage[1];
        soundEffects[0] = buttonSheet.crop(7,8,9,2);

        starPurchaseBackDrop = new BufferedImage[2];
        starPurchaseBackDrop[0] = sheet.crop(18,5,4,2);
        starPurchaseBackDrop[1] = sheet.crop(18,5,4,2);

        yesBtn = new BufferedImage[2];
        yesBtn[0] = sheet.crop(18,7,1,1);
        yesBtn[1] = sheet.crop(18,4,1,1);

        noBtn = new BufferedImage[2];
        noBtn[0] = sheet.crop(19,7,1,1);
        noBtn[1] = sheet.crop(19,4,1,1);

        purchaseMsg = new BufferedImage[2];
        purchaseMsg[0] = sheet.crop(20,7,3,1);
        purchaseMsg[1] = sheet.crop(20,7,3,1);

        noCoinsMsg = sheet.crop(20,8,7,2);
        enoughCoins = sheet.crop(20,7,4,1);

        buyMsg = new BufferedImage[2];
        buyMsg[0] = sheet.crop(25,5,4,1);
        buyMsg[1] = sheet.crop(25,5,4,1);

        endTurnBtn = new BufferedImage[2];
        endTurnBtn[1] = sheet.crop(29,4,2,2);
        endTurnBtn[0] = sheet.crop(31,4,2,2);

        firstShip = buttonSheet.crop(27,4,2,3);
        secondShip = buttonSheet.crop(29,4,2,3);
        thirdShip = buttonSheet.crop(31,4,2,3);
        fourthShip = buttonSheet.crop(33,4,2,3);

        okBtn = new BufferedImage[2];
        okBtn[0] = sheet.crop(19,8,1,1);
        okBtn[1] = sheet.crop(18,8,1,1);

        eventBackDrop = sheet.crop(0,8,2,3);


        coin = new BufferedImage[7];
        coin[0] = sheet.crop(27,7,1,1);
        coin[1] = sheet.crop(28,7,1,1);
        coin[2] = sheet.crop(29,7,1,1);
        coin[3] = sheet.crop(30,7,1,1);
        coin[4] = sheet.crop(31,7,1,1);
        coin[5] = sheet.crop(32,7,1,1);
        coin[6] = sheet.crop(27,7,1,1);

        star = new BufferedImage[10];
        star[0] = sheet.crop(29,6,1,1);
        star[1] = sheet.crop(30,6,1,1);
        star[2] = sheet.crop(31,6,1,1);
        star[3] = sheet.crop(32,6,1,1);
        star[4] = sheet.crop(33,6,1,1);
        star[5] = sheet.crop(34,6,1,1);
        star[6] = sheet.crop(35,6,1,1);
        star[7] = sheet.crop(36,6,1,1);
        star[8] = sheet.crop(37,6,1,1);
        star[9] = sheet.crop(29,6,1,1);

        duel = new BufferedImage[8];
        duel[0] = sheet.crop(2,8,2,1);
        duel[1] = sheet.crop(4,8,2,1);
        duel[2] = sheet.crop(6,8,2,1);
        duel[3] = sheet.crop(8,8,2,1);
        duel[4] = sheet.crop(10,8,2,1);
        duel[5] = sheet.crop(12,8,2,1);
        duel[6] = sheet.crop(14,8,2,1);
        duel[7] = sheet.crop(16,8,2,1);

        stealCoins = new BufferedImage[7];

        stealCoins[0] = sheet.crop(2,9,1,1);
        stealCoins[1] = sheet.crop(3,9,1,1);
        stealCoins[2] = sheet.crop(4,9,1,1);
        stealCoins[3] = sheet.crop(5,9,1,1);
        stealCoins[4] = sheet.crop(6,9,1,1);
        stealCoins[5] = sheet.crop(7,9,1,1);
        stealCoins[6] = sheet.crop(2,9,1,1);

        giveCoins = new BufferedImage[7];

        giveCoins[0] = sheet.crop(2,10,1,1);
        giveCoins[1] = sheet.crop(3,10,1,1);
        giveCoins[2] = sheet.crop(4,10,1,1);
        giveCoins[3] = sheet.crop(5,10,1,1);
        giveCoins[4] = sheet.crop(6,10,1,1);
        giveCoins[5] = sheet.crop(7,10,1,1);
        giveCoins[6] = sheet.crop(2,9,1,1);

        loseStar = new BufferedImage[10];
        loseStar[0] = sheet.crop(8,10,1,1);
        loseStar[1] = sheet.crop(9,10,1,1);
        loseStar[2] = sheet.crop(10,10,1,1);
        loseStar[3] = sheet.crop(11,10,1,1);
        loseStar[4] = sheet.crop(12,10,1,1);
        loseStar[5] = sheet.crop(13,10,1,1);
        loseStar[6] = sheet.crop(14,10,1,1);
        loseStar[7] = sheet.crop(15,10,1,1);
        loseStar[8] = sheet.crop(16,10,1,1);
        loseStar[9] = sheet.crop(8,10,1,1);

        win2Stars = new BufferedImage[11];
        win2Stars[0] = sheet.crop(8,11,1,1);
        win2Stars[1] = sheet.crop(9,11,1,1);
        win2Stars[2] = sheet.crop(10,11,1,1);
        win2Stars[3] = sheet.crop(11,11,1,1);
        win2Stars[4] = sheet.crop(12,11,1,1);
        win2Stars[5] = sheet.crop(13,11,1,1);
        win2Stars[6] = sheet.crop(14,11,1,1);
        win2Stars[7] = sheet.crop(15,11,1,1);
        win2Stars[8] = sheet.crop(16,11,1,1);
        win2Stars[9] = sheet.crop(8,11,1,1);

        win5Stars = new BufferedImage[11];
        win5Stars[0] = sheet.crop(8,12,1,1);
        win5Stars[1] = sheet.crop(9,12,1,1);
        win5Stars[2] = sheet.crop(10,12,1,1);
        win5Stars[3] = sheet.crop(11,12,1,1);
        win5Stars[4] = sheet.crop(12,12,1,1);
        win5Stars[5] = sheet.crop(13,12,1,1);
        win5Stars[6] = sheet.crop(14,12,1,1);
        win5Stars[7] = sheet.crop(15,12,1,1);
        win5Stars[8] = sheet.crop(16,12,1,1);
        win5Stars[9] = sheet.crop(8,12,1,1);

        stealStar = new BufferedImage[10];
        stealStar[0] = sheet.crop(8,9,1,1);
        stealStar[1] = sheet.crop(9,9,1,1);
        stealStar[2] = sheet.crop(10,9,1,1);
        stealStar[3] = sheet.crop(11,9,1,1);
        stealStar[4] = sheet.crop(12,9,1,1);
        stealStar[5] = sheet.crop(13,9,1,1);
        stealStar[6] = sheet.crop(14,9,1,1);
        stealStar[7] = sheet.crop(15,9,1,1);
        stealStar[8] = sheet.crop(16,9,1,1);
        stealStar[9] = sheet.crop(8,9,1,1);

        teleport = new BufferedImage[12];
        teleport[0] = sheet.crop(17,12,1,2);
        teleport[1] = sheet.crop(18,12,1,2);
        teleport[2] = sheet.crop(19,12,1,2);
        teleport[3] = sheet.crop(20,12,1,2);
        teleport[4] = sheet.crop(21,12,1,2);
        teleport[5] = sheet.crop(22,12,1,2);
        teleport[6] = sheet.crop(23,12,1,2);
        teleport[7] = sheet.crop(24,12,1,2);
        teleport[8] = sheet.crop(25,12,1,2);
        teleport[9] = sheet.crop(26,12,1,2);
        teleport[10] = sheet.crop(27,12,1,2);
        teleport[11] = sheet.crop(28,12,1,2);

        swapPlace = new BufferedImage[6];
        swapPlace[0] = sheet.crop(17,10,2,2);
        swapPlace[1] = sheet.crop(19,10,2,2);
        swapPlace[2] = sheet.crop(21,10,2,2);
        swapPlace[3] = sheet.crop(23,10,2,2);
        swapPlace[4] = sheet.crop(25,10,2,2);
        swapPlace[5] = sheet.crop(27,10,2,2);

        titanCard = new BufferedImage[2];
        titanCard[0] = buttonSheet.crop(0,22,4,6);
        titanCard[1] = buttonSheet.crop(19,22,4,6);

        ghostCard = new BufferedImage[2];
        ghostCard[0] = buttonSheet.crop(4,22,4,6);
        ghostCard[1] = buttonSheet.crop(23,22,4,6);

        ghostCard = new BufferedImage[2];
        ghostCard[0] = buttonSheet.crop(4,22,4,6);
        ghostCard[1] = buttonSheet.crop(23,22,4,6);

        koichiCard = new BufferedImage[2];
        koichiCard[0] = buttonSheet.crop(8,22,4,6);
        koichiCard[1] = buttonSheet.crop(27,22,4,6);

        samCard = new BufferedImage[2];
        samCard[0] = buttonSheet.crop(0,28,4,6);
        samCard[1] = buttonSheet.crop(19,28,4,6);

        tuxCard = new BufferedImage[2];
        tuxCard[0] = buttonSheet.crop(4,28,4,6);
        tuxCard[1] = buttonSheet.crop(23,28,4,6);

        stealCoins1 = new BufferedImage[2];
        stealCoins1[0] = sheet.crop(2,11,1,2);
        stealCoins1[1] = sheet.crop(4,11,1,2);

        backCard = new BufferedImage[2];
        backCard[0]= buttonSheet.crop(27,28,4,6);
        backCard[1]= buttonSheet.crop(8,28,4,6);

        stealCoins2 = new BufferedImage[2];
        stealCoins2[0] = sheet.crop(3,11,1,2);
        stealCoins2[1] = sheet.crop(5,11,1,2);

        stealCoins3 = new BufferedImage[2];
        stealCoins3[0] = sheet.crop(2,13,1,2);
        stealCoins3[1] = sheet.crop(4,13,1,2);

        stealCoins4 = new BufferedImage[2];
        stealCoins4[0] = sheet.crop(3,13,1,2);
        stealCoins4[1] = sheet.crop(5,13,1,2);

        bornStar = new BufferedImage[2];
        bornStar[0] = buttonSheet.crop(13,22,2,2);
        bornStar[1] = buttonSheet.crop(32,22,2,2);

        firstPlaceAnim = new BufferedImage[3];
        firstPlaceAnim[0] = sheet.crop(29,8,2,2);
        firstPlaceAnim[1] = sheet.crop(31,8,2,2);
        firstPlaceAnim[2] = sheet.crop(33,8,2,2);

        lastPlaceAnim = new BufferedImage[3];
        lastPlaceAnim[0] = sheet.crop(29,10,2,2);
        lastPlaceAnim[1] = sheet.crop(31,10,2,2);
        lastPlaceAnim[2] = sheet.crop(33,10,2,2);

        secondPLaceImg = sheet.crop(35,8,1,2);
        thirdPlaceImg = sheet.crop(36,8,1,2);

        twoPlayerAnim = new BufferedImage[2];
        twoPlayerAnim[0] = sheet.crop(36,10,2,2);
        twoPlayerAnim[1] = sheet.crop(38,10,2,2);

        checkButton = new BufferedImage[2];
        checkButton[0] = buttonSheet.crop(14,18,3,3);
        checkButton[1] = buttonSheet.crop(33,18,3,3);

        threePlayerAnim = new BufferedImage[3];
        threePlayerAnim[0] = sheet.crop(31,12,3,2);
        threePlayerAnim[1] = sheet.crop(34,12,3,2);
        threePlayerAnim[2] = sheet.crop(37,12,3,2);

        fourPlayerAnim = new BufferedImage[4];
        fourPlayerAnim[0] = sheet.crop(24,14,4,2);
        fourPlayerAnim[1] = sheet.crop(28,14,4,2);
        fourPlayerAnim[2] = sheet.crop(32,14,4,2);
        fourPlayerAnim[3] = sheet.crop(36,14,4,2);

        endGamePodium2 = sheet.crop(34,16,4,3);
        endGamePodium3 = sheet.crop(34,16,6,3);

        loginWallpaper = ImageLoader.loadImage("/textures/LoginWallpaper.png");
        roundWallpaper = ImageLoader.loadImage("/textures/RoundWallpaper.png");
        selectionWallpaper= ImageLoader.loadImage("/textures/SelectionWallpaper.png");
        memoryWallpaper = ImageLoader.loadImage("/textures/MemoryWallpaper.png");
        clickerBG = ImageLoader.loadImage("/textures/clickerBG.png");
        paintBallBG = ImageLoader.loadImage("/textures/paintballBG.png");
        spaceWallpaper = ImageLoader.loadImage("/textures/Space.png");
        mapGuide = ImageLoader.loadImage("/textures/MapLayout.png");
        clearSkyBG = ImageLoader.loadImage("/textures/clear-sky.png");
        openFieldBG = ImageLoader.loadImage("/textures/OpenField.png");

        congratulationsTitle = new BufferedImage[4];
        congratulationsTitle[0] = sheet.crop(0,17,17,2);
        congratulationsTitle[1] = sheet.crop(0,19,17,2);
        congratulationsTitle[2] = sheet.crop(0,21,17,2);
        congratulationsTitle[3] = sheet.crop(0,19,17,2);

        playerSelectionTitle = sheet.crop(6,13,10,2);

        redSelectorR = sheet.crop(20,24,1,2);
        redSelectorL = sheet.crop(21,24,1,2);

        blueSelectorR =  sheet.crop(22,24,1,2);
        blueSelectorL = sheet.crop(23,24,1,2);

        yellowSelectorR = sheet.crop(24,24,1,2);
        yellowSelectorL = sheet.crop(25,24,1,2);

        greenSelectorR = sheet.crop(26,24,1,2);
        greenSelectorL = sheet.crop(27,24,1,2);

        paintgun1 = sheet.crop(19,19,1,2);
        paintgun2 = sheet.crop(18,19,1,2);
        paintgun3 = sheet.crop(19,17,1,2);
        paintgun4 = sheet.crop(18,17,1,2);

        blackScope = sheet.crop(20, 27, 1, 1);
        target = sheet.crop(22, 26, 3, 3);

        redScope = new BufferedImage[2];
        redScope[0] = sheet.crop(21, 27, 1, 1);
        redScope[1] = sheet.crop(21, 28, 1, 1);

        damageRedL = new BufferedImage[6];
        damageRedL[0] = sheet.crop(25,18,1,2);
        damageRedL[1] = sheet.crop(24,18,1,2);
        damageRedL[2] = sheet.crop(23,18,1,2);
        damageRedL[3] = sheet.crop(22,18,1,2);
        damageRedL[4] = sheet.crop(21,18,1,2);
        damageRedL[5] = sheet.crop(20,18,1,2);

        damageRedR = new BufferedImage[6];
        damageRedR[0] = sheet.crop(20,16,1,2);
        damageRedR[1] = sheet.crop(21,16,1,2);
        damageRedR[2] = sheet.crop(22,16,1,2);
        damageRedR[3] = sheet.crop(23,16,1,2);
        damageRedR[4] = sheet.crop(24,16,1,2);
        damageRedR[5] = sheet.crop(25,16,1,2);

        damageBlueL = new BufferedImage[6];
        damageBlueL[0] = sheet.crop(31,18,1,2);
        damageBlueL[1] = sheet.crop(30,18,1,2);
        damageBlueL[2] = sheet.crop(29,18,1,2);
        damageBlueL[3] = sheet.crop(28,18,1,2);
        damageBlueL[4] = sheet.crop(27,18,1,2);
        damageBlueL[5] = sheet.crop(26,18,1,2);

        damageBlueR = new BufferedImage[6];
        damageBlueR[0] = sheet.crop(26,16,1,2);
        damageBlueR[1] = sheet.crop(27,16,1,2);
        damageBlueR[2] = sheet.crop(28,16,1,2);
        damageBlueR[3] = sheet.crop(29,16,1,2);
        damageBlueR[4] = sheet.crop(30,16,1,2);
        damageBlueR[5] = sheet.crop(31,16,1,2);

        damageYellowL = new BufferedImage[6];
        damageYellowL[0] = sheet.crop(31,22,1,2);
        damageYellowL[1] = sheet.crop(30,22,1,2);
        damageYellowL[2] = sheet.crop(29,22,1,2);
        damageYellowL[3] = sheet.crop(28,22,1,2);
        damageYellowL[4] = sheet.crop(27,22,1,2);
        damageYellowL[5] = sheet.crop(26,22,1,2);

        damageYellowR = new BufferedImage[6];
        damageYellowR[0] = sheet.crop(26,20,1,2);
        damageYellowR[1] = sheet.crop(27,20,1,2);
        damageYellowR[2] = sheet.crop(28,20,1,2);
        damageYellowR[3] = sheet.crop(29,20,1,2);
        damageYellowR[4] = sheet.crop(30,20,1,2);
        damageYellowR[5] = sheet.crop(31,20,1,2);

        damageGreenL = new BufferedImage[6];
        damageGreenL[0] = sheet.crop(25,22,1,2);
        damageGreenL[1] = sheet.crop(24,22,1,2);
        damageGreenL[2] = sheet.crop(23,22,1,2);
        damageGreenL[3] = sheet.crop(22,22,1,2);
        damageGreenL[4] = sheet.crop(21,22,1,2);
        damageGreenL[5] = sheet.crop(20,22,1,2);

        damageGreenR = new BufferedImage[6];
        damageGreenR[0] = sheet.crop(20,20,1,2);
        damageGreenR[1] = sheet.crop(21,20,1,2);
        damageGreenR[2] = sheet.crop(22,20,1,2);
        damageGreenR[3] = sheet.crop(23,20,1,2);
        damageGreenR[4] = sheet.crop(24,20,1,2);
        damageGreenR[5] = sheet.crop(25,20,1,2);

        stoneButton = new BufferedImage[2];
        stoneButton[0] = sheet.crop(33,19,3,4);
        stoneButton[1] = sheet.crop(36,19,3,4);

        dustAnimation = new BufferedImage[6];
        dustAnimation[0] = sheet.crop(31,27,3,4);
        dustAnimation[1] = sheet.crop(34,27,3,4);
        dustAnimation[2] = sheet.crop(37,27,3,4);
        dustAnimation[3] = sheet.crop(34,27,3,4);
        dustAnimation[4] = sheet.crop(31,27,3,4);
        dustAnimation[5] = sheet.crop(37,27,3,4);

        shootingStar = new BufferedImage[19];
        shootingStar[0] = shootingStarSheet.crop(0,0,2,2);
        shootingStar[1] = shootingStarSheet.crop(2,0,2,2);
        shootingStar[2] = shootingStarSheet.crop(4,0,2,2);
        shootingStar[3] = shootingStarSheet.crop(6,0,2,2);
        shootingStar[4] = shootingStarSheet.crop(8,0,2,2);
        shootingStar[5] = shootingStarSheet.crop(10,0,2,2);
        shootingStar[6] = shootingStarSheet.crop(12,0,2,2);
        shootingStar[7] = shootingStarSheet.crop(14,0,2,2);
        shootingStar[8] = shootingStarSheet.crop(16,0,2,2);
        shootingStar[9] = shootingStarSheet.crop(18,0,2,2);
        shootingStar[10] = shootingStarSheet.crop(20,0,2,2);
        shootingStar[11] = shootingStarSheet.crop(22,0,2,2);
        shootingStar[12] = shootingStarSheet.crop(24,0,2,2);
        shootingStar[13] = shootingStarSheet.crop(26,0,2,2);
        shootingStar[14] = shootingStarSheet.crop(28,0,2,2);
        shootingStar[15] = shootingStarSheet.crop(30,0,2,2);
        shootingStar[16] = shootingStarSheet.crop(32,0,2,2);
        shootingStar[17] = shootingStarSheet.crop(34,0,2,2);
        shootingStar[18] = shootingStarSheet.crop(36,0,2,2);

        paintBallLogo = sheet.crop(0,23,9,2);
        stoneLogo = sheet.crop(9,23,5,2);

        stoneRubble = sheet.crop(33,23,3,4);
        stoneStatue = sheet.crop(36,23,3,4);

        rock = sheet.crop(21,14,1,2);
        paper = sheet.crop(22,14,1,2);
        scissors = sheet.crop(23,14,1,2);

        number1 = sheet.crop(18,14,1,1);
        number2 = sheet.crop(19,14,1,1);
        number3 = sheet.crop(20,14,1,1);

        rpcTitle = sheet.crop(0,25,5,3);

        leftPlayer = sheet.crop(1,11,1,2);
        rightPlayer = sheet.crop(0,11,1,2);

        playerIndicator1 = sheet.crop(0,13,1,1);
        playerIndicator2 = sheet.crop(1,13,1,1);
        playerIndicator3 = sheet.crop(0,14,1,1);
        playerIndicator4 = sheet.crop(1,14,1,1);

        bitArtFont = FontLoader.loadFont("res/fonts/windows_command_prompt.ttf");
        retroComputer = FontLoader.loadFont("res/fonts/retro_computer_personal_use.ttf");
        threeDventure = FontLoader.loadFont("res/fonts/3Dventure.ttf");
        upHeavett = FontLoader.loadFont("res/fonts/upheavtt.ttf");
        pixelInversions = FontLoader.loadFont("res/fonts/pixel-inversions.ttf");
        astalemtim = FontLoader.loadFont("res/fonts/Astalemtim.ttf");
        fourB30 = FontLoader.loadFont("res/fonts/04B_30__.TTF");
        acientModernTales = FontLoader.loadFont("res/fonts/AncientModernTales-a7Po.ttf");
        swyrtd = FontLoader.loadFont("res/fonts/ScreamWhenYoureReadyToDieRegular-6AjD.ttf");


    }
}
