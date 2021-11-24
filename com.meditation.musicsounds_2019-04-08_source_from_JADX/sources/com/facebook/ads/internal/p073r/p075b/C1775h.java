package com.facebook.ads.internal.p073r.p075b;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.r.b.h */
public class C1775h implements C1783n {

    /* renamed from: a */
    public final String f5798a;

    /* renamed from: b */
    private HttpURLConnection f5799b;

    /* renamed from: c */
    private InputStream f5800c;

    /* renamed from: d */
    private volatile int f5801d;

    /* renamed from: e */
    private volatile String f5802e;

    public C1775h(C1775h hVar) {
        this.f5801d = Integer.MIN_VALUE;
        this.f5798a = hVar.f5798a;
        this.f5802e = hVar.f5802e;
        this.f5801d = hVar.f5801d;
    }

    public C1775h(String str) {
        this(str, C1782m.m8858a(str));
    }

    public C1775h(String str, String str2) {
        this.f5801d = Integer.MIN_VALUE;
        this.f5798a = (String) C1777j.m8841a(str);
        this.f5802e = str2;
    }

    /* renamed from: a */
    private int m8833a(HttpURLConnection httpURLConnection, int i, int i2) {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.f5801d;
    }

    /* renamed from: a */
    private HttpURLConnection m8834a(int i, int i2) {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z;
        String str2 = this.f5798a;
        int i3 = 0;
        do {
            String str3 = "ProxyCache";
            StringBuilder sb = new StringBuilder();
            sb.append("Open connection ");
            if (i > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" with offset ");
                sb2.append(i);
                str = sb2.toString();
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(str2);
            Log.d(str3, sb.toString());
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            if (i > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("bytes=");
                sb3.append(i);
                sb3.append("-");
                httpURLConnection.setRequestProperty("Range", sb3.toString());
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                str2 = httpURLConnection.getHeaderField("Location");
                i3++;
                httpURLConnection.disconnect();
            }
            if (i3 > 5) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Too many redirects: ");
                sb4.append(i3);
                throw new C1781l(sb4.toString());
            }
        } while (z);
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8835d() {
        /*
            r7 = this;
            java.lang.String r0 = "ProxyCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Read content info from "
            r1.append(r2)
            java.lang.String r2 = r7.f5798a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            r0 = 0
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 0
            java.net.HttpURLConnection r0 = r7.m8834a(r0, r1)     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            int r1 = r0.getContentLength()     // Catch:{ IOException -> 0x0069, all -> 0x0064 }
            r7.f5801d = r1     // Catch:{ IOException -> 0x0069, all -> 0x0064 }
            java.lang.String r1 = r0.getContentType()     // Catch:{ IOException -> 0x0069, all -> 0x0064 }
            r7.f5802e = r1     // Catch:{ IOException -> 0x0069, all -> 0x0064 }
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x0069, all -> 0x0064 }
            java.lang.String r2 = "ProxyCache"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062 }
            r3.<init>()     // Catch:{ IOException -> 0x0062 }
            java.lang.String r4 = "Content info for `"
            r3.append(r4)     // Catch:{ IOException -> 0x0062 }
            java.lang.String r4 = r7.f5798a     // Catch:{ IOException -> 0x0062 }
            r3.append(r4)     // Catch:{ IOException -> 0x0062 }
            java.lang.String r4 = "`: mime: "
            r3.append(r4)     // Catch:{ IOException -> 0x0062 }
            java.lang.String r4 = r7.f5802e     // Catch:{ IOException -> 0x0062 }
            r3.append(r4)     // Catch:{ IOException -> 0x0062 }
            java.lang.String r4 = ", content-length: "
            r3.append(r4)     // Catch:{ IOException -> 0x0062 }
            int r4 = r7.f5801d     // Catch:{ IOException -> 0x0062 }
            r3.append(r4)     // Catch:{ IOException -> 0x0062 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0062 }
            android.util.Log.i(r2, r3)     // Catch:{ IOException -> 0x0062 }
            com.facebook.ads.internal.p073r.p075b.C1782m.m8860a(r1)
            if (r0 == 0) goto L_0x0097
            goto L_0x0094
        L_0x0062:
            r2 = move-exception
            goto L_0x0077
        L_0x0064:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0099
        L_0x0069:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0077
        L_0x006e:
            r0 = move-exception
            r1 = r2
            r2 = r0
            r0 = r1
            goto L_0x0099
        L_0x0073:
            r0 = move-exception
            r1 = r2
            r2 = r0
            r0 = r1
        L_0x0077:
            java.lang.String r3 = "ProxyCache"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r4.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = "Error fetching info from "
            r4.append(r5)     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = r7.f5798a     // Catch:{ all -> 0x0098 }
            r4.append(r5)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0098 }
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0098 }
            com.facebook.ads.internal.p073r.p075b.C1782m.m8860a(r1)
            if (r0 == 0) goto L_0x0097
        L_0x0094:
            r0.disconnect()
        L_0x0097:
            return
        L_0x0098:
            r2 = move-exception
        L_0x0099:
            com.facebook.ads.internal.p073r.p075b.C1782m.m8860a(r1)
            if (r0 == 0) goto L_0x00a1
            r0.disconnect()
        L_0x00a1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p073r.p075b.C1775h.m8835d():void");
    }

    /* renamed from: a */
    public synchronized int mo7043a() {
        if (this.f5801d == Integer.MIN_VALUE) {
            m8835d();
        }
        return this.f5801d;
    }

    /* renamed from: a */
    public int mo7044a(byte[] bArr) {
        if (this.f5800c != null) {
            try {
                return this.f5800c.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Reading source ");
                sb.append(this.f5798a);
                sb.append(" is interrupted");
                throw new C1776i(sb.toString(), e);
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error reading data from ");
                sb2.append(this.f5798a);
                throw new C1781l(sb2.toString(), e2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error reading data from ");
            sb3.append(this.f5798a);
            sb3.append(": connection is absent!");
            throw new C1781l(sb3.toString());
        }
    }

    /* renamed from: a */
    public void mo7045a(int i) {
        try {
            this.f5799b = m8834a(i, -1);
            this.f5802e = this.f5799b.getContentType();
            this.f5800c = new BufferedInputStream(this.f5799b.getInputStream(), 8192);
            this.f5801d = m8833a(this.f5799b, i, this.f5799b.getResponseCode());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error opening connection for ");
            sb.append(this.f5798a);
            sb.append(" with offset ");
            sb.append(i);
            throw new C1781l(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public void mo7046b() {
        if (this.f5799b != null) {
            try {
                this.f5799b.disconnect();
            } catch (NullPointerException e) {
                throw new C1781l("Error disconnecting HttpUrlConnection", e);
            }
        }
    }

    /* renamed from: c */
    public synchronized String mo7047c() {
        if (TextUtils.isEmpty(this.f5802e)) {
            m8835d();
        }
        return this.f5802e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HttpUrlSource{url='");
        sb.append(this.f5798a);
        sb.append("}");
        return sb.toString();
    }
}
