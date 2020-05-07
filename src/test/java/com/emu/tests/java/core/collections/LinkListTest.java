package com.emu.tests.java.core.collections;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by eric on 04/06/2017.
 */

public class LinkListTest<T> {

    private T get(T a) {
        return a;
    }


    @Test
    public void linkList() {

        LinkedList <Number> numbers = new LinkedList <Number>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }


        for (ListIterator <Number> iter = numbers.listIterator(); iter.hasNext(); ) {
            System.out.print(iter.next());
        }
        System.out.println("");
        for (ListIterator <Number> iter = numbers.listIterator(10); iter.hasPrevious(); ) {
            System.out.print(iter.previous());
        }

    }

}
