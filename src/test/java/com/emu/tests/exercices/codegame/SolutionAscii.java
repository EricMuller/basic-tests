package com.emu.tests.exercices.codegame;

import java.util.Scanner;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LARGEUR = in.nextInt(); // largeur
        int HAUTEUR = in.nextInt();  // hauteur
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String LETTRES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
        int NBLETTRES = LETTRES.length();

        String CHAINE = in.nextLine();

        String ascii[][] = new String[HAUTEUR][NBLETTRES];

        for (int h = 0; h < HAUTEUR; h++) {

            String ROW = in.nextLine();

            for (int lettre = 0; lettre < NBLETTRES; lettre++) {
                ascii[h][lettre] = ROW.substring(lettre * LARGEUR, lettre * LARGEUR + LARGEUR);
                // System.err.print( ascii[h][lettre]+"|");
            }
            //System.err.println("");
        }


        for (int h = 0; h < HAUTEUR; h++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < CHAINE.length(); i++) {

                int c = Character.toUpperCase(CHAINE.charAt(i));

                if (c >= 'A' && c <= 'Z') {
                    int pos = LETTRES.indexOf(c);

                    if (pos >= 0) {
                        line.append(ascii[h][pos]);
                    }

                } else {

                    line.append(ascii[h][26]);
                }
            }
            System.out.println(line.toString());
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }

}
