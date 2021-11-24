package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ly */
final /* synthetic */ class C3724ly implements C3730md {

    /* renamed from: a */
    private final String f14430a;

    /* renamed from: b */
    private final String f14431b;

    /* renamed from: c */
    private final Map f14432c;

    /* renamed from: d */
    private final byte[] f14433d;

    C3724ly(String str, String str2, Map map, byte[] bArr) {
        this.f14430a = str;
        this.f14431b = str2;
        this.f14432c = map;
        this.f14433d = bArr;
    }

    /* renamed from: a */
    public final void mo13243a(JsonWriter jsonWriter) {
        C3723lx.m19140a(this.f14430a, this.f14431b, this.f14432c, this.f14433d, jsonWriter);
    }
}
