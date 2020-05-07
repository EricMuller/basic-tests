package com.emu.tests.java.core;



import org.junit.jupiter.api.Test;

/**
 * Created by eric on 04/06/2017.
 * <p>
 * We all know how to createParam objects of any class. Right?? Simplest is using new keyword. In this post, I will list down all other approaches in my knowledge.
 * <p>
 * Using Class.forName()
 * ClassLoader loadClass()
 * Using clone()
 * Deserialization
 * Using reflection
 * http://howtodoinjava.com/puzzles/how-to-create-an-instance-of-any-class-without-using-new-keyword/
 */
public class CreateAnInstanceOfAnyClassWithOutNewTest {

    /**
     * Using newInstance method of Class class
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        Class ref = Class.forName("com.emu.tests.java.core.Demo");
        Dummy obj = (Dummy) ref.newInstance();
    }
    /**
     * Using class loader’s loadClass()
     *
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {
        this.getClass().getClassLoader().loadClass("com.emu.tests.java.core.Demo").newInstance();
    }
    /**
     * Using clone() of java.lang.Object
     *
     * @throws Exception
     */
    @Test
    public void test3() throws Exception {
        Dummy obj = new Dummy();
        //Demo obj2 = (Demo) obj.clone();
    }
    /**
     * Serialisation
     *
     * @throws Exception
     */
    public void test4() {
        // ObjectInputStream objStream = new ObjectInputStream(inputStream);
        // Demo obj = (Demo ) inStream.readObject();
    }
    /**
     * Using Reflection
     * @throws Exception
     */
    @Test
    public void test5() throws Exception {
        //constructor.newInstance(); or
        //class.newInstance();
        Dummy.class.newInstance();
    }
}
