import java.util.Scanner;

public class ReadingUserInput {
    public static void scannerDemo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle enter key skipping name
        int age = ageCalc(yearOfBirth);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old");

        scanner.close();
    }

    public static int ageCalc(int yearOfBirth){
        return 2019 - yearOfBirth;
    }
}
