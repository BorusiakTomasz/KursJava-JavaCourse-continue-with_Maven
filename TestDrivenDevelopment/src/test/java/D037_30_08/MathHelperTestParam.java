package D037_30_08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Miver on 2017-09-03.
 */
@RunWith(Parameterized.class)
public class MathHelperTestParam {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = {{0,1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};
        return Arrays.asList(data);
    }

    @Parameterized.Parameter
    public int input;

    @Parameterized.Parameter(1)
    public int expected;

    @Test
    public void factorial() throws Exception {
        assertEquals(expected, MathHelper.Factorial(input));
    }
}
