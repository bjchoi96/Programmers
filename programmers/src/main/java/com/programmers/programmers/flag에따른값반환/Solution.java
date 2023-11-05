package com.programmers.programmers.flag에따른값반환;

public class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(-4, 7, true));
    }
}
