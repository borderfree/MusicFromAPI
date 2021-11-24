package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3266s;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.y */
final class C4774y implements Runnable {

    /* renamed from: a */
    private final C4773x f17242a;

    /* renamed from: b */
    private final int f17243b;

    /* renamed from: c */
    private final Throwable f17244c;

    /* renamed from: d */
    private final byte[] f17245d;

    /* renamed from: e */
    private final String f17246e;

    /* renamed from: f */
    private final Map<String, List<String>> f17247f;

    private C4774y(String str, C4773x xVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C3266s.m14913a(xVar);
        this.f17242a = xVar;
        this.f17243b = i;
        this.f17244c = th;
        this.f17245d = bArr;
        this.f17246e = str;
        this.f17247f = map;
    }

    public final void run() {
        this.f17242a.mo15561a(this.f17246e, this.f17243b, this.f17244c, this.f17245d, this.f17247f);
    }
}
