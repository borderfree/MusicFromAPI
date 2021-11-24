package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.os.Looper;
import com.google.android.exoplayer2.drm.C2518b;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.drm.a */
public interface C2517a<T extends C2518b> {
    /* renamed from: a */
    DrmSession<T> mo8913a(Looper looper, DrmInitData drmInitData);

    /* renamed from: a */
    void mo8914a(DrmSession<T> drmSession);
}
