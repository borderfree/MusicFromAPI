package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;

final class axc {

    /* renamed from: a */
    zzal f13255a;

    /* renamed from: b */
    zzjj f13256b;

    /* renamed from: c */
    avv f13257c;

    /* renamed from: d */
    long f13258d;

    /* renamed from: e */
    boolean f13259e;

    /* renamed from: f */
    boolean f13260f;

    /* renamed from: g */
    private final /* synthetic */ axb f13261g;

    axc(axb axb, avu avu) {
        this.f13261g = axb;
        this.f13255a = avu.mo12534b(axb.f13252c);
        this.f13257c = new avv();
        avv avv = this.f13257c;
        zzal zzal = this.f13255a;
        zzal.zza((ank) new avw(avv));
        zzal.zza((aoe) new awf(avv));
        zzal.zza((arf) new awh(avv));
        zzal.zza((anh) new awj(avv));
        zzal.zza((C3566gb) new awl(avv));
    }

    axc(axb axb, avu avu, zzjj zzjj) {
        this(axb, avu);
        this.f13256b = zzjj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo12576a() {
        if (this.f13259e) {
            return false;
        }
        this.f13260f = this.f13255a.zzb(awz.m17562b(this.f13256b != null ? this.f13256b : this.f13261g.f13251b));
        this.f13259e = true;
        this.f13258d = zzbv.zzer().mo11326a();
        return true;
    }
}
