package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.p019g.C0490b;
import android.util.Log;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3024d;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3037c;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C3080b.C3081a;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.api.internal.C3142h.C3143a;
import com.google.android.gms.common.internal.C3227d.C3230c;
import com.google.android.gms.common.internal.C3227d.C3232e;
import com.google.android.gms.common.internal.C3251l;
import com.google.android.gms.common.internal.C3252m;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.C3268t;
import com.google.android.gms.common.util.C3297b;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.internal.p128c.C4164e;
import com.google.android.gms.signin.C4781e;
import com.google.android.gms.tasks.C4796f;
import com.google.android.gms.tasks.C4797g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.d */
public class C3135d implements Callback {

    /* renamed from: a */
    public static final Status f10849a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Status f10850b = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f10851f = new Object();
    @GuardedBy("lock")

    /* renamed from: g */
    private static C3135d f10852g;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f10853c = 5000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f10854d = 120000;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f10855e = 10000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f10856h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3177d f10857i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3251l f10858j;

    /* renamed from: k */
    private final AtomicInteger f10859k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f10860l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<C3112cb<?>, C3136a<?>> f10861m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: n */
    public C3155r f10862n = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: o */
    public final Set<C3112cb<?>> f10863o = new C0490b();

    /* renamed from: p */
    private final Set<C3112cb<?>> f10864p = new C0490b();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f10865q;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public class C3136a<O extends C3024d> implements C3042b, C3043c, C3122ck {

        /* renamed from: b */
        private final Queue<C3067an> f10867b = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C3031f f10868c;

        /* renamed from: d */
        private final C3022b f10869d;

        /* renamed from: e */
        private final C3112cb<O> f10870e;

        /* renamed from: f */
        private final C3153p f10871f;

        /* renamed from: g */
        private final Set<C3115cd> f10872g = new HashSet();

        /* renamed from: h */
        private final Map<C3143a<?>, C3091bj> f10873h = new HashMap();

        /* renamed from: i */
        private final int f10874i;

        /* renamed from: j */
        private final C3095bn f10875j;

        /* renamed from: k */
        private boolean f10876k;

        /* renamed from: l */
        private final List<C3137b> f10877l = new ArrayList();

        /* renamed from: m */
        private ConnectionResult f10878m = null;

        public C3136a(C3037c<O> cVar) {
            this.f10868c = cVar.mo10827a(C3135d.this.f10865q.getLooper(), this);
            this.f10869d = this.f10868c instanceof C3268t ? ((C3268t) this.f10868c).mo10737e() : this.f10868c;
            this.f10870e = cVar.mo10831b();
            this.f10871f = new C3153p();
            this.f10874i = cVar.mo10832c();
            if (this.f10868c.mo10818j()) {
                this.f10875j = cVar.mo10829a(C3135d.this.f10856h, C3135d.this.f10865q);
            } else {
                this.f10875j = null;
            }
        }

        /* renamed from: a */
        private final Feature m14460a(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] n = this.f10868c.mo10822n();
                if (n == null) {
                    n = new Feature[0];
                }
                C0488a aVar = new C0488a(n.length);
                for (Feature feature : n) {
                    aVar.put(feature.mo10767a(), Long.valueOf(feature.mo10768b()));
                }
                for (Feature feature2 : featureArr) {
                    if (!aVar.containsKey(feature2.mo10767a()) || ((Long) aVar.get(feature2.mo10767a())).longValue() < feature2.mo10768b()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m14463a(C3137b bVar) {
            if (this.f10877l.contains(bVar) && !this.f10876k) {
                if (!this.f10868c.mo10816h()) {
                    mo11046i();
                    return;
                }
                m14476p();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m14465a(boolean z) {
            C3266s.m14918a(C3135d.this.f10865q);
            if (!this.f10868c.mo10816h() || this.f10873h.size() != 0) {
                return false;
            }
            if (this.f10871f.mo11076a()) {
                if (z) {
                    m14478r();
                }
                return false;
            }
            this.f10868c.mo10815g();
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m14468b(C3137b bVar) {
            if (this.f10877l.remove(bVar)) {
                C3135d.this.f10865q.removeMessages(15, bVar);
                C3135d.this.f10865q.removeMessages(16, bVar);
                Feature b = bVar.f10880b;
                ArrayList arrayList = new ArrayList(this.f10867b.size());
                for (C3067an anVar : this.f10867b) {
                    if (anVar instanceof C3092bk) {
                        Feature[] b2 = ((C3092bk) anVar).mo10959b(this);
                        if (b2 != null && C3297b.m15030a((T[]) b2, b)) {
                            arrayList.add(anVar);
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    C3067an anVar2 = (C3067an) obj;
                    this.f10867b.remove(anVar2);
                    anVar2.mo10915a((RuntimeException) new UnsupportedApiCallException(b));
                }
            }
        }

        /* renamed from: b */
        private final boolean m14469b(C3067an anVar) {
            if (!(anVar instanceof C3092bk)) {
                m14471c(anVar);
                return true;
            }
            C3092bk bkVar = (C3092bk) anVar;
            Feature a = m14460a(bkVar.mo10959b(this));
            if (a == null) {
                m14471c(anVar);
                return true;
            }
            if (bkVar.mo10960c(this)) {
                C3137b bVar = new C3137b(this.f10870e, a, null);
                int indexOf = this.f10877l.indexOf(bVar);
                if (indexOf >= 0) {
                    C3137b bVar2 = (C3137b) this.f10877l.get(indexOf);
                    C3135d.this.f10865q.removeMessages(15, bVar2);
                    C3135d.this.f10865q.sendMessageDelayed(Message.obtain(C3135d.this.f10865q, 15, bVar2), C3135d.this.f10853c);
                } else {
                    this.f10877l.add(bVar);
                    C3135d.this.f10865q.sendMessageDelayed(Message.obtain(C3135d.this.f10865q, 15, bVar), C3135d.this.f10853c);
                    C3135d.this.f10865q.sendMessageDelayed(Message.obtain(C3135d.this.f10865q, 16, bVar), C3135d.this.f10854d);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!m14472c(connectionResult)) {
                        C3135d.this.mo11027a(connectionResult, this.f10874i);
                    }
                }
            } else {
                bkVar.mo10915a((RuntimeException) new UnsupportedApiCallException(a));
            }
            return false;
        }

        /* renamed from: c */
        private final void m14471c(C3067an anVar) {
            anVar.mo10914a(this.f10871f, mo11048k());
            try {
                anVar.mo10913a(this);
            } catch (DeadObjectException unused) {
                mo10863a(1);
                this.f10868c.mo10815g();
            }
        }

        /* renamed from: c */
        private final boolean m14472c(ConnectionResult connectionResult) {
            synchronized (C3135d.f10851f) {
                if (C3135d.this.f10862n == null || !C3135d.this.f10863o.contains(this.f10870e)) {
                    return false;
                }
                C3135d.this.f10862n.mo10995b(connectionResult, this.f10874i);
                return true;
            }
        }

        /* renamed from: d */
        private final void m14473d(ConnectionResult connectionResult) {
            for (C3115cd cdVar : this.f10872g) {
                String str = null;
                if (C3261q.m14906a(connectionResult, ConnectionResult.f10553a)) {
                    str = this.f10868c.mo10821m();
                }
                cdVar.mo10993a(this.f10870e, connectionResult, str);
            }
            this.f10872g.clear();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m14474n() {
            mo11041d();
            m14473d(ConnectionResult.f10553a);
            m14477q();
            Iterator it = this.f10873h.values().iterator();
            while (it.hasNext()) {
                C3091bj bjVar = (C3091bj) it.next();
                if (m14460a(bjVar.f10727a.mo11071b()) == null) {
                    try {
                        bjVar.f10727a.mo11070a(this.f10869d, new C4797g());
                    } catch (DeadObjectException unused) {
                        mo10863a(1);
                        this.f10868c.mo10815g();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            m14476p();
            m14478r();
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m14475o() {
            mo11041d();
            this.f10876k = true;
            this.f10871f.mo11078c();
            C3135d.this.f10865q.sendMessageDelayed(Message.obtain(C3135d.this.f10865q, 9, this.f10870e), C3135d.this.f10853c);
            C3135d.this.f10865q.sendMessageDelayed(Message.obtain(C3135d.this.f10865q, 11, this.f10870e), C3135d.this.f10854d);
            C3135d.this.f10858j.mo11283a();
        }

        /* renamed from: p */
        private final void m14476p() {
            ArrayList arrayList = new ArrayList(this.f10867b);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C3067an anVar = (C3067an) obj;
                if (!this.f10868c.mo10816h()) {
                    return;
                }
                if (m14469b(anVar)) {
                    this.f10867b.remove(anVar);
                }
            }
        }

        /* renamed from: q */
        private final void m14477q() {
            if (this.f10876k) {
                C3135d.this.f10865q.removeMessages(11, this.f10870e);
                C3135d.this.f10865q.removeMessages(9, this.f10870e);
                this.f10876k = false;
            }
        }

        /* renamed from: r */
        private final void m14478r() {
            C3135d.this.f10865q.removeMessages(12, this.f10870e);
            C3135d.this.f10865q.sendMessageDelayed(C3135d.this.f10865q.obtainMessage(12, this.f10870e), C3135d.this.f10855e);
        }

        /* renamed from: a */
        public final void mo11034a() {
            C3266s.m14918a(C3135d.this.f10865q);
            mo11035a(C3135d.f10849a);
            this.f10871f.mo11077b();
            for (C3143a caVar : (C3143a[]) this.f10873h.keySet().toArray(new C3143a[this.f10873h.size()])) {
                mo11036a((C3067an) new C3111ca(caVar, new C4797g()));
            }
            m14473d(new ConnectionResult(4));
            if (this.f10868c.mo10816h()) {
                this.f10868c.mo10812a((C3232e) new C3082ba(this));
            }
        }

        /* renamed from: a */
        public final void mo10863a(int i) {
            if (Looper.myLooper() == C3135d.this.f10865q.getLooper()) {
                m14475o();
            } else {
                C3135d.this.f10865q.post(new C3078ay(this));
            }
        }

        /* renamed from: a */
        public final void mo10864a(Bundle bundle) {
            if (Looper.myLooper() == C3135d.this.f10865q.getLooper()) {
                m14474n();
            } else {
                C3135d.this.f10865q.post(new C3077ax(this));
            }
        }

        /* renamed from: a */
        public final void mo10865a(ConnectionResult connectionResult) {
            C3266s.m14918a(C3135d.this.f10865q);
            if (this.f10875j != null) {
                this.f10875j.mo10964b();
            }
            mo11041d();
            C3135d.this.f10858j.mo11283a();
            m14473d(connectionResult);
            if (connectionResult.mo10760c() == 4) {
                mo11035a(C3135d.f10850b);
            } else if (this.f10867b.isEmpty()) {
                this.f10878m = connectionResult;
            } else {
                if (!m14472c(connectionResult) && !C3135d.this.mo11027a(connectionResult, this.f10874i)) {
                    if (connectionResult.mo10760c() == 18) {
                        this.f10876k = true;
                    }
                    if (this.f10876k) {
                        C3135d.this.f10865q.sendMessageDelayed(Message.obtain(C3135d.this.f10865q, 9, this.f10870e), C3135d.this.f10853c);
                        return;
                    }
                    String a = this.f10870e.mo10985a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                    sb.append("API: ");
                    sb.append(a);
                    sb.append(" is not available on this device.");
                    mo11035a(new Status(17, sb.toString()));
                }
            }
        }

        /* renamed from: a */
        public final void mo10921a(ConnectionResult connectionResult, C3020a<?> aVar, boolean z) {
            if (Looper.myLooper() == C3135d.this.f10865q.getLooper()) {
                mo10865a(connectionResult);
            } else {
                C3135d.this.f10865q.post(new C3079az(this, connectionResult));
            }
        }

        /* renamed from: a */
        public final void mo11035a(Status status) {
            C3266s.m14918a(C3135d.this.f10865q);
            for (C3067an a : this.f10867b) {
                a.mo10912a(status);
            }
            this.f10867b.clear();
        }

        /* renamed from: a */
        public final void mo11036a(C3067an anVar) {
            C3266s.m14918a(C3135d.this.f10865q);
            if (!this.f10868c.mo10816h()) {
                this.f10867b.add(anVar);
                if (this.f10878m == null || !this.f10878m.mo10758a()) {
                    mo11046i();
                } else {
                    mo10865a(this.f10878m);
                }
            } else if (m14469b(anVar)) {
                m14478r();
            } else {
                this.f10867b.add(anVar);
            }
        }

        /* renamed from: a */
        public final void mo11037a(C3115cd cdVar) {
            C3266s.m14918a(C3135d.this.f10865q);
            this.f10872g.add(cdVar);
        }

        /* renamed from: b */
        public final C3031f mo11038b() {
            return this.f10868c;
        }

        /* renamed from: b */
        public final void mo11039b(ConnectionResult connectionResult) {
            C3266s.m14918a(C3135d.this.f10865q);
            this.f10868c.mo10815g();
            mo10865a(connectionResult);
        }

        /* renamed from: c */
        public final Map<C3143a<?>, C3091bj> mo11040c() {
            return this.f10873h;
        }

        /* renamed from: d */
        public final void mo11041d() {
            C3266s.m14918a(C3135d.this.f10865q);
            this.f10878m = null;
        }

        /* renamed from: e */
        public final ConnectionResult mo11042e() {
            C3266s.m14918a(C3135d.this.f10865q);
            return this.f10878m;
        }

        /* renamed from: f */
        public final void mo11043f() {
            C3266s.m14918a(C3135d.this.f10865q);
            if (this.f10876k) {
                mo11046i();
            }
        }

        /* renamed from: g */
        public final void mo11044g() {
            C3266s.m14918a(C3135d.this.f10865q);
            if (this.f10876k) {
                m14477q();
                mo11035a(C3135d.this.f10857i.mo11106a(C3135d.this.f10856h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f10868c.mo10815g();
            }
        }

        /* renamed from: h */
        public final boolean mo11045h() {
            return m14465a(true);
        }

        /* renamed from: i */
        public final void mo11046i() {
            C3266s.m14918a(C3135d.this.f10865q);
            if (!this.f10868c.mo10816h() && !this.f10868c.mo10817i()) {
                int a = C3135d.this.f10858j.mo11282a(C3135d.this.f10856h, this.f10868c);
                if (a != 0) {
                    mo10865a(new ConnectionResult(a, null));
                    return;
                }
                C3138c cVar = new C3138c(this.f10868c, this.f10870e);
                if (this.f10868c.mo10818j()) {
                    this.f10875j.mo10963a((C3098bq) cVar);
                }
                this.f10868c.mo10811a((C3230c) cVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public final boolean mo11047j() {
            return this.f10868c.mo10816h();
        }

        /* renamed from: k */
        public final boolean mo11048k() {
            return this.f10868c.mo10818j();
        }

        /* renamed from: l */
        public final int mo11049l() {
            return this.f10874i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public final C4781e mo11050m() {
            if (this.f10875j == null) {
                return null;
            }
            return this.f10875j.mo10962a();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    private static class C3137b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C3112cb<?> f10879a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f10880b;

        private C3137b(C3112cb<?> cbVar, Feature feature) {
            this.f10879a = cbVar;
            this.f10880b = feature;
        }

        /* synthetic */ C3137b(C3112cb cbVar, Feature feature, C3076aw awVar) {
            this(cbVar, feature);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C3137b)) {
                C3137b bVar = (C3137b) obj;
                if (C3261q.m14906a(this.f10879a, bVar.f10879a) && C3261q.m14906a(this.f10880b, bVar.f10880b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return C3261q.m14904a(this.f10879a, this.f10880b);
        }

        public final String toString() {
            return C3261q.m14905a((Object) this).mo11288a("key", this.f10879a).mo11288a("feature", this.f10880b).toString();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$c */
    private class C3138c implements C3098bq, C3230c {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C3031f f10882b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C3112cb<?> f10883c;

        /* renamed from: d */
        private C3252m f10884d = null;

        /* renamed from: e */
        private Set<Scope> f10885e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f10886f = false;

        public C3138c(C3031f fVar, C3112cb<?> cbVar) {
            this.f10882b = fVar;
            this.f10883c = cbVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m14503a() {
            if (this.f10886f && this.f10884d != null) {
                this.f10882b.mo10813a(this.f10884d, this.f10885e);
            }
        }

        /* renamed from: a */
        public final void mo11054a(ConnectionResult connectionResult) {
            C3135d.this.f10865q.post(new C3084bc(this, connectionResult));
        }

        /* renamed from: a */
        public final void mo10967a(C3252m mVar, Set<Scope> set) {
            if (mVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo10968b(new ConnectionResult(4));
                return;
            }
            this.f10884d = mVar;
            this.f10885e = set;
            m14503a();
        }

        /* renamed from: b */
        public final void mo10968b(ConnectionResult connectionResult) {
            ((C3136a) C3135d.this.f10861m.get(this.f10883c)).mo11039b(connectionResult);
        }
    }

    private C3135d(Context context, Looper looper, C3177d dVar) {
        this.f10856h = context;
        this.f10865q = new C4164e(looper, this);
        this.f10857i = dVar;
        this.f10858j = new C3251l(dVar);
        this.f10865q.sendMessage(this.f10865q.obtainMessage(6));
    }

    /* renamed from: a */
    public static C3135d m14434a() {
        C3135d dVar;
        synchronized (f10851f) {
            C3266s.m14914a(f10852g, (Object) "Must guarantee manager is non-null before using getInstance");
            dVar = f10852g;
        }
        return dVar;
    }

    /* renamed from: a */
    public static C3135d m14435a(Context context) {
        C3135d dVar;
        synchronized (f10851f) {
            if (f10852g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f10852g = new C3135d(context.getApplicationContext(), handlerThread.getLooper(), C3177d.m14629a());
            }
            dVar = f10852g;
        }
        return dVar;
    }

    /* renamed from: b */
    public static void m14437b() {
        synchronized (f10851f) {
            if (f10852g != null) {
                C3135d dVar = f10852g;
                dVar.f10860l.incrementAndGet();
                dVar.f10865q.sendMessageAtFrontOfQueue(dVar.f10865q.obtainMessage(10));
            }
        }
    }

    /* renamed from: b */
    private final void m14438b(C3037c<?> cVar) {
        C3112cb b = cVar.mo10831b();
        C3136a aVar = (C3136a) this.f10861m.get(b);
        if (aVar == null) {
            aVar = new C3136a(cVar);
            this.f10861m.put(b, aVar);
        }
        if (aVar.mo11048k()) {
            this.f10864p.add(b);
        }
        aVar.mo11046i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PendingIntent mo11022a(C3112cb<?> cbVar, int i) {
        C3136a aVar = (C3136a) this.f10861m.get(cbVar);
        if (aVar == null) {
            return null;
        }
        C4781e m = aVar.mo11050m();
        if (m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f10856h, i, m.mo10736d(), 134217728);
    }

    /* renamed from: a */
    public final C4796f<Map<C3112cb<?>, String>> mo11023a(Iterable<? extends C3037c<?>> iterable) {
        C3115cd cdVar = new C3115cd(iterable);
        this.f10865q.sendMessage(this.f10865q.obtainMessage(2, cdVar));
        return cdVar.mo10994b();
    }

    /* renamed from: a */
    public final void mo11024a(C3037c<?> cVar) {
        this.f10865q.sendMessage(this.f10865q.obtainMessage(7, cVar));
    }

    /* renamed from: a */
    public final <O extends C3024d> void mo11025a(C3037c<O> cVar, int i, C3109a<? extends C3049h, C3022b> aVar) {
        this.f10865q.sendMessage(this.f10865q.obtainMessage(4, new C3090bi(new C3107bz(i, aVar), this.f10860l.get(), cVar)));
    }

    /* renamed from: a */
    public final void mo11026a(C3155r rVar) {
        synchronized (f10851f) {
            if (this.f10862n != rVar) {
                this.f10862n = rVar;
                this.f10863o.clear();
            }
            this.f10863o.addAll(rVar.mo11079g());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo11027a(ConnectionResult connectionResult, int i) {
        return this.f10857i.mo11116a(this.f10856h, connectionResult, i);
    }

    /* renamed from: b */
    public final void mo11028b(ConnectionResult connectionResult, int i) {
        if (!mo11027a(connectionResult, i)) {
            this.f10865q.sendMessage(this.f10865q.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo11029b(C3155r rVar) {
        synchronized (f10851f) {
            if (this.f10862n == rVar) {
                this.f10862n = null;
                this.f10863o.clear();
            }
        }
    }

    /* renamed from: c */
    public final int mo11030c() {
        return this.f10859k.getAndIncrement();
    }

    /* renamed from: d */
    public final void mo11031d() {
        this.f10865q.sendMessage(this.f10865q.obtainMessage(3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo11032e() {
        this.f10860l.incrementAndGet();
        this.f10865q.sendMessage(this.f10865q.obtainMessage(10));
    }

    public boolean handleMessage(Message message) {
        C3136a aVar;
        C4797g b;
        Boolean valueOf;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f10855e = j;
                this.f10865q.removeMessages(12);
                for (C3112cb obtainMessage : this.f10861m.keySet()) {
                    this.f10865q.sendMessageDelayed(this.f10865q.obtainMessage(12, obtainMessage), this.f10855e);
                }
                break;
            case 2:
                C3115cd cdVar = (C3115cd) message.obj;
                Iterator it = cdVar.mo10992a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C3112cb cbVar = (C3112cb) it.next();
                        C3136a aVar2 = (C3136a) this.f10861m.get(cbVar);
                        if (aVar2 == null) {
                            cdVar.mo10993a(cbVar, new ConnectionResult(13), null);
                            break;
                        } else if (aVar2.mo11047j()) {
                            cdVar.mo10993a(cbVar, ConnectionResult.f10553a, aVar2.mo11038b().mo10821m());
                        } else if (aVar2.mo11042e() != null) {
                            cdVar.mo10993a(cbVar, aVar2.mo11042e(), null);
                        } else {
                            aVar2.mo11037a(cdVar);
                            aVar2.mo11046i();
                        }
                    }
                }
            case 3:
                for (C3136a aVar3 : this.f10861m.values()) {
                    aVar3.mo11041d();
                    aVar3.mo11046i();
                }
                break;
            case 4:
            case 8:
            case 13:
                C3090bi biVar = (C3090bi) message.obj;
                C3136a aVar4 = (C3136a) this.f10861m.get(biVar.f10726c.mo10831b());
                if (aVar4 == null) {
                    m14438b(biVar.f10726c);
                    aVar4 = (C3136a) this.f10861m.get(biVar.f10726c.mo10831b());
                }
                if (aVar4.mo11048k() && this.f10860l.get() != biVar.f10725b) {
                    biVar.f10724a.mo10912a(f10849a);
                    aVar4.mo11034a();
                    break;
                } else {
                    aVar4.mo11036a(biVar.f10724a);
                    break;
                }
                break;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f10861m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = (C3136a) it2.next();
                        if (aVar.mo11049l() == i) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String b2 = this.f10857i.mo11118b(connectionResult.mo10760c());
                    String e = connectionResult.mo10762e();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 69 + String.valueOf(e).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(b2);
                    sb2.append(": ");
                    sb2.append(e);
                    aVar.mo11035a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C3309n.m15070b() && (this.f10856h.getApplicationContext() instanceof Application)) {
                    C3080b.m14206a((Application) this.f10856h.getApplicationContext());
                    C3080b.m14205a().mo10940a((C3081a) new C3076aw(this));
                    if (!C3080b.m14205a().mo10941a(true)) {
                        this.f10855e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m14438b((C3037c) message.obj);
                break;
            case 9:
                if (this.f10861m.containsKey(message.obj)) {
                    ((C3136a) this.f10861m.get(message.obj)).mo11043f();
                    break;
                }
                break;
            case 10:
                for (C3112cb remove : this.f10864p) {
                    ((C3136a) this.f10861m.remove(remove)).mo11034a();
                }
                this.f10864p.clear();
                break;
            case 11:
                if (this.f10861m.containsKey(message.obj)) {
                    ((C3136a) this.f10861m.get(message.obj)).mo11044g();
                    break;
                }
                break;
            case 12:
                if (this.f10861m.containsKey(message.obj)) {
                    ((C3136a) this.f10861m.get(message.obj)).mo11045h();
                    break;
                }
                break;
            case 14:
                C3156s sVar = (C3156s) message.obj;
                C3112cb a = sVar.mo11080a();
                if (!this.f10861m.containsKey(a)) {
                    b = sVar.mo11081b();
                    valueOf = Boolean.valueOf(false);
                } else {
                    boolean a2 = ((C3136a) this.f10861m.get(a)).m14465a(false);
                    b = sVar.mo11081b();
                    valueOf = Boolean.valueOf(a2);
                }
                b.mo15931a(valueOf);
                break;
            case 15:
                C3137b bVar = (C3137b) message.obj;
                if (this.f10861m.containsKey(bVar.f10879a)) {
                    ((C3136a) this.f10861m.get(bVar.f10879a)).m14463a(bVar);
                    break;
                }
                break;
            case 16:
                C3137b bVar2 = (C3137b) message.obj;
                if (this.f10861m.containsKey(bVar2.f10879a)) {
                    ((C3136a) this.f10861m.get(bVar2.f10879a)).m14468b(bVar2);
                    break;
                }
                break;
            default:
                int i2 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
