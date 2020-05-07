package com.emu.tests.exercices.entretien.test_niveau1.test5.pkgB;

import com.emu.tests.exercices.entretien.test_niveau1.test5.pkgA.Foo;

public class Baz {
    public static void main(String[] args) {
        Foo f = new Foo();
        // compilation error System.out.print(" " + f.a);
        // compilation error System.out.print(" " + f.b);
        System.out.println(" " + f.c);
    }
}
