package n.h.a.b0;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* compiled from: FileDownloadConnection */
public interface a {
    InputStream a() throws IOException;

    String a(String str);

    void a(String str, String str2);

    boolean a(String str, long j);

    Map<String, List<String>> b();

    int c() throws IOException;

    void d();

    Map<String, List<String>> e();

    void execute() throws IOException;
}
