package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3602hk;
import com.google.android.gms.internal.ads.C3603hl;
import com.google.android.gms.internal.ads.C3607hp;
import com.google.android.gms.internal.ads.C3789oi;
import com.google.android.gms.internal.ads.C3796op;
import com.google.android.gms.internal.ads.C3811pd;
import com.google.android.gms.internal.ads.C3822po;
import com.google.android.gms.internal.ads.akz;

@C3464ci
public final class zzw {
    public final C3822po zzwy;
    public final C3789oi zzwz;
    public final C3607hp zzxa;
    public final akz zzxb;

    private zzw(C3822po poVar, C3789oi oiVar, C3607hp hpVar, akz akz) {
        this.zzwy = poVar;
        this.zzwz = oiVar;
        this.zzxa = hpVar;
        this.zzxb = akz;
    }

    public static zzw zzc(Context context) {
        return new zzw(new C3811pd(), new C3796op(), new C3602hk(new C3603hl()), new akz(context));
    }
}
