package com.company;

public class Arr {
    public static int[] move(int[] array) {
        int array1[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int n = array.length - i - 1;
            array1[n] = array[i];
            n--;
        }
        return array1;
    }

    public static void outArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
