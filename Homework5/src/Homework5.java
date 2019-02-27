import java.util.Arrays;

/**
 * @author Anna Bondarenko
 * @version 27.02.19
 */

public class Homework5 {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;


    public static void main(String[] args) {
        withoutThreds();
        useThreds();
    }

    public static void withoutThreds() {
        float[] arr = new float[SIZE];

        Arrays.fill(arr,1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE ; i++) {
            arr[i] = (float)(arr[i] *
                    Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println("Way 1 took " + (System.currentTimeMillis() - a));
    }

    public static void useThreds() {
        float[] arr = new float[SIZE];
        float[] a1 = new float[H];
        float[] a2 = new float[H];

        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, H);
        System.arraycopy(arr, H, a2, 0, H);
        Thread one = new Thread(new CalcArray(a1, 0));
        Thread two = new Thread(new CalcArray(a2, H));
        one.start();
        two.start();
        try {
            one.join();
            two.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, H);
        System.arraycopy(a2, 0, arr, H, H);
        System.out.println("Way 2 took " + (System.currentTimeMillis() - a));
    }


}
