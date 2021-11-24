package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@C3464ci
public final class aij implements ais {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ahw f12107a;

    /* renamed from: b */
    private final Context f12108b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzab f12109c;

    /* renamed from: d */
    private ayw f12110d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f12111e;

    /* renamed from: f */
    private final zzv<azg> f12112f = new aio(this);

    /* renamed from: g */
    private final zzv<azg> f12113g = new aip(this);

    /* renamed from: h */
    private final zzv<azg> f12114h = new aiq(this);

    /* renamed from: i */
    private final zzv<azg> f12115i = new air(this);

    public aij(ahw ahw, ayj ayj, Context context) {
        this.f12107a = ahw;
        this.f12108b = context;
        this.f12109c = new zzab(this.f12108b);
        this.f12110d = ayj.mo12631b((afm) null);
        this.f12110d.mo13301a(new aik(this), new ail(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f12107a.f12064a.mo11935d());
        C3643iy.m19172b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11974a(azg azg) {
        azg.mo12617a("/updateActiveView", this.f12112f);
        azg.mo12617a("/untrackActiveViewUnit", this.f12113g);
        azg.mo12617a("/visibilityChanged", this.f12114h);
        if (zzbv.zzfh().mo12999a(this.f12108b)) {
            azg.mo12617a("/logScionEvent", this.f12115i);
        }
    }

    /* renamed from: a */
    public final void mo11971a(JSONObject jSONObject, boolean z) {
        this.f12110d.mo13301a(new aim(this, jSONObject), new C3767nn());
    }

    /* renamed from: a */
    public final boolean mo11972a() {
        return this.f12111e;
    }

    /* renamed from: b */
    public final void mo11973b() {
        this.f12110d.mo13301a(new ain(this), new C3767nn());
        this.f12110d.mo12638c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo11975b(azg azg) {
        azg.mo12618b("/visibilityChanged", this.f12114h);
        azg.mo12618b("/untrackActiveViewUnit", this.f12113g);
        azg.mo12618b("/updateActiveView", this.f12112f);
        if (zzbv.zzfh().mo12999a(this.f12108b)) {
            azg.mo12618b("/logScionEvent", this.f12115i);
        }
    }
}
