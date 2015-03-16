package com.example.helloworld;

import java.util.Scanner;

/**
 * Created by tanya on 1/25/15.
 */
public class HappyTicket {
    public static void main(String[] args) {
        fio();
        fio_my();

    }

    public static void fio() {
        String in = "Бондаренко Виталий Викторович 23 vitalij2912@gmail.com";
        int prob = in.indexOf(' ');
        String Familia = in.substring(0,prob);
        System.out.println("Фамилия "  +Familia);
        in = in.replace(Familia,"");
        System.out.println("str = "+in);

        String Name = in.substring(11,18);
        System.out.println("Имя"   +Name);
        String Otchestvo = in.substring(18,29);
        System.out.println("Отчество" +Otchestvo);
        String age = in.substring(29,32);
        System.out.println("Возраст" +age);
        String MAIL = in.substring(32,54);
        System.out.println("Електронная почта" +MAIL);
    }
    public static void fio_my() {
        String str = "Шеремет Татьяна Федоровна 32 t.sheremet@gmail.com";
        String lastName = str.substring(0,str.indexOf(' '));
        //System.out.println("строка: "+str);

        System.out.println("Фамилия: "+lastName);

        str = str.substring(str.indexOf(' '),str.length()).trim();
        String firstName = str.substring(0,str.indexOf(' '));


        //System.out.println("строка: "+str);

//        System.out.println("Имя: "+firstName);
    }

    public static void ticket() {
        System.out.println("Enter your ticket number: ");
        Scanner console = new Scanner(System.in);

        String happyTicket = console.nextLine();
        //String happyTicket = "213123";

        String firstPart = happyTicket.substring(0,3);
        String lastPart = happyTicket.substring(3,6);
        int firstSum =0;
        for (int i=0; i<firstPart.length(); i++) {
            firstSum=firstSum+firstPart.charAt(i) - '0';
        }

        int lastSum =0;
        for (int i=0; i<lastPart.length(); i++) {
            lastSum=lastSum+lastPart.charAt(i) - '0';
        }

        if (firstSum == lastSum)
            System.out.println("You're lucky and it's a lucky ticket");
        else
            System.out.println("It's not a lucky ticket. Try more!");
    }
}
