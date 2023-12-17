package com.programmers.programmers.더크게합치기;

public class Solution {
    public int solution(int a, int b) {
        int answer1 = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int answer2 = Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));

        return Math.max(answer1, answer2);
    }
}
