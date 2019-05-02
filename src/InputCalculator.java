import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int counter = 0;


        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                break;
            }
        }

        if(counter > 0){
            average = Math.round((double) sum / counter);
        }



        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}
