package q.a;

import q.a.b0.c;

/* compiled from: MaybeObserver */
public interface k<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(c cVar);

    void onSuccess(T t);
}
