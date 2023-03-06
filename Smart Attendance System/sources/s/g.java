package s;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.kt */
public interface g extends y, WritableByteChannel {
    long a(a0 a0Var) throws IOException;

    g a(String str, int i, int i2) throws IOException;

    g b(String str) throws IOException;

    g c(long j) throws IOException;

    g c(i iVar) throws IOException;

    g e() throws IOException;

    void flush() throws IOException;

    f getBuffer();

    g h() throws IOException;

    g i(long j) throws IOException;

    g write(byte[] bArr) throws IOException;

    g write(byte[] bArr, int i, int i2) throws IOException;

    g writeByte(int i) throws IOException;

    g writeInt(int i) throws IOException;

    g writeShort(int i) throws IOException;
}
