package com.learningjava.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by tanya on 3/5/15.
 */
public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            inputLine = bf.readLine();
        } catch (IOException e) {
            System.out.println("Exception: "+e);
        }
        return inputLine;
    }


    public ArrayList<String> placeDotCom(int count) {
        ArrayList<String> locations = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            int randomNum = (int) (Math.random() * 5);
            locations.add(Integer.toString(randomNum));
            locations.add(Integer.toString(randomNum + 1));
            locations.add(Integer.toString(randomNum + 2));
        }
        return locations;
    }
}
