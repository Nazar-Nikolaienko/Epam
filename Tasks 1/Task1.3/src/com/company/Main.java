package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Введіть число: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("Число = " + num + "\t" + "Відповідь = " + calculation(num));

    }

    public static int calculation(int num2) {
        int answer = 0;

        while (num2 != 0) {
            int value = num2 % 10;

            if ((num2 % 2) == 1) {
                answer += value;
            } else {
                answer += 0;
            }
            num2 /= 10;
        }
        return answer;
    }
}