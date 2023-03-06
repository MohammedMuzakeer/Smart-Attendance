package rx;

/* compiled from: Observer */
public interface f<T> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(T t);
}
