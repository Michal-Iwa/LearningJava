public class LargestPrime {
    public static int getLargestPrime (int number){
        if(number <= 1) return -1;
        boolean prime = true;
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                prime = false;
            }
        }
        if (prime) return number;
        for (int i = number / 2; i >= 2 ; i--) {
            if (number % i == 0)
                prime = true;
                for(int j = 2; j <= i / 2; j++) {
                    if(i % j == 0) {
                        prime = false;
                    }
                }
            if (prime) return i;
        }
        return -1;
    }

}
