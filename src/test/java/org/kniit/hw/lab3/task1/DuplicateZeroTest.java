package org.kniit.hw.lab3.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateZeroTest {
    private Solution solution = new Solution();

    @Test
    void testBasic() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testWithoutZero() {
        int[] arr = {1, 2, 3};
        int[] expected = {1, 2, 3};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testWithOneZero() {
        int[] arr = {0};
        int[] expected = {0};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testWithOneNotZero() {
        int[] arr = {1};
        int[] expected = {1};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testWithOnlyZeros() {
        int[] arr = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testZeroAtBeginning() {
        int[] arr = {0, 1, 2, 3};
        int[] expected = {0, 0, 1, 2};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testZeroAtEnd() {
        int[] arr = {1, 2, 3, 0};
        int[] expected = {1, 2, 3, 0};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testNullArray() {
        solution.duplicateZeros(null);
    }

}
