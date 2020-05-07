package com.emu.tests.exercices;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by eric on 04/06/2017.
 */
public class NumberTypeTest {

    public String calc(Number i){
        return "number";
        }

    public String calc(Long i){
        return "Long";
    }

    public String calc(Integer i){
        return "int";
    }

    public String calc(short i){
        return "Short";
    }

    @Test
    public void shortTest()  {
        Short aShort = 1;

        NumberTypeTest test2 = new NumberTypeTest();

        System.out.print(test2.calc(aShort));

        Assertions.assertEquals("number",test2.calc(aShort));
    }

    @Test
    public void longTest()  {
        Long aLong = 1l;

        NumberTypeTest test2 = new NumberTypeTest();

        System.out.print(test2.calc(aLong));

        Assertions.assertEquals("Long",test2.calc(aLong));
    }

    @Test
    public void longTest2()  {
        long aLong = 1l;

        NumberTypeTest test2 = new NumberTypeTest();

        System.out.print(test2.calc(aLong));

        Assertions.assertEquals("Long",test2.calc(aLong));
    }



}
