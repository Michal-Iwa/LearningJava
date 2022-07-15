public class SharedDigit {
    public static boolean hasSharedDigit (int num1, int num2){
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;
        String num1Str = Integer.toString(num1);
        String num2Str = Integer.toString(num2);
        for (int i = 0; i< num1Str.length(); i++){
            for (int j = 0; j< num2Str.length(); j++) {
                if(num1Str.charAt(i) == num2Str.charAt(j)) return true;
            }
        }
        return false;
    }
}
