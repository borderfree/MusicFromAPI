package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ads */
public abstract class C3401ads {

    /* renamed from: Z */
    protected volatile int f11566Z = -1;

    /* renamed from: a */
    public static final <T extends C3401ads> T m16011a(T t, byte[] bArr) {
        return m16012a(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private static final <T extends C3401ads> T m16012a(T t, byte[] bArr, int i, int i2) {
        try {
            adk a = adk.m15941a(bArr, 0, i2);
            t.mo11511a(a);
            a.mo11783a(0);
            return t;
        } catch (zzbfh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* renamed from: a */
    public static final byte[] m16013a(C3401ads ads) {
        byte[] bArr = new byte[ads.mo11829d()];
        try {
            adm a = adm.m15971a(bArr, 0, bArr.length);
            ads.mo11512a(a);
            a.mo11800a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo11510a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C3401ads mo11511a(adk adk);

    /* renamed from: a */
    public void mo11512a(adm adm) {
    }

    /* renamed from: c */
    public C3401ads clone() {
        return (C3401ads) super.clone();
    }

    /* renamed from: d */
    public final int mo11829d() {
        int a = mo11510a();
        this.f11566Z = a;
        return a;
    }

    public String toString() {
        return adt.m16019a(this);
    }
}
