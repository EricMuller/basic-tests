package com.emu.tests.exercices.codegame;

import java.util.Arrays;

public class TemperatureMin {

    static int distClosestNumbers(int[] temperatures) {

        Arrays.sort(temperatures);

        int closest = temperatures[temperatures.length - 1];

        for (int i = 0; i < temperatures.length; i++) {
            if(Math.abs(closest) >= Math.abs(temperatures[i])){
                closest  = temperatures[i];
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] testArray = {-3, -9, 50, 15, 99, 7, 98, 65,3};
        int result = distClosestNumbers(testArray);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}
