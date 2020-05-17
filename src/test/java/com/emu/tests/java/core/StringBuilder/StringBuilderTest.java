package com.emu.tests.java.core.StringBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    @Test
    void testSbustr() {


        Assertions.assertEquals("coucou", new StringBuilder().append("coucou eric", 0, 6).toString());
    }
}
