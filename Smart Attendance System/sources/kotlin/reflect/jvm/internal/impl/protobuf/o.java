package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: MessageLite */
public interface o extends p {

    /* compiled from: MessageLite */
    public interface a extends Cloneable, p {
        a a(e eVar, f fVar) throws IOException;

        o a();
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    a c();

    int e();

    a f();

    q<? extends o> g();
}
