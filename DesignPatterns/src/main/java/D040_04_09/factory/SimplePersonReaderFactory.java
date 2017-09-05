package D040_04_09.factory;

/**
 * Created by Miver on 2017-09-04.
 */
public class SimplePersonReaderFactory {
    public PersonFileReader createReader(String path) {
        if(path.endsWith(".txt"))
            return new TxtPersonFileReader();
        if (path.endsWith(".json"))
            return new JsonPersonFileReader();
        if (path.endsWith(".xml"))
            return new XmlPersonFilesReader();
        return null;
    }
}
