package com.programmers.programmers.대소문자변경;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] ch = a.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
            } else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }

        System.out.println(ch);
    }
}
