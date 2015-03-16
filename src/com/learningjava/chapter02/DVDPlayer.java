package com.learningjava.chapter02;

/**
 * Created by tanya on 2/26/15.
 */
class DVDPlayer {
    boolean canRecord = false;

    void recordDVD() {
        System.out.println("DVD is recording");
    }
}
class DVDPLayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        //d.playDVD();

        if (d.canRecord) {
            d.recordDVD();
        }
    }
}
