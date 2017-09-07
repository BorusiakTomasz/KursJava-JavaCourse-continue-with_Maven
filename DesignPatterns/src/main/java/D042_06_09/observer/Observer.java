package D042_06_09.observer;

/**
 * Created by Miver on 2017-09-06.
 */
public abstract class Observer<T> {
    private T observedObject;

    protected Observer(T observedObject) {
        this.observedObject = observedObject;
    }

    protected abstract void onChange(T sender, PriceChangeEventArgs e);
}
