package n.e.c.a.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture */
public interface a<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
