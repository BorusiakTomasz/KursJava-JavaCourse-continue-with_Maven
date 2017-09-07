package D042_06_09.decorator;

/**
 * Created by Miver on 2017-09-06.
 */
public class UsdDollarDecorator implements Decorator{
    private Currency currency;

    public UsdDollarDecorator(Currency currency) {
        this.currency = currency;
    }

    //Wlasciwy proces dekorowania
    //Dollar zostal udekorowany o nazwe
    @Override
    public String getname() {
        return currency.getname() + ", it's a US dollar.";
    }
}
