package com.emu.tests.java.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTest {

    @Test
    void name() {

        Pattern pattern = Pattern.compile("(?<num>\\d{2})", Pattern.DOTALL);

        Matcher matcher = pattern.matcher("ssss-fff-ff (68)(sss)");

        Assertions.assertTrue(matcher.find());
        Assertions.assertEquals("68",matcher.group("num"));


    }
}
