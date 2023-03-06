package s;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.kt */
public interface y extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    b0 timeout();

    void write(f fVar, long j) throws IOException;
}
