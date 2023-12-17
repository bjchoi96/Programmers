package com.programmers.programmers.n개간격원소;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            list.add(num_list[i]);
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
