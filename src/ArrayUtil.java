import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUtil {

    /**
     * Prints positive elements of the given int array.
     *
     * @param n given array
     */
    public static void printPositive(int[] n) {
        for (int value : n) {
            if (value > 0) {
                System.out.println(value);
            }
        }
    }

    /**
     * Prints elements of the given short array in reverse order.
     *
     * @param s given array
     */
    public static void printReverse(short[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }

    /**
     * Finds and prints the maximum element of the given long array.
     *
     * @param l given array
     */
    public static void printMax(long[] l) {
        if (l.length == 0) {
            return;
        }

        long max = l[0];

        for (int i = 1; i < l.length; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }

        System.out.println(max);
    }

    /**
     * Finds and prints the minimum element of the given float array.
     *
     * @param f given array
     */
    public static void printMin(float[] f) {
        if (f.length == 0) {
            return;
        }

        float min = f[0];

        for (int i = 1; i < f.length; i++) {
            if (f[i] < min) {
                min = f[i];
            }
        }

        System.out.println(min);
    }

    /**
     * Copies elements of array n into array m.
     *
     * @param n source array
     * @param m destination array
     */
    public static void copyArray(int[] n, int[] m) {
        if (n.length != m.length) {
            throw new IllegalArgumentException("Arrays must have equal lengths");
        }

        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
        }
    }

    /**
     * Adds corresponding elements of two arrays
     * and stores results in a third array.
     *
     * @param array1 first array
     * @param array2 second array
     * @return array containing sums
     */
    public static int[] sumArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays must have equal lengths");
        }

        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        return array3;
    }

    /**
     * Counts how many times k appears in the given array.
     *
     * @param array given array
     * @param k value to count
     * @return number of occurrences
     */
    public static int countK(int[] array, int k) {
        int count = 0;

        for (int value : array) {
            if (value == k) {
                count++;
            }
        }

        return count;
    }

    /**
     * Prints all unique triples of elements.
     * The order of values inside a triple does not matter.
     *
     * @param array given array
     */
    public static void printTriples(int[] array) {
        Set<String> printed = new HashSet<>();

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {

                    int[] triple = {array[i], array[j], array[k]};
                    Arrays.sort(triple);

                    String key = Arrays.toString(triple);

                    if (printed.add(key)) {
                        System.out.println(Arrays.toString(triple));
                    }
                }
            }
        }
    }

    /**
     * Sorts the given array in descending order.
     *
     * @param array given array
     */
    public static void sortDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Moves odd numbers to the end of the array.
     * Even numbers remain at the beginning.
     *
     * @param array given array
     */
    public static void moveOddsToEnd(int[] array) {
        int index = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                array[index] = value;
                index++;
            }
        }

        for (int value : array) {
            if (value % 2 != 0) {
                array[index] = value;
                index++;
            }
        }
    }

    /**
     * Removes zeros from a float array.
     *
     * @param array given array
     * @return new array without zero elements
     */
    public static float[] removeZeros(float[] array) {
        int count = 0;

        for (float value : array) {
            if (value != 0) {
                count++;
            }
        }

        float[] result = new float[count];
        int index = 0;

        for (float value : array) {
            if (value != 0) {
                result[index] = value;
                index++;
            }
        }

        return result;
    }

    /**
     * Finds the longest non-decreasing subsequence.
     *
     * @param array given array
     * @return longest non-decreasing subsequence
     */
    public static int[] longestIncreasingSubsequence(int[] array) {
        if (array.length == 0) {
            return new int[0];
        }

        int n = array.length;
        int[] dp = new int[n];
        int[] prev = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] <= array[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        int[] result = new int[maxLength];
        int index = maxLength - 1;

        while (maxIndex != -1) {
            result[index] = array[maxIndex];
            index--;
            maxIndex = prev[maxIndex];
        }

        return result;
    }

    /**
     * Converts a binary array to its decimal representation.
     *
     * @param array binary array containing 0 and 1
     * @return decimal number
     */
    public static int binaryToDecimal(int[] array) {
        int result = 0;

        for (int bit : array) {
            if (bit != 0 && bit != 1) {
                throw new IllegalArgumentException("Array must contain only 0 and 1");
            }

            result = result * 2 + bit;
        }

        return result;
    }

    /**
     * Prints elements above the main diagonal of a matrix.
     *
     * @param matrix given matrix
     */
    public static void printAboveMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    /**
     * Transposes a square matrix over its main diagonal.
     *
     * @param matrix given square matrix
     */
    public static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     * Checks whether the sum of every matrix row is even.
     *
     * @param matrix given matrix
     * @return true if all row sums are even, otherwise false
     */
    public static boolean areRowSumsEven(int[][] matrix) {
        for (int[] row : matrix) {
            int sum = 0;

            for (int value : row) {
                sum += value;
            }

            if (sum % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Task 1
        printPositive(new int[]{-3, 5, 0, 8, -1});

        // Task 2
        printReverse(new short[]{257, 752, 123});

        // Task 3
        printMax(new long[]{10, 25, 7, 100, 45});

        // Task 4
        printMin(new float[]{2.5f, 1.2f, 9.4f, -3.5f});

        // Task 5
        int[] n = {1, 2, 3, 4, 5};
        int[] m = new int[n.length];
        copyArray(n, m);
        System.out.println(Arrays.toString(m));

        // Task 6
        int[] array1 = {1, 5, 6, 4, 7};
        int[] array2 = {7, 4, 2, 3, 5};
        System.out.println(Arrays.toString(sumArrays(array1, array2)));

        // Task 7
        System.out.println(countK(new int[]{1, 5, 6, 4, 5}, 5));

        // Task 8
        printTriples(new int[]{1, 5, 6, 4});

        // Task 9
        int[] descending = {1, 5, 6, 4, 7};
        sortDescending(descending);
        System.out.println(Arrays.toString(descending));

        // Task 10
        int[] odds = {1, 5, 6, 4, 9, 7, 1};
        moveOddsToEnd(odds);
        System.out.println(Arrays.toString(odds));

        // Task 11
        float[] noZeros = {1, 0, 6, 4, 9, 0, 0};
        System.out.println(Arrays.toString(removeZeros(noZeros)));

        // Task 12
        int[] sequence = {1, 5, 6, 4, 9, 0, 4, 7, 7, 9, 1};
        System.out.println(Arrays.toString(longestIncreasingSubsequence(sequence)));

        // Task 13
        int[] binary = {1, 1, 0, 0, 1, 1};
        System.out.println(binaryToDecimal(binary));

        // Task 14
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printAboveMainDiagonal(matrix);

        // Task 15
        int[][] square = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        transposeMatrix(square);

        for (int[] row : square) {
            System.out.println(Arrays.toString(row));
        }

        // Task 16
        int[][] matrixEven = {
                {1, -1, 0, 0},
                {2, -2, 1, -1},
                {9, 7, 1, -17}
        };

        int[][] matrixOdd = {
                {1, 2, 0, 0},
                {2, -2, 1, -1},
                {9, 7, 1, -17}
        };

        System.out.println(areRowSumsEven(matrixEven) ? "YES" : "NO");
        System.out.println(areRowSumsEven(matrixOdd) ? "YES" : "NO");
    }
}