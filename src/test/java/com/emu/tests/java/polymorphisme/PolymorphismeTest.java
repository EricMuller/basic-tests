package com.emu.tests.java.polymorphisme;

public class PolymorphismeTest {

    @org.junit.jupiter.api.Test
    public void test() {
        Base base = new Pere();

        base.test();
        //base = new Fille();
        // Fille fille = base; ---> erreur de compilation

    }


    @org.junit.jupiter.api.Test
    public void test2() {
        Base test = new Fille();

        Base test2 = test;

        test2.test();

    }

    @org.junit.jupiter.api.Test
    public void test3() {
        Fille f = new Fille();
        Pere p = f;
        Base base = p;
        base.test();
    }

    @org.junit.jupiter.api.Test
    public void test4() {

        Fille f = new Fille();
        Base p = f;

        Fille f2 = f;
        f2.test();
    }


}
