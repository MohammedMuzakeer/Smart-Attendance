package cm.aptoide.pt.install.installer;

import cm.aptoide.pt.database.room.RoomFileToDownload;
import java.io.File;
import java.util.List;
import rx.b;

public interface Installation {
    File getFile();

    List<RoomFileToDownload> getFiles();

    String getId();

    String getPackageName();

    int getStatus();

    int getType();

    int getVersionCode();

    String getVersionName();

    b save();

    b saveFileChanges();

    void setStatus(int i);

    void setType(int i);
}
