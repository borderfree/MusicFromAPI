package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzbl {

    /* renamed from: a */
    private final zzbn f10197a;

    /* renamed from: b */
    private final Runnable f10198b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzjj f10199c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f10200d;

    /* renamed from: e */
    private boolean f10201e;

    /* renamed from: f */
    private long f10202f;

    public zzbl(zza zza) {
        this(zza, new zzbn(C3653jh.f14275a));
    }

    private zzbl(zza zza, zzbn zzbn) {
        this.f10200d = false;
        this.f10201e = false;
        this.f10202f = 0;
        this.f10197a = zzbn;
        this.f10198b = new C2925z(this, new WeakReference(zza));
    }

    public final void cancel() {
        this.f10200d = false;
        this.f10197a.removeCallbacks(this.f10198b);
    }

    public final void pause() {
        this.f10201e = true;
        if (this.f10200d) {
            this.f10197a.removeCallbacks(this.f10198b);
        }
    }

    public final void resume() {
        this.f10201e = false;
        if (this.f10200d) {
            this.f10200d = false;
            zza(this.f10199c, this.f10202f);
        }
    }

    public final void zza(zzjj zzjj, long j) {
        if (this.f10200d) {
            C3643iy.m19178e("An ad refresh is already scheduled.");
            return;
        }
        this.f10199c = zzjj;
        this.f10200d = true;
        this.f10202f = j;
        if (!this.f10201e) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j);
            sb.append(" milliseconds from now.");
            C3643iy.m19176d(sb.toString());
            this.f10197a.postDelayed(this.f10198b, j);
        }
    }

    public final void zzdy() {
        this.f10201e = false;
        this.f10200d = false;
        if (!(this.f10199c == null || this.f10199c.f15483c == null)) {
            this.f10199c.f15483c.remove("_ad");
        }
        zza(this.f10199c, 0);
    }

    public final boolean zzdz() {
        return this.f10200d;
    }

    public final void zzf(zzjj zzjj) {
        this.f10199c = zzjj;
    }

    public final void zzg(zzjj zzjj) {
        zza(zzjj, 60000);
    }
}
