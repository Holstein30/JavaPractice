public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = width * height;
//        System.out.println(area);

        double totalBucketsNeeded = Math.ceil(area / areaPerBucket);
//        System.out.println(totalBucketsNeeded);

        int remainingBucketsNeeded = (int) totalBucketsNeeded - extraBuckets;
//        System.out.println(remainingBucketsNeeded);

        return remainingBucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double area = width * height;

        double totalBucketsNeeded = Math.ceil(area / areaPerBucket);

        return (int) totalBucketsNeeded;
    }
}
