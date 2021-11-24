package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p009v4.p019g.C0488a;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3023c;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3037c;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3240e.C3242b;
import com.google.android.gms.common.util.p125a.C3293a;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4781e;
import com.google.android.gms.tasks.C4793c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.cq */
public final class C3128cq implements C3088bg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C3023c<?>, C3127cp<?>> f10816a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C3023c<?>, C3127cp<?>> f10817b = new HashMap();

    /* renamed from: c */
    private final Map<C3020a<?>, Boolean> f10818c;

    /* renamed from: d */
    private final C3135d f10819d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3063aj f10820e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f10821f;

    /* renamed from: g */
    private final Looper f10822g;

    /* renamed from: h */
    private final C3182e f10823h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Condition f10824i;

    /* renamed from: j */
    private final C3240e f10825j;

    /* renamed from: k */
    private final boolean f10826k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f10827l;

    /* renamed from: m */
    private final Queue<C3109a<?, ?>> f10828m = new LinkedList();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: n */
    public boolean f10829n;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: o */
    public Map<C3112cb<?>, ConnectionResult> f10830o;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: p */
    public Map<C3112cb<?>, ConnectionResult> f10831p;
    @GuardedBy("mLock")

    /* renamed from: q */
    private C3152o f10832q;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: r */
    public ConnectionResult f10833r;

    public C3128cq(Context context, Lock lock, Looper looper, C3182e eVar, Map<C3023c<?>, C3031f> map, C3240e eVar2, Map<C3020a<?>, Boolean> map2, C3021a<? extends C4781e, C4776a> aVar, ArrayList<C3121cj> arrayList, C3063aj ajVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f10821f = lock;
        this.f10822g = looper;
        this.f10824i = lock.newCondition();
        this.f10823h = eVar;
        this.f10820e = ajVar;
        this.f10818c = map2;
        this.f10825j = eVar2;
        this.f10826k = z;
        HashMap hashMap = new HashMap();
        for (C3020a aVar2 : map2.keySet()) {
            hashMap.put(aVar2.mo10806c(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C3121cj cjVar = (C3121cj) obj;
            hashMap2.put(cjVar.f10792a, cjVar);
        }
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        for (Entry entry : map.entrySet()) {
            C3020a aVar3 = (C3020a) hashMap.get(entry.getKey());
            C3031f fVar = (C3031f) entry.getValue();
            if (fVar.mo10819k()) {
                if (!((Boolean) this.f10818c.get(aVar3)).booleanValue()) {
                    z3 = z7;
                    z4 = true;
                } else {
                    z3 = z7;
                    z4 = z8;
                }
                z2 = true;
            } else {
                z2 = z6;
                z4 = z8;
                z3 = false;
            }
            C3127cp cpVar = r1;
            C3127cp cpVar2 = new C3127cp(context, aVar3, looper, fVar, (C3121cj) hashMap2.get(aVar3), eVar2, aVar);
            this.f10816a.put((C3023c) entry.getKey(), cpVar);
            if (fVar.mo10818j()) {
                this.f10817b.put((C3023c) entry.getKey(), cpVar);
            }
            z8 = z4;
            z7 = z3;
            z6 = z2;
        }
        if (!z6 || z7 || z8) {
            z5 = false;
        }
        this.f10827l = z5;
        this.f10819d = C3135d.m14434a();
    }

    /* renamed from: a */
    private final ConnectionResult m14376a(C3023c<?> cVar) {
        this.f10821f.lock();
        try {
            C3127cp cpVar = (C3127cp) this.f10816a.get(cVar);
            if (this.f10830o != null && cpVar != null) {
                return (ConnectionResult) this.f10830o.get(cpVar.mo10831b());
            }
            this.f10821f.unlock();
            return null;
        } finally {
            this.f10821f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m14380a(C3127cp<?> cpVar, ConnectionResult connectionResult) {
        return !connectionResult.mo10759b() && !connectionResult.mo10758a() && ((Boolean) this.f10818c.get(cpVar.mo10828a())).booleanValue() && cpVar.mo11005h().mo10819k() && this.f10823h.mo11114a(connectionResult.mo10760c());
    }

    /* renamed from: b */
    private final <T extends C3109a<? extends C3049h, ? extends C3022b>> boolean m14384b(T t) {
        C3023c d = t.mo10983d();
        ConnectionResult a = m14376a(d);
        if (a == null || a.mo10760c() != 4) {
            return false;
        }
        t.mo10981b(new Status(4, null, this.f10819d.mo11022a(((C3127cp) this.f10816a.get(d)).mo10831b(), System.identityHashCode(this.f10820e))));
        return true;
    }

    /* renamed from: e */
    private final boolean m14388e() {
        this.f10821f.lock();
        try {
            if (this.f10829n) {
                if (this.f10826k) {
                    for (C3023c a : this.f10817b.keySet()) {
                        ConnectionResult a2 = m14376a(a);
                        if (a2 != null) {
                            if (!a2.mo10759b()) {
                            }
                        }
                    }
                    this.f10821f.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f10821f.unlock();
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: g */
    public final void m14392g() {
        if (this.f10825j == null) {
            this.f10820e.f10654c = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f10825j.mo11247d());
        Map f = this.f10825j.mo11249f();
        for (C3020a aVar : f.keySet()) {
            ConnectionResult a = mo11006a(aVar);
            if (a != null && a.mo10759b()) {
                hashSet.addAll(((C3242b) f.get(aVar)).f11088a);
            }
        }
        this.f10820e.f10654c = hashSet;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: j */
    public final void m14395j() {
        while (!this.f10828m.isEmpty()) {
            mo10918a((T) (C3109a) this.f10828m.remove());
        }
        this.f10820e.mo10905a((Bundle) null);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: k */
    public final ConnectionResult m14397k() {
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i = 0;
        int i2 = 0;
        for (C3127cp cpVar : this.f10816a.values()) {
            C3020a a = cpVar.mo10828a();
            ConnectionResult connectionResult3 = (ConnectionResult) this.f10830o.get(cpVar.mo10831b());
            if (!connectionResult3.mo10759b() && (!((Boolean) this.f10818c.get(a)).booleanValue() || connectionResult3.mo10758a() || this.f10823h.mo11114a(connectionResult3.mo10760c()))) {
                if (connectionResult3.mo10760c() != 4 || !this.f10826k) {
                    int a2 = a.mo10804a().mo10810a();
                    if (connectionResult == null || i > a2) {
                        connectionResult = connectionResult3;
                        i = a2;
                    }
                } else {
                    int a3 = a.mo10804a().mo10810a();
                    if (connectionResult2 == null || i2 > a3) {
                        connectionResult2 = connectionResult3;
                        i2 = a3;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    /* renamed from: a */
    public final ConnectionResult mo11006a(C3020a<?> aVar) {
        return m14376a(aVar.mo10806c());
    }

    /* renamed from: a */
    public final <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10918a(T t) {
        C3023c d = t.mo10983d();
        if (this.f10826k && m14384b(t)) {
            return t;
        }
        this.f10820e.f10656e.mo10974a(t);
        return ((C3127cp) this.f10816a.get(d)).mo10830a(t);
    }

    /* renamed from: a */
    public final void mo10919a() {
        this.f10821f.lock();
        try {
            if (!this.f10829n) {
                this.f10829n = true;
                this.f10830o = null;
                this.f10831p = null;
                this.f10832q = null;
                this.f10833r = null;
                this.f10819d.mo11031d();
                this.f10819d.mo11023a((Iterable<? extends C3037c<?>>) this.f10816a.values()).mo15919a((Executor) new C3293a(this.f10822g), (C4793c<TResult>) new C3130cs<TResult>(this));
            }
        } finally {
            this.f10821f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10924a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo10925a(C3148k kVar) {
        this.f10821f.lock();
        try {
            if (!this.f10829n || m14388e()) {
                this.f10821f.unlock();
                return false;
            }
            this.f10819d.mo11031d();
            this.f10832q = new C3152o(this, kVar);
            this.f10819d.mo11023a((Iterable<? extends C3037c<?>>) this.f10817b.values()).mo15919a((Executor) new C3293a(this.f10822g), (C4793c<TResult>) this.f10832q);
            this.f10821f.unlock();
            return true;
        } catch (Throwable th) {
            this.f10821f.unlock();
            throw th;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final ConnectionResult mo10926b() {
        mo10919a();
        while (mo11007d()) {
            try {
                this.f10824i.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return mo10930f() ? ConnectionResult.f10553a : this.f10833r != null ? this.f10833r : new ConnectionResult(13, null);
    }

    /* renamed from: c */
    public final void mo10927c() {
        this.f10821f.lock();
        try {
            this.f10829n = false;
            this.f10830o = null;
            this.f10831p = null;
            if (this.f10832q != null) {
                this.f10832q.mo11074a();
                this.f10832q = null;
            }
            this.f10833r = null;
            while (!this.f10828m.isEmpty()) {
                C3109a aVar = (C3109a) this.f10828m.remove();
                aVar.mo10875a((C3105bx) null);
                aVar.mo10867a();
            }
            this.f10824i.signalAll();
        } finally {
            this.f10821f.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo11007d() {
        this.f10821f.lock();
        try {
            return this.f10830o == null && this.f10829n;
        } finally {
            this.f10821f.unlock();
        }
    }

    /* renamed from: f */
    public final boolean mo10930f() {
        this.f10821f.lock();
        try {
            return this.f10830o != null && this.f10833r == null;
        } finally {
            this.f10821f.unlock();
        }
    }

    /* renamed from: h */
    public final void mo10932h() {
        this.f10821f.lock();
        try {
            this.f10819d.mo11032e();
            if (this.f10832q != null) {
                this.f10832q.mo11074a();
                this.f10832q = null;
            }
            if (this.f10831p == null) {
                this.f10831p = new C0488a(this.f10817b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (C3127cp b : this.f10817b.values()) {
                this.f10831p.put(b.mo10831b(), connectionResult);
            }
            if (this.f10830o != null) {
                this.f10830o.putAll(this.f10831p);
            }
        } finally {
            this.f10821f.unlock();
        }
    }

    /* renamed from: i */
    public final void mo10933i() {
    }
}
