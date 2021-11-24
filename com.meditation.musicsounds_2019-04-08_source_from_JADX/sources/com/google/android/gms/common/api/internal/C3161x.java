package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3023c;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3240e.C3242b;
import com.google.android.gms.common.internal.C3252m;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4781e;
import com.google.android.gms.signin.internal.zaj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.x */
public final class C3161x implements C3071ar {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3072as f10918a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f10919b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f10920c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3182e f10921d;

    /* renamed from: e */
    private ConnectionResult f10922e;

    /* renamed from: f */
    private int f10923f;

    /* renamed from: g */
    private int f10924g = 0;

    /* renamed from: h */
    private int f10925h;

    /* renamed from: i */
    private final Bundle f10926i = new Bundle();

    /* renamed from: j */
    private final Set<C3023c> f10927j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C4781e f10928k;

    /* renamed from: l */
    private boolean f10929l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f10930m;

    /* renamed from: n */
    private boolean f10931n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3252m f10932o;

    /* renamed from: p */
    private boolean f10933p;

    /* renamed from: q */
    private boolean f10934q;

    /* renamed from: r */
    private final C3240e f10935r;

    /* renamed from: s */
    private final Map<C3020a<?>, Boolean> f10936s;

    /* renamed from: t */
    private final C3021a<? extends C4781e, C4776a> f10937t;

    /* renamed from: u */
    private ArrayList<Future<?>> f10938u = new ArrayList<>();

