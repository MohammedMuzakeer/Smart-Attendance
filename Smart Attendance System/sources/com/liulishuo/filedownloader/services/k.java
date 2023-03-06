package com.liulishuo.filedownloader.services;

import android.content.Intent;
import android.os.IBinder;

/* compiled from: IFileDownloadServiceHandler */
interface k {
    void a(Intent intent, int i, int i2);

    IBinder b(Intent intent);

    void onDestroy();
}
