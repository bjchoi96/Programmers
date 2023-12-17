package com.programmers.programmers.n번째원소부터;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for (int i = n-1; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
