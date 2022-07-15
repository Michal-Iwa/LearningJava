public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        String numStr = Integer.toString(number);
        int sum = 0;
        int digit = 0;
        for (int i = 0; i < numStr.length(); i++) {
            digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            if (digit % 2 == 0) sum += digit;
        }
        return sum;
    }
}
