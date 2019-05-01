public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }

        int gcd = 0;

        for(int i = 1; i <= number; i++){
            if(number % i == 0 && i != number){
                gcd = i;
            }
        }

        if(gcd > 1){
            return gcd;
        }

        return -1;
    }
}
