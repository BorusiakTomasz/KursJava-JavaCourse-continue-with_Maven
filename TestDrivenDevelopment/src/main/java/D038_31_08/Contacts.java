package D038_31_08;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Miver on 2017-08-31.
 */
@Getter
@AllArgsConstructor
public class Contacts {
    private String name;
    private String phoneNumber;

    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
