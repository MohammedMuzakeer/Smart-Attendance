package q.a;

import q.a.b0.c;

/* compiled from: Observer */
public interface u<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(c cVar);
}
