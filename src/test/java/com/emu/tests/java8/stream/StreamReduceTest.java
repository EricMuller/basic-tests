package com.emu.tests.java8.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Before we look deeper into using the Stream.reduce() operation, let's break down the operation's participant elements into separate blocks. That way, we'll understand more easily the role that each one plays:

Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty
Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
Combiner – a function used to combine the partial result of the reduction operation when the reduction is parallelized,
or when there's a mismatch between the types of the accumulator arguments and the types of the accumulator implementation
 */
public class StreamReduceTest {

    private List <Data> generateDatas() {

        List <Data> data = new ArrayList <>();

        data.add(new Data(1, 10));
        data.add(new Data(2, 10));
        data.add(new Data(3, 10));
        data.add(new Data(4, 10));

        return data;
    }

    @Test
    void reduceTest1() {

        List <Data> datas = generateDatas();

        Optional <Data> sum = datas
                .stream()
                .reduce((Data partial, Data data) -> new Data(0, partial.montant + data.montant));

        Assertions.assertEquals(40, sum.get().getMontant());

    }


    @Test
    void reduceTest2() {

        List <Data> datas = generateDatas();

        Data data1 = new Data(0, 0);

        Data sum = datas
                .stream()
                .reduce(data1, (Data partial, Data data) -> new Data(0, partial.montant + data.montant));

        Assertions.assertEquals(40, sum.getMontant());

    }

    @Test
    void reduceTest3() {

        List <Data> datas = generateDatas();

        Data data1 = new Data(0, 0);

        Data sum = datas
                .stream()
                .reduce(data1, Data::sum);

        Assertions.assertEquals(40, sum.getMontant());

    }




}

