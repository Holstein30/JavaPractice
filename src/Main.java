import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        int result = PaintJob.getBucketCount(-3.4,2.1,1.5,2);
        System.out.println("Result: " + result);
        result = PaintJob.getBucketCount(3.4,2.1,1.5,2);
        System.out.println("Result: " + result);
        result = PaintJob.getBucketCount(2.75,3.25,2.5,1);
        System.out.println("Result: " + result);
        result = PaintJob.getBucketCount(-3.4,2.1,1.5);
        System.out.println("Result: " + result);
        result = PaintJob.getBucketCount(3.4,2.1,1.5);
        System.out.println("Result: " + result);
        result = PaintJob.getBucketCount(7.25,4.3,2.35);
        System.out.println("Result: " + result);
    }
}
