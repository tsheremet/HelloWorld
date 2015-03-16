package com.example.helloworld;

import java.util.Random;

/**
 * Created by tanya on 3/1/15.
 */
public class PasswordGenerator {

    public final static int LOW =0;
    public final static int MEDIUM =1;
    public final static int HARD =2;
    private static String generateLowPass() {
        String pass = null;
        char symbolic[] = new char[93];
        int firstElementNum = 33;
        for (int i = 0; i<symbolic.length; i++) {
            symbolic[i] = (char)(firstElementNum + i);
            System.out.print(symbolic[i]);
        }

        Random r = new Random();
        int passLength = r.nextInt(4);
        char passChar[] = new char[passLength];
        System.out.println("\nPass length = "+passLength);
        for (int j = 0; j < passLength; j++) {
            passChar[j] = symbolic[r.nextInt(93)];
        }
        return String.valueOf(passChar);
    }

    private static String generateMediumPass() {
        Random r = new Random();
        int pass = r.nextInt(999)*1000;
        return String.valueOf(pass);
    }

    private static String generateHardPass() {
        Random r = new Random();
        int pass = r.nextInt(999)*10000;
        return String.valueOf(pass);
    }


    public static String generate(int type){
        String password = null;
        switch(type){

            case LOW:
                password = generateLowPass();
                break;
            case MEDIUM:
                password = generateMediumPass();
                break;
            case HARD:
                password = generateHardPass();
                break;


        }
        return password;
    }


    public static void main(String[] args) {
        System.out.println(PasswordGenerator.generate(PasswordGenerator.LOW));
        System.out.println(PasswordGenerator.generate(PasswordGenerator.MEDIUM));
        System.out.println(PasswordGenerator.generate(PasswordGenerator.HARD));

    }

}