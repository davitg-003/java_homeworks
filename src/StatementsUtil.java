
public class StatementsUtil {

    /**
     * Checks whether the given number is even or not.
     *
     * @param x the integer number to check
     * @return "even" if the number is even, otherwise "not even"
     */
    public static String isEven(int x) {
        return x % 2 == 0 ? "even" : "not even";
    }

    /**
     * Checks whether the given number is positive or negative.
     *
     * @param x the integer number to check
     * @return "positive" if x is greater than 0, otherwise "negative"
     */
    public static String isPositive(int x) {
        return x > 0 ? "positive" : "negative";
    }

    /**
     * Checks whether the given number belongs to one of two ranges.
     *
     * @param x the integer number to check
     * @return "[5,8]" if x is between 5 and 8,
     *         "[15,20]" if x is between 15 and 20,
     *         "out of range" otherwise
     */
    public static String checkRange(int x) {
        if (x > 5 && x < 8) {
            return "[5,8]";
        } else if (x > 15 && x < 20) {
            return "[15,20]";
        } else {
            return "out of range";
        }
    }

    /**
     * Checks whether the given number is divisible by both 5 and 7.
     *
     * @param x the integer number to check
     * @return true if x is divisible by both 5 and 7, otherwise false
     */
    public static boolean isDivisable(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    /**
     * Checks whether the second digit of the given number is 7.
     *
     * @param x the three-digit integer number
     * @return true if the second digit is 7, otherwise false
     */
    public static boolean isSecondDigitSeven(int x) {
        return (x / 10) % 10 == 7;
    }

    /**
     * Checks whether a point is inside a circle centered at (0, 0)
     * with a radius of 5.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @return true if the point is inside the circle, otherwise false
     */
    public static boolean isInsideCircle(int x, int y) {
        return x * x + y * y < 25;
    }

    /**
     * Finds the maximum among three integer numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the largest of the three numbers
     */
    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /**
     * Checks whether the given year is a leap year.
     *
     * @param year the year to check
     * @return true if the year is a leap year, otherwise false
     */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    /**
     * Prints all integer numbers from 1 to 200.
     */
    public static void printNumbers() {
        for (int i = 1; i < 201; i++) {
            System.out.println(i);
        }
    }

    /**
     * Prints the first digit of the given integer number.
     *
     * @param x the integer number
     */
    public static void firstDigit(int x) {
        while (x > 9) {
            x = x / 10;
        }
        System.out.println(x);
    }

    /**
     * Prints the sum of x and y while x is less than 5
     * and y is less than 10.
     */
    public static void sum() {
        int y = 0;

        for (int x = 1; x < 5; x++) {
            System.out.println(x + y);
            y++;
        }
    }

    /**
     * Prints a square consisting of '*' symbols.
     *
     * @param size the number of rows and columns of the square
     */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            String row = "";
            for (int j = 0; j < size; j++) {
                row += "* ";
            }
            System.out.println(row);
        }
    }

    /**
     * Reads an integer N from the console and calculates
     * the sum of all numbers divisible by 5 in the range [1, N].
     *
     * @return the sum of all multiples of 5 from 1 to N
     */
    public static int sumOfMultiplesOfFive() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter number for sum Of Multiples Of Five ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Reads an integer N from the console and calculates
     * the product of all two-digit even numbers from 10 to N.
     *
     * @return the product of all two-digit even numbers
     */
    public static long multipleEvenNums() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter number for multiple Even Nums ");
        int n = scanner.nextInt();
        long result = 1;

        for (int i = 10; i <= n; i += 2) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates the arithmetic mean of the minimum and maximum
     * numbers in the range [1, N].
     *
     * @param n the upper limit of the range
     * @return the arithmetic mean of 1 and N
     */
    public static double arithmeticMean(double n) {
        return (1 + n) / 2;
    }

    /**
     * Calculates the sum of the last four digits of the given number.
     *
     * @param n the integer number
     * @return the sum of its last four digits
     */
    public static int digitsSum(int n) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
