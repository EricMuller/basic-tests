package com.emu.tests.java.interfaces;

@FunctionalInterface
public interface Ifunctionnel {

    void test();

    default void teste(){
        System.out.println("default test");
    }

}
