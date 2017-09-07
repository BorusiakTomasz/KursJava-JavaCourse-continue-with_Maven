package D043_07_09.chainofresponsibility;

/**
 * Created by Miver on 2017-09-07.
 */
public class InfoLogger extends Logger {
    public InfoLogger() {
        this.logLevel = LogLevel.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}
