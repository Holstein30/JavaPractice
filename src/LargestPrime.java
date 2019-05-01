public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }


        int gcp = 0;
        int newNum = number;

        for(int i = 2; i <= number; i++){
            if(newNum % i == 0){
                gcp = i;
                newNum /= i;
                i--;
                if(newNum == 1){
                    break;
                }
            }
        }

        if(gcp > 1){
            return gcp;
        }

        return -1;
    }
}
