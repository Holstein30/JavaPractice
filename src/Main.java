import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        Wall wall = new Wall(5, 4);

        System.out.println("Area = " + wall.getArea());
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());

        wall.setHeight(-1.5);

        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());

    }
}
