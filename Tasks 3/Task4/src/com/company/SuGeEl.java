package com.company;

public class SuGeEl {
    public static int SumGeometricelements(int a1, int a, double t) {

        if (a1 < a) {
            return 0;
        }
        else {
            return a1 + SumGeometricelements((int) Math.round(a1 * t), a, t);
        }
    }
}
