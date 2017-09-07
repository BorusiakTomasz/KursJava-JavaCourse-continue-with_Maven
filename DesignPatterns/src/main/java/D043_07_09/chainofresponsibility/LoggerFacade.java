package D043_07_09.chainofresponsibility;

/**
 * Created by Miver on 2017-09-07.
 */
public class LoggerFacade {
    private static Logger info = new InfoLogger();
    private static Logger debug = new DebugLogger();
    private static Logger error = new ErrorLogger();

    static {
        info.setNextLogger(debug);
        debug.setNextLogger(error);
    }

//    public LoggerFacade() {
//        info.setNextLogger(debug);
//        debug.setNextLogger(error);
//    }

    public static void log(LogLevel level, String message) {
        info.logMessage(level,message);
    }
}
