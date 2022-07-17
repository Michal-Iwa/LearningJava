import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0, avg = 0;
        int number;
        boolean isNumber = true;
        for (int i = 1; isNumber; i++){
            isNumber = scanner.hasNextInt();
            if (isNumber) {
                number = scanner.nextInt();
                sum += number;
                avg = (int) Math.round((double) sum / i);
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
