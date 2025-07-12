package com.estudo.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private final PalindromeNumber pn = new PalindromeNumber();

    @Test
    @DisplayName("Input: 121, Output: true")
    public void test1() {
        Assertions.assertTrue(this.pn.isPalindrome(121));
    }

    @Test
    @DisplayName("Input: -121, Output: false")
    public void test2() {
        Assertions.assertFalse(this.pn.isPalindrome(-121));
    }

    @Test
    @DisplayName("Input: 10, Output: false")
    public void test3() {
        Assertions.assertFalse(this.pn.isPalindrome(10));
    }

}