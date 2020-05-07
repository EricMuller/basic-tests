package com.emu.tests.java.innerclass;

import org.junit.jupiter.api.Test;

public class MethodLocalInnerClassTest {
    private int x = 10;

    void printFromInner(final int a) {
        final int y = 10;

        class MethodLocalInnerClass {
            int w = 5;

            public void print(int z) {
                System.out.println("x + y - z + w + a = " + (x+y-z+w+a));
            }
        }

        MethodLocalInnerClass innerClass = new MethodLocalInnerClass(); // must come after the class' definition
        innerClass.print(5);
    }

    @Test
    public void test() {
        new MethodLocalInnerClassTest().printFromInner(5);
    }

}
