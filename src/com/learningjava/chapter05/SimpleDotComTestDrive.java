package com.learningjava.chapter05;

/**
 * Created by tanya on 3/5/15.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int [] locations = {randomNum,randomNum+1,randomNum+2};
        dot.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("Введите число ");
            String result = dot.checkYourself(guess);
            numOfGuess++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам понадобилось "+numOfGuess+" попыток/и");
            }
        }
        String step = "2";
    }
}
