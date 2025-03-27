package com.example.CTGTDL.leetcode;

public class lc345 {
    public class Solution {

        public String reverseVowels(String s) {
            String vowels = "aiueoAEIOU ";
            char[] list = s.toCharArray();
            int start = 0;
            int end= s.length()-1;
            while (start<end) {
                while (start < end && vowels.indexOf(list[start])== -1) {
                    start++;
                }
                while (start < end && vowels.indexOf(list[end])== -1) {
                    end--;
                }
                char temp = list[start];
                list[start] = list[end];
                list[end] = temp;
                start++;
                end--;
            }
            return new String(list);
        }
    }
}
/*
Input: s = "IceCreAm"

Output: "AceCreIm"
 */