package com.emu.tests.exercices.codegame;

import java.util.Arrays;

public class Chevaux {

   
    static int distClosestNumbers(int[] puissance) {

        Arrays.sort(puissance);

        int ecartMin = puissance[puissance.length - 1];
        for (int i = 1; i < puissance.length; i++) {
            int e = puissance[i] - puissance[i - 1];
            ecartMin = e < ecartMin ? e : ecartMin;
        }

        return ecartMin;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 5, 8, 9};
        int result = distClosestNumbers(testArray);
        System.out.println(result); // Expected result is 1
    }
}
