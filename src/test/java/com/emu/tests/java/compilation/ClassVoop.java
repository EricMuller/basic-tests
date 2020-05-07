package com.emu.tests.java.compilation;

public class ClassVoop {
    public static void main(String[] args) {
        doStuff(1);
        doStuff(1, 2);
    }

    static void doStuff(int... doArgs) {
        System.out.println("doStuff(int... doArgs) ");
    }

//    static void doStuff(int[] doArgs) {
//    }

//    static void doStuff(intdoArgs...) {
//    }

//    static void doStuff(int... doArgs, int y) {
//    }

//    static void doStuff(int x, int... doArgs) { //ok
//        System.out.println("doStuff(int x, int... doArgs)");
//    }


}
