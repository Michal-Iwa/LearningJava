public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        double areaCovered = areaPerBucket*extraBuckets;
        double areaToCover = width*height;
        int bucketsToBuy = 0;
        for (int i = 0; areaCovered < areaToCover; i++){
            areaCovered += areaPerBucket;
            bucketsToBuy++;
        }
        return bucketsToBuy;
    }
    public static int getBucketCount (double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ) return -1;
        double areaCovered = 0;
        double areaToCover = width*height;
        int bucketsToBuy = 0;
        for (int i = 0; areaCovered < areaToCover; i++){
            areaCovered += areaPerBucket;
            bucketsToBuy++;
        }
        return bucketsToBuy;
    }
    public static int getBucketCount (double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0 ) return -1;
        double areaCovered = 0;
        int bucketsToBuy = 0;
        for (int i = 0; areaCovered < area; i++){
            areaCovered += areaPerBucket;
            bucketsToBuy++;
        }
        return bucketsToBuy;
    }
}
