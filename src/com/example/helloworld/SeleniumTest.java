package com.example.helloworld;

import java.util.Arrays;

/**
 * Created by tanya on 3/3/15.
 */
public class SeleniumTest {
    public static void main(String[] args) {
        String input = "1ab%10#*";
        char[] arrayInput = new char[input.length()];

        for (int i = 0; i< input.length(); i++) {
            arrayInput[i] = input.charAt(i);

            if ((arrayInput[i]>= 'A' && arrayInput[i] <= 'Z') || (arrayInput[i] >='a' && arrayInput[i] <='z')) {
                System.out.println("fi"+arrayInput[i]+"' - буква");
            } else if (arrayInput[i] >='0' && arrayInput[i] <='9') {
                System.out.println("'"+arrayInput[i]+"' - цифра");
            } else {
                System.out.println("'"+arrayInput[i]+"' - символ");
            }
        }
        Arrays.sort(arrayInput);

        for (char num : arrayInput) {
            System.out.println(num);
        }
    }
}
