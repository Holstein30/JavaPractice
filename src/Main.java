import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5);
        calculator.setSecondNumber(12);

        double first = calculator.getFirstNumber();
        double second = calculator.getSecondNumber();
        System.out.println(first);
        System.out.println(second);


    }
}
