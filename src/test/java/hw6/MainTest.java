package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void arrModFore() {
        Arr arr = new Arr();
        Assertions.assertArrayEquals(new int[]{7}, Arr.arrModFore(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
       // Assertions.assertEquals(new int[]{7}, Arr.arrModFore(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    void haseOneAndFore() {
        Arr arr = new Arr();
        Assertions.assertEquals(true, arr.haseOneAndFore(new int[]{1, 4}));
        Assertions.assertEquals(false, arr.haseOneAndFore(new int[]{1, 1}));
        Assertions.assertEquals(false, arr.haseOneAndFore(new int[]{1, 4, 4, 5}));
        Assertions.assertEquals(false, arr.haseOneAndFore(new int[]{4, 4}));
        Assertions.assertEquals(false, arr.haseOneAndFore(new int[]{1, 1, 3, 4}));
    }
}