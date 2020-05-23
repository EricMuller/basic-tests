package com.emu.tests.java8.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.StreamSupport;

public class IterableToStreamTest {

    @Test
    void testIterableToStream() {

        Iterable iterable = new ArrayList();

        StreamSupport.stream(iterable.spliterator(), false);

    }
}


