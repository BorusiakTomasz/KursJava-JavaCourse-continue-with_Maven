package D039_01_09;

import D038_31_08.MobilePhone;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Miver on 2017-09-03.
 */
public class SimpleSingletonTest {
    @Test
    public void getInstance() throws Exception {
        MobilePhone mp = SimpleSingleton.getInstance();
        MobilePhone mp1 = SimpleSingleton.getInstance();

        assertNotNull(mp);
        assertNotNull(mp1);

        assertSame(mp, mp1);
    }
}