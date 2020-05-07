package com.emu.tests.java.core.string;

import java.util.Stack;
import java.util.StringTokenizer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Created by eric on 04/06/2017.
 */
public class StringReverse {

    @Test
    public void test1() throws Exception {
        String sh = "HowToDoInJava.com";

        String reverseString = new StringBuilder(sh).reverse().toString();
        Assertions.assertEquals(reverseString, "moc.avaJnIoDoTwoH");
    }

    @Test
    public void test2() throws Exception {
        String s = "Java technology blog for smart java concepts and coding practices";
       // Put words from String in Stack
        Stack<String> myStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            myStack.push(st.nextToken());
        }
        // Build the reverse string
        StringBuilder reverseString = new StringBuilder();
        while (!myStack.empty()) {
            reverseString.append(myStack.pop() + " ");
        }

        Assertions.assertEquals(reverseString.toString(), "practices coding and concepts java smart for blog technology Java ");
    }
}
