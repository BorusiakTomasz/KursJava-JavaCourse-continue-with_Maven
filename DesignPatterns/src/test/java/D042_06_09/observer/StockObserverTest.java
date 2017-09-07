package D042_06_09.observer;

import org.junit.Test;

/**
 * Created by Miver on 2017-09-06.
 */
public class StockObserverTest {
    @Test
    public void test() {
        Stock orlen = new Stock("Orlen", 10);

        new StockObserver(orlen);
        orlen.setPrice(20);
        orlen.setPrice(20);
        orlen.setPrice(30);
    }
}
