package com.emu.tests.java8.lambdas;

@FunctionalInterface
public interface Ifunctionnel {

    void test();

    default void teste(){
        System.out.println("default test");
    }

}
