package com.facebook.ads.internal.p073r.p074a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.r.a.i */
public class C1745i {

    /* renamed from: a */
    private int f5745a;

    /* renamed from: b */
    private String f5746b;

    /* renamed from: c */
    private Map<String, List<String>> f5747c;

    /* renamed from: d */
    private byte[] f5748d;

    public C1745i(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.f5745a = httpURLConnection.getResponseCode();
            this.f5746b = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f5747c = httpURLConnection.getHeaderFields();
        this.f5748d = bArr;
    }

    /* renamed from: a */
    public int mo6987a() {
        return this.f5745a;
    }

    /* renamed from: b */
    public String mo6988b() {
        return this.f5746b;
    }

    /* renamed from: c */
    public Map<String, List<String>> mo6989c() {
        return this.f5747c;
    }

    /* renamed from: d */
    public byte[] mo6990d() {
        return this.f5748d;
    }

    /* renamed from: e */
    public String mo6991e() {
        if (this.f5748d != null) {
            return new String(this.f5748d);
        }
        return null;
    }
}
