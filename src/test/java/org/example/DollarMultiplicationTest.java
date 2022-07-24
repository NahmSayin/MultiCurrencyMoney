package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DollarMultiplicationTest {

    @Test
    public void Multiply5by2() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    public void Multiplication10by2() {
        Dollar ten = new Dollar(10);
        ten.times(2);
        assertEquals(20, ten.amount);
    }

    @Test
    public void Multiplication10by3() {
        Dollar ten = new Dollar(10);
        ten.times(3);
        assertEquals(30, ten.amount);
    }
}
