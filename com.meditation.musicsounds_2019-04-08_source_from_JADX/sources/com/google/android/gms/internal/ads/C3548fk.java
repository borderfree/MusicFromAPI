package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzbw;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3327d;
import java.util.HashMap;
import java.util.Map;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.fk */
public final class C3548fk {

    /* renamed from: a */
    private static final bar f13982a = new bar();

    /* renamed from: b */
    private final bas f13983b;

    /* renamed from: c */
    private final zzbw f13984c;

    /* renamed from: d */
    private final Map<String, C3589gy> f13985d = new HashMap();

    /* renamed from: e */
    private final C3581gq f13986e;

    /* renamed from: f */
    private final zzb f13987f;

    /* renamed from: g */
    private final C3413an f13988g;

    public C3548fk(zzbw zzbw, bas bas, C3581gq gqVar, zzb zzb, C3413an anVar) {
        this.f13984c = zzbw;
        this.f13983b = bas;
        this.f13986e = gqVar;
        this.f13987f = zzb;
        this.f13988g = anVar;
    }

    /* renamed from: a */
    public static boolean m18401a(C3622id idVar, C3622id idVar2) {
        return true;
    }

    /* renamed from: a */
    public final zzb mo12904a() {
        return this.f13987f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3589gy mo12905a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.gy> r0 = r4.f13985d
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.gy r0 = (com.google.android.gms.internal.ads.C3589gy) r0
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.bas r1 = r4.f13983b     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.bar r1 = f13982a     // Catch:{ Exception -> 0x002b }
        L_0x0016:
            com.google.android.gms.internal.ads.gy r2 = new com.google.android.gms.internal.ads.gy     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.bav r1 = r1.mo12681a(r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.gq r3 = r4.f13986e     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002b }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.gy> r0 = r4.f13985d     // Catch:{ Exception -> 0x0028 }
            r0.put(r5, r2)     // Catch:{ Exception -> 0x0028 }
            r0 = r2
            goto L_0x0045
        L_0x0028:
            r1 = move-exception
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            java.lang.String r2 = "Fail to instantiate adapter "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003d
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0042
        L_0x003d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0042:
            com.google.android.gms.internal.ads.C3643iy.m19175c(r5, r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3548fk.mo12905a(java.lang.String):com.google.android.gms.internal.ads.gy");
    }

    /* renamed from: a */
    public final zzaig mo12906a(zzaig zzaig) {
        if (!(this.f13984c.zzacw == null || this.f13984c.zzacw.f14151r == null || TextUtils.isEmpty(this.f13984c.zzacw.f14151r.f13433k))) {
            zzaig = new zzaig(this.f13984c.zzacw.f14151r.f13433k, this.f13984c.zzacw.f14151r.f13434l);
        }
        if (!(this.f13984c.zzacw == null || this.f13984c.zzacw.f14148o == null)) {
            zzbv.zzfd();
            bal.m17781a(this.f13984c.zzrt, this.f13984c.zzacr.f15360a, this.f13984c.zzacw.f14148o.f13414m, this.f13984c.zzadr, zzaig);
        }
        return zzaig;
    }

    /* renamed from: a */
    public final void mo12907a(Context context) {
        for (C3589gy a : this.f13985d.values()) {
            try {
                a.mo12971a().mo12686a(C3327d.m15136a(context));
            } catch (RemoteException e) {
                C3643iy.m19173b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo12908a(boolean z) {
        C3589gy a = mo12905a(this.f13984c.zzacw.f14150q);
        if (!(a == null || a.mo12971a() == null)) {
            try {
                a.mo12971a().mo12696a(z);
                a.mo12971a().mo12701f();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: b */
    public final C3413an mo12909b() {
        return this.f13988g;
    }

    /* renamed from: c */
    public final void mo12910c() {
        this.f13984c.zzadv = 0;
        zzbw zzbw = this.f13984c;
        zzbv.zzej();
        C3584gt gtVar = new C3584gt(this.f13984c.zzrt, this.f13984c.zzacx, this);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(gtVar.getClass().getName());
        C3643iy.m19172b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        gtVar.mo11913c();
        zzbw.zzacu = gtVar;
    }

    /* renamed from: d */
    public final void mo12911d() {
        C3266s.m14922b("pause must be called on the main UI thread.");
        for (String str : this.f13985d.keySet()) {
            try {
                C3589gy gyVar = (C3589gy) this.f13985d.get(str);
                if (!(gyVar == null || gyVar.mo12971a() == null)) {
                    gyVar.mo12971a().mo12699d();
                }
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo12912e() {
        C3266s.m14922b("resume must be called on the main UI thread.");
        for (String str : this.f13985d.keySet()) {
            try {
                C3589gy gyVar = (C3589gy) this.f13985d.get(str);
                if (!(gyVar == null || gyVar.mo12971a() == null)) {
                    gyVar.mo12971a().mo12700e();
                }
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: f */
    public final void mo12913f() {
        C3266s.m14922b("destroy must be called on the main UI thread.");
        for (String str : this.f13985d.keySet()) {
            try {
                C3589gy gyVar = (C3589gy) this.f13985d.get(str);
                if (!(gyVar == null || gyVar.mo12971a() == null)) {
                    gyVar.mo12971a().mo12698c();
                }
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: g */
    public final void mo12914g() {
        if (this.f13984c.zzacw != null && this.f13984c.zzacw.f14148o != null) {
            zzbv.zzfd();
            bal.m17780a(this.f13984c.zzrt, this.f13984c.zzacr.f15360a, this.f13984c.zzacw, this.f13984c.zzacp, false, this.f13984c.zzacw.f14148o.f13413l);
        }
    }

    /* renamed from: h */
    public final void mo12915h() {
        if (this.f13984c.zzacw != null && this.f13984c.zzacw.f14148o != null) {
            zzbv.zzfd();
            bal.m17780a(this.f13984c.zzrt, this.f13984c.zzacr.f15360a, this.f13984c.zzacw, this.f13984c.zzacp, false, this.f13984c.zzacw.f14148o.f13415n);
        }
    }
}
