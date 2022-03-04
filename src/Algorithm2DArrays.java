import java.util.ArrayList;
public class Algorithm2DArrays {
    /**
     * Return true if target is found in the 2D array arr, false otherwise.
     * For example, if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
     * and target is 5, this method returns true. If target is 15, returns false
     *
     * @param arr    2D array of ints
     * @param target target value to be searched for in arr
     * @return true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target)
    {
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                if (arr[row][col] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    /** Return the number of elements in arr that contain searchStr as a substring
     *  For example, if arr is:
     *                  {{"hi", "bye", "howl", "goo"},
     *                   {"time", "owl", "you", "good"},
     *                   {"map", "low", "bow", "mom"}};
     *  and searchStr is "ow", this method returns 4, because 4 strings in arr
     *  contain "ow" as a substring.
     *
     *  @param arr  2D array of Strings
     *  @param searchStr value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr)
    {
        int num = 0;
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                if (arr[row][col].indexOf(searchStr) > -1)
                {
                    num++;
                }
            }
        }
        return num;
    }

    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *  It also returns the number of changes that were made.
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     *  @return  the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr)
    {
        int changes = 0;
        for(int col = 0; col < arr[0].length; col++)
        {
            for(int row = 0; row < arr.length; row++)
            {
                if(arr[row][col] % 2 == 0)
                {
                    arr[row][col] = 0;
                    changes ++;
                }
            }
        }
        return changes;
    }

    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;
        for(int col = 0; col < arr[0].length; col ++)
        {
            sum += arr[row][col];
        }
        return sum;
    }

    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     */
    public static int sumForColumn(int[][] arr, int col)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i][col];
        }
        return sum;
    }

    /** Creates a 2D array of ints of size n x m, where n is number of rows and
     *  m is number of columns; the elements in the 2D array should be numbered 0
     *  through n x m - 1, with the numbers filled top to bottom, left to right.
     *  The method prints the 2D array "grid" of numbers, and also returns
     *  the 2D array.
     *
     *  For example, for rows = 3 and cols = 4, this method should print
     *  (and return):
     *  0 1 2 3
     *  4 5 6 7
     *  8 9 10 11
     *
     *  Print each element with a single space in between.
     *
     *  @param rows  number of rows
     *  @param cols  number of columns
     *  @return  the same 2D array "number grid" that gets printed by the method
     */
    public static int[][] printNumberGrid(int rows, int cols)
    {
        int[][] array = new int[rows][cols];
        int num = 0;
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                array[row][col] = num;
                num++;
            }
        }
        for (int[] row : array)
        {
            for (int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        return array;
    }

    public static String[][] gridOfXandO(int n)
    {
        String[][] gridXandO = new String[n][n];
        for(int row = 0; row < n; row++)
        {
            for(int column = 0; column < n; column++)
            {
                if((row + column) % 2 == 0)
                {
                    gridXandO[row][column] = "X";
                }
                else
                {
                    gridXandO[row][column] = "O";
                }
            }
        }
        return gridXandO;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len)
    {
        ArrayList<String> list = new ArrayList<String>();

        for(String[] row: wordChart)
        {
            for(String string: row)
            {
                if(string.length() == len)
                {
                    list.add(string);
                }
            }
        }
        return list;
    }





}