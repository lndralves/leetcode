package com.estudo.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/description/">See description</a>
 * */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reversed = 0;
        int next = x;

        while(next > 0){
            reversed = reversed * 10 + next % 10;
            next = next / 10;
        }

        return x - reversed == 0;
    }
}
