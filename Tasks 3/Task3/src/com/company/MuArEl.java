package com.company;

public class MuArEl {
    public static int MultArEl(int a1, int t, int n) {
        int answer = 1;

        for (int i = 0; i < n; i++) {
            answer *= a1;
            int temporary = a1 + t;
            a1 = temporary;
        }

        return answer;
    }
}