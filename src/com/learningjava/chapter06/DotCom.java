package com.learningjava.chapter06;

import java.util.ArrayList;

/**
 * Created by tanya on 3/9/15.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    void setLocationCells(ArrayList<String> loc) {
        this.locationCells = loc;
    }

    void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        int index = locationCells.indexOf(userInput);
        String result = "Мимо";

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }

        System.out.println(result);
        return result;
    }


}
