package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by tanya on 1/25/15.
 */
public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader row1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader row2 = new BufferedReader(new InputStreamReader(System.in));

        String name = row1.readLine();
        String age = row2.readLine();
        System.out.println(String.format("%s захватит мир через %s лет. Му-ха-ха!",name,age));

    }

    public static void lesson08task02() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String int1 = br.readLine();
        String int2 = br.readLine();
        System.out.print(name1+" получает "+int1+" через "+int2+" лет.");
    }

    public static void lesson06task05() {
        String s1 = "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\\"";
        String s2 = "It's Java string: \"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\"";
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void lesson06task03() {
        String[] rainbow = {"красный ","оранжевый ","желтый","зеленый ","голубой ","синий","фиолетовый"};
        for (int i=0;i<rainbow.length;i++) {
            System.out.print(rainbow[i]);
            if ((i+1)%3==0)
                System.out.println();
        }
    }

    public static void lesson06task02() {
        int[] anArray = new int[10];
        for (int i=0; i < anArray.length; i++) {
            anArray[i]=i+1;
        }

        for (int j=0; j < anArray.length; j++) {
            for (int m=1; m<11; m++) {
                System.out.print(anArray[j] * m + " ");
            }
            System.out.print("\n");
        }
    }
}
