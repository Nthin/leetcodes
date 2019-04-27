package com.xxf.easy;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertTest {

    private SearchInsert searchInsert = new SearchInsert();
    private int[] array = new int[]{1, 3, 5, 6};

    @Test
    public void searchInsert() {
        Assert.assertEquals(2, searchInsert.searchInsert(array, 5));
        Assert.assertEquals(1, searchInsert.searchInsert(array, 2));
        Assert.assertEquals(4, searchInsert.searchInsert(array, 7));
        Assert.assertEquals(0, searchInsert.searchInsert(array, 0));
    }

    @Test
    public void searchInsert2() {
        Assert.assertEquals(2, searchInsert.searchInsert2(array, 5));
        Assert.assertEquals(1, searchInsert.searchInsert2(array, 2));
        Assert.assertEquals(4, searchInsert.searchInsert2(array, 7));
        Assert.assertEquals(0, searchInsert.searchInsert2(array, 0));
    }
}