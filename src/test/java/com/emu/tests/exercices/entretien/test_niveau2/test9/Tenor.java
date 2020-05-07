package com.emu.tests.exercices.entretien.test_niveau2.test9;

public class Tenor extends Singer {

    public static String sing() {
        return "fa";
    }

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }

}

class Singer {
    public static String sing() {
        return "la";
    }
}
