package com.emu.tests.exercices.entretien.test_niveau2.test2;

public class Bottom2 extends Top {
    public Bottom2(String s) {
        super(s);
        System.out.print("D");
    }
    public static void main(String [] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}

