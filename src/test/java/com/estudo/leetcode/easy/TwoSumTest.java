package com.estudo.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    private final TwoSum ts = new TwoSum();

    @Test
    @DisplayName("Input: [2,7,11,15], target = 9, Output: [0,1]")
    public void test1(){
        int[] result = this.ts.twoSum(new int[]{2,7,11,15},9);
        Assertions.assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    @DisplayName("Input: [3,2,4], target = 6, Output: [1,2]")
    public void test2(){
        int[] result = this.ts.twoSum(new int[]{3,2,4},6);
        Assertions.assertArrayEquals(new int[]{1,2}, result);
    }

    @Test
    @DisplayName("Input: [3,3], target = 6, Output: [0,1]")
    public void test3(){
        int[] result = this.ts.twoSum(new int[]{3,3},6);
        Assertions.assertArrayEquals(new int[]{0,1}, result);
    }



}
