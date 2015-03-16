package com.learningjava.chapter02;

/**
 * Created by tanya on 2/27/15.
 */
class Echo {
    int count = 0;

    void hello() {
        System.out.println("привееееет...");
    }
}

class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;
        while (x < 4) {                     //0 1 2 3
            e1.hello();
            e1.count = e1.count + 1;        //1 2 3 4

            if (x == 3) {
                e2.count = e2.count +1;     //0 0 0 6
            }

            if (x > 0) {
                e2.count = e2.count +e1.count;//0 2 5 10
            }
            x = x + 1;                      //1 2 3 4
        }
        System.out.println(e2.count); //10
    }
}
