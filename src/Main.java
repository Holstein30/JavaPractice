import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        Floor floor = new Floor(2, 3);

        double result = floor.getArea();
        System.out.println(result);
        
    }
}
