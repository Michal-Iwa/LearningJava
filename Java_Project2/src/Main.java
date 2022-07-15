public class Main {
    public static void main(String[] args) {
        //Primitive data types
        /*
        boolean myBoolean = true; // 1 bit true or false
        byte myByte = 127; //8 bits <-128,127>
        char myChar = 'D'; // 16 bits Unicode character
        char myUnicodeChar = '\u0044'
        short myShort = 32767; // 16 bits
        int myInt = 2_147_483_647; // 32 bits default
        long myLong = 2_147_483_648L; //64 bits
        float myFloat = 912.3f; //32 bits floating-point type
        double myDouble = 422323.2d; // 64 bits default
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+ myMinValue);
        System.out.println("Integer Maximum Value = " + myMaxValue);
        System.out.println("Busted Max Value = " + (myMaxValue + 1)); //overflow
        System.out.println("Busted Min Value = " + (myMinValue - 1)); //underflow
        byte myByteMax = Byte.MAX_VALUE;
        short myShortMax = Short.MAX_VALUE;
        long myLongMax = Long.MAX_VALUE;
        int myTotal = (myMinValue / 2);
        byte myNewByteValue = (byte) (myByte/2);
        short myNewShortValue = (short) (myShort/2);

        int num = 1_122_922_929;
        byte numByte = -121;
        short numShort = 12_323;
        long result = 50000L + 10L * (num + numByte + numShort);
        System.out.println(result);
        */
        double pounds = 200d;
        double kilograms = pounds * 0.45359237;
        System.out.println(kilograms);
    }
}