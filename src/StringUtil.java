public class StringUtil {

    /**
     * Concatenates the given values into one String.
     *
     * @param values values to concatenate
     * @return concatenated String
     */
    public static String concatenate(Object... values) {
        String result = "";

        for (Object value : values) {
            result += value;
        }

        return result;
    }

    /**
     * Prints each word of the given String on a new line.
     *
     * @param line given String
     */
    public static void printWords(String line) {
        System.out.println(line.replace(" ", "\n"));
    }

    /**
     * Reverses the given String.
     *
     * @param line given String
     * @return reversed String
     */
    public static String reverse(String line) {
        String result = "";

        for (int i = line.length() - 1; i >= 0; i--) {
            result += line.charAt(i);
        }

        return result;
    }

    /**
     * Counts how many times token appears in line.
     *
     * @param line given String
     * @param token substring to find
     * @return number of occurrences
     */
    public static int countSubString(String line, String token) {
        int count = 0;

        if (token.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= line.length() - token.length(); i++) {
            if (line.substring(i, i + token.length()).equals(token)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Converts the given String to uppercase using String.
     *
     * @param line given String
     * @return uppercase String
     */
    public static String toUpperCaseString(String line) {
        return line.toUpperCase();
    }

    /**
     * Converts the given String to uppercase using StringBuilder.
     *
     * @param line given String
     * @return uppercase String
     */
    public static String toUpperCaseBuilder(String line) {
        StringBuilder result = new StringBuilder(line);
        return result.toString().toUpperCase();
    }

    /**
     * Reads a String and fills it with '*' until its length becomes 20.
     *
     * @param line given String
     * @return String with length 20
     */
    public static String fillString(String line) {
        StringBuilder result = new StringBuilder(line);

        while (result.length() < 20) {
            result.append("*");
        }

        return result.toString();
    }

    /**
     * Removes all 'a' characters using String.
     *
     * @param line given String
     * @return String without 'a'
     */
    public static String removeAString(String line) {
        return line.replace("a", "");
    }

    /**
     * Removes all 'a' characters using StringBuilder.
     *
     * @param line given String
     * @return String without 'a'
     */
    public static String removeABuilder(String line) {
        StringBuilder result = new StringBuilder(line);

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'a') {
                result.deleteCharAt(i);
                i--;
            }
        }

        return result.toString();
    }

    /**
     * Replaces all 'a' characters with '*' using String.
     *
     * @param line given String
     * @return String with replaced characters
     */
    public static String replaceA(String line) {
        return line.replace("a", "*");
    }

    /**
     * Finds the longest word in the given String.
     *
     * @param line given String
     * @return longest word
     */
    public static String findLongestWord(String line) {
        String[] words = line.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    /**
     * Finds the first index of the given String c in line.
     *
     * @param line given String
     * @param c String to find
     * @return first index or -1
     */
    public static int findIndex(String line, String c) {
        return line.indexOf(c);
    }

    /**
     * Prints substring from index 0 to n inclusive using String.
     *
     * @param line given String
     * @param n last index
     */
    public static void printSubLine(String line, int n) {
        System.out.println(line.substring(0, n + 1));
    }

    /**
     * Prints substring from index 0 to n inclusive using StringBuilder.
     *
     * @param line given StringBuilder
     * @param n last index
     */
    public static void printSubLine(StringBuilder line, int n) {
        System.out.println(line.substring(0, n + 1));
    }

    /**
     * Checks whether the given String is not null and not empty.
     *
     * @param line given String
     * @return true if line is not null and not empty
     */
    public static boolean isNotEmpty(String line) {
        return line != null && !line.isEmpty();
    }

    /**
     * Splits the given sentence by commas and finds the longest part.
     *
     * @param line given sentence
     * @return longest part
     */
    public static String findLongestCommaPart(String line) {
        String[] parts = line.split(",");
        String longest = "";

        for (String part : parts) {
            part = part.trim();

            if (part.length() > longest.length()) {
                longest = part;
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        // Task 1
        System.out.println(concatenate("hello", "world"));
        System.out.println(concatenate(1, 2, "hello"));
        System.out.println(concatenate("1", 2, "hello"));
        System.out.println(concatenate("hello", 1, 2, "world"));

        // Task 2
        printWords("We are living in");

        // Task 3
        System.out.println(reverse("sample"));

        // Task 4
        System.out.println(countSubString(
                "We are living in an yellow submarine. We don't have anything",
                "in"
        ));

        // Task 5
        System.out.println(toUpperCaseString("hello world"));
        System.out.println(toUpperCaseBuilder("hello world"));

        // Task 6
        System.out.println(fillString("Armenia"));

        // Task 7
        String text = "We are living in an yellow submarine. We don't have anything";
        System.out.println(removeAString(text));
        System.out.println(removeABuilder(text));

        // Task 8
        System.out.println(replaceA(text));

        // Task 9
        System.out.println(findLongestWord(text));

        // Task 10
        System.out.println(findIndex(text, "a"));

        // Task 11
        printSubLine(text, 10);
        printSubLine(new StringBuilder(text), 10);

        // Task 12
        System.out.println(isNotEmpty("hello"));
        System.out.println(isNotEmpty(""));
        System.out.println(isNotEmpty(null));

        // Task 13
        System.out.println(findLongestCommaPart(
                "We, are, living, in an, yellow, submarine, We don't, have anything"
        ));
    }
}