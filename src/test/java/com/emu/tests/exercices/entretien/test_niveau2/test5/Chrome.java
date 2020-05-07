package com.emu.tests.exercices.entretien.test_niveau2.test5;

class X {
    void do1() {
    }
}

class Y extends X {
    void do2() {
    }
}

class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        // insert code here
        // compilation erreur  x2.do2();
        // compilation erreur(Y)x2.do2();
        ((Y) x2).do2();
    }
}
