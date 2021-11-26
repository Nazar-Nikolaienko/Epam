package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayRectangles rectangles = new ArrayRectangles(5);

        rectangles.addRectangle(new Rectangle(2,5));
        rectangles.addRectangle(new Rectangle());
        rectangles.addRectangle(new Rectangle(6));


        System.out.println("Індекс максимальної площі прямокутника:" + rectangles.numberMaxArea());

        System.out.println("Індекс мінімального прямокутника периметра:" + rectangles.numberMinPerimeter());

        System.out.println("Кількість квадратів:" + rectangles.numberSquare());
    }
}


