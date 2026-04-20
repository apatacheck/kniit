package org.kniit.hw.lab3.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeTest {
    private Solution solution = new Solution();

    @Test
    void testExample1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testSecondArrayEmpty() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] expected = {1};
        solution.merge(nums1, 1, nums2, 0);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testFirstArrayEmpty() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int[] expected = {1};
        solution.merge(nums1, 0, nums2, 1);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testWithDuplicates() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 2, 3};
        int[] expected = {1, 2, 2, 2, 3, 3};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testWithNegativeNumbers() {
        int[] nums1 = {-3, -1, 0, 0, 0};
        int[] nums2 = {-2, 2, 4};
        int[] expected = {-3, -2, -1, 2, 4};
        solution.merge(nums1, 2, nums2, 3);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testAllNums2Smaller() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int[] expected = {1, 2, 3, 4, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testAllNums2Greater() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testEmptyArrays() {
        int[] nums1 = {};
        int[] nums2 = {};
        int[] expected = {};
        solution.merge(nums1, 0, nums2, 0);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testOneElementEach() {
        int[] nums1 = {1, 0};
        int[] nums2 = {2};
        int[] expected = {1, 2};
        solution.merge(nums1, 1, nums2, 1);
        assertArrayEquals(expected, nums1);
    }
}