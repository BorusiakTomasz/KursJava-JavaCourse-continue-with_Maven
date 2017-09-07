package D042_06_09.observer;

/**
 * Created by Miver on 2017-09-06.
 */
public class StockObserver extends Observer<Stock> {
    public StockObserver(Stock stock) {
        this.observedObject = stock;
        stock.attachObserver(this);
    }

    @Override
    public void onChange(Object sender, PriceChangeEventArgs e) {
        System.out.println("Cena sie zmieniala: " + e.getOldPrice() + ", nowa cena: " + e.getNewPrice());
    }
}
