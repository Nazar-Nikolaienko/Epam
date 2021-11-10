package com.company;

public class Array {

    public static void Matrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (c > r) {
                    matrix[r][c] = 1;
                } else if (c < r) {
                    matrix[r][c] = 0;
                }
            }
        }
    }

    public static void outMatrix(int[][] array) {
        for (var r : array) {
            for (var c : r) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}
