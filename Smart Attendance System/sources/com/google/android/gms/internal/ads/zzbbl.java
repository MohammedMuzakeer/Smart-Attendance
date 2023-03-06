package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface zzbbl extends ExecutorService {
    zzbbh<?> a(Runnable runnable);

    <T> zzbbh<T> a(Callable<T> callable);
}
