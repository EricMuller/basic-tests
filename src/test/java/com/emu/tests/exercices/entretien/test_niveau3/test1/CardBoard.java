package com.emu.tests.exercices.entretien.test_niveau3.test1;

class CardBoard {
    Short story = 200;

    CardBoard go(CardBoard cb) {
        cb = null;
        return cb;
    }

    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;
        // do Stuff
    }

}
