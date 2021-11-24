package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.pg */
public final class C3814pg extends C3638it {

    /* renamed from: a */
    final C3804ox f14643a;

    /* renamed from: b */
    final C3817pj f14644b;

    /* renamed from: c */
    private final String f14645c;

    C3814pg(C3804ox oxVar, C3817pj pjVar, String str) {
        this.f14643a = oxVar;
        this.f14644b = pjVar;
        this.f14645c = str;
        zzbv.zzff().mo13444a(this);
    }

    /* renamed from: a */
    public final void mo10051a() {
        try {
            this.f14644b.mo13449a(this.f14645c);
        } finally {
            C3653jh.f14275a.post(new C3815ph(this));
        }
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
        this.f14644b.mo13450b();
    }
}
