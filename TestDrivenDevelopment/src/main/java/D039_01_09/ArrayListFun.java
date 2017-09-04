package D039_01_09;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by Miver on 2017-09-01.
 */
@Slf4j
public class ArrayListFun {
    private List<Integer> lista;

    public ArrayListFun() {
        this.lista = new ArrayList<>();
    }

    public void randTenNumbers() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int liczba = rand.nextInt(11);
            lista.add(liczba);
        }
    }

    public void viewList() {
        for(int i = 0; i < lista.size(); i++)
            log.info(lista.get(i).toString());
    }

    public boolean czyZawiera(Integer liczba) {
        if (lista.contains(liczba)) {
            log.info("zawiera");
            return true;
        }
        return false;
    }

    public boolean remove(Integer index) {
        if (lista.indexOf(index) < 0) {
            log.info("Integer not found");
            return false;
        }

        lista.remove(index);
        log.info("Integer was remove");
        return true;
    }

    public void viewAll() {
        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()){
            log.info(iterator.next().toString());
        }
    }
}
