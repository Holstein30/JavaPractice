public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if((a < 10) || (a > 1000) || (b < 10) || (b > 1000) || (c < 10) || (c > 1000)){
            return false;
        }

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        System.out.println(lastDigitA);
        System.out.println(lastDigitB);
        System.out.println(lastDigitC);
        return true;
    }
}
