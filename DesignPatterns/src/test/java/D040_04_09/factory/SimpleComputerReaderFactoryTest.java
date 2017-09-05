package D040_04_09.factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Miver on 2017-09-04.
 */
public class SimpleComputerReaderFactoryTest {
    @Test
    public void txtReaderTest() throws Exception {
        String path = "plik.txt";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        PersonFileReader fileReader = factory.createReader(path);

        assertTrue(fileReader instanceof TxtPersonFileReader);
        assertSame(TxtPersonFileReader.class, fileReader.getClass());
    }

    @Test
    public void jsonReaderTest() {
        String path = "plik.json";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        PersonFileReader fileReader = factory.createReader(path);

        assertTrue(fileReader instanceof JsonPersonFileReader);
        assertSame(JsonPersonFileReader.class, fileReader.getClass());
    }

    @Test
    public void xmlReaderTest() {
        String path = "plik.xml";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        PersonFileReader fileReader = factory.createReader(path);

        assertTrue(fileReader instanceof XmlPersonFilesReader);
        assertSame(XmlPersonFilesReader.class, fileReader.getClass());
    }
}