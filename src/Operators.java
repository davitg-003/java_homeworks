
public class Operators {

    /**
     * Ստեղծել 2 փոփոխական (int a = 8, int b = 6), տպել console-ում
     * թվաբանական օպերատորների արդյունքները։
     *
     * @param a առաջին թիվը
     * @param b երկրորդ թիվը
     */
    public static void printArithmeticInt(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a % b = " + (a % b));
    }

    /**
     * Ստեղծել 2 փոփոխական (double c = 6.4, double d = 0.03),
     * տպել թվաբանական օպերատորների արդյունքները։
     *
     * @param c առաջին թիվը
     * @param d երկրորդ թիվը
     */
    public static void printArithmeticDouble(double c, double d) {
        System.out.println("c + d = " + (c + d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c % d = " + (c % d));
    }

    /**
     * Տպել թվաբանական արտահայտությունների արդյունքները։
     */
    public static void printExpressions() {
        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    /**
     * Ստեղծել e, f և n1 փոփոխականները և տպել ունար օպերատորների արդյունքները։
     *
     * @param e ամբողջ թիվ
     * @param f ամբողջ թիվ
     * @param n1 տրամաբանական արժեք
     */
    public static void printUnaryOperators(int e, int f, boolean n1) {
        System.out.println("-e = " + (-e));
        System.out.println("-f = " + (-f));
        System.out.println("+e = " + (+e));
        System.out.println("-e + 92 = " + (-e + 92));
        System.out.println("!n1 = " + (!n1));
        System.out.println("!(!n1) = " + (!(!n1)));

        System.out.println("e++ = " + (e++));
        System.out.println("e after e++ = " + e);

        System.out.println("--f = " + (--f));
    }

    /**
     * Հաշվել ++ և -- օպերատորներով արտահայտության արդյունքը։
     */
    public static void printIncrementDecrement() {
        int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    /**
     * Տպել վերագրման օպերատորների և տիպերի փոխակերպման արդյունքները։
     */
    public static void printAssignmentOperators() {
        int x = (int) 1.0;
        System.out.println("x = " + x);

        short y = (short) 1921222;
        System.out.println("y = " + y);

        System.out.println("2147483647 + 1 = " + (2147483647 + 1));

        long z = (x = 3);
        System.out.println("z = " + z);

        boolean a = false;
        boolean b = (a = true);

        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * Ստեղծել երկու int փոփոխական և տպել համեմատության արդյունքները։
     *
     * @param x առաջին թիվը
     * @param y երկրորդ թիվը
     */
    public static void printRelationalOperators(int x, int y) {
        System.out.println("x < y = " + (x < y));
        System.out.println("x <= y = " + (x <= y));
        System.out.println("x >= y = " + (x >= y));
        System.out.println("x > y = " + (x > y));
    }

    /**
     * Ուղղել սխալները՝ կապված տիպերի հետ։
     */
    public static void correctErrors() {
        float y = 2.1f;
        System.out.println("float y = " + y);

        byte x = 5;
        byte z = 10;
        byte result = (byte) (x + z);
        System.out.println("byte result = " + result);

        short a = 10;
        short b = 3;
        short c = (short) (a * b);
        System.out.println("short result = " + c);

        long l = 10;
        int n = 5;
        long answer = n * l;
        System.out.println("long result = " + answer);
    }

    /**
     * Փոխել երկու փոփոխականների արժեքները՝ օգտագործելով երրորդ փոփոխական։
     *
     * @param a առաջին թիվը
     * @param b երկրորդ թիվը
     */
    public static void swapWithTemporary(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * Փոխել երկու փոփոխականների արժեքները՝ առանց երրորդ փոփոխականի։
     *
     * @param a առաջին թիվը
     * @param b երկրորդ թիվը
     */
    public static void swapWithoutTemporary(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * Հաշվել 1-ից 100 թվերի գումարը՝ առանց ցիկլ օգտագործելու։
     */
    public static void printSumOneToHundred() {
        int sum = 100 * 101 / 2;
        System.out.println("Sum = " + sum);
    }

    /**
     * Տպել bitwise և logical օպերատորների արդյունքները։
     *
     * @param a առաջին թիվը
     * @param b երկրորդ թիվը
     */
    public static void printBitwiseAndLogical(int a, int b) {
        System.out.println("a & b = " + (a & b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a | b = " + (a | b));
        System.out.println("~a = " + (~a));
        System.out.println("true || (a < 4) = " + (true || (a < 4)));
        System.out.println("(b >= 6) || (++a <= 7) = " + ((b >= 6) || (++a <= 7)));
        System.out.println("(a < b) ? a : b = " + ((a < b) ? a : b));
        System.out.println("b ^ b = " + (b ^ b));
    }

    /**
     * Տպել ձախ և աջ տեղաշարժի օպերատորների արդյունքները։
     */
    public static void printShiftOperators() {
        System.out.println("10 << 2 = " + (10 << 2));
        System.out.println("-10 << 3 = " + (-10 << 3));
        System.out.println("20 >> 2 = " + (20 >> 2));
        System.out.println("15 >> 3 = " + (15 >> 3));
    }

    /**
     * Բազմապատկել թիվը 8-ով և 16-ով՝ առանց * օպերատորի։
     *
     * @param x տրված թիվը
     */
    public static void multiplyUsingShift(int x) {
        System.out.println("x * 8 = " + (x << 3));
        System.out.println("x * 16 = " + (x << 4));
    }

    public static void main(String[] args) {
        System.out.println("1. Arithmetic int");
        printArithmeticInt(8, 6);

        System.out.println("\n2. Arithmetic double");
        printArithmeticDouble(6.4, 0.03);

        System.out.println("\n3. Arithmetic expressions");
        printExpressions();

        System.out.println("\n4. Unary operators");
        printUnaryOperators(10, -88, true);

        System.out.println("\n5. Increment and decrement");
        printIncrementDecrement();

        System.out.println("\n6. Assignment operators");
        printAssignmentOperators();

        System.out.println("\n7. Relational operators");
        printRelationalOperators(10, 20);

        System.out.println("\n8. Correct errors");
        correctErrors();

        System.out.println("\n9. Swap with temporary variable");
        swapWithTemporary(10, 5);

        System.out.println("\n10. Swap without temporary variable");
        swapWithoutTemporary(10, 5);

        System.out.println("\n11. Sum from 1 to 100");
        printSumOneToHundred();

        System.out.println("\n12. Bitwise and logical operators");
        printBitwiseAndLogical(8, 3);

        System.out.println("\n13. Shift operators");
        printShiftOperators();

        System.out.println("\n14. Multiply using shift");
        multiplyUsingShift(5);
    }
}
