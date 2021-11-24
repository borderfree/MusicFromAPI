package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;

@TargetApi(9)
/* renamed from: com.google.android.gms.internal.ads.jp */
public class C3661jp extends C3659jn {
    public C3661jp() {
        super();
    }

    /* renamed from: a */
    public final int mo13143a() {
        return 6;
    }

    /* renamed from: a */
    public boolean mo13152a(Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    /* renamed from: b */
    public final int mo13156b() {
        return 7;
    }
}
