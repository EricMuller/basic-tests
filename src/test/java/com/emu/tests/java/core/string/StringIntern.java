package com.emu.tests.java.core.string;

import org.junit.jupiter.api.Test;

public class StringIntern {

    @Test
    public void test() {

        String s1 = "abc";
        String s2 = new String("abc");
        s2.intern();
        System.out.println(s1 ==s2);

    }

    @Test
    public void test2() {

        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = s2.intern();
        System.out.println(s1 ==s3);
    }

    @Test
    public void test3() {

        String str = null;
        String str1="abc";
        System.out.println(str1.equals("abc") | str.equals(null));

    }
}
