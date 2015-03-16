package com.example.helloworld;

import java.util.Random;

/**
 * Created by tanya on 2/15/15.
 */
public class Sort {
    public static void main(String[] args) {

        long time_befor = System.currentTimeMillis();
        Random rand = new Random();
        int[] mass = new int [10];
        for (int i =0; i<mass.length; i++)
            mass[i]= rand.nextInt(1000);


        for (int i = 0; i<mass.length; i++){
            int min = mass[i];
            int min2 = i;
            for(int a = i + 1; a <mass.length; a++) {
                if(mass[a] < min){
                    min = mass [a];
                    min2 = a;
                }
            }

            if(i != min2){
            int zam = mass[i];
            mass[i]= mass[min2];
            mass[min2]= zam;
            }

        }

        for (int i = 0; i < mass.length; i++)
            System.out.print(mass[i] + " ");

        // проверка производительности

        long time_after = System.currentTimeMillis();

        System.out.println("\n" + (time_after - time_befor) + " MC");
    }
}
