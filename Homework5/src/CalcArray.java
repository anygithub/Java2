/**
 * @author Anna Bondarenko
 * @version 27.02.19
 */

public class CalcArray implements Runnable {
    private float[] array;
    private int h;

    public CalcArray(float[] array, int h) {
        this.array = array;
        this.h = h;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++)
            array[i] = (float)(array[i] *
                    Math.sin(0.2f + (i + h) / 5) *
                    Math.cos(0.2f + (i + h) / 5) *
                    Math.cos(0.4f + (i + h) / 2));
    }
}
