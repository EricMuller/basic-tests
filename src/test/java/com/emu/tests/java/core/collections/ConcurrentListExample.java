package com.emu.tests.java.core.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ConcurrentListExample {

    public static void main(String[] args) {
        List <String> list = new ArrayList <>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // get the iterator
        Iterator <String> it = list.iterator();

        //manipulate list while iterating
        while (it.hasNext()) {
            System.out.println("list is:" + list);
            String str = it.next();
            System.out.println(str);
            if (str.equals("2")) list.remove("5");
            if (str.equals("3")) list.add("3 found");
            //below code don't throw ConcurrentModificationException
            //because it doesn't change modCount variable of list
            if (str.equals("4")) list.set(1, "4");
        }
    }

    @Test
    public void test2() {

        List <Integer> list = new ArrayList <>(Arrays.asList(new Integer[]{1, 2, 3}));
        for (Integer i : list) {
            System.out.println(i);
            list.add(4);
        }

    }

    @Test
    public void test3() {
        List <Integer> list = new ArrayList <>(Arrays.asList(new Integer[]{1, 2, 3}));

        for (Iterator <Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
            iterator.remove();
        }


        System.out.println(list.size());


    }

    @Test
    public void test4() {
        List <Integer> list = new ArrayList <>(Arrays.asList(new Integer[]{1, 2, 3}));

        for (ListIterator <Integer> iterator = list.listIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
            iterator.add(5);
        }


        System.out.println(list.size());


    }

}
