public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        if (number < 10 && number > -10) return true;
        if (number<0) number *= -1;
        String numberString = Integer.toString(number);
        for(int i = 0, j=numberString.length()-1; i<j;i++,j--)
            if(numberString.charAt(i) != numberString.charAt(j)) return false;
        return true;
    }
}
