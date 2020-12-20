package com.emu.tests.java.autoboxing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AutoBoxingCastTest {

    private class Data {

        private Long l;
        private Double d;

        private Integer i;

        public Double getD() {
            return d;
        }

        public void setD(Double d) {
            this.d = d;
        }

        public Long getL() {
            return l;
        }

        public void setL(Long l) {
            this.l = l;
        }

        public Integer getI() {
            return i;
        }

    }


    @Test
    void castLongTest() {

        Data data = new Data();

        data.setL(24L);

        assertEquals(data.getL(),24L);

        data.setL((Long)(long)24);

        assertEquals(data.getL(),24L);

        data.setL((long)24);

        assertEquals(data.getL(),24L);

    }

    @Test()
    @DisplayName(" Cast Null Double to double should failed")
    void nullTest() {


        Throwable exception = assertThrows(NullPointerException.class, () -> {

            double d = new Data().getD();
        });


    }

    @Test()
    @DisplayName(" Cast Null Double to double should failed")
    void nullTest2() {


        Throwable exception = assertThrows(NullPointerException.class, () -> {

            Data data = new Data();

            if(Integer.valueOf(data.getI()) == 1 ){

            }

        });


    }

}
