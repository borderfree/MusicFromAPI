package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.p001a.p002a.C0001a;
import android.arch.p001a.p003b.C0007b;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Object f26b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f27a = new Object();

    /* renamed from: c */
    private C0007b<C0031j<T>, C0017a> f28c = new C0007b<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f29d = 0;

    /* renamed from: e */
    private volatile Object f30e = f26b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Object f31f = f26b;

    /* renamed from: g */
    private int f32g = -1;

    /* renamed from: h */
    private boolean f33h;

    /* renamed from: i */
    private boolean f34i;

    /* renamed from: j */
    private final Runnable f35j = new Runnable() {
        public void run() {
            Object b;
            synchronized (LiveData.this.f27a) {
                b = LiveData.this.f31f;
                LiveData.this.f31f = LiveData.f26b;
            }
            LiveData.this.mo50b(b);
        }
    };

    class LifecycleBoundObserver extends C0017a implements GenericLifecycleObserver {

        /* renamed from: a */
        final C0023d f37a;

        LifecycleBoundObserver(C0023d dVar, C0031j<T> jVar) {
            super(jVar);
            this.f37a = dVar;
        }

        /* renamed from: a */
        public void mo34a(C0023d dVar, Event event) {
            if (this.f37a.mo65B_().mo41a() == State.DESTROYED) {
                LiveData.this.mo47a(this.f39c);
            } else {
                mo57a(mo54a());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo54a() {
            return this.f37a.mo65B_().mo41a().isAtLeast(State.STARTED);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo55a(C0023d dVar) {
            return this.f37a == dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo56b() {
            this.f37a.mo65B_().mo43b(this);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0017a {

        /* renamed from: c */
        final C0031j<T> f39c;

        /* renamed from: d */
        boolean f40d;

        /* renamed from: e */
        int f41e = -1;

        C0017a(C0031j<T> jVar) {
            this.f39c = jVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo57a(boolean z) {
            if (z != this.f40d) {
                this.f40d = z;
                int i = 1;
                boolean z2 = LiveData.this.f29d == 0;
                LiveData liveData = LiveData.this;
                int c = liveData.f29d;
                if (!this.f40d) {
                    i = -1;
                }
                liveData.f29d = c + i;
                if (z2 && this.f40d) {
                    LiveData.this.mo49b();
                }
                if (LiveData.this.f29d == 0 && !this.f40d) {
                    LiveData.this.mo51c();
                }
                if (this.f40d) {
                    LiveData.this.m57b(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo54a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo55a(C0023d dVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo56b() {
        }
    }

    /* renamed from: a */
    private void m53a(C0017a aVar) {
        if (aVar.f40d) {
            if (!aVar.mo54a()) {
                aVar.mo57a(false);
            } else if (aVar.f41e < this.f32g) {
                aVar.f41e = this.f32g;
                aVar.f39c.mo70a(this.f30e);
            }
        }
    }

    /* renamed from: a */
    private static void m55a(String str) {
        if (!C0001a.m1a().mo3b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background");
            sb.append(" thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m57b(C0017a aVar) {
        if (this.f33h) {
            this.f34i = true;
            return;
        }
        this.f33h = true;
        do {
            this.f34i = false;
            if (aVar == null) {
                C0012d c = this.f28c.mo14c();
                while (c.hasNext()) {
                    m53a((C0017a) ((Entry) c.next()).getValue());
                    if (this.f34i) {
                        break;
                    }
                }
            } else {
                m53a(aVar);
                aVar = null;
            }
        } while (this.f34i);
        this.f33h = false;
    }

    /* renamed from: a */
    public T mo45a() {
        T t = this.f30e;
        if (t != f26b) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public void mo46a(C0023d dVar, C0031j<T> jVar) {
        if (dVar.mo65B_().mo41a() != State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(dVar, jVar);
            C0017a aVar = (C0017a) this.f28c.mo7a(jVar, lifecycleBoundObserver);
            if (aVar != null && !aVar.mo55a(dVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (aVar == null) {
                dVar.mo65B_().mo42a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo47a(C0031j<T> jVar) {
        m55a("removeObserver");
        C0017a aVar = (C0017a) this.f28c.mo8b(jVar);
        if (aVar != null) {
            aVar.mo56b();
            aVar.mo57a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48a(T t) {
        boolean z;
        synchronized (this.f27a) {
            z = this.f31f == f26b;
            this.f31f = t;
        }
        if (z) {
            C0001a.m1a().mo2b(this.f35j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo49b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo50b(T t) {
        m55a("setValue");
        this.f32g++;
        this.f30e = t;
        m57b(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo51c() {
    }

    /* renamed from: d */
    public boolean mo52d() {
        return this.f29d > 0;
    }
}
