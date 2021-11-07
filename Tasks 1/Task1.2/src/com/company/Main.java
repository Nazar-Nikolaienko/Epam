package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введіть число в межах (100<=n<=999): ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num < 100 || num > 999)
        {
            System.out.println("Error!");
            return;
        }

        int first = num / 100;
        int second = num % 100;
        second = second / 10;
        int third = num % 10;

        if(first > second && first > third)
        {
            System.out.println("Відповідь: " + first + " " + second + " " + third);
        } else if(second > first && second > third)
        {
            System.out.println("Відповідь: " + second + " " + first + " " + third);
        } else if(third > first && third > second)
        {
            System.out.println("Відповідь: " + third + " " + first + " " + second);
        }
    }
}
