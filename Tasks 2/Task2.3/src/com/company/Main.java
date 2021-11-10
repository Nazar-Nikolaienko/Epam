package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {11, 8, 3, 2},
                {8, 22, 45, 97},
                {3, 56, 33, 11},
                {64, 6, 88, 44}
        };
        System.out.println("Матриця: ");
        Array.outMatrix(matrix);
        Array.Matrix(matrix);
        System.out.println();
        System.out.println("Результат: ");
        Array.outMatrix(matrix);
    }
}
