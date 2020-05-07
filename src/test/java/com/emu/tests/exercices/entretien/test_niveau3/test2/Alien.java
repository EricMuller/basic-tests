package com.emu.tests.exercices.entretien.test_niveau3.test2;

class Alien {
    String invade(short ships) { return "a few"; }
    String invade(short... ships) { return "many"; }
}
class Defender {
    public static void main(String [] args) {
      //  System.out.println(new Alien().invade(7)); // compilation failed

    }
}

