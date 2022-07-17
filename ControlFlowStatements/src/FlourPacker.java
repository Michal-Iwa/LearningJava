public class FlourPacker {
    //bigCount represents the count of big flour bags (5kg)
    //smallCount represents the count of small flour bags (1kg)
    //goal represents the needed amount to assemble package
    public static final int bigSize = 5, smallSize = 1;
    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int sum = 0;
        for (int i = 0; i<bigCount && sum <= goal - bigSize; i++){
            sum += bigSize;
        }
        for (int i = 0; i<smallCount && sum < goal; i++){
            sum += smallSize;
        }
        if (goal == sum) return true;
        return false;
    }
}
