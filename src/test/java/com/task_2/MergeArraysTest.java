package com.task_2;

import org.junit.Assert;
import org.junit.Test;

public class MergeArraysTest {

    @Test
    public void firstArrayBiggerThenSecondTest() {
        int a1[] = {1, 3, 6, 8, 9};
        int a2[] = {1, 2, 4, 5};

        int expectedResult[] = {1, 1, 2, 3, 4, 5, 6, 8, 9};

        int[] result = MergeArrays.mergeArraysToOne(a1, a2);

        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, a1.length + a2.length);
        Assert.assertArrayEquals(result, expectedResult);
    }

    @Test
    public void secondArrayBiggerThenfirstTest() {

        int a1[] = {1, 2, 4, 5};
        int a2[] = {1, 3, 6, 8, 9};

        int expectedResult[] = {1, 1, 2, 3, 4, 5, 6, 8, 9};

        int[] result = MergeArrays.mergeArraysToOne(a1, a2);

        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, a1.length + a2.length);
        Assert.assertArrayEquals(result, expectedResult);
    }

    @Test
    public void firstArrayEmptyTest() {

        int a1[] = {1, 3, 6, 8, 9};
        int a2[] = {};

        int expectedResult[] = {1, 3, 6, 8, 9};

        int[] result = MergeArrays.mergeArraysToOne(a1, a2);

        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, a1.length + a2.length);
        Assert.assertArrayEquals(result, expectedResult);
    }

    @Test
    public void secondArrayEmptyTest() {

        int a1[] = {};
        int a2[] = {1, 3, 6, 8, 9};

        int expectedResult[] = {1, 3, 6, 8, 9};

        int[] result = MergeArrays.mergeArraysToOne(a1, a2);

        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, a1.length + a2.length);
        Assert.assertArrayEquals(result, expectedResult);
    }

    @Test
    public void firstAndSecondArraysEmptyTest() {

        int a1[] = {};
        int a2[] = {};

        int expectedResult[] = {};

        int[] result = MergeArrays.mergeArraysToOne(a1, a2);

        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, a1.length + a2.length);
        Assert.assertArrayEquals(result, expectedResult);
    }

}
