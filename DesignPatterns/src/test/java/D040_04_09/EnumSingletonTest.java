package D040_04_09;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Miver on 2017-09-04.
 */
public class EnumSingletonTest {
    @Test
    public void enumTest(){
        EnumSingleton firstInstance = EnumSingleton.INSTANCE;
        EnumSingleton second = EnumSingleton.INSTANCE;
        String name = EnumSingleton.INSTANCE.getName();

        assertNotNull(firstInstance);
        assertNotNull(second);
        assertSame(firstInstance, second);
    }
}