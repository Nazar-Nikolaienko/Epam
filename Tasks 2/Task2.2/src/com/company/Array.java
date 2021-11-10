package com.company;

public class Array {
    public static int count(int[] array) {
        int answer = 0;
        int max = array[0];

        for (int e : array) {
            max = Math.max(max, e);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                int d = 0;
                for (int j = i + 1; j < array.length; j++) {
                    d++;
                    if (array[j] == max) {
                        answer = d;
                    }
                }
            }
        }
        return answer;
    }
}
