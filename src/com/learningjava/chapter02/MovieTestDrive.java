package com.learningjava.chapter02;

/**
 * Created by tanya on 2/26/15.
 */
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как проиграть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Байт-клуб";
        three.genre = "Трагедия, но веселая";
        three.rating = 127;

    }
}
