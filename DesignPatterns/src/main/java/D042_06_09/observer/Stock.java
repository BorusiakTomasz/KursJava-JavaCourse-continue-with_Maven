package D042_06_09.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miver on 2017-09-06.
 * chcemy obserwowaczmiane ceny
 * chcemy byc powiadamiani o kazdej zmianie ceny
 */
public class Stock {
    //Lista wszystkich obserwatorow
    private List<Observer<Stock>> observers = new ArrayList<>();
    private String name;
    private double price;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void attachObserver(Observer<Stock> observer) {
        observers.add(observer);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price == this.price) {
            return;
        }

        double oldPrice = this.price;
        this.price = price;
        //powiadomic wszystkich obserwatorow

        PriceChangeEventArgs eventArgs = new PriceChangeEventArgs(oldPrice, price);
        for (Observer o : observers) {
            o.onChange(this, eventArgs);
        }
    }
}
