package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.p009v4.p019g.C0510m;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.ank;
import com.google.android.gms.internal.ads.ano;
import com.google.android.gms.internal.ads.aok;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.aty;
import com.google.android.gms.internal.ads.aub;
import com.google.android.gms.internal.ads.auf;
import com.google.android.gms.internal.ads.aui;
import com.google.android.gms.internal.ads.aul;
import com.google.android.gms.internal.ads.auo;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzah extends ano {

    /* renamed from: a */
    private final Context f10137a;

    /* renamed from: b */
    private final ank f10138b;

    /* renamed from: c */
    private final bas f10139c;

    /* renamed from: d */
    private final aty f10140d;

    /* renamed from: e */
    private final auo f10141e;

    /* renamed from: f */
    private final aub f10142f;

    /* renamed from: g */
    private final aul f10143g;

    /* renamed from: h */
    private final zzjn f10144h;

    /* renamed from: i */
    private final PublisherAdViewOptions f10145i;

    /* renamed from: j */
    private final C0510m<String, aui> f10146j;

    /* renamed from: k */
    private final C0510m<String, auf> f10147k;

    /* renamed from: l */
    private final zzpl f10148l;

    /* renamed from: m */
    private final List<String> f10149m;

    /* renamed from: n */
    private final aok f10150n;

    /* renamed from: o */
    private final String f10151o;

    /* renamed from: p */
    private final zzang f10152p;

    /* renamed from: q */
    private WeakReference<zzd> f10153q;

    /* renamed from: r */
    private final zzw f10154r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Object f10155s = new Object();

    zzah(Context context, String str, bas bas, zzang zzang, ank ank, aty aty, auo auo, aub aub, C0510m<String, aui> mVar, C0510m<String, auf> mVar2, zzpl zzpl, aok aok, zzw zzw, aul aul, zzjn zzjn, PublisherAdViewOptions publisherAdViewOptions) {
        this.f10137a = context;
        this.f10151o = str;
        this.f10139c = bas;
        this.f10152p = zzang;
        this.f10138b = ank;
        this.f10142f = aub;
        this.f10140d = aty;
        this.f10141e = auo;
        this.f10146j = mVar;
        this.f10147k = mVar2;
        this.f10148l = zzpl;
        this.f10149m = m13628c();
        this.f10150n = aok;
        this.f10154r = zzw;
        this.f10143g = aul;
        this.f10144h = zzjn;
        this.f10145i = publisherAdViewOptions;
        aqm.m16920a(this.f10137a);
    }

    /* renamed from: a */
    private final void m13619a(int i) {
        if (this.f10138b != null) {
            try {
                this.f10138b.mo12091a(0);
            } catch (RemoteException e) {
                C3643iy.m19175c("Failed calling onAdFailedToLoad.", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13622a(zzjj zzjj) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12778cl)).booleanValue() || this.f10141e == null) {
            zzq zzq = new zzq(this.f10137a, this.f10154r, this.f10144h, this.f10151o, this.f10139c, this.f10152p);
            this.f10153q = new WeakReference<>(zzq);
            aul aul = this.f10143g;
            C3266s.m14922b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
            zzq.f10120e.f10270q = aul;
            if (this.f10145i != null) {
                if (this.f10145i.zzbg() != null) {
                    zzq.zza(this.f10145i.zzbg());
                }
                zzq.setManualImpressionsEnabled(this.f10145i.getManualImpressionsEnabled());
            }
            aty aty = this.f10140d;
            C3266s.m14922b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            zzq.f10120e.f10262i = aty;
            auo auo = this.f10141e;
            C3266s.m14922b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            zzq.f10120e.f10264k = auo;
            aub aub = this.f10142f;
            C3266s.m14922b("setOnContentAdLoadedListener must be called on the main UI thread.");
            zzq.f10120e.f10263j = aub;
            C0510m<String, aui> mVar = this.f10146j;
            C3266s.m14922b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            zzq.f10120e.f10266m = mVar;
            C0510m<String, auf> mVar2 = this.f10147k;
            C3266s.m14922b("setOnCustomClickListener must be called on the main UI thread.");
            zzq.f10120e.f10265l = mVar2;
            zzpl zzpl = this.f10148l;
            C3266s.m14922b("setNativeAdOptions must be called on the main UI thread.");
            zzq.f10120e.f10267n = zzpl;
            zzq.zzd(m13628c());
            zzq.zza(this.f10138b);
            zzq.zza(this.f10150n);
            ArrayList arrayList = new ArrayList();
            if (m13626b()) {
                arrayList.add(Integer.valueOf(1));
            }
            if (this.f10143g != null) {
                arrayList.add(Integer.valueOf(2));
            }
            zzq.zze(arrayList);
            if (m13626b()) {
                zzjj.f15483c.putBoolean("ina", true);
            }
            if (this.f10143g != null) {
                zzjj.f15483c.putBoolean("iba", true);
            }
            zzq.zzb(zzjj);
            return;
        }
        m13619a(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13623a(zzjj zzjj, int i) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12778cl)).booleanValue() || this.f10141e == null) {
            zzbc zzbc = new zzbc(this.f10137a, this.f10154r, zzjn.m20760a(this.f10137a), this.f10151o, this.f10139c, this.f10152p);
            this.f10153q = new WeakReference<>(zzbc);
            aty aty = this.f10140d;
            C3266s.m14922b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            zzbc.f10120e.f10262i = aty;
            auo auo = this.f10141e;
            C3266s.m14922b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            zzbc.f10120e.f10264k = auo;
            aub aub = this.f10142f;
            C3266s.m14922b("setOnContentAdLoadedListener must be called on the main UI thread.");
            zzbc.f10120e.f10263j = aub;
            C0510m<String, aui> mVar = this.f10146j;
            C3266s.m14922b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            zzbc.f10120e.f10266m = mVar;
            zzbc.zza(this.f10138b);
            C0510m<String, auf> mVar2 = this.f10147k;
            C3266s.m14922b("setOnCustomClickListener must be called on the main UI thread.");
            zzbc.f10120e.f10265l = mVar2;
            zzbc.zzd(m13628c());
            zzpl zzpl = this.f10148l;
            C3266s.m14922b("setNativeAdOptions must be called on the main UI thread.");
            zzbc.f10120e.f10267n = zzpl;
            zzbc.zza(this.f10150n);
            zzbc.zzj(i);
            zzbc.zzb(zzjj);
            return;
        }
        m13619a(0);
    }

    /* renamed from: a */
    private static void m13624a(Runnable runnable) {
        C3653jh.f14275a.post(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m13625a() {
        return ((Boolean) ane.m16650f().mo12297a(aqm.f12647aM)).booleanValue() && this.f10143g != null;
    }

    /* renamed from: b */
    private final boolean m13626b() {
        return (this.f10140d == null && this.f10142f == null && this.f10141e == null && (this.f10146j == null || this.f10146j.size() <= 0)) ? false : true;
    }

    /* renamed from: c */
    private final List<String> m13628c() {
        ArrayList arrayList = new ArrayList();
        if (this.f10142f != null) {
            arrayList.add("1");
        }
        if (this.f10140d != null) {
            arrayList.add("2");
        }
        if (this.f10141e != null) {
            arrayList.add("6");
        }
        if (this.f10146j.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMediationAdapterClassName() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10155s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzd> r1 = r3.f10153q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzd> r1 = r3.f10153q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.zzd r1 = (com.google.android.gms.ads.internal.zzd) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.getMediationAdapterClassName()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.getMediationAdapterClassName():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isLoading() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10155s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzd> r1 = r3.f10153q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzd> r1 = r3.f10153q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.zzd r1 = (com.google.android.gms.ads.internal.zzd) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r2 = r1.isLoading()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.isLoading():boolean");
    }

    public final void zza(zzjj zzjj, int i) {
        if (i > 0) {
            m13624a((Runnable) new C2877e(this, zzjj, i));
            return;
        }
        throw new IllegalArgumentException("Number of ads has to be more than 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzck() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10155s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzd> r1 = r3.f10153q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzd> r1 = r3.f10153q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.zzd r1 = (com.google.android.gms.ads.internal.zzd) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.zzck()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.zzck():java.lang.String");
    }

    public final void zzd(zzjj zzjj) {
        m13624a((Runnable) new C2876d(this, zzjj));
    }
}
