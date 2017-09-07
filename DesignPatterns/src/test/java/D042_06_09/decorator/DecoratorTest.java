package D042_06_09.decorator;

import org.junit.Test;

/**
 * Created by Miver on 2017-09-06.
 */
public class DecoratorTest {
    @Test
    public void decoratorTest() {
        UsdDollarDecorator usdDollar = new UsdDollarDecorator(new Dollar());
        SgdDollarDecorator sgdDollar = new SgdDollarDecorator(new Dollar());

        System.out.println(usdDollar.getname());
        System.out.println(sgdDollar.getname());
    }
}