package com.emu.tests.java8.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Before we look deeper into using the Stream.reduce() operation, let's break down the operation's participant elements into separate blocks. That way, we'll understand more easily the role that each one plays:

Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty
Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
Combiner – a function used to combine the partial result of the reduction operation when the reduction is parallelized,
or when there's a mismatch between the types of the accumulator arguments and the types of the accumulator implementation
 */
public class StreamCollectTest {

    private List <Data> generateDatas() {

        List <Data> data = new ArrayList <>();

        data.add(new Data(1, 10));
        data.add(new Data(2, 10));
        data.add(new Data(3, 20));
        data.add(new Data(4, 20));
        data.add(new Data(5, 30));

        return data;
    }

    @Test
    void collectToListTest() {

        List <Data> datas = generateDatas();

        List <Data> dataList = datas
                .stream()
                .collect(Collectors.toList());

        Assertions.assertEquals(5, dataList.size());
    }


    @Test
    void collectToMapTest() {

        List <Data> datas = generateDatas();

        Map <Integer, Data> dataList = datas
                .stream()
                .collect(Collectors.toMap(Data::getId, Function.identity()));

        Assertions.assertEquals(5, dataList.size());
    }


    @Test
    void collectGroupingByTest() {

        List <Data> datas = generateDatas();

        Map <Integer, List <Data>> dataList = datas
                .stream()
                .collect(Collectors.groupingBy(Data::getMontant));

        Assertions.assertEquals(3, dataList.size());
    }

    @Test
    void collectGroupingByTest2() {

        List <Data> datas = generateDatas();

        Map <Integer, List <Integer>> dataList = datas
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Data::getMontant,
                                Collectors.mapping(data -> data.getMontant(), Collectors.toList())));

        Assertions.assertEquals(3, dataList.size());

        // montant -> liste des montants
        dataList.get(10).forEach(System.out::println);

    }


    @Test
    void collectGroupingByAndReduceTest() {

        List <Data> datas = generateDatas();

        Map <Integer, Data> dataList = datas
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Data::getMontant,
                                Collectors.reducing(new Data(), Data::sum)));

        Assertions.assertEquals(3, dataList.size());

        // somme des montat 10 ( 2 * 10)
        Assertions.assertEquals(23, dataList.get(10));

    }

    @Test
    void reduceTest2() {

    }

    @Test
    void reduceTest3() {


    }


}

