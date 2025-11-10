public class TriangleLoops {

    

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        int a = 0;
        String triangle = "";
        while (a < numberOfRows) {
            a += 1;
            int i = 0;
            while (i < a) {
                i += 1;
                triangle +=  letter;
            }
            triangle += "\n";
        }
        return triangle;
    }


    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        int a = numberOfRows;
        String triangle = "";
        while (a > 0) {
            a -= 1;
            int i = 0;
            while (i <= a) {
                i += 1;
                triangle +=  letter;
            }
            triangle += "\n";
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        int a = 0;
        String triangle = "";
        while (a < numberOfRows) {
            a += 1;
            int i = 0;
            while (i < a) {
                i += 1;
                triangle += a + " ";
            }
            triangle += "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        int a = numberOfRows;
        String triangle = "";
        int b = 0;
        if (numberOfRows > 26) {
            a = 26;
        }
        while (a > 0) {
            b += 1;
            a -= 1;
            int newLetter = b - 1;
            int i = 0;
            int letternum = 0;
            while (i < a) {
                i += 1;
                triangle += " ";
            }
            
            while (letternum < b) {
                triangle += (char) ('A' + letternum);
                letternum += 1;
            }
            while (newLetter > 0) {
                triangle += (char) ('A' + newLetter - 1);
                newLetter -= 1;
            }
            triangle += "\n";
        }   
        return triangle;
    }     
}
