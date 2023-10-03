package Dimension.Shape3D;

import Dimension.ThreeDimensionalShape;

public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return (Math.pow(side,3)*Math.sqrt(2))/12;
    }

    @Override
    public double getArea() {
        return 4*Math.pow(side,2)*Math.sqrt(3);
    }
}
