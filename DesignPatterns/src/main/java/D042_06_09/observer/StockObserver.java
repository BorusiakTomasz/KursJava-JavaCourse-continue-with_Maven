package D042_06_09.observer;

/**
 * Created by Miver on 2017-09-06.
 */
public class StockObserver extends Observer<Stock> {
    protected StockObserver(Stock stock) {
        super(stock);
        stock.attachObserver(this);
    }

    @Override
    protected void onChange(Stock sender, PriceChangeEventArgs e) {
        System.out.println("Cena sie zmieniala: " + e.getOldPrice() + ", nowa cena: " + e.getNewPrice());
    }
}
