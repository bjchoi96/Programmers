package com.programmers.programmers.문자열정수변환;

public class Solution {
    public int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("10"));
    }
}
