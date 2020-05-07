package com.emu.tests.exercices.codegame;

import java.util.Arrays;

public class Closest {
    static int distClosestNumbers(int[] numbers) {
        // try to implement it!
        if (numbers == null || numbers.length > 0) {
            return -1;
        }

        Arrays.sort(numbers);
        int ecartMin = numbers[numbers.length - 1];
        for (int i = 1; i < numbers.length; i++) {
            int ecart = numbers[i] - numbers[i - 1];
            ecartMin = ecart < ecartMin ? ecart : ecartMin;
        }
        return ecartMin;


    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}
