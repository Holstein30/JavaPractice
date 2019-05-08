import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        Floor floor = new Floor(2, 3);

        double result = floor.getArea();
        System.out.println(result);

        Floor floor2 = new Floor(-1, 3);

        result = floor2.getArea();
        System.out.println(result);

        Carpet carpet = new Carpet(5.44);
        result = carpet.getCost();
        System.out.println(result);
        Carpet carpet2 = new Carpet(-1.3);
        result = carpet2.getCost();
        System.out.println(result);

    }
}
