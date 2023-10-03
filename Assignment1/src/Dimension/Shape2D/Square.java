package Dimension.Shape2D;

import Dimension.TwoDimensionalShape;

public class Square extends TwoDimensionalShape {
    private double side;

    public double getN() {
        return side;
    }
    public void setN(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return side*side;
    }
}
