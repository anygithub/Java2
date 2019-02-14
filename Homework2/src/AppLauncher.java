import java.util.Random;

public class AppLauncher {
    public static void main(String[] args) {





    }

    public static void runTest(int dimention) {
        int[][] array = new int[dimention][dimention];
        createArray(array,dimention);

        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.CheckArray(array);

    }

    public static int[][] createArray(int[][] array, int dim) {
        Random random = new Random();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                array[i][j] = random.nextInt();
            }
        }
        return array;
    }


}
