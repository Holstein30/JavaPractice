public class GetDuration {
    public static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid";
        }



        long minsToHours = minutes / 60;
        long remainingMins = minutes % 60;
        String result = minsToHours + "h " + remainingMins + "m " + seconds + "s ";

        return result;
    }

    public static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid";
        }

        long secsToMins = seconds / 60;
        long remainingSecs = seconds % 60;

        return getDurationString(secsToMins, remainingSecs);
    }
}
