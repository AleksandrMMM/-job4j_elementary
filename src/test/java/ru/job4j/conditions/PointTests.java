package ru.job4j.conditions;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import ru.job4j.condition.Point;

import static org.assertj.core.api.Assertions.withPrecision;

public class PointTests {

    @Test
    public void whenPointsAreSameThenDistanceIsZero() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double result = a.distance(b);
        AssertionsForClassTypes.assertThat(result).isEqualTo(4.472, withPrecision(0.002));
    }
}