public class DecimalComparator {
    public static void main(String [] args){
        areEqualByThreeDecimalPlaces(-3.175,-3.1756);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if (num1 * num2 < 0) return false;
        if (num1 < 0 && num2 < 0) return (Math.ceil(num1*1000) == Math.ceil(num2*1000));
        if (num1 > 0 && num2 > 0) return (Math.floor(num1*1000) == Math.floor(num2*1000));
        if (num1 == num2) //if they are both 0
            return true;
        return false;
    }
    public static boolean hasEqualSum(int param1, int param2, int expectedSum){
        return (param1 + param2 == expectedSum);
    }
    public static boolean isTeen(int age){
        return (age >= 13 && age <= 19);
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }
}
