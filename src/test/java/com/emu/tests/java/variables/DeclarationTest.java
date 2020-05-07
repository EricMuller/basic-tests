package com.emu.tests.java.variables;

import org.junit.jupiter.api.Test;

public class DeclarationTest {


    int x[];

    int[] y;

    // int[5] x2;

    //int z2[5];

    int[] z[][];

    // int[] y2 = [5];

    //int z2[5] = new int[5];
    int z2[] = new int[5];

    int tableauEntier[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    double tableauDouble[] = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
    char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String tableauChaine[] = {"chaine1", "chaine2", "chaine3", "chaine4"};


    int[][] premiersNombres = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}};

    int premiersNombres2[][] = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}};

    int[] premiersNombres3[][] = {{{0}, {2}, {4}, {6}, {8}}};

    @Test
    public void test() {
        char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        for (int i = 0; i < tableauCaractere.length; i++) {
            System.out.println("À l'emplacement " + i + " du tableau nous avons = " + tableauCaractere[i]);
        }
    }


    @Test
    public void test2() {

        int premiersNombres[][] = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}};
        int i = 0, j = 0;

        System.out.println(premiersNombres[0]);


    }
}
