package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface zzdsw extends Closeable {
    ByteBuffer a(long j, long j2) throws IOException;

    void close() throws IOException;

    void f(long j) throws IOException;

    long position() throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;
}
