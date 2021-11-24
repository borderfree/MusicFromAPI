package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzaf;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class ara extends ard {

    /* renamed from: a */
    private final zzaf f12949a;

    /* renamed from: b */
    private final String f12950b;

    /* renamed from: c */
    private final String f12951c;

    public ara(zzaf zzaf, String str, String str2) {
        this.f12949a = zzaf;
        this.f12950b = str;
        this.f12951c = str2;
    }

    /* renamed from: a */
    public final String mo12328a() {
        return this.f12950b;
    }

    /* renamed from: a */
    public final void mo12329a(C3323b bVar) {
        if (bVar != null) {
            this.f12949a.zzh((View) C3327d.m15137a(bVar));
        }
    }

    /* renamed from: b */
    public final String mo12330b() {
        return this.f12951c;
    }

    /* renamed from: c */
    public final void mo12331c() {
        this.f12949a.zzcn();
    }

    /* renamed from: d */
    public final void mo12332d() {
        this.f12949a.zzco();
    }
}
