package com.programmers.programmers.글자이어붙여문자열만들기;

public class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int i = 0; i < index_list.length; i++) {
            answer = answer.concat(String.valueOf(my_string.charAt(index_list[i])));
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test = {1,2,0,0,3};
        System.out.println(solution.solution("zpiaz", test));
    }
}
