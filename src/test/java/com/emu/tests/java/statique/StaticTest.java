package com.emu.tests.java.statique;

public class StaticTest {

    static int j = 20;

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        int i = 10;
        StaticTest p = new StaticTest();
        p.maMethod(i);
        System.out.println(i);
        System.out.println(j);
        // 10
        // 40
    }

    public void maMethod(int x) {
        x = x * 2;
        j = j * 2;
    }


}
