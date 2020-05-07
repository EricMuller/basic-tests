package com.emu.tests.java.heritage.innerclass;

public class StaticInnerClassTest {

    public static void main(String[] args) {
        TestInner testInner = new StaticInnerClassTest.TestInner();
        testInner.test();

    }

    public static class TestInner {

        public void test() {
            System.out.println("Test");
        }
    }
}
