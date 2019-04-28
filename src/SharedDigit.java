public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if((a < 10) || (a > 99) || (b < 10) || (b > 99)){
            return false;
        }

        int tempA = a;
        int tempB = b;
        int tempAdigit = 0;
        int tempBdigit = 0;

        while(true) {
            if(((tempA % 10) == (tempB % 10)) || ((tempA % 10) == tempBdigit) || ((tempB % 10) == tempAdigit)) {
                return true;
            } else {
                tempAdigit = tempA % 10;
                tempBdigit = tempB % 10;
                tempA /= 10;
                tempB /= 10;
            }
            if ((tempA == 0) || (tempB == 0)) {
                break;
            }
        }
        return false;
    }
}
