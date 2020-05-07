package com.emu.tests.exercices.entretien.test_niveau2.test7;

class Dog {
    public void bark() {
        System.out.print("woof ");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.print("sniff ");
    }

    public void bark() {
        System.out.print("howl ");
    }
}

public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        // ((Dog) new Hound()).sniff();// comipaltioàn faiuled
    }
}
