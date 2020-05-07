package com.emu.tests.java.core.collections;

import com.emu.tests.java.helpers.Helper;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class ComparableTest {

    @Test
    public void test() {

        List <Data> data1 = Helper.newArrayList(new Data());
        Collections.sort(data1);

    }

    class Data implements Comparable {
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

}
