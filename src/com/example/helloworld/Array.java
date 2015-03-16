package com.example.helloworld;

/**
 * Created by tanya on 2/5/15.
 */
public class Array {
    /*
    Задача №1
    В символьный массив вводиться любое количество символов, как числовых, так и любых других.
    Необходимо произвести анализ введенных данных и вывести на экран следующую информацию о массиве:
    1) Количество элементов в массиве, если 0 , то написать, что массив пуст.
    2) Найти все числовые символы, посчитать их среднее арифметическое и найти максимальное число.
    3) Создать дополнительный массив, в который записать все символы, которые не принадлежат числовым
    символам и символам английского алфавита.
     */

    public static void main(String[] args) {
        arrayChar();
        //arrayInt();
    }

    public static void arrayChar() {
        char[] mass = { '2' , '%', 'T', '3','2'};
        System.out.println("количество елементов в массиве: " +mass.length);
        if (mass.length == 0) {
            System.out.println("массив пуст");
        }

        int i = 0;
        int max = mass[i];

        while (i < mass.length) {
            if (mass[i] >= '0' && mass[i] <= '9') {
                int number = mass[i] - '0';
                System.out.println("number="+number);
                if (number > max)
                    max = number;
            }
            i++;
        }
        System.out.print("max="+max);

    }

    public static void arrayInt() {
        int[] mass = { 678, 10, -5, 800, 13, -10, 1300 };

        int max = mass[0];
        System.out.println("max = "+max);
        int i = 0;

        while (i < mass.length) {
            System.out.println("mass.length="+mass.length);
            if (mass[i] > max)
                max = mass[i];
            i++;
        }

        System.out.println(max);
    }
}
