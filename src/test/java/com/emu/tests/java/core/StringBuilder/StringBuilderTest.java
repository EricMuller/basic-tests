package com.emu.tests.java.core.StringBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    @Test
    void testSbustr() {


        Assertions.assertEquals(8, new StringBuilder().append("coucou eric", 0, 8).length());
    }
}
