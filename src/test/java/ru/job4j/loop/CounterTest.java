package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.loop.Counter.sum;
import static ru.job4j.loop.Counter.sumByEven;

public class CounterTest {

    @Test
    public void testSumFrom1To5() {
        assertEquals(15, sum(1, 5));
    }

    @Test
    public void testSumFrom0To0() {
        assertEquals(0, sum(0, 0));
    }

    @Test
    public void testSumFromNegativeToPositive() {
        assertEquals(-3, sum(-3, 2));
    }

    @Test
    public void testSumWithSingleElement() {
        assertEquals(10, sum(10, 10));
    }

    @Test
    public void testSumFromPositiveToPositive() {
        assertEquals(55, sum(1, 10));
    }

    @Test
    public void testSumWithStartGreaterThanFinish() {
        assertEquals(0, sum(5, 1));
    }

    @Test
    public void testSumByEvenFrom1To10() {
        assertEquals(20, sumByEven(1, 10));
    }

    @Test
    public void testSumByEvenFrom0To0() {
        assertEquals(0, sumByEven(0, 0));
    }

    @Test
    public void testSumByEvenFromNegativeToPositive() {
        assertEquals(0, sumByEven(-3, 3));
    }

    @Test
    public void testSumByEvenWithSingleEvenElement() {
        assertEquals(2, sumByEven(2, 3));
    }

    @Test
    public void testSumByEvenFrom4To4() {
        assertEquals(0, sumByEven(4, 4));
    }

    @Test
    public void testSumByEvenFromNegativeToNegative() {
        assertEquals(-12, sumByEven(-6, -1));
    }

    @Test
    public void testSumByEvenStartGreaterThanFinish() {
        assertEquals(0, sumByEven(10, 1));
    }
}