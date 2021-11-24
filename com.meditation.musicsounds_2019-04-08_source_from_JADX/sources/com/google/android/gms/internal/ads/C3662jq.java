package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.jq */
public class C3662jq extends C3661jp {
    /* renamed from: a */
    public C3833pz mo13146a(C3832py pyVar, boolean z) {
        return new C3856qv(pyVar, z);
    }

    /* renamed from: a */
    public final Set<String> mo13149a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    /* renamed from: a */
    public final boolean mo13152a(Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    /* renamed from: a */
    public boolean mo13153a(Context context, WebSettings webSettings) {
        super.mo13153a(context, webSettings);
        return ((Boolean) C3710lk.m19088a(context, new C3663jr(this, context, webSettings))).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo13155a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    /* renamed from: b */
    public final boolean mo13158b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    /* renamed from: c */
    public final boolean mo13161c(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
