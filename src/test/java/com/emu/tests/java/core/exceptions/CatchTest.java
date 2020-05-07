package com.emu.tests.java.core.exceptions;


import org.junit.jupiter.api.Test;

public class CatchTest {

    @Test
    public void test() {
       Boolean flag = null;

        try {
            if (flag) {
                while (true) {
                }
            } else {
                System.exit(1);
            }
        } finally {
            System.out.println("In Finally");
        }

    }
}
