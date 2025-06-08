package ru.job4j.conditions;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import ru.job4j.condition.Point;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTests {

    @Test
    public void whenPointsAreSameThenDistanceIsZero() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double result = a.distance(b);
        AssertionsForClassTypes.assertThat(result).isEqualTo(4.472, withPrecision(0.002));
    }

    @Test
    public void whenDistance3dIsZero() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 0, 0);
        double result = p1.distance3d(p2);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void whenDistance3dIsOne() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 1, 0);
        double result = p1.distance3d(p2);
        assertEquals(1, result, 0.01);
    }

    @Test
    public void whenDistance3dIsSqrt3() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(1, 1, 1);
        double result = p1.distance3d(p2);
        assertEquals(Math.sqrt(3), result, 0.01);
    }
}