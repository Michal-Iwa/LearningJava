public class LastDigitChecker {
    public static boolean isValid (int num){
        return (num >= 10 && num <= 1000);
    }
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;
        String num1Str = Integer.toString(num1);
        String num2Str = Integer.toString(num2);
        String num3Str = Integer.toString(num3);
        if(num1Str.charAt(num1Str.length() - 1) == num2Str.charAt(num2Str.length() - 1)) return true;
        if(num1Str.charAt(num1Str.length() - 1) == num3Str.charAt(num3Str.length() - 1)) return true;
        if(num3Str.charAt(num3Str.length() - 1) == num2Str.charAt(num2Str.length() - 1)) return true;
        return false;
    }
}
