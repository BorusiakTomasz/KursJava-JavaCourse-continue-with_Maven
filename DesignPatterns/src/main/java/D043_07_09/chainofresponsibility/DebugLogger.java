package D043_07_09.chainofresponsibility;

/**
 * Created by Miver on 2017-09-07.
 */
public class DebugLogger extends Logger {
    public DebugLogger() {
        this.logLevel = LogLevel.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
