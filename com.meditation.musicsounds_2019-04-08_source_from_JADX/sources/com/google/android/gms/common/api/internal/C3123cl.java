package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3023c;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.p128c.C4164e;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4781e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.cl */
final class C3123cl implements C3088bg {

    /* renamed from: a */
    private final Context f10795a;

    /* renamed from: b */
    private final C3063aj f10796b;

    /* renamed from: c */
    private final Looper f10797c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3072as f10798d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3072as f10799e;

    /* renamed from: f */
    private final Map<C3023c<?>, C3072as> f10800f;

    /* renamed from: g */
    private final Set<C3148k> f10801g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final C3031f f10802h;

    /* renamed from: i */
    private Bundle f10803i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ConnectionResult f10804j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ConnectionResult f10805k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f10806l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Lock f10807m;
    @GuardedBy("mLock")

    /* renamed from: n */
    private int f10808n = 0;

    private C3123cl(Context context, C3063aj ajVar, Lock lock, Looper looper, C3182e eVar, Map<C3023c<?>, C3031f> map, Map<C3023c<?>, C3031f> map2, C3240e eVar2, C3021a<? extends C4781e, C4776a> aVar, C3031f fVar, ArrayList<C3121cj> arrayList, ArrayList<C3121cj> arrayList2, Map<C3020a<?>, Boolean> map3, Map<C3020a<?>, Boolean> map4) {
        this.f10795a = context;
        this.f10796b = ajVar;
        this.f10807m = lock;
        this.f10797c = looper;
        this.f10802h = fVar;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C3182e eVar3 = eVar;
        C3072as asVar = r3;
        C3072as asVar2 = new C3072as(context2, this.f10796b, lock2, looper2, eVar3, map2, null, map4, null, arrayList2, new C3125cn(this, null));
        this.f10798d = asVar;
        C3072as asVar3 = new C3072as(context2, this.f10796b, lock2, looper2, eVar3, map, eVar2, map3, aVar, arrayList, new C3126co(this, null));
        this.f10799e = asVar3;
        C0488a aVar2 = new C0488a();
        for (C3023c put : map2.keySet()) {
            aVar2.put(put, this.f10798d);
        }
        for (C3023c put2 : map.keySet()) {
            aVar2.put(put2, this.f10799e);
        }
        this.f10800f = Collections.unmodifiableMap(aVar2);
    }

