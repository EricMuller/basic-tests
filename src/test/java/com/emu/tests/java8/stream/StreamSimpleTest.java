package com.emu.tests.java8.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSimpleTest {

    @Test
    void maptoSortedListTest() {

        List <String> strings = Arrays.asList("a.", "e.", "b.", "c.", "d.", "aa", "bb");

        List <String> stringList = strings
                .stream()
                // filtrage
                .filter(x -> x.contains("."))
                // mapping
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                // tri par ordre alphabétique
                .sorted()
                // Outputs:
                //A.
                //B.
                //C.
                //D.
                //E.
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);

        Assertions.assertEquals(5, stringList.size());
    }

    @Test
    void maptoDistinctListTest() {

        List <String> strings = Arrays.asList("a.", "a.", "b.", "c.", "c.", "aa", "bb");

        List <String> stringList = strings
                .stream()
                // filtrage
                .filter(x -> x.contains("."))
                // mapping
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                // tri par ordre alphabétique
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);
        // Outputs:
        //A.
        //B.
        //C.
        Assertions.assertEquals(3, stringList.size());

    }

    @Test
    void mapDistinctMap() {

        List <Data> strings = generateDatas();

        // Dta should be Comaprable or add a comparator
        List <Data> stringList = strings
                .stream()
                // mapping
                // tri par ordre alphabétique
                .distinct()
                .sorted(Comparator.comparingInt(o -> o.montant))
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);
        // Outputs:
        //A.
        //B.
        //C.
        // Assertions.assertEquals(3, stringList.size());

    }

    private List <Data> generateDatas() {

        List <Data> data = new ArrayList <>();
        data.add(new Data(1, 10));
        data.add(new Data(2, 10));
        data.add(new Data(3, 20));
        data.add(new Data(4, 20));
        data.add(new Data(5, 30));
        return data;
    }

}
