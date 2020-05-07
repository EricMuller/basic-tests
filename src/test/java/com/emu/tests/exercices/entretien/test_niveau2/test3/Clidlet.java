package com.emu.tests.exercices.entretien.test_niveau2.test3;

public class Clidlet extends Clidder {
    public final void flipper() { System.out.println("Clidlet"); }
    public static void main(String [] args) {
        new Clidlet().flipper();
    }
}
