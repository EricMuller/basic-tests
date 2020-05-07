package com.emu.tests.java8.lambdas;

public class IFunctionnelTest {
    public static void main(String[] args) {

        Ifunctionnel ifunctionnel = () -> System.out.println("test");

        ifunctionnel.test();
    }
}
