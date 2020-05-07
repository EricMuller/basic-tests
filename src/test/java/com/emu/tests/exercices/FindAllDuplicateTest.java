package com.emu.tests.exercices;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by eric on 04/06/2017.
 */
public class FindAllDuplicateTest {

    @Test
    public void name() {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8 };  // input 1
        int size = array.length;              // input 2

        Set <Integer> set = new HashSet <>();
        Set <Integer> duplicates = new HashSet <>();

        for (int i = 0; i < size; i++) {
            if (set.add(array[i]) == false) {
                duplicates.add(array[i]);
            }
        }

        if (duplicates.size() == 0) {
            duplicates.add(-1);
        }

        System.out.println(duplicates);
    }
}
