package com.emu.tests.java.core.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Created by eric on 04/06/2017.
 */
public class SerializationTest {

    private static final Logger logger = LoggerFactory.getLogger(SerializationTest.class);

    static class NameStore implements Serializable {
        private String firstName;

        private String lastName;

        private transient String middleName;

        public NameStore(String fName, String mName, String lName) {
            this.firstName = fName;
            this.lastName = lName;
            this.middleName = mName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String toString() {
            StringBuffer sb = new StringBuffer(40);
            sb.append(" First Name : ");
            sb.append(this.firstName);
            sb.append(" Last Name : ");
            sb.append(this.lastName);
            sb.append(" Middle Name : ");
            sb.append(this.middleName);
            return sb.toString();
        }
    }

    @Test
    public void test() throws IOException, ClassNotFoundException {

        NameStore nameStore = new NameStore("Steve", "Middle", "Jobs");

        // serialize to object
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("nameStore"));
        o.writeObject(nameStore);
        o.close();

        // unserialize from object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("nameStore"));
        NameStore nameStore1 = (NameStore) in.readObject();

        Assertions.assertNull(nameStore1.getMiddleName());

        logger.info(nameStore1.toString());

    }

}
