package Dimension.Shape2D;

import Dimension.TwoDimensionalShape;

public class Triangle extends TwoDimensionalShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public double getArea() {
        // Using Heron's formula to calculate the area of the triangle
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    public boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    public boolean isScalene() {
        return side1 != side2 && side1 != side3 && side2 != side3;
    }

    public boolean isRightTriangle() {
        double hypotenuse = Math.max(Math.max(side1, side2), side3);
        double sumOfSquares = 0;

        if (hypotenuse == side1) {
            sumOfSquares = side2 * side2 + side3 * side3;
        } else if (hypotenuse == side2) {
            sumOfSquares = side1 * side1 + side3 * side3;
        } else {
            sumOfSquares = side1 * side1 + side2 * side2;
        }
        return hypotenuse * hypotenuse == sumOfSquares;
    }
}
