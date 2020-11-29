package com.emu.tests.java8.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionalTest {

    @Test
    public void test() {


        assertThrows(NullPointerException.class, () -> {

            Optional.of(null);


        });


    }

    @Test
    public void testNullable() {


        Optional optional = Optional.ofNullable(null);

        Assertions.assertFalse(optional.isPresent());


    }
}
