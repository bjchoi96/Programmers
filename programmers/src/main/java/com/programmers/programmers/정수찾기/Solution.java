package com.programmers.programmers.정수찾기;

public class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1,2,3};
        System.out.println(solution.solution(ints, 3));
    }
}
