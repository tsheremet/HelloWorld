package com.learningjava.chapter01;

/**
 * Created by tanya on 2/22/15.
 */
public class BeerSong {
    public static void main(String[] args) {
        /*int beerNum = 99;
        String word = " bottles";
        while (beerNum > 0) {
            System.out.println(beerNum + word + " of beer on the wall, " + beerNum + word + " of beer!");
            System.out.println("Take one down, pass it around.");
            beerNum = beerNum - 1;

            if (beerNum >= 1) {
                if (beerNum == 1) {
                    word = " bottle";
                }
                System.out.println(beerNum + word + " of beer on the wall! \n");
            } else {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            }
        }*/

        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0)
        {
            if (beerNum == 1)
            {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum > 0)
            {
                System.out.println(beerNum +  " " + word + " of beer on the wall");
            }
            else
            {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
