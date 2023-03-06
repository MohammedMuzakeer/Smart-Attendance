package n.h.a;

import com.liulishuo.filedownloader.message.MessageSnapshot;

/* compiled from: ITaskHunter */
public interface w {

    /* compiled from: ITaskHunter */
    public interface a {
        MessageSnapshot a(Throwable th);

        boolean a(MessageSnapshot messageSnapshot);

        boolean b(MessageSnapshot messageSnapshot);

        boolean c(MessageSnapshot messageSnapshot);

        boolean d(MessageSnapshot messageSnapshot);

        s e();
    }

    /* compiled from: ITaskHunter */
    public interface b {
        boolean a(i iVar);

        void start();
    }

    void a();

    int b();

    Throwable c();

    boolean d();

    void g();

    byte getStatus();

    long h();

    long i();

    boolean pause();
}
