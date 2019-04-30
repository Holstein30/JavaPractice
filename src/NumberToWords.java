public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < -1){
            System.out.println("Invalid Value");
            return;
        }

        int digitCount = getDigitCount(number);
        int numReversed = reverse(number);
        int reversedDigitCount = getDigitCount(numReversed);


        while(numReversed != 0) {
            int lastDigit = numReversed % 10;
            switch(lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            numReversed /= 10;
        }

        if(digitCount != reversedDigitCount) {
            int remaining = digitCount - reversedDigitCount;
            for(int i = 0; i < remaining; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {


        int reversed = 0;

        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if(number < 0){
            return -1;
        }

        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }

        return count;
    }
}