    /* renamed from: a */
    public static C3123cl m14337a(Context context, C3063aj ajVar, Lock lock, Looper looper, C3182e eVar, Map<C3023c<?>, C3031f> map, C3240e eVar2, Map<C3020a<?>, Boolean> map2, C3021a<? extends C4781e, C4776a> aVar, ArrayList<C3121cj> arrayList) {
        Map<C3020a<?>, Boolean> map3 = map2;
        C0488a aVar2 = new C0488a();
        C0488a aVar3 = new C0488a();
        C3031f fVar = null;
        for (Entry entry : map.entrySet()) {
            C3031f fVar2 = (C3031f) entry.getValue();
            if (fVar2.mo10735c()) {
                fVar = fVar2;
            }
            if (fVar2.mo10818j()) {
                aVar2.put((C3023c) entry.getKey(), fVar2);
            } else {
                aVar3.put((C3023c) entry.getKey(), fVar2);
            }
        }
        C3266s.m14920a(!aVar2.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C0488a aVar4 = new C0488a();
        C0488a aVar5 = new C0488a();
        for (C3020a aVar6 : map2.keySet()) {
            C3023c c = aVar6.mo10806c();
            if (aVar2.containsKey(c)) {
                aVar4.put(aVar6, (Boolean) map3.get(aVar6));
            } else if (aVar3.containsKey(c)) {
                aVar5.put(aVar6, (Boolean) map3.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            C3121cj cjVar = (C3121cj) obj;
            if (aVar4.containsKey(cjVar.f10792a)) {
                arrayList2.add(cjVar);
            } else if (aVar5.containsKey(cjVar.f10792a)) {
                arrayList3.add(cjVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        C3123cl clVar = new C3123cl(context, ajVar, lock, looper, eVar, aVar2, aVar3, eVar2, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
        return clVar;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m14339a(int i, boolean z) {
        this.f10796b.mo10904a(i, z);
        this.f10805k = null;
        this.f10804j = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14340a(Bundle bundle) {
        if (this.f10803i == null) {
            this.f10803i = bundle;
            return;
        }
        if (bundle != null) {
            this.f10803i.putAll(bundle);
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final void m14341a(ConnectionResult connectionResult) {
        switch (this.f10808n) {
            case 1:
                break;
            case 2:
                this.f10796b.mo10906a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m14354g();
        this.f10808n = 0;
    }

    /* renamed from: b */
    private static boolean m14347b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo10759b();
    }

    /* renamed from: b */
    private final boolean m14348b(C3109a<? extends C3049h, ? extends C3022b> aVar) {
        C3023c d = aVar.mo10983d();
        C3266s.m14924b(this.f10800f.containsKey(d), "GoogleApiClient is not configured to use the API required for this call.");
        return ((C3072as) this.f10800f.get(d)).equals(this.f10799e);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: e */
    public final void m14352e() {
        if (m14347b(this.f10804j)) {
            if (m14347b(this.f10805k) || m14355j()) {
                switch (this.f10808n) {
                    case 1:
                        break;
                    case 2:
                        this.f10796b.mo10905a(this.f10803i);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
                m14354g();
                this.f10808n = 0;
            } else if (this.f10805k != null) {
                if (this.f10808n == 1) {
                    m14354g();
                    return;
                }
                m14341a(this.f10805k);
                this.f10798d.mo10927c();
            }
        } else if (this.f10804j != null && m14347b(this.f10805k)) {
            this.f10799e.mo10927c();
            m14341a(this.f10804j);
        } else if (!(this.f10804j == null || this.f10805k == null)) {
            ConnectionResult connectionResult = this.f10804j;
            if (this.f10799e.f10691c < this.f10798d.f10691c) {
                connectionResult = this.f10805k;
            }
            m14341a(connectionResult);
        }
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    private final void m14354g() {
        for (C3148k y : this.f10801g) {
            y.mo10732y();
        }
        this.f10801g.clear();
    }

    @GuardedBy("mLock")
    /* renamed from: j */
    private final boolean m14355j() {
        return this.f10805k != null && this.f10805k.mo10760c() == 4;
    }

    /* renamed from: k */
    private final PendingIntent m14356k() {
        if (this.f10802h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f10795a, System.identityHashCode(this.f10796b), this.f10802h.mo10736d(), 134217728);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10918a(T t) {
        if (!m14348b((C3109a<? extends C3049h, ? extends C3022b>) t)) {
            return this.f10798d.mo10918a(t);
        }
        if (!m14355j()) {
            return this.f10799e.mo10918a(t);
        }
        t.mo10981b(new Status(4, null, m14356k()));
        return t;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10919a() {
        this.f10808n = 2;
        this.f10806l = false;
        this.f10805k = null;
        this.f10804j = null;
        this.f10798d.mo10919a();
        this.f10799e.mo10919a();
    }

    /* renamed from: a */
    public final void mo10924a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f10799e.mo10924a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f10798d.mo10924a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public final boolean mo10925a(C3148k kVar) {
        this.f10807m.lock();
        try {
            if ((mo11003d() || mo10930f()) && !this.f10799e.mo10930f()) {
                this.f10801g.add(kVar);
                if (this.f10808n == 0) {
                    this.f10808n = 1;
                }
                this.f10805k = null;
                this.f10799e.mo10919a();
                return true;
            }
            this.f10807m.unlock();
            return false;
        } finally {
            this.f10807m.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final ConnectionResult mo10926b() {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo10927c() {
        this.f10805k = null;
        this.f10804j = null;
        this.f10808n = 0;
        this.f10798d.mo10927c();
        this.f10799e.mo10927c();
        m14354g();
    }

    /* renamed from: d */
    public final boolean mo11003d() {
        this.f10807m.lock();
        try {
            return this.f10808n == 2;
        } finally {
            this.f10807m.unlock();
        }
    }

    /* renamed from: f */
    public final boolean mo10930f() {
        this.f10807m.lock();
        try {
            boolean z = true;
            if (!this.f10798d.mo10930f() || (!this.f10799e.mo10930f() && !m14355j() && this.f10808n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f10807m.unlock();
        }
    }

    /* renamed from: h */
    public final void mo10932h() {
        this.f10807m.lock();
        try {
            boolean d = mo11003d();
            this.f10799e.mo10927c();
            this.f10805k = new ConnectionResult(4);
            if (d) {
                new C4164e(this.f10797c).post(new C3124cm(this));
            } else {
                m14354g();
            }
        } finally {
            this.f10807m.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    public final void mo10933i() {
        this.f10798d.mo10933i();
        this.f10799e.mo10933i();
    }
}
