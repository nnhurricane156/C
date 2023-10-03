import Dimension.*;
import Dimension.Shape2D.Circle;
import Dimension.Shape2D.Square;
import Dimension.Shape2D.Triangle;
import Dimension.Shape3D.Cube;
import Dimension.Shape3D.Sphere;
import Dimension.Shape3D.Tetrahedron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.function.Predicate;

public class Tester {
    static Scanner scanner = new Scanner(System.in);
    static List<Shape> list;

    public Tester() {
        list = new ArrayList<>();
    }

    public static void checkTriangle(Triangle triangle) {
        if (triangle.isEquilateral()) {
            System.out.println("This is equilateral triangle ! ");
        } else if (triangle.isRightTriangle()) {
            System.out.println("This is right triangle ! ");
        } else if (triangle.isIsosceles()) {
            System.out.println("This is isosceles triangle !");
        } else if (triangle.isScalene()) {
            System.out.println("This is scalene triangle !");
        }
    }

    public static void display() {
        System.out.println("\t------------MENU---------");
        System.out.println("\t1. Input shapes");
        System.out.println("\t2. Display shapes and its elements");
        System.out.println("\t Press 0 to exit");
        System.out.print("\t\tEnter choice: ");

    }

    public static void displayEx() {
        System.out.println("1. Two Dimensional Shape");
        System.out.println("2. Three Dimensional Shape");
        System.out.println("\tPress 0 to exit");
        System.out.print("\t\tEnter your choice.");
    }

    public static void display2D() {
        System.out.println("1.Circle");
        System.out.println("2.Triangle");
        System.out.println("3.Square");
        System.out.print("\t\tEnter choice: ");
    }

    public static void display3D() {
        System.out.println("1.Cube");
        System.out.println("2.Sphere");
        System.out.println("3.Tetrahedron");
        System.out.print("\t\tEnter choice: ");
    }

    public static String checkShape(Shape shape) {
        if (shape instanceof Circle) {
            return "Circle";
        } else if (shape instanceof Triangle) {
            return "Triangle";
        } else if (shape instanceof Square) {
            return "Square";
        } else if (shape instanceof Sphere) {
            return "Sphere";
        } else if (shape instanceof Cube) {
            return "Cube";
        } else return "Tetrahedron";

    }

    public static void runInput() {
        double radius;
        double side1, side2, side3;
        int choice1, choice2;
        do {
            displayEx();
            choice1 = scanner.nextInt();
            if (choice1 == 1) {
                display2D();
                choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1-> {
                        System.out.println("Enter radius: ");
                        radius = scanner.nextDouble();
                        list.add(new Circle(radius));
                    }
                    case 2-> {
                        System.out.println("Enter 3 sides of triangle");
                        side1 = scanner.nextDouble();
                        side2 = scanner.nextDouble();
                        side3 = scanner.nextDouble();
                        list.add(new Triangle(side1, side2, side3));
                    }
                    case 3-> {
                        System.out.println("Enter a side of square");
                        side1 = scanner.nextDouble();
                        list.add((new Square(side1)));
                    }
                    default -> System.out.println("Error");
                }
            } else if (choice1 == 2) {
                display3D();
                choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1 -> {
                        System.out.println("Enter a side of cube");
                        side1 = scanner.nextDouble();
                        list.add(new Cube(side1));
                        ;
                    }
                    case 2 -> {
                        System.out.println("Enter radius of sphere");
                        radius = scanner.nextDouble();
                        list.add(new Sphere(radius));
                    }
                    case 3 -> {
                        System.out.println("Enter a side of tetrahedron");
                        side1 = scanner.nextDouble();
                        list.add((new Tetrahedron(side1)));
                    }
                    default -> {
                        System.out.println("Error");
                    }
                }
            }
        }
        while (choice1 != 0);
    }

    public void run() {
        int choice;
        double radius;
        do {
            display();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    runInput();
                }
                case 2 -> {
                    if (list.isEmpty()) {
                        System.out.println("No value exist");
                        choice = 0;
                    } else {
                        for (Shape shape : list) {
                            System.out.print(shape.toString() + "   ");
                            System.out.println(checkShape(shape));
                        }
                    }
                }
                default -> {
                    System.out.println("Thank you guys !!!!!");
                }
            }
        } while (choice > 0 && choice < 3);
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.run();
    }

}
