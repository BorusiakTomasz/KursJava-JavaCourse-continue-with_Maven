package D043_07_09.chainofresponsibility;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Miver on 2017-09-07.
 */
public class LoggerTest {
    @Test
    public void should_log_message() {
        Logger info = new InfoLogger();
        Logger debug = new DebugLogger();
        Logger error = new ErrorLogger();

        info.setNextLogger(debug);
        debug.setNextLogger(error);

        info.logMessage(LogLevel.ERROR, "chor rocks!");
    }
}
