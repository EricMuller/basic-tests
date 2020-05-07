package com.emu.tests.exercices.entretien.test_niveau1.test9;

public class Frodo extends Hobbit {
    public static void main(String[] args) {
        int i = 5;
        Short myGold = 7;
        // System.out.println(countGold(myGold, 6)); //compilation error

    }
}

class Hobbit {
    int countGold(int x, int y) {
        return x + y;
    }
}



