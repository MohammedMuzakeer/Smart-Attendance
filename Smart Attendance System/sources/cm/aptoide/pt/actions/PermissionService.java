package cm.aptoide.pt.actions;

import android.annotation.TargetApi;
import rx.m.a;

public interface PermissionService {
    @TargetApi(23)
    void hasDownloadAccess(a aVar, a aVar2);

    @TargetApi(23)
    void requestAccessToAccounts(a aVar, a aVar2);

    @TargetApi(23)
    void requestAccessToAccounts(boolean z, a aVar, a aVar2);

    @TargetApi(23)
    void requestAccessToCamera(a aVar, a aVar2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(a aVar, a aVar2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(boolean z, int i, a aVar, a aVar2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(boolean z, a aVar, a aVar2);

    @TargetApi(23)
    void requestDownloadAccess(a aVar, a aVar2, boolean z, boolean z2, long j);
}
