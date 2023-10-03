package Dimension.Shape3D;

import Dimension.ThreeDimensionalShape;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side*6;
    }
    @Override
    public double getVolume(){
        return Math.pow(side,3);
    }
}
