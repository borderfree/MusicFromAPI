package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import com.google.android.exoplayer2.drm.C2518b;

@TargetApi(16)
public interface DrmSession<T extends C2518b> {

    public static class DrmSessionException extends Exception {
        public DrmSessionException(Exception exc) {
            super(exc);
        }
    }

    /* renamed from: a */
    int mo8909a();

    /* renamed from: a */
    boolean mo8910a(String str);

    /* renamed from: b */
    T mo8911b();

    /* renamed from: c */
    DrmSessionException mo8912c();
}
