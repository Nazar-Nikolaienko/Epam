package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введіть значення a1: ");
        int a1 = new Scanner(System.in).nextInt();

        System.out.print("Введіть значення n: ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("Введіть значення t: ");
        int t = new Scanner(System.in).nextInt();

        System.out.println("Відповідь: " + MuArEl.MultArEl(a1, n, t));
    }
}
