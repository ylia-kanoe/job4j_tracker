package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when03and45andThen32() {
        Point a = new Point(0, 3);
        Point b = new Point(4, 5);
        Point c = new Point(3, 2);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 5;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when010andMinus2Minus5andThen10Minus5() {
        Point a = new Point(0, 10);
        Point b = new Point(-2, -5);
        Point c = new Point(10, -5);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 90;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}