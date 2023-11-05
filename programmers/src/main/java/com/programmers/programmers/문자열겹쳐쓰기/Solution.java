package com.programmers.programmers.문자열겹쳐쓰기;

public class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String subHead = my_string.substring(0,s);
        String subMod = my_string.substring(s);
        String subEnd = "";
        if (subMod.length() > overwrite_string.length()) {
            subEnd = subMod.substring(overwrite_string.length());
        }
        answer = subHead + overwrite_string + subEnd;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
    }
}
