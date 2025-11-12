public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a
     * comma and enclosing the output in square brackets [].
     *
     * @param array
     *              The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        String list = "[";
        if (array.length == 0) {
            return list + "]";
        } else {
            for (int i = 0; i < array.length - 1; i++) { 
                list += array[i] + ", "; 
            }
            list += array[array.length - 1] + "]";
            System.out.println(list);
            return list;  
        }
        
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and
     * enclosing the output in square brackets [].
     *
     * @param array
     *              The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {
        String list = "[";
        if (array.length == 0) {
            return list + "]";
        } else {
            for (int i = 0; i < array.length - 1; i++) { 
            list += array[array.length - 1] + "]";
            System.out.println(list);
            return list;  
        }
        }
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array
     *              The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        int greatest = array[0];
        for (int i = 0; i < array.length; i++) { 
        }
        return greatest;
    }

    /**
     * The method returns the longest String in the array.
     * If two Strings share the longest length, the method will return the one that
     * appears first in the array.
     *
     * @param array
     *              The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        int greatestLen = array[0].length();
        String longestString = array[0];
        for (int i = 0; i < array.length; i++) { 
            if (greatestLen < array[i].length()) {
                greatestLen = array[i].length();
                longestString = array[i];
            }
        }
        return longestString;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array
     *              The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        int totalLen = 0;
        for (int i = 0; i < array.length; i++) { 
            totalLen += array[i].length();
        }
        return (double) totalLen / (double) array.length;
    }

    /**
     * Counts the number of times each letter appears in the given String.
     * The method creates an array of integers length 26, where each element
     * represents the
     * frequency of a letter in the alphabet. The first element (index 0) represents
     * the frequency of the letter 'a', the second element (index 1) represents the
     * frequency of the letter 'b', and so on.
     *
     * @param input
     *              The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input
     *         string.
     */
    public static int[] countLetterFrequencies(String input) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int[] integers = new int[26];
        for (int i = 0; i < letters.length; i++) {
            for (int a = 0; a < input.length(); a++)
                if (letters[i].toLowerCase().equals("" + input.charAt(a))) {
                    integers[i] += 1;
            }
        }
        return integers;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by
     * one, and assigns a value of zero to the last element in the array.
     *
     * @param array
     *              The array of int values
     * @param index
     *              The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {
        int[] removed = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (i < index) {
                removed[i] = array[i];
            } else {
                removed[i] = array[i + 1];
            }
        }
        return removed;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array
     *              The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of
     * each
     * String in the array.
     * For example, if the array contained: {"Hello", "my", "name", "is", "Larry"},
     * then this method would return an array with the contents:
     * {"#0 Hello", "#1 my", "#2 name", "#3 is", "#4 Larry"}.
     *
     * @param array
     *              The array of Strings to modify
     * @return The modified array with the number symbol and element number added to
     *         each String
     */
    public static String[] addNumToStringArray(String[] array) {
        String [] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = "#" + Integer.toString(i) + " " + array[i];
        }
        return newArray;
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array
     *              The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        int [] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array.length - i;
        }
        return newArray;
    }

}
