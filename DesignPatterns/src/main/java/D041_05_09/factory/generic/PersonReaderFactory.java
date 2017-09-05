package D041_05_09.factory.generic;

import D040_04_09.factory.*;
import D040_04_09.factory.enumexample.PersonReaderFileType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by Miver on 2017-09-05.
 */
public class PersonReaderFactory implements Factory<PersonReaderFileType, PersonFileReader> {
    private Map<PersonReaderFileType, Supplier<PersonFileReader>> map;

    public PersonReaderFactory() {
        map = new HashMap<>();
        map.put(PersonReaderFileType.TXT, TxtPersonFileReader::new);
        map.put(PersonReaderFileType.JSON, JsonPersonFileReader::new);
        map.put(PersonReaderFileType.XML, XmlPersonFilesReader::new);
    }

    @Override
    public PersonFileReader create(PersonReaderFileType key) {
        /*if (map.containsKey(key)) {
            //map.get(key) pobiera wartosc o podanym kluczu
            Supplier<PersonFileReader> supplier = map.get(key);
            //supplier.get() pobiera i uruchamia wyrazenie lambda
            return supplier.get();
        }*/
        return map.containsKey(key) ? map.get(key).get() : null;
    }
}
