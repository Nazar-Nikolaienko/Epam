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
        int val;

        while (num2 != 0) {
            val = num2 % 2;

            if (val == 1) {
                answer++;
            }
            num2 /= 2;
        }
        return answer;
    }
}
