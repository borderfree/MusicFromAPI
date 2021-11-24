package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3023c;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3040d.C3041a;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.C3050i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3246i;
import com.google.android.gms.common.internal.C3246i.C3247a;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.p124a.C3189a;
import com.google.android.gms.common.util.C3299d;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4781e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.aj */
public final class C3063aj extends C3040d implements C3089bh {

    /* renamed from: a */
    final Queue<C3109a<?, ?>> f10652a = new LinkedList();

    /* renamed from: b */
    final Map<C3023c<?>, C3031f> f10653b;

    /* renamed from: c */
    Set<Scope> f10654c;

    /* renamed from: d */
    Set<C3099br> f10655d;

    /* renamed from: e */
    final C3102bu f10656e;

    /* renamed from: f */
    private final Lock f10657f;

    /* renamed from: g */
    private boolean f10658g;

    /* renamed from: h */
    private final C3246i f10659h;

    /* renamed from: i */
    private C3088bg f10660i = null;

    /* renamed from: j */
    private final int f10661j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Context f10662k;

    /* renamed from: l */
    private final Looper f10663l;

    /* renamed from: m */
    private volatile boolean f10664m;

    /* renamed from: n */
    private long f10665n;

    /* renamed from: o */
    private long f10666o;

    /* renamed from: p */
    private final C3069ap f10667p;

    /* renamed from: q */
    private final C3177d f10668q;

    /* renamed from: r */
    private C3086be f10669r;

    /* renamed from: s */
    private final C3240e f10670s;

    /* renamed from: t */
    private final Map<C3020a<?>, Boolean> f10671t;

    /* renamed from: u */
    private final C3021a<? extends C4781e, C4776a> f10672u;

    /* renamed from: v */
    private final C3146i f10673v;

    /* renamed from: w */
    private final ArrayList<C3121cj> f10674w;

    /* renamed from: x */
    private Integer f10675x;

    /* renamed from: y */
    private final C3247a f10676y;

    public C3063aj(Context context, Lock lock, Looper looper, C3240e eVar, C3177d dVar, C3021a<? extends C4781e, C4776a> aVar, Map<C3020a<?>, Boolean> map, List<C3042b> list, List<C3043c> list2, Map<C3023c<?>, C3031f> map2, int i, int i2, ArrayList<C3121cj> arrayList, boolean z) {
        Looper looper2 = looper;
        this.f10665n = C3299d.m15035a() ? 10000 : 120000;
        this.f10666o = 5000;
        this.f10654c = new HashSet();
        this.f10673v = new C3146i();
        this.f10675x = null;
        this.f10655d = null;
        this.f10676y = new C3064ak(this);
        this.f10662k = context;
        this.f10657f = lock;
        this.f10658g = false;
        this.f10659h = new C3246i(looper, this.f10676y);
        this.f10663l = looper2;
        this.f10667p = new C3069ap(this, looper);
        this.f10668q = dVar;
        this.f10661j = i;
        if (this.f10661j >= 0) {
            this.f10675x = Integer.valueOf(i2);
        }
        this.f10671t = map;
        this.f10653b = map2;
        this.f10674w = arrayList;
        this.f10656e = new C3102bu(this.f10653b);
        for (C3042b a : list) {
            this.f10659h.mo11267a(a);
        }
        for (C3043c a2 : list2) {
            this.f10659h.mo11268a(a2);
        }
        this.f10670s = eVar;
        this.f10672u = aVar;
    }

    /* renamed from: a */
    public static int m14127a(Iterable<C3031f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C3031f fVar : iterable) {
            if (fVar.mo10818j()) {
                z2 = true;
            }
            if (fVar.mo10735c()) {
                z3 = true;
            }
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14128a(C3040d dVar, C3150m mVar, boolean z) {
        C3189a.f10995c.mo11157a(dVar).mo10869a((C3050i<? super R>) new C3068ao<Object>(this, mVar, z, dVar));
    }

    /* renamed from: b */
    private final void m14131b(int i) {
        if (this.f10675x == null) {
            this.f10675x = Integer.valueOf(i);
        } else if (this.f10675x.intValue() != i) {
            String c = m14134c(i);
            String c2 = m14134c(this.f10675x.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f10660i == null) {
            boolean z = false;
            boolean z2 = false;
            for (C3031f fVar : this.f10653b.values()) {
                if (fVar.mo10818j()) {
                    z = true;
                }
                if (fVar.mo10735c()) {
                    z2 = true;
                }
            }
            switch (this.f10675x.intValue()) {
                case 1:
                    if (!z) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z2) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z) {
                        if (this.f10658g) {
                            C3128cq cqVar = new C3128cq(this.f10662k, this.f10657f, this.f10663l, this.f10668q, this.f10653b, this.f10670s, this.f10671t, this.f10672u, this.f10674w, this, true);
                            this.f10660i = cqVar;
                            return;
                        }
                        this.f10660i = C3123cl.m14337a(this.f10662k, this, this.f10657f, this.f10663l, this.f10668q, this.f10653b, this.f10670s, this.f10671t, this.f10672u, this.f10674w);
                        return;
                    }
                    break;
            }
            if (!this.f10658g || z2) {
                C3072as asVar = new C3072as(this.f10662k, this, this.f10657f, this.f10663l, this.f10668q, this.f10653b, this.f10670s, this.f10671t, this.f10672u, this.f10674w, this);
                this.f10660i = asVar;
                return;
            }
            C3128cq cqVar2 = new C3128cq(this.f10662k, this.f10657f, this.f10663l, this.f10668q, this.f10653b, this.f10670s, this.f10671t, this.f10672u, this.f10674w, this, false);
            this.f10660i = cqVar2;
        }
    }

