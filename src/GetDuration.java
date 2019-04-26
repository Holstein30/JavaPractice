public class GetDuration {
    public static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid";
        }


        long mins = minutes;
        mins += seconds / 60;
        long minsToHours = mins / 60;
        long remainingMins = mins % 60;
        long remainingSecs = seconds % 60;
        String result = minsToHours + "h " + remainingMins + "m " + remainingSecs + "s ";

        return result;
    }
}
