package com.emu.tests.java.overloading;

/**
 *
 */
public class OverloadingTest1 {


    public static void main(String[] args) {

        OverloadingTest1 test1 = new OverloadingTest1();

        test1.methode(1, null);

        test1.methode(1, Double.valueOf(1));

        test1.methode(1, 1);

        test1.methode(Integer.valueOf(1));

    }

    public void methode(int i) {
        System.out.println("int");
    }

    public void methode(int i, Integer s) {
        System.out.println("Integer");
    }

    public void methode(int i, Number s) {
        System.out.println("Number");
    }

}
