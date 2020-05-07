package com.emu.tests.exercices;


import org.junit.jupiter.api.Test;

public class PalindromeStringTest {
    @Test
    public void test() {

        String s = "aba";

        for(int i=0,j=s.length()-1;i<s.length() && j> 0; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return ;
            }
        }

        System.out.print("exercices/palindrome");

        //s.subSequence()
    }

}
