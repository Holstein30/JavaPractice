package Inheritance;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("Radius = " + cylinder.getRadius());
        System.out.println("Height = " + cylinder.getHeight());
        System.out.println("Area = " + cylinder.getArea());
        System.out.println("Volume = " + cylinder.getVolume());

        }
    }
