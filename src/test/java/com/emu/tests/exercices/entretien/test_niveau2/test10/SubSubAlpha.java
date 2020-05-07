package com.emu.tests.exercices.entretien.test_niveau2.test10;


class Alpha {
    static String s = " ";

    protected Alpha() {
        s += "alpha ";
    }
}

class SubAlpha extends Alpha {
    private SubAlpha() {
        s += "sub ";
    }
}

public class SubSubAlpha extends Alpha {
    private SubSubAlpha() {
        s += "subsub ";
    }

    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }
}

