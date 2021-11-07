package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int num = in.nextInt();
        int result;

        if(num > 0)
        {
            result = num * num;
            System.out.printf("Число в квадраті: %d \n", result);
        } else if(num < 0)
        {
            System.out.println(Math.abs(num));
        } else if(num == 0)
        {
            System.out.print(num);
        }

        in.close();
    }
}