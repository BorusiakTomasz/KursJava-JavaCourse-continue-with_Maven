package D042_06_09.facade.workerexample;

/**
 * Created by Miver on 2017-09-06.
 */
public class DirectorWorker extends AbstractWorker{
    public String giveRaise() {
        System.out.println("Raise all salaries ...");
        return "Dyrektor ciezko pracuje.";
    }
}
