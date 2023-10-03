package Dimension.Shape2D;

import Dimension.TwoDimensionalShape;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
