package com.programmers.programmers.카운트업;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3,10));
    }
}
