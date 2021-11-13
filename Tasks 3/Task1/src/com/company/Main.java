package com.company;
import java.util.Scanner;

public class Main {

    public static boolean Sorted (int[] arr){
        boolean order = true;

        for (int i = 0; i < arr.length-1 && order; i++) {
            order = arr[i] <= arr[i+1];
        }

        return order;
    }

    public static boolean isSorted (int[] arr2){
        boolean inOrder = true;

        for (int i = 0; i < arr2.length-1 && inOrder; i++) {

            inOrder = arr2[i] >= arr2[i+1];
        }
        return inOrder;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть довжину масиву: ");
        int n = in.nextInt();

        int[] v = new int[n];
        System.out.print("Введіть значення масиву: ");

        for (int i = 0; i < n; i++){
            v[i]=in.nextInt();
        }

        for (int val: v) {
            System.out.print(val + ", ");
        }
        System.out.println();

        if (Sorted(v)){
            System.out.println("Відсортовано за зростанням");

        }
        else if (isSorted(v)){
            System.out.println("Відсортовано за спаданням");
        }
        else
            System.out.println("Числа цілі.");
    }
}