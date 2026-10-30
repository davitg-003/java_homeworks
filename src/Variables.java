
public class Variables {

    /**
     * Creates and prints two byte variables.
     */
    public static void printByteVariables() {
        byte a = 10;
        byte b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * Creates and prints two short variables.
     */
    public static void printShortVariables() {
        short c = 1000;
        short d = 2000;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    /**
     * Creates and prints two int variables.
     */
    public static void printIntVariables() {
        int e = 100000;
        int f = 200000;

        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }

    /**
     * Creates and prints two long variables.
     */
    public static void printLongVariables() {
        long g = 10000000000L;
        long h = 20000000000L;

        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }

    /**
     * Prints the minimum and maximum values of byte, short, int and long.
     */
    public static void printIntegerMinMax() {
        System.out.println("byte MIN = " + Byte.MIN_VALUE);
        System.out.println("byte MAX = " + Byte.MAX_VALUE);

        System.out.println("short MIN = " + Short.MIN_VALUE);
        System.out.println("short MAX = " + Short.MAX_VALUE);

        System.out.println("int MIN = " + Integer.MIN_VALUE);
        System.out.println("int MAX = " + Integer.MAX_VALUE);

        System.out.println("long MIN = " + Long.MIN_VALUE);
        System.out.println("long MAX = " + Long.MAX_VALUE);
    }

    /**
     * Creates and prints byte and int variables using binary literals.
     */
    public static void printBinaryVariables() {
        byte a = 0b00001010;
        int b = 0b00000000000000000000000000001010;

        System.out.println("byte a = " + a);
        System.out.println("int b = " + b);
    }

    /**
     * Creates and prints two float variables.
     */
    public static void printFloatVariables() {
        float j = 12.5f;
        float k = 34.75f;

        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

    /**
     * Creates and prints two double variables.
     */
    public static void printDoubleVariables() {
        double l = 123.456;
        double m = 789.123;

        System.out.println("l = " + l);
        System.out.println("m = " + m);
    }

    /**
     * Prints the minimum and maximum values of float and double.
     */
    public static void printFloatingMinMax() {
        System.out.println("float MIN = " + Float.MIN_VALUE);
        System.out.println("float MAX = " + Float.MAX_VALUE);

        System.out.println("double MIN = " + Double.MIN_VALUE);
        System.out.println("double MAX = " + Double.MAX_VALUE);
    }

    /**
     * Prints the given decimal values as float and double.
     * Demonstrates the precision difference between the two types.
     */
    public static void printFloatAndDoubleValues() {
        float a = 34.567839023f;
        double b = 34.567839023;

        float c = 12.345f;
        double d = 12.345;

        float e = 8923.1234857f;
        double f = 8923.1234857;

        float g = 3456.091f;
        double h = 3456.091;

        System.out.println("Float: " + a);
        System.out.println("Double: " + b);

        System.out.println("Float: " + c);
        System.out.println("Double: " + d);

        System.out.println("Float: " + e);
        System.out.println("Double: " + f);

        System.out.println("Float: " + g);
        System.out.println("Double: " + h);
    }

    /**
     * Creates and prints two char variables.
     */
    public static void printCharVariables() {
        char n = 'A';
        char o = 'B';

        System.out.println("n = " + n);
        System.out.println("o = " + o);
    }

    /**
     * Prints characters represented by Unicode decimal values 77 and 109.
     */
    public static void printUnicodeCharacters() {
        char s = 77;
        char w = 109;

        System.out.println("s = " + s);
        System.out.println("w = " + w);
    }

    /**
     * Prints the character K using different representations.
     */
    public static void printKCharacters() {
        System.out.println('K');
        System.out.println((char) 75);
        System.out.println('\u004B');
        System.out.println((char) 0x004B);
        System.out.println('\113');
    }

    /**
     * Creates and prints two boolean variables.
     */
    public static void printBooleanVariables() {
        boolean p = true;
        boolean q = false;

        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }

    /**
     * Demonstrates the difference between int and long literals.
     */
    public static void printYear() {
        long year = 201L;

        System.out.println(year);
    }

    /**
     * Demonstrates widening casting from int to long.
     */
    public static void wideningIntToLong() {
        int aa = 7;
        long bb = aa;

        System.out.println("bb = " + bb);
    }

    /**
     * Demonstrates widening casting from int to double.
     */
    public static void wideningIntToDouble() {
        int myInt = 7;
        double myDouble = myInt;

        System.out.println("myDouble = " + myDouble);
    }

    /**
     * Demonstrates narrowing casting from double to int.
     */
    public static void narrowingDoubleToInt() {
        double dd = 9.78d;
        int ii = (int) dd;

        System.out.println("ii = " + ii);
    }

    /**
     * Demonstrates narrowing casting from int to byte.
     */
    public static void narrowingIntToByte() {
        int ff = 9999;
        byte gg = (byte) ff;

        System.out.println("gg = " + gg);
    }

    /**
     * Demonstrates corrected Java statements with type and initialization errors.
     */
    public static void correctErrors() {
        long max = 3123456789L;

        double d = 1000.00;

        char i = 'i';
        char j = 'j';
        char ij = (char) (i + j);

        int a = 8;

        long h = 0;
        h = h + 8;

        int n = 5;
        int m = 11;
        m = n;

        System.out.println("max = " + max);
        System.out.println("d = " + d);
        System.out.println("ij = " + ij);
        System.out.println("a = " + a);
        System.out.println("h = " + h);
        System.out.println("m = " + m);
    }

    public static void main(String[] args) {
        printByteVariables();
        printShortVariables();
        printIntVariables();
        printLongVariables();
        printIntegerMinMax();
        printBinaryVariables();

        printFloatVariables();
        printDoubleVariables();
        printFloatingMinMax();
        printFloatAndDoubleValues();

        printCharVariables();
        printUnicodeCharacters();
        printKCharacters();

        printBooleanVariables();
        printYear();

        wideningIntToLong();
        wideningIntToDouble();

        narrowingDoubleToInt();
        narrowingIntToByte();

        correctErrors();
    }
}
