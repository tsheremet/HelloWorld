package com.learningjava.chapter06;

import com.learningjava.chapter05.GameHelper;

import java.util.ArrayList;

/**
 * Created by tanya on 3/9/15.
 */
public class DotComBust {
    private int numOfGuesses = 0;
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private GameHelper helper = new GameHelper();

    private void setUpGame() {
        DotCom dotCom1 = new DotCom();
        dotCom1.setName("Pets.com");

        DotCom dotCom2 = new DotCom();
        dotCom2.setName("Go2.com");

        DotCom dotCom3 = new DotCom();
        dotCom3.setName("AskMe.com");

        ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
        dotComList.add(dotCom1);
        dotComList.add(dotCom2);
        dotComList.add(dotCom3);

        System.out.println("Ваша цель - потопить 3 сайта: Pets.com, Go2.com, AskMe.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }

    }
    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private String checkUserGuess(String userInput) {
        numOfGuesses++;
        String result = "Мимо";

        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userInput);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                System.out.println("Ой! Вы потопили "  + " :(");
                dotComList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
        return result;
    }

    private void finishGame() {
        System.out.println("Игра окончена");
        if (numOfGuesses <= 18) {
            System.out.println("Хорошая игра. Вам понадобилось всего " + numOfGuesses + " ходов");
        } else {
            System.out.println("Попробуй сыграть лучше");
            System.out.println("Вам понадобилось аж " + numOfGuesses + " ходов");
        }
    }


    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
