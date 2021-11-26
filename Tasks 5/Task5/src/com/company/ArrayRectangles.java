package com.company;

public class ArrayRectangles {

    private final Rectangle[] recArr;
    private int lastIndex;

    public ArrayRectangles(int length) {
        recArr = new Rectangle[length];
        lastIndex = 0;
    }

    public void addRectangle(Rectangle rectangle) {
        if (lastIndex >= recArr.length)
            return;
        recArr[lastIndex++] = rectangle;
    }

    public int numberMaxArea() throws ArrayIndexOutOfBoundsException {
        if (lastIndex == 0)
            throw new ArrayIndexOutOfBoundsException("Rectangle array is empty");
        double maxArea = recArr[0].area();
        int indexMaxArea = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (recArr[i].area() > maxArea) {
                maxArea = recArr[i].area();
                indexMaxArea = i;
            }
        }
        return indexMaxArea;
    }

    public int numberMinPerimeter() throws ArrayIndexOutOfBoundsException {
        if (lastIndex == 0)
            throw new ArrayIndexOutOfBoundsException("Rectangle array is empty");
        double minPerimeter = recArr[0].perimeter();
        int indexMinPerimeter = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (minPerimeter > recArr[i].perimeter()) {
                minPerimeter = recArr[i].perimeter();
                indexMinPerimeter = i;
            }
        }
        return indexMinPerimeter;
    }

    public int numberSquare() throws ArrayIndexOutOfBoundsException {
        if (lastIndex == 0)
            throw new ArrayIndexOutOfBoundsException("Rectangle array is empty");
        int number = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (recArr[i].isSquare())
                number++;
        }
        return number;
    }
}
