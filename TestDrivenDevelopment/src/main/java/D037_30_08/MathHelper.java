package D037_30_08;

/**
 * Created by Miver on 2017-08-30.
 */
public class MathHelper {
    //napisz silnie rekurencyjnie
    public static int Factorial(int n) {
        if (n < 2) return 1;
        return n * Factorial(n-1);
    }
}
