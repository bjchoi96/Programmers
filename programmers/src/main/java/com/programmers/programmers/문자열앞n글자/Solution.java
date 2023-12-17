package com.programmers.programmers.문자열앞n글자;

public class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("HellowWorld", 3));
    }
}
