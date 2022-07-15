public class SumOddRange {
    public static boolean isOdd (int number) {
        if (number<=0) return false;
        return (number%2 == 1);
    }
    public static int sumOdd (int start, int end) {
        if (start <= 0 || end <= 0 || end < start) return -1;
        int sum=0,amount = 1;
        while (start<=end){
            if(isOdd(start) && sum == 0) {
                amount++;
            }
            if(amount == 2){
                sum += start;
            }
            start+=amount;
        }
        return sum;
    }
}
