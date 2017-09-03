package D039_01_09;

import D038_31_08.MobilePhone;

/**
 * Created by Miver on 2017-09-01.
 */
public class SimpleSingleton {
    private static MobilePhone mp;

    private SimpleSingleton() {}

    public static MobilePhone getInstance() {
        if(mp == null){
            mp = new MobilePhone("123");
        }
        return mp;
    }
}
