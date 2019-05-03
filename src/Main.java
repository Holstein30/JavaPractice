import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        int result = PaintJob.getBucketCount(-3.4,2.1,1.5,2);
        System.out.println(result);
        result = PaintJob.getBucketCount(3.4,2.1,1.5,2);
        System.out.println(result);
        result = PaintJob.getBucketCount(2.75,3.25,2.5,1);
        System.out.println(result);
    }
}
