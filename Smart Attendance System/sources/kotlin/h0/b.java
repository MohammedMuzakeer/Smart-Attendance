package kotlin.h0;

import java.util.List;
import java.util.Map;

/* compiled from: KCallable.kt */
public interface b<R> extends a {
    R call(Object... objArr);

    R callBy(Map<k, ? extends Object> map);

    String getName();

    List<k> getParameters();

    p getReturnType();

    List<q> getTypeParameters();

    t getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
