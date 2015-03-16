package com.learningjava.chapter02;

/**
 * Created by tanya on 2/26/15.
 */
class TapeDeck {

    boolean canRecord = false;

    void playType() {
        System.out.println("type is playing");
    }

    void recordType() {
        System.out.println("type is recording");
    }
}

class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playType();

        if (t.canRecord) {
            t.recordType();
        }
    }
}