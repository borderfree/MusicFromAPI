package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.upstream.h */
public final class C2815h implements C2809d {

    /* renamed from: a */
    private final C2809d f9745a;

    /* renamed from: b */
    private final C2809d f9746b;

    /* renamed from: c */
    private final C2809d f9747c;

    /* renamed from: d */
    private final C2809d f9748d;

    /* renamed from: e */
    private C2809d f9749e;

    public C2815h(Context context, C2819l<? super C2809d> lVar, C2809d dVar) {
        this.f9745a = (C2809d) C2488a.m11664a(dVar);
        this.f9746b = new FileDataSource(lVar);
        this.f9747c = new AssetDataSource(context, lVar);
        this.f9748d = new ContentDataSource(context, lVar);
    }

    /* renamed from: a */
    public int mo9518a(byte[] bArr, int i, int i2) {
        return this.f9749e.mo9518a(bArr, i, i2);
    }

    /* renamed from: a */
    public long mo9519a(C2811e eVar) {
        C2809d dVar;
        C2488a.m11668b(this.f9749e == null);
        String scheme = eVar.f9717a.getScheme();
        if (C2511s.m11808a(eVar.f9717a)) {
            if (!eVar.f9717a.getPath().startsWith("/android_asset/")) {
                dVar = this.f9746b;
                this.f9749e = dVar;
                return this.f9749e.mo9519a(eVar);
            }
        } else if (!"asset".equals(scheme)) {
            dVar = "content".equals(scheme) ? this.f9748d : this.f9745a;
            this.f9749e = dVar;
            return this.f9749e.mo9519a(eVar);
        }
        dVar = this.f9747c;
        this.f9749e = dVar;
        return this.f9749e.mo9519a(eVar);
    }

    /* renamed from: a */
    public Uri mo9520a() {
        if (this.f9749e == null) {
            return null;
        }
        return this.f9749e.mo9520a();
    }

    /* renamed from: b */
    public void mo9521b() {
        if (this.f9749e != null) {
            try {
                this.f9749e.mo9521b();
            } finally {
                this.f9749e = null;
            }
        }
    }
}
