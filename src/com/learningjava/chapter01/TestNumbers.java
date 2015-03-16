package com.learningjava.chapter01;

/**
 * Created by tanya on 2/22/15.
 */
public class TestNumbers {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        //result: 02 14 36 48
        /*while (x<5) {
            if (y<5) {
                x=x+1;
                if (y<3) {
                    x=x-1;
                }
            }
            y=y+2;
            System.out.print(x+""+y+" ");
            x = x+1;
        }*/

        //result: 11 34 59
        /*while (x<5) {
            x=x+1;
            y=x+y;
            System.out.print(x+""+y+" ");
            x = x+1;
        }*/

        //result: 02 14 25 36 47
        /*while (x<5) {
            y=y+2;
            if (y > 4){
                y=y-1;
            }
            System.out.print(x+""+y+" ");
            x = x+1;
        }*/

        //result: 00 11 23 36 410
        while (x<5) {
            y=x+y;
            System.out.print(x+""+y+" ");
            x = x+1;
        }
    }
}
