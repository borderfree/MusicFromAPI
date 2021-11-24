package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.dynamic.C3327d;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
public final class bag implements bak {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f13450a;

    /* renamed from: b */
    private final bas f13451b;

    /* renamed from: c */
    private final long f13452c;

    /* renamed from: d */
    private final bac f13453d;

    /* renamed from: e */
    private final bab f13454e;

    /* renamed from: f */
    private zzjj f13455f;

    /* renamed from: g */
    private final zzjn f13456g;

    /* renamed from: h */
    private final Context f13457h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f13458i = new Object();

    /* renamed from: j */
    private final zzang f13459j;

    /* renamed from: k */
    private final boolean f13460k;

    /* renamed from: l */
    private final zzpl f13461l;

    /* renamed from: m */
    private final List<String> f13462m;

    /* renamed from: n */
    private final List<String> f13463n;

    /* renamed from: o */
    private final List<String> f13464o;

    /* renamed from: p */
    private final boolean f13465p;

    /* renamed from: q */
    private final boolean f13466q;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: r */
    public bav f13467r;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: s */
    public int f13468s = -2;

    /* renamed from: t */
    private bbb f13469t;

    public bag(Context context, String str, bas bas, bac bac, bab bab, zzjj zzjj, zzjn zzjn, zzang zzang, boolean z, boolean z2, zzpl zzpl, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        bac bac2 = bac;
        bab bab2 = bab;
        this.f13457h = context;
        this.f13451b = bas;
        this.f13454e = bab2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            str2 = m17761b();
        }
        this.f13450a = str2;
        this.f13453d = bac2;
        long j = bab2.f13421t != -1 ? bab2.f13421t : bac2.f13424b != -1 ? bac2.f13424b : 10000;
        this.f13452c = j;
        this.f13455f = zzjj;
        this.f13456g = zzjn;
        this.f13459j = zzang;
        this.f13460k = z;
        this.f13465p = z2;
        this.f13461l = zzpl;
        this.f13462m = list;
        this.f13463n = list2;
        this.f13464o = list3;
        this.f13466q = z3;
    }

    /* renamed from: a */
    private static bav m17752a(MediationAdapter mediationAdapter) {
        return new bbq(mediationAdapter);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final String m17755a(String str) {
        if (str != null && m17767e() && !m17762b(2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                return jSONObject.toString();
            } catch (JSONException unused) {
                C3643iy.m19178e("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m17756a(baf baf) {
        String a = m17755a(this.f13454e.f13412k);
        try {
            if (this.f13459j.f15362c >= 4100000) {
                if (!this.f13460k) {
                    if (!this.f13454e.mo12657b()) {
                        if (this.f13456g.f15502d) {
                            this.f13467r.mo12690a(C3327d.m15136a(this.f13457h), this.f13455f, a, this.f13454e.f13402a, (bay) baf);
                            return;
                        } else if (!this.f13465p) {
                            this.f13467r.mo12693a(C3327d.m15136a(this.f13457h), this.f13456g, this.f13455f, a, this.f13454e.f13402a, baf);
                            return;
                        } else if (this.f13454e.f13416o != null) {
                            this.f13467r.mo12691a(C3327d.m15136a(this.f13457h), this.f13455f, a, this.f13454e.f13402a, baf, new zzpl(m17760b(this.f13454e.f13420s)), this.f13454e.f13419r);
                            return;
                        } else {
                            this.f13467r.mo12693a(C3327d.m15136a(this.f13457h), this.f13456g, this.f13455f, a, this.f13454e.f13402a, baf);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(this.f13462m);
                if (this.f13463n != null) {
                    for (String str : this.f13463n) {
                        String str2 = ":false";
                        if (this.f13464o != null && this.f13464o.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length());
                        sb.append("custom:");
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
                this.f13467r.mo12691a(C3327d.m15136a(this.f13457h), this.f13455f, a, this.f13454e.f13402a, baf, this.f13461l, arrayList);
            } else if (this.f13456g.f15502d) {
                this.f13467r.mo12688a(C3327d.m15136a(this.f13457h), this.f13455f, a, baf);
            } else {
                this.f13467r.mo12692a(C3327d.m15136a(this.f13457h), this.f13456g, this.f13455f, a, (bay) baf);
            }
        } catch (RemoteException e) {
            C3643iy.m19175c("Could not request ad from mediation adapter.", e);
            mo12674a(5);
        }
    }

    /* renamed from: b */
    private static NativeAdOptions m17760b(String str) {
        Builder builder = new Builder();
        if (str == null) {
            return builder.build();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            builder.setRequestMultipleImages(jSONObject.optBoolean("multiple_images", false));
            builder.setReturnUrlsForImageAssets(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i = 2;
            } else if ("portrait".equals(optString)) {
                i = 1;
            } else if (!"any".equals(optString)) {
                i = -1;
            }
            builder.setImageOrientation(i);
        } catch (JSONException e) {
            C3643iy.m19175c("Exception occurred when creating native ad options", e);
        }
        return builder.build();
    }

    /* renamed from: b */
    private final String m17761b() {
        try {
            if (!TextUtils.isEmpty(this.f13454e.f13406e)) {
                return this.f13451b.mo12683b(this.f13454e.f13406e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException unused) {
            C3643iy.m19178e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final boolean m17762b(int i) {
        try {
            Bundle bundle = this.f13460k ? this.f13467r.mo12707l() : this.f13456g.f15502d ? this.f13467r.mo12706k() : this.f13467r.mo12705j();
            return bundle != null && (bundle.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException unused) {
            C3643iy.m19178e("Could not get adapter info. Returning false");
            return false;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    private final bbb m17764c() {
        if (this.f13468s != 0 || !m17767e()) {
            return null;
        }
        try {
            if (!(!m17762b(4) || this.f13469t == null || this.f13469t.mo12677a() == 0)) {
                return this.f13469t;
            }
        } catch (RemoteException unused) {
            C3643iy.m19178e("Could not get cpm value from MediationResponseMetadata");
        }
        return new bai(m17769f());
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: d */
    public final bav m17765d() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.f13450a);
        C3643iy.m19176d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!this.f13460k && !this.f13454e.mo12657b()) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12736bw)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f13450a)) {
                return m17752a((MediationAdapter) new AdMobAdapter());
            }
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12737bx)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f13450a)) {
                return m17752a((MediationAdapter) new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f13450a)) {
                return new bbq(new zzzv());
            }
        }
        try {
            return this.f13451b.mo12681a(this.f13450a);
        } catch (RemoteException e) {
            String str2 = "Could not instantiate mediation adapter: ";
            String valueOf2 = String.valueOf(this.f13450a);
            C3643iy.m19170a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m17767e() {
        return this.f13453d.f13435m != -1;
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    private final int m17769f() {
        if (this.f13454e.f13412k == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f13454e.f13412k);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f13450a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m17762b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            if (optInt == 0) {
                optInt = jSONObject.optInt("penalized_average_cpm_cents", 0);
            }
            return optInt;
        } catch (JSONException unused) {
            C3643iy.m19178e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* renamed from: a */
    public final baj mo12672a(long j, long j2) {
        baj baj;
        synchronized (this.f13458i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            baf baf = new baf();
            C3653jh.f14275a.post(new bah(this, baf));
            long j3 = this.f13452c;
            while (this.f13468s == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (elapsedRealtime2 - elapsedRealtime);
                long j5 = j2 - (elapsedRealtime2 - j);
                if (j4 <= 0 || j5 <= 0) {
                    C3643iy.m19176d("Timed out waiting for adapter.");
                    this.f13468s = 3;
                } else {
                    try {
                        this.f13458i.wait(Math.min(j4, j5));
                    } catch (InterruptedException unused) {
                        this.f13468s = 5;
                    }
                }
            }
            baj = new baj(this.f13454e, this.f13467r, this.f13450a, baf, this.f13468s, m17764c(), zzbv.zzer().mo11327b() - elapsedRealtime);
        }
        return baj;
    }

    /* renamed from: a */
    public final void mo12673a() {
        synchronized (this.f13458i) {
            try {
                if (this.f13467r != null) {
                    this.f13467r.mo12698c();
                }
            } catch (RemoteException e) {
                C3643iy.m19175c("Could not destroy mediation adapter.", e);
            }
            this.f13468s = -1;
            this.f13458i.notify();
        }
    }

    /* renamed from: a */
    public final void mo12674a(int i) {
        synchronized (this.f13458i) {
            this.f13468s = i;
            this.f13458i.notify();
        }
    }

    /* renamed from: a */
    public final void mo12675a(int i, bbb bbb) {
        synchronized (this.f13458i) {
            this.f13468s = 0;
            this.f13469t = bbb;
            this.f13458i.notify();
        }
    }
}
