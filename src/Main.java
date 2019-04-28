public class Main {

    public static void main(String[] args) {
        int result = LeapYear.getDaysInMonth(1, 2020);
        System.out.println(result);
        result = LeapYear.getDaysInMonth(2, 2020);
        System.out.println(result);
        result = LeapYear.getDaysInMonth(2, 2018);
        System.out.println(result);
        result = LeapYear.getDaysInMonth(-1,2020);
        System.out.println(result);
        result = LeapYear.getDaysInMonth(1, -2020);
        System.out.println(result);

    }
}
