package D042_06_09.observer;

/**
 * Created by Miver on 2017-09-06.
 */
public abstract class Observer<T> {
    protected T observedObject;

    public abstract void onChange(Object sender, PriceChangeEventArgs e);
}
