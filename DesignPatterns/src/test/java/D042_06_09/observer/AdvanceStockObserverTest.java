package D042_06_09.observer;

import org.junit.Test;

/**
 * Created by Miver on 2017-09-07.
 */
public class AdvanceStockObserverTest {
    @Test
    public void test() {
        Stock orlen = new Stock("Orlen", 10);

        new AdvanceStockObserver(orlen);
        orlen.setPrice(40);
        orlen.setPrice(20);
        orlen.setPrice(60);
    }
}
