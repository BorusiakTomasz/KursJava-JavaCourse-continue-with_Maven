package D037_30_08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Miver on 2017-09-03.
 */
//1. Dodac adnotacje @RunWith(Parameterized.class)
@RunWith(Parameterized.class)
public class MathHelperTest {
    //2. Napisac metode z adnotacja @Parameterized.Parameters zwracajaca Collection<Object[]>
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        //3. dane, pierwsza wartosc to wejscie (input), druga wartosc to wartosc oczekiwana (expected)
        Object[][] data = {{0,1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};
        return Arrays.asList(data);

//        List<Object[]> data1 = new ArrayList<>();
//        data1.add(new Object[] {0, 1});
//        data1.add(new Object[] {1, 1});
//        data1.add(new Object[] {2, 2});
//        data1.add(new Object[] {3, 6});
//        data1.add(new Object[] {4, 24});
//        data1.add(new Object[] {5, 120});
//        return data1;
    }

    //4. utworzyc pola dla wejscia i dla wyjscia
    private int input;
    private int expected;

    //5. utworz konstruktor przyjmujacy wartosci
    public MathHelperTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void factorial() throws Exception {
        assertEquals(expected, MathHelper.Factorial(input));
    }
}