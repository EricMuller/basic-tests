package com.emu.tests.java.compilation;

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");

    String sound;

    Animals(String s) {
        sound = s;
    }
}

public class Enumeration {
    static Animals a;

    public static void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
//* woof burble
    }
}
