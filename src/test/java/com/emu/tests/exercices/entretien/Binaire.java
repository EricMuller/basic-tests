package com.emu.tests.exercices.entretien;

public class Binaire {

    public static void main( String [] args ) {

        int value1 = 0b10101010;
        int value2 = 0b00001111;

        // & (AND)   | (OR)    ^ (XOR)    ~ (NOT)
        System.out.println( "NOT - " + Integer.toBinaryString( ~value1 ) );
        System.out.println( "AND - " + Integer.toBinaryString( value1 & value2 ) );
        System.out.println( "OR  - " + Integer.toBinaryString( value1 | value2 ) );
        System.out.println( "XOR - " + Integer.toBinaryString( value1 ^ value2 ) );

    }
}
