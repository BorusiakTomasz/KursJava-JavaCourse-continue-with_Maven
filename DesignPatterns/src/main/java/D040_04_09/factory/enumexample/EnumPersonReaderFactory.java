package D040_04_09.factory.enumexample;

import D040_04_09.factory.JsonPersonFileReader;
import D040_04_09.factory.PersonFileReader;
import D040_04_09.factory.TxtPersonFileReader;
import D040_04_09.factory.XmlPersonFilesReader;

/**
 * Created by Miver on 2017-09-04.
 */
public class EnumPersonReaderFactory {
    public PersonFileReader create(PersonReaderFileType fileType) {
        switch (fileType) {
            case TXT:
                return new TxtPersonFileReader();
            case XML:
                return new XmlPersonFilesReader();
            case JSON:
                return new JsonPersonFileReader();
            default:
                return null;
        }
    }
}
