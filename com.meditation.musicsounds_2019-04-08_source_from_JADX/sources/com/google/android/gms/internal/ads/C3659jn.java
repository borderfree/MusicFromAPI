package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@TargetApi(8)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.jn */
public class C3659jn {
    private C3659jn() {
    }

    /* renamed from: a */
    public static boolean m18932a(C3832py pyVar) {
        if (pyVar == null) {
            return false;
        }
        pyVar.onPause();
        return true;
    }

    /* renamed from: b */
    public static boolean m18933b(C3832py pyVar) {
        if (pyVar == null) {
            return false;
        }
        pyVar.onResume();
        return true;
    }

    /* renamed from: e */
    public static boolean m18934e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: a */
    public int mo13143a() {
        return 0;
    }

    /* renamed from: a */
    public Drawable mo13144a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: a */
    public WebResourceResponse mo13145a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: a */
    public C3833pz mo13146a(C3832py pyVar, boolean z) {
        return new C3833pz(pyVar, z);
    }

    /* renamed from: a */
    public String mo13147a(Context context) {
        return "";
    }

    /* renamed from: a */
    public String mo13148a(SslError sslError) {
        return "";
    }

    /* renamed from: a */
    public Set<String> mo13149a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: a */
    public void mo13150a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo13151a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo13152a(Request request) {
        return false;
    }

    /* renamed from: a */
    public boolean mo13153a(Context context, WebSettings webSettings) {
        return false;
    }

    /* renamed from: a */
    public boolean mo13154a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: a */
    public boolean mo13155a(Window window) {
        return false;
    }

    /* renamed from: b */
    public int mo13156b() {
        return 1;
    }

    /* renamed from: b */
    public void mo13157b(Context context) {
    }

    /* renamed from: b */
    public boolean mo13158b(View view) {
        return false;
    }

    /* renamed from: c */
    public int mo13159c() {
        return 5;
    }

    /* renamed from: c */
    public CookieManager mo13160c(Context context) {
        if (m18934e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C3643iy.m19173b("Failed to obtain CookieManager.", th);
            zzbv.zzeo().mo13047a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo13161c(View view) {
        return false;
    }

    /* renamed from: d */
    public LayoutParams mo13162d() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public int mo13163f() {
        return 0;
    }
}
