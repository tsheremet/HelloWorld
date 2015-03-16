package com.example.helloworld;

/**
 * Created by tanya on 2/2/15.
 */
public class password {
    public static void main(String[] args) {
        String parol = "1";

        int p = parol.length();
        System.out.println(p);

        if (p != 0) {
            char on = parol.charAt(0);
            int p2 = (parol.length() - 1);
            char p3 = parol.charAt(p2);


            if (p > 8 &&  ((on>= 'A' && on <= 'Z') || (on >='А' && on <='Я')) && p3 >='0' && p3 <='9') {
                System.out.println("отличный пароль");
            } else if (p > 8) {
                System.out.println("хороший пароль");
            } else if (p >= 4 && p <=8) {
                System.out.println("средний пароль");
            } else {
                System.out.println("простой пароль");
            }
        } else {
            System.out.println("пустой пароль");
        }
    }
}
