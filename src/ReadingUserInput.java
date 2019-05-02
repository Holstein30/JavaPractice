import java.util.Scanner;

public class ReadingUserInput {
    public static void scannerDemo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Year of birth: ");
        int age = 0;
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            age = ageCalc(yearOfBirth);
        } else {
            System.out.println("Invalid number");
            return;
        }

        scanner.nextLine(); // handle enter key skipping name


        if(age == -1){
            System.out.println("Invalid Date of Birth");
            return;
        }
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old");

        scanner.close();
    }

    public static int ageCalc(int yearOfBirth){
        if (yearOfBirth < 0){
            return -1;
        }
        return 2019 - yearOfBirth;
    }
}
