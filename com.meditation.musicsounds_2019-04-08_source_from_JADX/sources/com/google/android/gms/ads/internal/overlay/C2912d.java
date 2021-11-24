package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3638it;
import com.google.android.gms.internal.ads.C3653jh;

@C3464ci
/* renamed from: com.google.android.gms.ads.internal.overlay.d */
final class C2912d extends C3638it {

    /* renamed from: a */
    final /* synthetic */ zzd f10050a;

    private C2912d(zzd zzd) {
        this.f10050a = zzd;
    }

    /* synthetic */ C2912d(zzd zzd, C2910b bVar) {
        this(zzd);
    }

    /* renamed from: a */
    public final void mo10051a() {
        Bitmap a = zzbv.zzfe().mo13217a(Integer.valueOf(this.f10050a.f10062b.zzbyw.zzzj));
        if (a != null) {
            C3653jh.f14275a.post(new C2913e(this, zzbv.zzem().mo13144a(this.f10050a.f10061a, a, this.f10050a.f10062b.zzbyw.zzzh, this.f10050a.f10062b.zzbyw.zzzi)));
        }
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
    }
}
