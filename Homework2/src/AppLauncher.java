import java.util.Random;

public class AppLauncher {
    public static void main(String[] args) {
        //runTest(5);
        runTest(4);
        //runTest(2);
        //checkNullElement();


    }

    public static void runTest(int size) {
        String [][] array = new String [size][size];
        String result;
        createArrayWithNotIntElem(array,size);
        //createArray(array,size);
        printArray(array,size);
        ArrayHandler arrayHandler = new ArrayHandler();

        result = arrayHandler.calcSumOfArrayElements(array,size);
        System.out.println(result);
    }



    /**
     * Print matrix array
     * @param array
     * @param size
     */
    private static void printArray(String[][] array,int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Create new int[][] array
     * @param array
     * @param size
     */
    public static void createArray(String[][] array, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = String.valueOf(random.nextInt(20));
            }
        }
    }

    /**
     * Create new int[][] array
     * @param array
     * @param size
     */
    public static void createRectangleArray(String [][] array, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size+5; j++) {
                array[i][j] = String.valueOf(random.nextInt(20));
            }
        }

        System.out.println(array.length);
    }

    public static void createArrayWithNotIntElem(String[][] array, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = String.valueOf(random.nextInt(20));
            }
        }
        array[0][0] = "f";
    }

}
