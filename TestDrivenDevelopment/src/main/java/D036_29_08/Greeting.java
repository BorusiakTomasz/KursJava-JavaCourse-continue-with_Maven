package D036_29_08;

/**
 * Created by Miver on 2017-08-29.
 */
public class Greeting {
    public String greet(String... name) {
        if (name == null)
            return "Hello, my friend";

        if (name.length == 1) {
            if (name[0].equals(name[0].toUpperCase()))
                return "HELLO, " + name[0];

            return "Hello, " + name[0];
        }

        StringBuilder result = new StringBuilder("Hello");
        for (int i = 0; i < name.length; i++) {
            if (i < name.length - 1)
                result.append(", ").append(name[i]);
            else
                result.append(" and ").append(name[i]);
        }
        return result.toString();
    }
}
