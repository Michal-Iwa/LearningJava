public class NumberToWords {
    public static void main(String []args){
        int reversed = reverse(101);
        System.out.println(reversed);
        numberToWords(101);
    }
    public static int getDigitCount (int num){
        if(num<0) return -1;
        for (int i = 1; true; i++){
            if(Math.pow(10,i) > num ) return i;
        }
    }
    public static int reverse (int num){
        int reversed = 0;
        boolean positive = true;
        if(num<0) {
            num = -num;
            positive = false;
        }
        int digitCount = getDigitCount(num);
        int x = 0;
        for (int i=1; i<=digitCount; i++){
           reversed += Math.pow(10,digitCount-i-x)*(num%(Math.pow(10,i)));
           num = (int) (num - (num%(Math.pow(10,i))));
           x++;
        }
        if (positive) return reversed;
        return -reversed;
    }
    public static void numberToWords (int num){
        if (num<0) System.out.println("Invalid Value");
        int digitCount = getDigitCount(num);
        StringBuilder wordNumber = new StringBuilder();
        num = reverse(num);
        int digit = 0;
        for (int i=1; i<=digitCount; i++){
            digit = (int) (num%10);
            num -= digit;
            num /= 10;
            switch(digit){
                case 0:
                    wordNumber.append("Zero");
                    break;
                case 1:
                    wordNumber.append("One");
                    break;
                case 2:
                    wordNumber.append("Two");
                    break;
                case 3:
                    wordNumber.append("Three");
                    break;
                case 4:
                    wordNumber.append("Four");
                    break;
                case 5:
                    wordNumber.append("Five");
                    break;
                case 6:
                    wordNumber.append("Six");
                    break;
                case 7:
                    wordNumber.append("Seven");
                    break;
                case 8:
                    wordNumber.append("Eight");
                    break;
                case 9:
                    wordNumber.append("Nine");
                    break;
            }
            wordNumber.append(" ");
        }
        System.out.println(wordNumber);
    }

}
