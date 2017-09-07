package D043_07_09.chainofresponsibility;

/**
 * Created by Miver on 2017-09-07.
 */
public class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.logLevel = LogLevel.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: "+message);
    }
}
