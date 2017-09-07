package D042_06_09.decorator;

/**
 * Created by Miver on 2017-09-06.
 */
public class SgdDollarDecorator implements Decorator {
    private Currency currency;

    public SgdDollarDecorator(Currency currency) {
        this.currency = currency;
    }

    //Wlasciwy proces dekorowania
    //Dollar zostal udekorowany o nazwe
    @Override
    public String getname() {
        return currency.getname() + ", it's a Singapore dollar.";
    }
}
