package com.emu.tests.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by eric on 04/06/2017.
 */
public class NthLogestStringAlgorithm {
    public static void main(String[] args) {
        int n = 0;
        List <String> list = new ArrayList <>();
        list.add("Yuri");
        list.add("Ron");
        list.add("Interview");
        list.add("Longest");
        list.add("List");
        list.add("Contain");
        System.out.println(findNthLongestElement(list, n));
    }

    private static List <String> findNthLongestElement(List <String> list, int n) {
        if (n < 1) {
            return null; //Handle invalid case
        }
        TreeMap <Integer, List <String>> map = new TreeMap <>();
        for (String str : list) {
            Integer length = str.length();
            List <String> tempList = map.get(length) != null ? map.get(length) : new ArrayList <>();
            tempList.add(str);
            map.put(length, tempList);
        }
        return map.get(map.descendingKeySet().toArray()[n - 1]);

    }
}
