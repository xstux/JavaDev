package stuart.learn2;


public class Main {
    
    public static void DisplayByte() {

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;

        System.out.println("Byte MIN: " + myMinByte + "\nByte MAX: " + myMaxByte + " (" + Byte.SIZE + ")");
    }

    public static void DisplayShort() {

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        System.out.println("Short MIN: " + myMinShort + "\nShort MAX: " + myMaxShort + " (" + Short.SIZE + ")");
    }

    public static void DisplayInt() {

        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;

        System.out.println("Int MIN: " + myMinInt + "\nInt MAX: " + myMaxInt + " (" + Integer.SIZE + ")");
    }

    public static void DisplayLong() {

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;

        System.out.println("Long MIN: " + myMinLong + "\nLong MAX: " + myMaxLong + " (" + Long.SIZE + ")");
    }


public static void main(String[] args) {

    DisplayByte();
    DisplayShort();
    DisplayInt();
    DisplayLong();

    int myMaxInt = Integer.MAX_VALUE;
    int myMinInt = Integer.MIN_VALUE;

    System.out.println("myMaxInt: " + myMaxInt + " and +1 to it (OVERFLOW!): " + (myMaxInt + 1));
    System.out.println("myMinInt: " + myMinInt + " and -1 to it (UNDERFLOW!): " + (myMinInt - 1));

}

}
