package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3023c;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4781e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.as */
public final class C3072as implements C3088bg, C3122ck {

    /* renamed from: a */
    final Map<C3023c<?>, C3031f> f10689a;

    /* renamed from: b */
    final Map<C3023c<?>, ConnectionResult> f10690b = new HashMap();

    /* renamed from: c */
    int f10691c;

    /* renamed from: d */
    final C3063aj f10692d;

    /* renamed from: e */
    final C3089bh f10693e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f10694f;

    /* renamed from: g */
    private final Condition f10695g;

    /* renamed from: h */
    private final Context f10696h;

    /* renamed from: i */
    private final C3182e f10697i;

    /* renamed from: j */
    private final C3074au f10698j;

    /* renamed from: k */
    private final C3240e f10699k;

    /* renamed from: l */
    private final Map<C3020a<?>, Boolean> f10700l;

    /* renamed from: m */
    private final C3021a<? extends C4781e, C4776a> f10701m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile C3071ar f10702n;

    /* renamed from: o */
    private ConnectionResult f10703o = null;

    public C3072as(Context context, C3063aj ajVar, Lock lock, Looper looper, C3182e eVar, Map<C3023c<?>, C3031f> map, C3240e eVar2, Map<C3020a<?>, Boolean> map2, C3021a<? extends C4781e, C4776a> aVar, ArrayList<C3121cj> arrayList, C3089bh bhVar) {
        this.f10696h = context;
        this.f10694f = lock;
        this.f10697i = eVar;
        this.f10689a = map;
        this.f10699k = eVar2;
        this.f10700l = map2;
        this.f10701m = aVar;
        this.f10692d = ajVar;
        this.f10693e = bhVar;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((C3121cj) obj).mo11002a((C3122ck) this);
        }
        this.f10698j = new C3074au(this, looper);
        this.f10695g = lock.newCondition();
        this.f10702n = new C3062ai(this);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10918a(T t) {
        t.mo10880h();
        return this.f10702n.mo10897a(t);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10919a() {
        this.f10702n.mo10903c();
    }

    /* renamed from: a */
    public final void mo10863a(int i) {
        this.f10694f.lock();
        try {
            this.f10702n.mo10899a(i);
        } finally {
            this.f10694f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10864a(Bundle bundle) {
        this.f10694f.lock();
        try {
            this.f10702n.mo10900a(bundle);
        } finally {
            this.f10694f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10920a(ConnectionResult connectionResult) {
        this.f10694f.lock();
        try {
            this.f10703o = connectionResult;
            this.f10702n = new C3062ai(this);
            this.f10702n.mo10898a();
            this.f10695g.signalAll();
        } finally {
            this.f10694f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10921a(ConnectionResult connectionResult, C3020a<?> aVar, boolean z) {
        this.f10694f.lock();
        try {
            this.f10702n.mo10901a(connectionResult, aVar, z);
        } finally {
            this.f10694f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10922a(C3073at atVar) {
        this.f10698j.sendMessage(this.f10698j.obtainMessage(1, atVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10923a(RuntimeException runtimeException) {
        this.f10698j.sendMessage(this.f10698j.obtainMessage(2, runtimeException));
    }

    /* renamed from: a */
    public final void mo10924a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f10702n);
        for (C3020a aVar : this.f10700l.keySet()) {
            printWriter.append(str).append(aVar.mo10807d()).println(":");
            ((C3031f) this.f10689a.get(aVar.mo10806c())).mo10814a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final boolean mo10925a(C3148k kVar) {
        return false;
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final ConnectionResult mo10926b() {
        mo10919a();
        while (mo10931g()) {
            try {
                this.f10695g.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return mo10930f() ? ConnectionResult.f10553a : this.f10703o != null ? this.f10703o : new ConnectionResult(13, null);
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo10927c() {
        if (this.f10702n.mo10902b()) {
            this.f10690b.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo10928d() {
        this.f10694f.lock();
        try {
            C3161x xVar = new C3161x(this, this.f10699k, this.f10700l, this.f10697i, this.f10701m, this.f10694f, this.f10696h);
            this.f10702n = xVar;
            this.f10702n.mo10898a();
            this.f10695g.signalAll();
        } finally {
            this.f10694f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo10929e() {
        this.f10694f.lock();
        try {
            this.f10692d.mo10907l();
            this.f10702n = new C3158u(this);
            this.f10702n.mo10898a();
            this.f10695g.signalAll();
        } finally {
            this.f10694f.unlock();
        }
    }

    /* renamed from: f */
    public final boolean mo10930f() {
        return this.f10702n instanceof C3158u;
    }

    /* renamed from: g */
    public final boolean mo10931g() {
        return this.f10702n instanceof C3161x;
    }

    /* renamed from: h */
    public final void mo10932h() {
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    public final void mo10933i() {
        if (mo10930f()) {
            ((C3158u) this.f10702n).mo11082d();
        }
    }
}
