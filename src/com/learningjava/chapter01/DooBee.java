package com.learningjava.chapter01;

/**
 * Created by tanya on 2/22/15.
 */
public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x=x+1;
        }
        if (x == 3) {
            System.out.print("Do");
        }
    }
}
