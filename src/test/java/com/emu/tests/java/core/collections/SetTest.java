package com.emu.tests.java.core.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {


    @Test
    @DisplayName("Unique value in Hashet")
    public void testSet() {

        Set <String> set = new HashSet <>();

        set.add(null);
        set.add(null);
        set.add("s");
        set.add("s");

        Assertions.assertTrue(set.size() == 2);

    }

    @Test
    public void test() {
        HashSet shortSet = new HashSet();
        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }
        System.out.println(shortSet.size());
    }
}
