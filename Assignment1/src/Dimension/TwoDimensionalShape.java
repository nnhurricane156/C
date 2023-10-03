package Dimension;

public class TwoDimensionalShape extends Shape {
    public  double getArea(){
        return 0.0;
    }
    public double getVolume(){
        return 0.0;
    }
    @Override
    public String toString(){
        return "Area: " + getArea();
    }
}
