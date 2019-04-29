public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        if((lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int i) {
        if ((i < 10) || (i > 1000)) {
            return false;
        }
        return true;
    }
}
