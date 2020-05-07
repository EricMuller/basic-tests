package com.emu.tests.java.interfaces;

public class IFunctionnelTest {
    public static void main(String[] args) {

        Ifunctionnel ifunctionnel = () -> System.out.println("test");

        ifunctionnel.test();
    }
}
