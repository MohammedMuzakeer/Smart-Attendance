package cm.aptoide.pt.dataprovider.cache;

public interface Cache<K, V> {
    boolean contains(K k);

    void destroy();

    V get(K k);

    boolean isValid(K k);

    void put(K k, V v);

    void remove(K k);
}
