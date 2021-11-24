package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.C3300e;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.v */
public final class C4771v extends C4725ea {

    /* renamed from: b */
    private final SSLSocketFactory f17241b;

    public C4771v(C4726eb ebVar) {
        super(ebVar);
        this.f17241b = VERSION.SDK_INT < 19 ? new C4737el() : null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m23963a(java.net.HttpURLConnection r5) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0025 }
            r1.<init>()     // Catch:{ all -> 0x0025 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ all -> 0x0025 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0023 }
        L_0x000e:
            int r2 = r5.read(r0)     // Catch:{ all -> 0x0023 }
            if (r2 <= 0) goto L_0x0019
            r3 = 0
            r1.write(r0, r3, r2)     // Catch:{ all -> 0x0023 }
            goto L_0x000e
        L_0x0019:
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x0023 }
            if (r5 == 0) goto L_0x0022
            r5.close()
        L_0x0022:
            return r0
        L_0x0023:
            r0 = move-exception
            goto L_0x0029
        L_0x0025:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x0029:
            if (r5 == 0) goto L_0x002e
            r5.close()
        L_0x002e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4771v.m23963a(java.net.HttpURLConnection):byte[]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HttpURLConnection mo15862a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            if (this.f17241b != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(this.f17241b);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15307e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo15863f() {
        NetworkInfo networkInfo;
        mo15525k();
        try {
            networkInfo = ((ConnectivityManager) mo15249n().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4733eh mo15309g() {
        return super.mo15309g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4741ep mo15311h() {
        return super.mo15311h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4747ev mo15312i() {
        return super.mo15312i();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }
}
