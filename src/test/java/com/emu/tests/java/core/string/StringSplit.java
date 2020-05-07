package com.emu.tests.java.core.string;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringSplit {

    @Test
    public void test() {

        String s = "abcaada";

        //String s = "","bc","","d";
        //String s = [, , bc, , d];
        String[] spl= s.split("a");

        System.out.println(Arrays.toString(s.split("a")));

        System.out.println(Arrays.toString(s.split("a",2)));

    }

    @Test
    public void test2() {
        String s = "Pankaj,New York,USA";
        String[] data = s.split(",", 2);


        System.out.println("Name = "+data[0]); //Pankaj
        System.out.println("Address = "+data[1]); //New York,USA
    }


    @Test
    public void test3() {


        String line = "I am a java developer";

        //SString line = [I, am, a, java, developer];

        String[] words = line.split(" ");

        String[] twoWords = line.split(" ", 2);

        System.out.println("String split with delimiter: " + Arrays.toString(words));

        System.out.println("String split into two: " + Arrays.toString(twoWords));

        // split string delimited with special characters
        String wordsWithNumbers = "I|am|a|java|developer";

        String[] numbers = wordsWithNumbers.split("\\|");

        System.out.println("String split with special character: " + Arrays.toString(numbers));

    }

}
