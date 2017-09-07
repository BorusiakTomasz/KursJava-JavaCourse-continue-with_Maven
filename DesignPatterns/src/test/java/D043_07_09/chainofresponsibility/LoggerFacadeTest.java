package D043_07_09.chainofresponsibility;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Miver on 2017-09-07.
 */
public class LoggerFacadeTest {
    @Test
    public void log() throws Exception {
        LoggerFacade.log(LogLevel.INFO, "chor rocks!");
        LoggerFacade.log(LogLevel.ERROR, "chor rocks!");
        LoggerFacade.log(LogLevel.DEBUG, "chor rocks!");
        LoggerFacade.log(LogLevel.SUPER_ERROR, "chor rocks!");
    }

}