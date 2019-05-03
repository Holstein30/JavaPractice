public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = width * height;
        System.out.println(area);

        double bucketsNeeded = Math.ceil(area / areaPerBucket);
        System.out.println(bucketsNeeded);

        int remainingBuckets = (int) bucketsNeeded - extraBuckets;
        System.out.println(remainingBuckets);

        return 0;
    }
}
