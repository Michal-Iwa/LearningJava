public class SpeedConverter {
    public static double rateKiloToMiles = (1d/1.609d);
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour * rateKiloToMiles);
    }
    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) System.out.println("Invalid Value");
        else System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
