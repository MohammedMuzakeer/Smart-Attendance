package cm.aptoide.pt.dataprovider.interfaces;

import rx.m.b;

public interface SuccessRequestListener<T> extends b<T> {
    void call(T t);
}
