package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.jr */
final class C3663jr implements Callable<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ Context f14291a;

    /* renamed from: b */
    private final /* synthetic */ WebSettings f14292b;

    C3663jr(C3662jq jqVar, Context context, WebSettings webSettings) {
        this.f14291a = context;
        this.f14292b = webSettings;
    }

    public final /* synthetic */ Object call() {
        if (this.f14291a.getCacheDir() != null) {
            this.f14292b.setAppCachePath(this.f14291a.getCacheDir().getAbsolutePath());
            this.f14292b.setAppCacheMaxSize(0);
            this.f14292b.setAppCacheEnabled(true);
        }
        this.f14292b.setDatabasePath(this.f14291a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f14292b.setDatabaseEnabled(true);
        this.f14292b.setDomStorageEnabled(true);
        this.f14292b.setDisplayZoomControls(false);
        this.f14292b.setBuiltInZoomControls(true);
        this.f14292b.setSupportZoom(true);
        this.f14292b.setAllowContentAccess(false);
        return Boolean.valueOf(true);
    }
}
