package com.emu.tests.java.autoboxing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AutoBoxingCastTest {

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

        assertEquals(24L, data.getL());

        data.setL((Long) (long) 24);

        assertEquals(24L, data.getL());

        data.setL((long) 24);

        assertEquals(24L, data.getL());

    }

    @Test()
    @DisplayName(" Cast Null Double to double should failed")
    void nullTest() {


         Data data = new Data();

        assertThrows(NullPointerException.class, () -> {
            double d = data.getD();
        });


    }

    @Test()
    @DisplayName(" Cast Null Double to double should failed")
    void nullTest2() {

        Data data = new Data();

        assertThrows(NullPointerException.class, () -> {

            if (Integer.valueOf(data.getI()) == 1) {

            }

        });


    }

}
