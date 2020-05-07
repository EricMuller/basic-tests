package com.emu.tests.exercices.entretien.test_niveau3.test8;

public class Ouch {
    static int ouch = 7;

    public static void main(String[] args) {
        new Ouch().go(ouch);
        System.out.print(" " + ouch);
    }

    void go(int ouch) {
        ouch++;
        // for (int ouch = 3; ouch < 6; ouch++) // compilataioin failed
            ;
        System.out.print(" " + ouch);
    }
}
