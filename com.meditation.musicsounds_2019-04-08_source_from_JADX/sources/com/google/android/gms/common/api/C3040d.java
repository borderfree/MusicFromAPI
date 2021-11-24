package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.p019g.C0488a;
import android.view.View;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3024d;
import com.google.android.gms.common.api.C3020a.C3024d.C3027c;
import com.google.android.gms.common.api.C3020a.C3024d.C3028d;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.internal.C3063aj;
import com.google.android.gms.common.api.internal.C3099br;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.api.internal.C3113cc;
import com.google.android.gms.common.api.internal.C3121cj;
import com.google.android.gms.common.api.internal.C3140f;
import com.google.android.gms.common.api.internal.C3148k;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3240e.C3242b;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4778b;
import com.google.android.gms.signin.C4781e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.d */
public abstract class C3040d {
    /* access modifiers changed from: private */
    @GuardedBy("sAllClients")

    /* renamed from: a */
    public static final Set<C3040d> f10600a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.d$a */
    public static final class C3041a {

        /* renamed from: a */
        private Account f10601a;

        /* renamed from: b */
        private final Set<Scope> f10602b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f10603c = new HashSet();

        /* renamed from: d */
        private int f10604d;

        /* renamed from: e */
        private View f10605e;

        /* renamed from: f */
        private String f10606f;

        /* renamed from: g */
        private String f10607g;

        /* renamed from: h */
        private final Map<C3020a<?>, C3242b> f10608h = new C0488a();

        /* renamed from: i */
        private final Context f10609i;

        /* renamed from: j */
        private final Map<C3020a<?>, C3024d> f10610j = new C0488a();

        /* renamed from: k */
        private C3140f f10611k;

        /* renamed from: l */
        private int f10612l = -1;

        /* renamed from: m */
        private C3043c f10613m;

        /* renamed from: n */
        private Looper f10614n;

        /* renamed from: o */
        private C3177d f10615o = C3177d.m14629a();

        /* renamed from: p */
        private C3021a<? extends C4781e, C4776a> f10616p = C4778b.f17302a;

        /* renamed from: q */
        private final ArrayList<C3042b> f10617q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<C3043c> f10618r = new ArrayList<>();

        /* renamed from: s */
        private boolean f10619s = false;

        public C3041a(Context context) {
            this.f10609i = context;
            this.f10614n = context.getMainLooper();
            this.f10606f = context.getPackageName();
            this.f10607g = context.getClass().getName();
        }

        /* renamed from: a */
        public final C3041a mo10856a(Handler handler) {
            C3266s.m14914a(handler, (Object) "Handler must not be null");
            this.f10614n = handler.getLooper();
            return this;
        }

        /* renamed from: a */
        public final C3041a mo10857a(C3020a<? extends C3028d> aVar) {
            C3266s.m14914a(aVar, (Object) "Api must not be null");
            this.f10610j.put(aVar, null);
            List a = aVar.mo10804a().mo10667a(null);
            this.f10603c.addAll(a);
            this.f10602b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends C3027c> C3041a mo10858a(C3020a<O> aVar, O o) {
            C3266s.m14914a(aVar, (Object) "Api must not be null");
            C3266s.m14914a(o, (Object) "Null options are not permitted for this Api");
            this.f10610j.put(aVar, o);
            List a = aVar.mo10804a().mo10667a(o);
            this.f10603c.addAll(a);
            this.f10602b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final C3041a mo10859a(C3042b bVar) {
            C3266s.m14914a(bVar, (Object) "Listener must not be null");
            this.f10617q.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C3041a mo10860a(C3043c cVar) {
            C3266s.m14914a(cVar, (Object) "Listener must not be null");
            this.f10618r.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C3240e mo10861a() {
            C4776a aVar = C4776a.f17293a;
            if (this.f10610j.containsKey(C4778b.f17303b)) {
                aVar = (C4776a) this.f10610j.get(C4778b.f17303b);
            }
            C3240e eVar = new C3240e(this.f10601a, this.f10602b, this.f10608h, this.f10604d, this.f10605e, this.f10606f, this.f10607g, aVar);
            return eVar;
        }

        /* renamed from: b */
        public final C3040d mo10862b() {
            C3266s.m14924b(!this.f10610j.isEmpty(), "must call addApi() to add at least one API");
            C3240e a = mo10861a();
            C3020a aVar = null;
            Map f = a.mo11249f();
            C0488a aVar2 = new C0488a();
            C0488a aVar3 = new C0488a();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C3020a aVar4 : this.f10610j.keySet()) {
                Object obj = this.f10610j.get(aVar4);
                boolean z2 = f.get(aVar4) != null;
                aVar2.put(aVar4, Boolean.valueOf(z2));
                C3121cj cjVar = new C3121cj(aVar4, z2);
                arrayList.add(cjVar);
                C3021a b = aVar4.mo10805b();
                C3020a aVar5 = aVar4;
                C3031f a2 = b.mo10666a(this.f10609i, this.f10614n, a, obj, cjVar, cjVar);
                aVar3.put(aVar5.mo10806c(), a2);
                if (b.mo10810a() == 1) {
                    z = obj != null;
                }
                if (a2.mo10735c()) {
                    if (aVar == null) {
                        aVar = aVar5;
                    } else {
                        String d = aVar5.mo10807d();
                        String d2 = aVar.mo10807d();
                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21 + String.valueOf(d2).length());
                        sb.append(d);
                        sb.append(" cannot be used with ");
                        sb.append(d2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar != null) {
                if (!z) {
                    C3266s.m14921a(this.f10601a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.mo10807d());
                    C3266s.m14921a(this.f10602b.equals(this.f10603c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.mo10807d());
                } else {
                    String d3 = aVar.mo10807d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C3063aj ajVar = new C3063aj(this.f10609i, new ReentrantLock(), this.f10614n, a, this.f10615o, this.f10616p, aVar2, this.f10617q, this.f10618r, aVar3, this.f10612l, C3063aj.m14127a((Iterable<C3031f>) aVar3.values(), true), arrayList, false);
            synchronized (C3040d.f10600a) {
                C3040d.f10600a.add(ajVar);
            }
            if (this.f10612l >= 0) {
                C3113cc.m14305b(this.f10611k).mo10989a(this.f10612l, ajVar, this.f10613m);
            }
            return ajVar;
        }
    }

    /* renamed from: com.google.android.gms.common.api.d$b */
    public interface C3042b {
        /* renamed from: a */
        void mo10863a(int i);

        /* renamed from: a */
        void mo10864a(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.api.d$c */
    public interface C3043c {
        /* renamed from: a */
        void mo10865a(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    public static Set<C3040d> m14041a() {
        Set<C3040d> set;
        synchronized (f10600a) {
            set = f10600a;
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10839a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo10840a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo10841a(C3043c cVar);

    /* renamed from: a */
    public void mo10842a(C3099br brVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo10843a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public boolean mo10844a(C3148k kVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Context mo10845b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract void mo10846b(C3043c cVar);

    /* renamed from: b */
    public void mo10847b(C3099br brVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Looper mo10848c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo10849d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public abstract void mo10850e();

    /* renamed from: f */
    public abstract ConnectionResult mo10851f();

    /* renamed from: g */
    public abstract void mo10852g();

    /* renamed from: h */
    public abstract void mo10853h();

    /* renamed from: i */
    public abstract C3044e<Status> mo10854i();

    /* renamed from: j */
    public abstract boolean mo10855j();
}
