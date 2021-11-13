package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введіть значення a1: ");
        int a1 = new Scanner(System.in).nextInt();

        System.out.print("Введіть значення t: ");
        double t = new Scanner(System.in).nextDouble();

        System.out.print("Введіть значення alim: ");
        int alim = new Scanner(System.in).nextInt();

        System.out.print("Відповідь: " + SuGeEl.SumGeometricelements(a1, alim, t));
        System.out.println();
    }
}
