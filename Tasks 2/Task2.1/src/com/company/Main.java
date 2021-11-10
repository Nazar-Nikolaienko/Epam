package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть 6 чисел масиву: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int num5 = in.nextInt();
        int num6 = in.nextInt();

        int[] arr = {num1, num2, num3, num4, num5, num6};
        Arr.outArr(arr);
        System.out.println("\n");
        Arr.outArr(Arr.move(arr));

    }
}