package com.tw.tdd;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {

    @Test
    public void should_be_one_when_index_is_one() {
        // GIVEN
        int index = 1;
        // WHEN
        long result = Fibonacci.calculate(index);
        // THEN
        assertEquals(1L, result);
    }

    @Test
    public void should_be_one_when_index_is_two() {
        // GIVEN
        int index = 2;
        // WHEN
        long result = Fibonacci.calculate(index);
        // THEN
        assertEquals(1L, result);
    }

    @Test
    public void should_be_3_when_index_is_4() {
        // GIVEN
        int index = 4;
        // WHEN
        long result = Fibonacci.calculate(index);
        // THEN
        assertEquals(3L, result);
    }

    @Test
    public void should_be_12_586_269_025L_when_index_is_50() {
        // GIVEN
        int index = 50;
        // WHEN
        long result = Fibonacci.calculate(index);
        // THEN
        assertEquals(12_586_269_025L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_index_is_lower_1() {
        // GIVEN
        int index = -1;
        // WHEN
        Fibonacci.calculate(index);
    }


    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_index_is_greater_than_50() {
        // GIVEN
        int index = 51;
        // WHEN
        Fibonacci.calculate(index);
    }
}
