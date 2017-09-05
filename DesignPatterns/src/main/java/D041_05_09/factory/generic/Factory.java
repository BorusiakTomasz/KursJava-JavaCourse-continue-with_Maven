package D041_05_09.factory.generic;

/**
 * Created by Miver on 2017-09-05.
 * Generyczny interfejs do tworzenia wielu rodzajow fabryk
 */
public interface Factory<K, V> {
    V create(K key);
}
