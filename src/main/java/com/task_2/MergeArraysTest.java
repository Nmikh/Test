package com.task_2;

import java.util.Arrays;

public class MergeArraysTest {
    public static void main(String[] args) {
        int a1[] = {1, 3, 6, 8, 9};
        int a2[] = {1, 2, 4, 5};
        int[] r = MergeArrays.mergeArraysToOne(a1, a2);
        System.out.println(Arrays.toString(r));
    }
}