    public C3161x(C3072as asVar, C3240e eVar, Map<C3020a<?>, Boolean> map, C3182e eVar2, C3021a<? extends C4781e, C4776a> aVar, Lock lock, Context context) {
        this.f10918a = asVar;
        this.f10935r = eVar;
        this.f10936s = map;
        this.f10921d = eVar2;
        this.f10937t = aVar;
        this.f10919b = lock;
        this.f10920c = context;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m14576a(zaj zaj) {
        if (m14583b(0)) {
            ConnectionResult a = zaj.mo15908a();
            if (a.mo10759b()) {
                ResolveAccountResponse b = zaj.mo15909b();
                ConnectionResult b2 = b.mo11149b();
                if (!b2.mo10759b()) {
                    String valueOf = String.valueOf(b2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    m14581b(b2);
                    return;
                }
                this.f10931n = true;
                this.f10932o = b.mo11148a();
                this.f10933p = b.mo11150c();
                this.f10934q = b.mo11151d();
                m14589e();
            } else if (m14578a(a)) {
                m14594g();
                m14589e();
            } else {
                m14581b(a);
            }
        }
    }

    /* renamed from: a */
    private final void m14577a(boolean z) {
        if (this.f10928k != null) {
            if (this.f10928k.mo10816h() && z) {
                this.f10928k.mo15892e();
            }
            this.f10928k.mo10815g();
            this.f10932o = null;
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final boolean m14578a(ConnectionResult connectionResult) {
        return this.f10929l && !connectionResult.mo10758a();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final void m14581b(ConnectionResult connectionResult) {
        m14596h();
        m14577a(!connectionResult.mo10758a());
        this.f10918a.mo10920a(connectionResult);
        this.f10918a.f10693e.mo10906a(connectionResult);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((r5.mo10758a() || r4.f10921d.mo11133c(r5.mo10760c()) != null) != false) goto L_0x0024;
     */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m14582b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C3020a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.mo10804a()
            int r0 = r0.mo10810a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.mo10758a()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.e r7 = r4.f10921d
            int r3 = r5.mo10760c()
            android.content.Intent r7 = r7.mo11133c(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.f10922e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f10923f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f10922e = r5
            r4.f10923f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.as r7 = r4.f10918a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f10690b
            com.google.android.gms.common.api.a$c r6 = r6.mo10806c()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3161x.m14582b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final boolean m14583b(int i) {
        if (this.f10924g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f10918a.f10692d.mo10909n());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i2 = this.f10925h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String c = m14585c(this.f10924g);
        String c2 = m14585c(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(c2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c);
        sb3.append(" but received callback for step ");
        sb3.append(c2);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        m14581b(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: c */
    private static String m14585c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: d */
    public final boolean m14588d() {
        ConnectionResult connectionResult;
        this.f10925h--;
        if (this.f10925h > 0) {
            return false;
        }
        if (this.f10925h < 0) {
            Log.w("GoogleApiClientConnecting", this.f10918a.f10692d.mo10909n());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, null);
        } else if (this.f10922e == null) {
            return true;
        } else {
            this.f10918a.f10691c = this.f10923f;
            connectionResult = this.f10922e;
        }
        m14581b(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: e */
    public final void m14589e() {
        if (this.f10925h == 0) {
            if (!this.f10930m || this.f10931n) {
                ArrayList arrayList = new ArrayList();
                this.f10924g = 1;
                this.f10925h = this.f10918a.f10689a.size();
                for (C3023c cVar : this.f10918a.f10689a.keySet()) {
                    if (!this.f10918a.f10690b.containsKey(cVar)) {
                        arrayList.add((C3031f) this.f10918a.f10689a.get(cVar));
                    } else if (m14588d()) {
                        m14592f();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f10938u.add(C3075av.m14203a().submit(new C3057ad(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    private final void m14592f() {
        this.f10918a.mo10929e();
        C3075av.m14203a().execute(new C3162y(this));
        if (this.f10928k != null) {
            if (this.f10933p) {
                this.f10928k.mo15890a(this.f10932o, this.f10934q);
            }
            m14577a(false);
        }
        for (C3023c cVar : this.f10918a.f10690b.keySet()) {
            ((C3031f) this.f10918a.f10689a.get(cVar)).mo10815g();
        }
        this.f10918a.f10693e.mo10905a(this.f10926i.isEmpty() ? null : this.f10926i);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: g */
    public final void m14594g() {
        this.f10930m = false;
        this.f10918a.f10692d.f10654c = Collections.emptySet();
        for (C3023c cVar : this.f10927j) {
            if (!this.f10918a.f10690b.containsKey(cVar)) {
                this.f10918a.f10690b.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: h */
    private final void m14596h() {
        ArrayList arrayList = this.f10938u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f10938u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final Set<Scope> m14597i() {
        if (this.f10935r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f10935r.mo11247d());
        Map f = this.f10935r.mo11249f();
        for (C3020a aVar : f.keySet()) {
            if (!this.f10918a.f10690b.containsKey(aVar.mo10806c())) {
                hashSet.addAll(((C3242b) f.get(aVar)).f11088a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10897a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo10898a() {
        this.f10918a.f10690b.clear();
        this.f10930m = false;
        this.f10922e = null;
        this.f10924g = 0;
        this.f10929l = true;
        this.f10931n = false;
        this.f10933p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C3020a aVar : this.f10936s.keySet()) {
            C3031f fVar = (C3031f) this.f10918a.f10689a.get(aVar.mo10806c());
            z |= aVar.mo10804a().mo10810a() == 1;
            boolean booleanValue = ((Boolean) this.f10936s.get(aVar)).booleanValue();
            if (fVar.mo10818j()) {
                this.f10930m = true;
                if (booleanValue) {
                    this.f10927j.add(aVar.mo10806c());
                } else {
                    this.f10929l = false;
                }
            }
            hashMap.put(fVar, new C3163z(this, aVar, booleanValue));
        }
        if (z) {
            this.f10930m = false;
        }
        if (this.f10930m) {
            this.f10935r.mo11244a(Integer.valueOf(System.identityHashCode(this.f10918a.f10692d)));
            C3060ag agVar = new C3060ag(this, null);
            this.f10928k = (C4781e) this.f10937t.mo10666a(this.f10920c, this.f10918a.f10692d.mo10848c(), this.f10935r, this.f10935r.mo11252i(), agVar, agVar);
        }
        this.f10925h = this.f10918a.f10689a.size();
        this.f10938u.add(C3075av.m14203a().submit(new C3054aa(this, hashMap)));
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10899a(int i) {
        m14581b(new ConnectionResult(8, null));
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10900a(Bundle bundle) {
        if (m14583b(1)) {
            if (bundle != null) {
                this.f10926i.putAll(bundle);
            }
            if (m14588d()) {
                m14592f();
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10901a(ConnectionResult connectionResult, C3020a<?> aVar, boolean z) {
        if (m14583b(1)) {
            m14582b(connectionResult, aVar, z);
            if (m14588d()) {
                m14592f();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo10902b() {
        m14596h();
        m14577a(true);
        this.f10918a.mo10920a((ConnectionResult) null);
        return true;
    }

    /* renamed from: c */
    public final void mo10903c() {
    }
}
