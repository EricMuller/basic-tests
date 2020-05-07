package com.emu.tests.java.overloading;


import org.junit.jupiter.api.Test;

public class OverloadingTest3 {

    public void methode(int i) {
        System.out.println("Int");
    }

    public void methode(Double i) {
        System.out.println("Double");
    }

    public void methode(Long i) {
        System.out.println("Number");
    }

    @Test
    public void test() {

        OverloadingTest3 test = new OverloadingTest3();

        //test.methode(null);

    }


}
