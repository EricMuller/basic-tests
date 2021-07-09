package com.emu.tests.java.tokenizer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class TokenizerTest {


    @Test
    void stringToMapTest() {

        String str = "AL,M,X";

        Set <String> set =  Collections.list(new StringTokenizer(str, ","))
                .stream() .map(token -> (String) token)
                .collect(Collectors.toSet());

        Assertions.assertTrue(set.contains("X"));

    }
}
