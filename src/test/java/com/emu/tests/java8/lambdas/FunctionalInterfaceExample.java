package com.emu.tests.java8.lambdas;

@FunctionalInterface
public interface FunctionalInterfaceExample {

    void test();
    default int doSomething() {
        return 0;
    }


}
