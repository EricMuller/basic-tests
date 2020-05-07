package com.emu.tests.exercices.codegame;

public class Ascci {

    static void distClosestNumbers(String[] row, int H, int L) {

        String chaineT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
        String tab[][] = new String[chaineT.length()][H];
        for (int i = 0; i < H; i++) {
            String ROW = row[i];
            for (int l = 0; l < tab.length; l++) {
                tab[l][i] = ROW.substring(l * L, l * L + L);
                //System.err.println("tab[i]=" + tab[l][i] +"'");
            }
            System.err.println("ROW=" + ROW);
        }

        String T = "E";

        for (int i = 0; i < T.length(); i++) {
            int c = Character.toUpperCase(T.charAt(i));
            if( c > 'A' && c < 'Z'  ) {
                int pos = chaineT.indexOf(c);
                System.out.println(pos);
            }
        }


    }

    public static void main(String[] args) {

        String files[] = {
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #",
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##",
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #",
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #"
        };
        distClosestNumbers(files, 5, 3);

    }
}
