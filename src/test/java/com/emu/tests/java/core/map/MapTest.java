package com.emu.tests.java.core.map;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static class Identite {
        private String nom;

        private int score;

        public Identite(String nom, int score) {
            this.nom = nom;
            this.score = score;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    @Test
    void testSortTreeMapByValue() {

        Map <String, List <Identite>> map = new HashMap <>();
        map.putIfAbsent("111111", Arrays.asList(new Identite("nom1", 90), new Identite("nom1", 60)));
        map.putIfAbsent("222222", Arrays.asList(new Identite("nom3", 100), new Identite("nom4", 40)));

        for (Map.Entry <String, List <Identite>> key : map.entrySet()) {
            System.out.println(key.getKey() + " --> " + key.getValue().get(0).score);
        }

        TreeMap<String, List <Identite>> sortedMap = createSortedMap(map);

        System.out.println("sortedMap result :");

        for (Map.Entry <String, List <Identite>> key : sortedMap.entrySet()) {
            System.out.println(key.getKey() + " --> " + key.getValue().get(0).score);
        }

    }

    public static TreeMap<String, List <Identite>> createSortedMap(Map<String, List <Identite>> map){
        Comparator<String> comparator = new ValueComparator(map);
        TreeMap<String, List <Identite>> result = new TreeMap<>(comparator);
        result.putAll(map);
        return result;
    }

    // a comparator using generic type
    public static class ValueComparator implements Comparator <String> {
        private Map <String, List <Identite>> map;

        public ValueComparator(Map <String, List <Identite>> map) {
            this.map = map;
        }

        @Override
        public int compare(String k1, String k2) {

//            int compare = k1.compareTo(k2);
//            if (compare == 0) {
                Identite identity1 = map.get(k1).get(0);
                Identite identity2 = map.get(k2).get(0);
                return Integer.compare( identity2.score, identity1.score);
//            }
//            return compare;
        }
    }

}
