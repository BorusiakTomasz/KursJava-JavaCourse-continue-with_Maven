package D042_06_09.facade.workerexample;

import org.junit.Test;

import javax.swing.*;

/**
 * Created by Miver on 2017-09-06.
 */
public class WorkerFacadeTest {
    @Test
    public void test() {
        InternWorker stazysta = new InternWorker();
        AssistantWorker asystent = new AssistantWorker();
        DirectorWorker kierownik = new DirectorWorker();

        WorkerFacade facade = new WorkerFacade();
        facade.addWorker(stazysta);
        facade.addWorker(asystent);
        facade.addWorker(kierownik);

//        Zamiast wywolywac rozpoczecie pracy dla kazdego pracownika z osobna,
//        stazysta.startWork();
//        asystent.startWork();
//        kierownik.startWork();

//        korzystamy z fasady, ktora uprasza rozpoczecie dnia.
        facade.startWorkingDay();
        System.out.println();

//        Fasada upraszcza tylko rozpoczecie pracy.
//        Zadania pracownikow sa rozne, wiec sa one wywolane oddzielnie.
        stazysta.createReports();
        asystent.prepareDocuments();
        String raport = kierownik.giveRaise();

//        wywolanie swinga
        JOptionPane.showMessageDialog(null, raport);
//        JOptionPane.showMessageDialog(null, raport, "ExampleTitle", JOptionPane.INFORMATION_MESSAGE);
    }
}
