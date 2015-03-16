package com.example.helloworld;

/**
 * Created by tanya on 1/27/15.
 */
public class Bilet {
    public static void main(String[] args) {
        int billet = 234432;
        int l = 2 + 3 + 5;
        int r = 4 + 3 + 2;
        System.out.println(l);
        System.out.println(r);
        boolean b = l >= r;
        System.out.println(b);
        String n = b ? "билет счастливый":"билет не счастливый";
        System.out.println(n);
    }

}
