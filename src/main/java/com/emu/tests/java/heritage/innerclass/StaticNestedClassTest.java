package com.emu.tests.java.heritage.innerclass;


class HelperClass {
    static class InnerHelper {
        void print() {
            doPrint();
            int b = a;
        }
    }

    static void doPrint() {
        System.out.println("Printing from HelperClass");
    }

    static int a = 1;
}

public class StaticNestedClassTest {
    static class AnotherHelper {
        void print() {
            System.out.println("Printing from AnotherHelper");
        }
    }

    public static void main(String... args) {
        /* Remark the way we create an instance of a static inner class
         is not the same as for inner classes */
        HelperClass.InnerHelper h1 = new HelperClass.InnerHelper();
        h1.print(); // will print: Printing from HelperClass
        AnotherHelper h2 = new AnotherHelper();
        h2.print(); // will print: Printing from AnotherHelper
    }
}
