import java.util.Scanner;

public class ReadingUserInput {
    public static void scannerDemo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);

        scanner.close();
    }
}
