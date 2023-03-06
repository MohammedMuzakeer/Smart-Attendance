package s;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: Source.kt */
public interface a0 extends Closeable {
    void close() throws IOException;

    long read(f fVar, long j) throws IOException;

    b0 timeout();
}
