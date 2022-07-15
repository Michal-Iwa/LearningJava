public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main (String [] args){
        System.out.println(getDurationString(123,32));
        System.out.println(getDurationString(231232));
        System.out.println(getDurationString(-23,3));
    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds <0 || seconds>59) return INVALID_VALUE_MESSAGE;
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        String hoursString, secondsString, minutesString;
        if(hours<10) hoursString = "0"+ Integer.toString(hours);
        else hoursString = Integer.toString(hours);
        if(remainingMinutes<10) minutesString = "0"+ Integer.toString(remainingMinutes);
        else minutesString = Integer.toString(remainingMinutes);
        if(seconds<10) secondsString = "0"+ Integer.toString(seconds);
        else secondsString = Integer.toString(seconds);
        return hoursString + "h "+ minutesString + "m " + secondsString + "s";
    }
    public static String getDurationString(int seconds){
        if(seconds<0) return INVALID_VALUE_MESSAGE;
        return getDurationString(seconds/60,seconds%60);
    }
}
