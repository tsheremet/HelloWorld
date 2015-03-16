package com.example.helloworld;

import java.util.Random;

/**
 * Created by tanya on 2/9/15.
 */
/*
Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку. Определить и вывести на экран
сообщение о том, является ли массив строго возрастающей
последовательностью.
 */

public class RandomArray {
    public static void main(String[] args) {
        int ai[] = new int[4];
        int min = 10;
        int max = 99;
        int num;
        Random r = new Random();
        for (int i=0; i<4; i++) {
            num = r.nextInt(max - min +1) + min;
            ai[i]=num;
            System.out.println("ai="+ai[i]);
        }
        int maxNum = ai[0];
        for (int i=0; i<3; i++){

            if (ai[i]<ai[i+1]) {
                System.out.println(String.format("ai[%s]=%s < ai[%s]=%s ",i, ai[i],i+1,ai[i+1]));
            } else {
                System.out.println("массив не является строго возрастающей последовательностью");
                break;
            }
        }
        System.out.println("массив является строго возрастающей последовательностью");


    }
}
