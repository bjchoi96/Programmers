package com.programmers.programmers.문자열뒤n글자;

public class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String test = solution.solution("hello", 3);
        System.out.println(test);
    }
}
