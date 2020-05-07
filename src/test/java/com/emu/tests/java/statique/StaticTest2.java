package com.emu.tests.java.statique;

public class StaticTest2 {

    public static int i;

    public int j;

    public StaticTest2() {
        i++;
        j = i;
    }

    public static void main(String[] args) {
        StaticTest2 x = new StaticTest2();
        StaticTest2 y = new StaticTest2();
        StaticTest2 z = x;
        System.out.println(z.i + " et " + z.j);
    }
}
