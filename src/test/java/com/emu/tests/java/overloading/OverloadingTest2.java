package com.emu.tests.java.overloading;


import org.junit.jupiter.api.Test;

public class OverloadingTest2 {

    public void methode(int i) {
        System.out.println("Int");
    }

    public void methode(Long i) {
        System.out.println("Long");
    }

    public void methode(Number i) {
        System.out.println("Number");
    }

    @Test
    public void test() {
        OverloadingTest2 test2 = new OverloadingTest2();

        test2.methode(1);
        // Int
        test2.methode(1L);
        // Long
        test2.methode(null);
        // Long
        test2.methode(Integer.valueOf(1));
        //Number
    }


}
