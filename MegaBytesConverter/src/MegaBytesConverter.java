public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0) System.out.println("Invalid Value");
        else {
            int leftoverKiloBytes = kiloBytes % 1024;
            int megaBytes = (kiloBytes - leftoverKiloBytes) / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB + and " + leftoverKiloBytes + " KB");
        }
    }
}
