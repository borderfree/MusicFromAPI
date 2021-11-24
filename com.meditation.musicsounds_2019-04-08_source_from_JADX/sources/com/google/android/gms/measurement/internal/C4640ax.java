package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.C3184g;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3314s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.ax */
public final class C4640ax extends C4759j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4726eb f16762a;

    /* renamed from: b */
    private Boolean f16763b;

    /* renamed from: c */
    private String f16764c;

    public C4640ax(C4726eb ebVar) {
        this(ebVar, null);
    }

    private C4640ax(C4726eb ebVar, String str) {
        C3266s.m14913a(ebVar);
        this.f16762a = ebVar;
        this.f16764c = null;
    }

    /* renamed from: a */
    private final void m23079a(Runnable runnable) {
        C3266s.m14913a(runnable);
        if (!((Boolean) C4756h.f17140ab.mo15821b()).booleanValue() || !this.f16762a.mo15252q().mo15317g()) {
            this.f16762a.mo15252q().mo15314a(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    private final void m23080a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f16763b == null) {
                        if (!"com.google.android.gms".equals(this.f16764c) && !C3314s.m15088a(this.f16762a.mo15249n(), Binder.getCallingUid())) {
                            if (!C3184g.m14674a(this.f16762a.mo15249n()).mo11137a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f16763b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f16763b = Boolean.valueOf(z2);
                    }
                    if (this.f16763b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f16762a.mo15253r().mo15852u_().mo15859a("Measurement Service called with invalid calling package. appId", C4767r.m23924a(str));
                    throw e;
                }
            }
            if (this.f16764c == null && C3183f.uidHasPackageName(this.f16762a.mo15249n(), Binder.getCallingUid(), str)) {
                this.f16764c = str;
            }
            if (!str.equals(this.f16764c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f16762a.mo15253r().mo15852u_().mo15858a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: b */
    private final void m23081b(zzk zzk, boolean z) {
        C3266s.m14913a(zzk);
        m23080a(zzk.f17264a, false);
        this.f16762a.mo15552i().mo15593b(zzk.f17265b, zzk.f17281r);
    }

    /* renamed from: a */
    public final List<zzfv> mo15356a(zzk zzk, boolean z) {
        m23081b(zzk, false);
        try {
            List<C4735ej> list = (List) this.f16762a.mo15252q().mo15313a((Callable<V>) new C4658bo<V>(this, zzk)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4735ej ejVar : list) {
                if (z || !C4736ek.m23542e(ejVar.f17047c)) {
                    arrayList.add(new zzfv(ejVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f16762a.mo15253r().mo15852u_().mo15860a("Failed to get user attributes. appId", C4767r.m23924a(zzk.f17264a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final List<zzo> mo15357a(String str, String str2, zzk zzk) {
        m23081b(zzk, false);
        try {
            return (List) this.f16762a.mo15252q().mo15313a((Callable<V>) new C4650bg<V>(this, zzk, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f16762a.mo15253r().mo15852u_().mo15859a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzo> mo15358a(String str, String str2, String str3) {
        m23080a(str, true);
        try {
            return (List) this.f16762a.mo15252q().mo15313a((Callable<V>) new C4651bh<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f16762a.mo15253r().mo15852u_().mo15859a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo15359a(String str, String str2, String str3, boolean z) {
        m23080a(str, true);
        try {
            List<C4735ej> list = (List) this.f16762a.mo15252q().mo15313a((Callable<V>) new C4649bf<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4735ej ejVar : list) {
                if (z || !C4736ek.m23542e(ejVar.f17047c)) {
                    arrayList.add(new zzfv(ejVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f16762a.mo15253r().mo15852u_().mo15860a("Failed to get user attributes. appId", C4767r.m23924a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo15360a(String str, String str2, boolean z, zzk zzk) {
        m23081b(zzk, false);
        try {
            List<C4735ej> list = (List) this.f16762a.mo15252q().mo15313a((Callable<V>) new C4648be<V>(this, zzk, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4735ej ejVar : list) {
                if (z || !C4736ek.m23542e(ejVar.f17047c)) {
                    arrayList.add(new zzfv(ejVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f16762a.mo15253r().mo15852u_().mo15860a("Failed to get user attributes. appId", C4767r.m23924a(zzk.f17264a), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final void mo15361a(long j, String str, String str2, String str3) {
        C4660bq bqVar = new C4660bq(this, str2, str3, str, j);
        m23079a((Runnable) bqVar);
    }

    /* renamed from: a */
    public final void mo15362a(zzag zzag, zzk zzk) {
        C3266s.m14913a(zzag);
        m23081b(zzk, false);
        m23079a((Runnable) new C4653bj(this, zzag, zzk));
    }

    /* renamed from: a */
    public final void mo15363a(zzag zzag, String str, String str2) {
        C3266s.m14913a(zzag);
        C3266s.m14915a(str);
        m23080a(str, true);
        m23079a((Runnable) new C4654bk(this, zzag, str));
    }

    /* renamed from: a */
    public final void mo15364a(zzfv zzfv, zzk zzk) {
        C3266s.m14913a(zzfv);
        m23081b(zzk, false);
        m23079a(zzfv.mo15877a() == null ? new C4656bm(this, zzfv, zzk) : new C4657bn(this, zzfv, zzk));
    }

    /* renamed from: a */
    public final void mo15365a(zzk zzk) {
        m23081b(zzk, false);
        m23079a((Runnable) new C4659bp(this, zzk));
    }

    /* renamed from: a */
    public final void mo15366a(zzo zzo) {
        C3266s.m14913a(zzo);
        C3266s.m14913a(zzo.f17284c);
        m23080a(zzo.f17282a, true);
        zzo zzo2 = new zzo(zzo);
        m23079a(zzo.f17284c.mo15877a() == null ? new C4646bc(this, zzo2) : new C4647bd(this, zzo2));
    }

    /* renamed from: a */
    public final void mo15367a(zzo zzo, zzk zzk) {
        C3266s.m14913a(zzo);
        C3266s.m14913a(zzo.f17284c);
        m23081b(zzk, false);
        zzo zzo2 = new zzo(zzo);
        zzo2.f17282a = zzk.f17264a;
        m23079a(zzo.f17284c.mo15877a() == null ? new C4644ba(this, zzo2, zzk) : new C4645bb(this, zzo2, zzk));
    }

    /* renamed from: a */
    public final byte[] mo15368a(zzag zzag, String str) {
        C3266s.m14915a(str);
        C3266s.m14913a(zzag);
        m23080a(str, true);
        this.f16762a.mo15253r().mo15854w().mo15859a("Log and bundle. event", this.f16762a.mo15551h().mo15841a(zzag.f17252a));
        long c = this.f16762a.mo15248m().mo11328c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f16762a.mo15252q().mo15315b((Callable<V>) new C4655bl<V>(this, zzag, str)).get();
            if (bArr == null) {
                this.f16762a.mo15253r().mo15852u_().mo15859a("Log and bundle returned null. appId", C4767r.m23924a(str));
                bArr = new byte[0];
            }
            this.f16762a.mo15253r().mo15854w().mo15861a("Log and bundle processed. event, size, time_ms", this.f16762a.mo15551h().mo15841a(zzag.f17252a), Integer.valueOf(bArr.length), Long.valueOf((this.f16762a.mo15248m().mo11328c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f16762a.mo15253r().mo15852u_().mo15861a("Failed to log and bundle. appId, event, error", C4767r.m23924a(str), this.f16762a.mo15551h().mo15841a(zzag.f17252a), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final zzag mo15369b(zzag zzag, zzk zzk) {
        boolean z = false;
        if (!(!"_cmp".equals(zzag.f17252a) || zzag.f17253b == null || zzag.f17253b.mo15866a() == 0)) {
            String d = zzag.f17253b.mo15871d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && this.f16762a.mo15539b().mo15754n(zzk.f17264a))) {
                z = true;
            }
        }
        if (!z) {
            return zzag;
        }
        this.f16762a.mo15253r().mo15853v().mo15859a("Event has been filtered ", zzag.toString());
        zzag zzag2 = new zzag("_cmpx", zzag.f17253b, zzag.f17254c, zzag.f17255d);
        return zzag2;
    }

    /* renamed from: b */
    public final void mo15370b(zzk zzk) {
        m23081b(zzk, false);
        m23079a((Runnable) new C4641ay(this, zzk));
    }

    /* renamed from: c */
    public final String mo15371c(zzk zzk) {
        m23081b(zzk, false);
        return this.f16762a.mo15547d(zzk);
    }

    /* renamed from: d */
    public final void mo15372d(zzk zzk) {
        m23080a(zzk.f17264a, false);
        m23079a((Runnable) new C4652bi(this, zzk));
    }
}
