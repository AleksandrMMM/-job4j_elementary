package ru.job4j.conditions;

import org.junit.jupiter.api.Test;
import ru.job4j.condition.Max;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTests {

    @Test
    void whenMaxOfTwoThenFirstIsMax() {
        int result = Max.max(5, 3);
        assertEquals(5, result);
    }

    @Test
    void whenMaxOfTwoThenSecondIsMax() {
        int result = Max.max(2, 7);
        assertEquals(7, result);
    }

    @Test
    void whenMaxOfTwoThenEqual() {
        int result = Max.max(4, 4);
        assertEquals(4, result);
    }

    @Test
    void whenMaxOfThreeThenFirstIsMax() {
        int result = Max.max(9, 6, 4);
        assertEquals(9, result);
    }

    @Test
    void whenMaxOfThreeThenSecondIsMax() {
        int result = Max.max(3, 8, 1);
        assertEquals(8, result);
    }

    @Test
    void whenMaxOfThreeThenThirdIsMax() {
        int result = Max.max(2, 5, 10);
        assertEquals(10, result);
    }

    @Test
    void whenMaxOfThreeThenAllEqual() {
        int result = Max.max(3, 3, 3);
        assertEquals(3, result);
    }

    @Test
    void whenMaxOfFourThenFirstIsMax() {
        int result = Max.max(10, 7, 5, 4);
        assertEquals(10, result);
    }

    @Test
    void whenMaxOfFourThenSecondIsMax() {
        int result = Max.max(5, 12, 8, 3);
        assertEquals(12, result);
    }

    @Test
    void whenMaxOfFourThenThirdIsMax() {
        int result = Max.max(3, 7, 15, 6);
        assertEquals(15, result);
    }

    @Test
    void whenMaxOfFourThenFourthIsMax() {
        int result = Max.max(2, 6, 9, 14);
        assertEquals(14, result);
    }

    @Test
    void whenMaxOfFourThenAllEqual() {
        int result = Max.max(5, 5, 5, 5);
        assertEquals(5, result);
    }
}