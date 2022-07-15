import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int value = 1;
        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("Value was 3,4,5");
                System.out.println("Actually value was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        switchValue = 5;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3,4,5");
                System.out.println("Actually value was " + switchValue);
            }
            default -> System.out.println("Value was not 1 or 2");
        }
        String month = "JanUaRy";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println(month);
                break;
            case "june":
                System.out.println("month");
                break;
            default:
                System.out.println("IDK");
                break;
        }
        printDayOfTheWeek(0);
    }
    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }
    }
}