    /* renamed from: c */
    private static String m14134c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    @GuardedBy("mLock")
    /* renamed from: o */
    private final void m14135o() {
        this.f10659h.mo11269b();
        this.f10660i.mo10919a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m14136p() {
        this.f10657f.lock();
        try {
            if (this.f10664m) {
                m14135o();
            }
        } finally {
            this.f10657f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m14137q() {
        this.f10657f.lock();
        try {
            if (mo10907l()) {
                m14135o();
            }
        } finally {
            this.f10657f.unlock();
        }
    }

    /* renamed from: a */
    public final <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10839a(T t) {
        C3266s.m14924b(t.mo10983d() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f10653b.containsKey(t.mo10983d());
        String d = t.mo10984e() != null ? t.mo10984e().mo10807d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        C3266s.m14924b(containsKey, sb.toString());
        this.f10657f.lock();
        try {
            if (this.f10660i != null) {
                if (this.f10664m) {
                    this.f10652a.add(t);
                    while (!this.f10652a.isEmpty()) {
                        C3109a aVar = (C3109a) this.f10652a.remove();
                        this.f10656e.mo10974a(aVar);
                        aVar.mo10981b(Status.f10572c);
                    }
                } else {
                    t = this.f10660i.mo10918a(t);
                }
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f10657f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10840a(int i) {
        this.f10657f.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C3266s.m14924b(z, sb.toString());
            m14131b(i);
            m14135o();
        } finally {
            this.f10657f.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10904a(int i, boolean z) {
        if (i == 1 && !z && !this.f10664m) {
            this.f10664m = true;
            if (this.f10669r == null && !C3299d.m15035a()) {
                this.f10669r = this.f10668q.mo11112a(this.f10662k.getApplicationContext(), (C3087bf) new C3070aq(this));
            }
            this.f10667p.sendMessageDelayed(this.f10667p.obtainMessage(1), this.f10665n);
            this.f10667p.sendMessageDelayed(this.f10667p.obtainMessage(2), this.f10666o);
        }
        this.f10656e.mo10975b();
        this.f10659h.mo11264a(i);
        this.f10659h.mo11263a();
        if (i == 2) {
            m14135o();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10905a(Bundle bundle) {
        while (!this.f10652a.isEmpty()) {
            mo10839a((C3109a) this.f10652a.remove());
        }
        this.f10659h.mo11265a(bundle);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10906a(ConnectionResult connectionResult) {
        if (!this.f10668q.mo11135c(this.f10662k, connectionResult.mo10760c())) {
            mo10907l();
        }
        if (!this.f10664m) {
            this.f10659h.mo11266a(connectionResult);
            this.f10659h.mo11263a();
        }
    }

    /* renamed from: a */
    public final void mo10841a(C3043c cVar) {
        this.f10659h.mo11268a(cVar);
    }

    /* renamed from: a */
    public final void mo10842a(C3099br brVar) {
        this.f10657f.lock();
        try {
            if (this.f10655d == null) {
                this.f10655d = new HashSet();
            }
            this.f10655d.add(brVar);
        } finally {
            this.f10657f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10843a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f10662k);
        printWriter.append(str).append("mResuming=").print(this.f10664m);
        printWriter.append(" mWorkQueue.size()=").print(this.f10652a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f10656e.f10756b.size());
        if (this.f10660i != null) {
            this.f10660i.mo10924a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final boolean mo10844a(C3148k kVar) {
        return this.f10660i != null && this.f10660i.mo10925a(kVar);
    }

    /* renamed from: b */
    public final Context mo10845b() {
        return this.f10662k;
    }

    /* renamed from: b */
    public final void mo10846b(C3043c cVar) {
        this.f10659h.mo11270b(cVar);
    }

    /* renamed from: b */
    public final void mo10847b(C3099br brVar) {
        String str;
        String str2;
        Exception exc;
        this.f10657f.lock();
        try {
            if (this.f10655d == null) {
                str = "GoogleApiClientImpl";
                str2 = "Attempted to remove pending transform when no transforms are registered.";
                exc = new Exception();
            } else if (!this.f10655d.remove(brVar)) {
                str = "GoogleApiClientImpl";
                str2 = "Failed to remove pending transform - this may lead to memory leaks!";
                exc = new Exception();
            } else {
                if (!mo10908m()) {
                    this.f10660i.mo10933i();
                }
            }
            Log.wtf(str, str2, exc);
        } finally {
            this.f10657f.unlock();
        }
    }

    /* renamed from: c */
    public final Looper mo10848c() {
        return this.f10663l;
    }

    /* renamed from: d */
    public final void mo10849d() {
        if (this.f10660i != null) {
            this.f10660i.mo10932h();
        }
    }

    /* renamed from: e */
    public final void mo10850e() {
        this.f10657f.lock();
        try {
            boolean z = false;
            if (this.f10661j >= 0) {
                if (this.f10675x != null) {
                    z = true;
                }
                C3266s.m14920a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f10675x == null) {
                this.f10675x = Integer.valueOf(m14127a((Iterable<C3031f>) this.f10653b.values(), false));
            } else if (this.f10675x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo10840a(this.f10675x.intValue());
        } finally {
            this.f10657f.unlock();
        }
    }

    /* renamed from: f */
    public final ConnectionResult mo10851f() {
        boolean z = true;
        C3266s.m14920a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f10657f.lock();
        try {
            if (this.f10661j >= 0) {
                if (this.f10675x == null) {
                    z = false;
                }
                C3266s.m14920a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f10675x == null) {
                this.f10675x = Integer.valueOf(m14127a((Iterable<C3031f>) this.f10653b.values(), false));
            } else if (this.f10675x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m14131b(this.f10675x.intValue());
            this.f10659h.mo11269b();
            return this.f10660i.mo10926b();
        } finally {
            this.f10657f.unlock();
        }
    }

    /* renamed from: g */
    public final void mo10852g() {
        this.f10657f.lock();
        try {
            this.f10656e.mo10973a();
            if (this.f10660i != null) {
                this.f10660i.mo10927c();
            }
            this.f10673v.mo11068a();
            for (C3109a aVar : this.f10652a) {
                aVar.mo10875a((C3105bx) null);
                aVar.mo10867a();
            }
            this.f10652a.clear();
            if (this.f10660i != null) {
                mo10907l();
                this.f10659h.mo11263a();
            }
        } finally {
            this.f10657f.unlock();
        }
    }

    /* renamed from: h */
    public final void mo10853h() {
        mo10852g();
        mo10850e();
    }

    /* renamed from: i */
    public final C3044e<Status> mo10854i() {
        C3266s.m14920a(mo10855j(), (Object) "GoogleApiClient is not connected yet.");
        C3266s.m14920a(this.f10675x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C3150m mVar = new C3150m(this);
        if (this.f10653b.containsKey(C3189a.f10993a)) {
            m14128a(this, mVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C3040d b = new C3041a(this.f10662k).mo10857a(C3189a.f10994b).mo10859a((C3042b) new C3065al(this, atomicReference, mVar)).mo10860a((C3043c) new C3066am(this, mVar)).mo10856a((Handler) this.f10667p).mo10862b();
            atomicReference.set(b);
            b.mo10850e();
        }
        return mVar;
    }

    /* renamed from: j */
    public final boolean mo10855j() {
        return this.f10660i != null && this.f10660i.mo10930f();
    }

    /* access modifiers changed from: 0000 */
    @GuardedBy("mLock")
    /* renamed from: l */
    public final boolean mo10907l() {
        if (!this.f10664m) {
            return false;
        }
        this.f10664m = false;
        this.f10667p.removeMessages(2);
        this.f10667p.removeMessages(1);
        if (this.f10669r != null) {
            this.f10669r.mo10956a();
            this.f10669r = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo10908m() {
        this.f10657f.lock();
        try {
            if (this.f10655d == null) {
                this.f10657f.unlock();
                return false;
            }
            boolean z = !this.f10655d.isEmpty();
            this.f10657f.unlock();
            return z;
        } catch (Throwable th) {
            this.f10657f.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final String mo10909n() {
        StringWriter stringWriter = new StringWriter();
        mo10843a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }
}
