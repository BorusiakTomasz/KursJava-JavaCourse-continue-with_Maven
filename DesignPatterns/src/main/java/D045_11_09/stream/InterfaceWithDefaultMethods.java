package D045_11_09.stream;

/**
 * Created by Miver on 2017-09-11.
 */
public interface InterfaceWithDefaultMethods {
    void foo();

    default void bar() {
        System.out.println("bar");
    }
}
