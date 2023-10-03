package Dimension.Shape3D;

import Dimension.ThreeDimensionalShape;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getVolume() {
        return (4*Math.PI*Math.pow(radius,3))/3;
    }
}
