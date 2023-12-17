package com.programmers.programmers.조건맞게수열변환1;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 50) && (arr[i] % 2 == 0)) {
                arr[i] = arr[i] / 2;
            } else if ((arr[i] < 50) && (arr[i] % 2 == 1)) {
                arr[i] = arr[i] * 2;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test = {1,2,3,100,99,98};
        System.out.println(Arrays.toString(solution.solution(test)));
    }
}
