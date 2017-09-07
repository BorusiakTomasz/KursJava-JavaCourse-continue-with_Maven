package D042_06_09.facade.workerexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miver on 2017-09-06.
 */
public class WorkerFacade {
    private List<Worker> workerList = new ArrayList<>();

    public void addWorker(Worker w) {
        workerList.add(w);
    }

    public void startWorkingDay() {
        for (Worker w : workerList) {
            System.out.print(w.getName() + " -> ");
            w.startWork();
        }
    }
}
