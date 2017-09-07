package D042_06_09.observer;

/**
 * Created by Miver on 2017-09-07.
 */
public class AdvanceStockObserver extends Observer<Stock> {
    protected AdvanceStockObserver(Stock stock) {
        super(stock);
        stock.attachObserver(this);
    }

    @Override
    protected void onChange(Stock sender, PriceChangeEventArgs e) {
        System.out.print("Cena sie zmieniala: " + e.getOldPrice() + ", nowa cena: " + e.getNewPrice());
        if (e.getOldPrice() < e.getNewPrice())
            System.out.println(" ->> " + e.getNewPrice()/e.getOldPrice()*100 + "%");
            //System.out.println("Cena wzrosla o: " + e.getNewPrice()/e.getOldPrice()*100 + "%");
            //System.out.println("Cena zmieniala sie o: " + e.getNewPrice()/e.getOldPrice()*100 + "%");
        else
            System.out.println(" ->> -" + e.getOldPrice()/e.getNewPrice()*100 + "%");
            //System.out.println("Cena zmalala o: " + e.getNewPrice()/e.getOldPrice()*100 + "%");
            //System.out.println("Cena zmieniala sie o: -" + e.getOldPrice()/e.getNewPrice()*100 + "%");
    }
}
