public class GetDuration {
    public static long getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid");
            return -1;
        }
        System.out.println("valid");
        return 0;
    }
}
