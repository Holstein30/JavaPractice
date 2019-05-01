public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int b = bigCount * 5;

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if(goal % 5 <= smallCount && b + smallCount >= goal) {
            return true;
        }

        return false;
    }
}
