package com.bumptech.glide.p;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p.l.i;

/* compiled from: RequestListener */
public interface g<R> {
    boolean onLoadFailed(GlideException glideException, Object obj, i<R> iVar, boolean z);

    boolean onResourceReady(R r, Object obj, i<R> iVar, a aVar, boolean z);
}
