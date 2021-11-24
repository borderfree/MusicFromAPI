package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzw;

@C3464ci
public final class avu {

    /* renamed from: a */
    private final Context f13202a;

    /* renamed from: b */
    private final bas f13203b;

    /* renamed from: c */
    private final zzang f13204c;

    /* renamed from: d */
    private final zzw f13205d;

    avu(Context context, bas bas, zzang zzang, zzw zzw) {
        this.f13202a = context;
        this.f13203b = bas;
        this.f13204c = zzang;
        this.f13205d = zzw;
    }

    /* renamed from: a */
    public final Context mo12532a() {
        return this.f13202a.getApplicationContext();
    }

    /* renamed from: a */
    public final zzal mo12533a(String str) {
        zzal zzal = new zzal(this.f13202a, new zzjn(), str, this.f13203b, this.f13204c, this.f13205d);
        return zzal;
    }

    /* renamed from: b */
    public final zzal mo12534b(String str) {
        zzal zzal = new zzal(this.f13202a.getApplicationContext(), new zzjn(), str, this.f13203b, this.f13204c, this.f13205d);
        return zzal;
    }

    /* renamed from: b */
    public final avu mo12535b() {
        return new avu(this.f13202a.getApplicationContext(), this.f13203b, this.f13204c, this.f13205d);
    }
}
