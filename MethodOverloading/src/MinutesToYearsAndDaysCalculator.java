public class MinutesToYearsAndDaysCalculator {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final long MINUTES_IN_A_YEAR = 365*24*60;
    private static final long MINUTES_IN_A_DAY = 24*60;

    public static void printYearsAndDays(long minutes){
        if ( minutes < 0 ) System.out.println(INVALID_VALUE_MESSAGE);
        else {
            long years = minutes / MINUTES_IN_A_YEAR;
            long days = (minutes - years * MINUTES_IN_A_YEAR) / MINUTES_IN_A_DAY;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
    public static String addZeroAtBeginning(String myString){
        if (myString.length() == 1) myString = "0" + myString;
        return myString;
    }
}
