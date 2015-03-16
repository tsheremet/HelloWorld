package com.learningjava.chapter01;

/**
 * Created by tanya on 2/22/15.
 */
public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {

            if (x > 3) {//4
                System.out.print("an");
                System.out.print(" oyster ");
                x = x - 1;
            }
            if (x > 0) {//2
                System.out.print("annoys");
                x = x + 2;//4
            }
            if (x < 1) {//0
                System.out.print("a ");
                x = x + 1;//1
            }
            if (x == 1) {//1
                System.out.print("noise");
                x = x + 1;//2
            }
            System.out.println("");





            /*
            a noise
            annoys
            an oyster
             */
        }
    }
}
