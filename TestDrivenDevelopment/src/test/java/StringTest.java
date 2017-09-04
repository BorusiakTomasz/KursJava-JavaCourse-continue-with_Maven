import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Miver on 2017-09-03.
 */
public class StringTest {
    @Test
    public void test() {
        String napis = "ala";

        //metoda z Junit'a
        assertEquals("ala", napis);

        //metoda z assertJ
        assertThat(napis).isEqualTo("ala");
    }

    @Test
    public void dateTest() {
        Date date = new Date();
        date.getTime();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 10, 9);
        Date result = calendar.getTime();

        Calendar instance = Calendar.getInstance();
        instance.set(1980, 12, 10);
        Date birtDay = instance.getTime();

        assertThat(birtDay).isBefore(result);
    }

    //Test dla listy - sprawdzamy czy lista nie jest nullem i czy nie jest pusta
    @Test
    public void listTest() {
        List<Object> objects = new ArrayList<>();
        objects.add(new Object());

        //Junit
        assertNotNull(objects);
        assertFalse(objects.isEmpty());

        //assertJ
        assertThat(objects).isNotNull();
    }

    //Test sprawdzajacy czy mamy klucz w mapie
    @Test
    public void mapTest() {
        Map<String, String> stringMap = new HashMap<String, String>();
        stringMap.put("1020", "PKO BP");
        stringMap.put("1040", "Nordea");

        assertThat(stringMap)
                .containsKeys("1020", "1040")
                .containsValues("PKO BP", "Nordea");
    }
}
