public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) {
            return false;
        }
        int leap4 = year % 4;
        int leap100 = year % 100;
        int leap400 = year % 400;

        if(leap4 == 0) {
            if (leap100 == 0) {
                if (leap400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }

        boolean leapYearValidation = isLeapYear(year);
        int days = 0;
        if (leapYearValidation && (month == 2)) {
            return 29;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
        }

        return days;
    }
}
