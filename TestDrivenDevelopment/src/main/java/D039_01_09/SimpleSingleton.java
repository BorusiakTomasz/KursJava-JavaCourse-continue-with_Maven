package D039_01_09;

import D038_31_08.MobilePhone;

/**
 * Created by Miver on 2017-09-01.
 */
public class SimpleSingleton {
    //lazyVersion
    private static MobilePhone mp;

    //simpleVersion
    //private static MobilePhone mp = new MobilePhone();

    private SimpleSingleton() {
        if (mp != null)
            throw new IllegalArgumentException("Already exist");
    }

    //lazyVersion, jesli w sygnaturze jest synchronized, tworzymy takzwana
    public static synchronized MobilePhone getInstance() {
        if(mp == null){
            mp = new MobilePhone("123");
        }
        return mp;
    }

    //simpleVersion is without if()
}
