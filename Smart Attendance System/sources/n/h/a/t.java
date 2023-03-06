package n.h.a;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;

/* compiled from: IFileDownloadServiceProxy */
public interface t {
    void a(Context context);

    boolean a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3);

    byte b(int i);

    boolean d(int i);

    boolean e(int i);

    boolean isConnected();
}
