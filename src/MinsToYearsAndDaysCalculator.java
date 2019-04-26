public class MinsToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long minsToHours = minutes / 60;
        long hoursToDays = minsToHours / 24;
        long daysToYears = hoursToDays / 365;
        long remainingDays = hoursToDays % 365;

        System.out.println(minutes + " min = " + daysToYears + " y and " + remainingDays + " d");
    }
}
