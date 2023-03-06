package s;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
public interface h extends a0, ReadableByteChannel {
    int a(q qVar) throws IOException;

    long a(i iVar) throws IOException;

    long a(y yVar) throws IOException;

    String a(Charset charset) throws IOException;

    i a(long j) throws IOException;

    void a(f fVar, long j) throws IOException;

    boolean a(long j, i iVar) throws IOException;

    long b(i iVar) throws IOException;

    String b(long j) throws IOException;

    f c();

    byte[] e(long j) throws IOException;

    byte[] f() throws IOException;

    boolean g() throws IOException;

    f getBuffer();

    void h(long j) throws IOException;

    long j() throws IOException;

    i k() throws IOException;

    String n() throws IOException;

    h peek();

    long r() throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    InputStream s();

    void skip(long j) throws IOException;
}
