public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0 ) {
            return -1;
        }

        int sum = 0;
        int temp = number;

        while(temp != 0) {
            int digit = temp % 10;
            if((digit % 2) == 0){
                sum += digit;
            }
            temp /= 10;
        }

        return sum;
    }
}
