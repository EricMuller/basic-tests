package com.emu.tests.exercices.entretien.test_niveau2.test11;

class Building {
    Building() {
        System.out.print("b ");
    }

    Building(String name) {
        this();
        System.out.print("bn " + name);
    }
}

public class House extends Building {
    House() {
        System.out.print("h ");
    }

    House(String name) {
        this();
        System.out.print("hn " + name);
    }

    public static void main(String[] args) {
        new House("x ");
    }
}

