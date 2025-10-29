package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    public void when5Or4ThenThisMax5() {
        int expected = 5;
        int output = Max.max(5,4);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void when5Or4Or7ThenThisMax7() {
        int expected = 7;
        int output = Max.max(5,4, 7);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void when5Or12Or4Or7ThenThisMax12() {
        int expected = 12;
        int output = Max.max(5, 12,4, 7);
        assertThat(output).isEqualTo(expected);
    }
}