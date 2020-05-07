package com.emu.tests.java.core.StringTokenier;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.StringTokenizer;

public class StringTokenizerTest {

    private static final Logger logger = LoggerFactory.getLogger(StringTokenizerTest.class);

    @Test
    public void testTokenizer() {
        String test = ":::::1";
        StringTokenizer stringTokenizer = new StringTokenizer(test, ":");
        Assertions.assertEquals(stringTokenizer.countTokens(), 1);
        while (stringTokenizer.hasMoreElements()) {
            String res = (String) stringTokenizer.nextToken();
            logger.info("testTokenizer res=" + res);
        }
    }

    @Test
    /*
    with return delmimieter = true
     */
    public void testTokenizerWithReturnDelimiter() {
        String test = ":::::1";
        StringTokenizer stringTokenizer = new StringTokenizer(test, ":", true);
        Assertions.assertEquals(stringTokenizer.countTokens(), 6);
        while (stringTokenizer.hasMoreElements()) {
            String res = (String) stringTokenizer.nextToken();
            logger.info("testTokenizer2 res=" + res);
        }
    }

    @Test
    public void test() {

        StringTokenizer stringTokenizer = new StringTokenizer(":15:42:3:", ":", true);

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }


    }
}
