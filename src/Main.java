public class Main {

    public static void main(String[] args) {
        LastDigitChecker.hasSameLastDigit(51, 894, 777);

        boolean result = LastDigitChecker.hasSameLastDigit(41, 22, 71);
        System.out.println(result);
        result = LastDigitChecker.hasSameLastDigit(23, 32, 42);
        System.out.println(result);
        result = LastDigitChecker.hasSameLastDigit(9, 99, 999);
        System.out.println(result);
        result = LastDigitChecker.hasSameLastDigit(51, 894, 777);
        System.out.println(result);
    }
}
