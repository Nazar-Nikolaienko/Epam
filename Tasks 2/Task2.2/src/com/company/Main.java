package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть 5 чисел в масив: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();

        int[] arr = {n1, n2, n3, n4, n5};

        System.out.println("Відстань між першим і останнім числом: " + Array.count(arr));
    }
}
