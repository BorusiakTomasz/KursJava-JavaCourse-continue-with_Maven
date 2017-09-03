package D035_28_08;

public class Calculator {

    public int multiply(int i, int i1) {
        return i * i1;
    }

    public int Addition(int a, int b) {
        return a + b;
    }

    public int divide(int i, int j) {
        if (j == 0) {
            throw new IllegalArgumentException("Second argument cannot be 0");
        }
        return i / j;
    }


}
