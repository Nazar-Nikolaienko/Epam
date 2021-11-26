package com.company;

public class Rectangle {

    double s1;
    double s2;

    public Rectangle(double s1, double s2) throws ExceptionInInitializerError {
        if(s1<=0 || s2 <= 0)
            throw new ExceptionInInitializerError("Не вірні дані");
        this.s1 = s1;
        this.s2 = s2;
    }

    public Rectangle(double s1) {
        this(s1, 5);
    }

    public Rectangle() {
        this(4, 3);
    }

    public double area(){
        return s1 * s2;
    }

    public double perimeter(){
        return 2*(s1 + s2);
    }

    public boolean isSquare(){
        return s1 == s2;
    }

}
