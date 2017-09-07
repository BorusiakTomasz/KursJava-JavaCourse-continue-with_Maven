package D042_06_09.facade.workerexample;

/**
 * Created by Miver on 2017-09-06.
 */
public class AbstractWorker implements Worker {

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void startWork() {
        System.out.println("Rozpoczynam prace");
    }
}
