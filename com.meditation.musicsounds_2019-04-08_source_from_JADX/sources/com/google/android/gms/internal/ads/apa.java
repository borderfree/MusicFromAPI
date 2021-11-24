package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class apa {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet<String> f12526a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f12527b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f12528c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet<String> f12529d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f12530e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet<String> f12531f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f12532g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f12533h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f12534i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Location f12535j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f12536k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f12537l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f12538m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f12539n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f12540o;

    /* renamed from: a */
    public final void mo12170a(int i) {
        this.f12534i = i;
    }

    /* renamed from: a */
    public final void mo12171a(Location location) {
        this.f12535j = location;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo12172a(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            mo12173a(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f12528c.put(networkExtras.getClass(), networkExtras);
        }
    }

    /* renamed from: a */
    public final void mo12173a(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.f12527b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: a */
    public final void mo12174a(String str) {
        this.f12526a.add(str);
    }

    /* renamed from: a */
    public final void mo12175a(String str, String str2) {
        this.f12530e.putString(str, str2);
    }

    /* renamed from: a */
    public final void mo12176a(Date date) {
        this.f12532g = date;
    }

    /* renamed from: a */
    public final void mo12177a(boolean z) {
        this.f12536k = z;
    }

    /* renamed from: b */
    public final void mo12178b(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f12527b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f12527b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f12527b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    /* renamed from: b */
    public final void mo12179b(String str) {
        this.f12529d.add(str);
    }

    /* renamed from: b */
    public final void mo12180b(boolean z) {
        this.f12539n = z ? 1 : 0;
    }

    /* renamed from: c */
    public final void mo12181c(String str) {
        this.f12529d.remove(str);
    }

    /* renamed from: c */
    public final void mo12182c(boolean z) {
        this.f12540o = z;
    }

    /* renamed from: d */
    public final void mo12183d(String str) {
        this.f12533h = str;
    }

    /* renamed from: e */
    public final void mo12184e(String str) {
        this.f12537l = str;
    }

    /* renamed from: f */
    public final void mo12185f(String str) {
        this.f12538m = str;
    }

    /* renamed from: g */
    public final void mo12186g(String str) {
        this.f12531f.add(str);
    }
}
