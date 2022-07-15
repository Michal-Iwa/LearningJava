public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number){
        if (number<0) return -1;
        String numStr = Integer.toString(number);
        int firstDigit = Integer.parseInt(String.valueOf(numStr.charAt(0)));
        int lastDigit = Integer.parseInt(String.valueOf(numStr.charAt(numStr.length()-1)));
        return firstDigit + lastDigit;
    }
}
