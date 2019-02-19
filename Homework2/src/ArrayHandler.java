import excepthandler.MyArrayDataException;
import excepthandler.MyArraySizeException;

/**
 * @author Anna Bondarenko
 * @version 14.02.19
 */
public class ArrayHandler {

    /**
     * Calculate sum of all elements in the array
     * @param array
     * @param size
     * @return
     */
    public String calcSumOfArrayElements(String[][] array, int size) {
        int sum = 0;
        if (isArraySizeValid(array,4)) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException made) {
                        made.printStackTrace();
                        return "Element["+ i + "]" + "["+ j +"]" + " is not integer";
                    }
                }
            }
        } else {
            return "There is no ability to calculate sum of array elements.";
        }
        return Integer.toString(sum);
    }

    /**
     * Check if array has required size
     * @param array
     * @param sizeToCheck
     * @return
     */
    private boolean isArraySizeValid(String[][] array, int sizeToCheck) {
        try
        {
            int i = 0;

            if (array.length != sizeToCheck) {
                throw new MyArraySizeException();
            }

            do {
                if (array[i].length != sizeToCheck) {
                    System.out.println(array[i].length);
                    throw new MyArraySizeException();
                }
                i++;
            } while (i < sizeToCheck);
            System.out.println();
        } catch (MyArraySizeException mase) {
            System.out.println("Wrong array size. Must be 4x4");
            mase.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Convert string to integer number
     * @param string
     * @return
     */
    /*private boolean convertStringToInt(String string) throws MyArrayDataException{
        try {
            Integer.parseInt(string);
            return true;
        } catch(MyArrayDataException made) {
            made.printStackTrace();
            return false;
        }
    }*/




}
