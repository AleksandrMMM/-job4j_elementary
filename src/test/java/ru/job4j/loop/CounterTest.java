package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.loop.Counter.sum;

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
}