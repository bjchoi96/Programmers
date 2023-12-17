package com.programmers.programmers.이어붙인수;

public class Solution {
    public int solution(int[] num_list) {
        String oddNum = "";
        String evenNum = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNum = evenNum.concat(String.valueOf(num_list[i]));
            } else {
                oddNum = oddNum.concat(String.valueOf(num_list[i]));
            }
        }

        return Integer.parseInt(evenNum) + Integer.parseInt(oddNum);
    }
}
