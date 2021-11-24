package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: android.support.design.widget.m */
class C0202m {

    /* renamed from: a */
    private static C0202m f639a;

    /* renamed from: b */
    private final Object f640b = new Object();

    /* renamed from: c */
    private final Handler f641c = new Handler(Looper.getMainLooper(), new Callback() {
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0202m.this.mo933a((C0205b) message.obj);
            return true;
        }
    });

    /* renamed from: d */
    private C0205b f642d;

    /* renamed from: e */
    private C0205b f643e;

    /* renamed from: android.support.design.widget.m$a */
    interface C0204a {
        /* renamed from: a */
        void mo939a();

        /* renamed from: a */
        void mo940a(int i);
    }

    /* renamed from: android.support.design.widget.m$b */
    private static class C0205b {

        /* renamed from: a */
        final WeakReference<C0204a> f645a;

        /* renamed from: b */
        int f646b;

        /* renamed from: c */
        boolean f647c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo941a(C0204a aVar) {
            return aVar != null && this.f645a.get() == aVar;
        }
    }

    private C0202m() {
    }

    /* renamed from: a */
    static C0202m m810a() {
        if (f639a == null) {
            f639a = new C0202m();
        }
        return f639a;
    }

    /* renamed from: a */
    private boolean m811a(C0205b bVar, int i) {
        C0204a aVar = (C0204a) bVar.f645a.get();
        if (aVar == null) {
            return false;
        }
        this.f641c.removeCallbacksAndMessages(bVar);
        aVar.mo940a(i);
        return true;
    }

    /* renamed from: b */
    private void m812b() {
        if (this.f643e != null) {
            this.f642d = this.f643e;
            this.f643e = null;
            C0204a aVar = (C0204a) this.f642d.f645a.get();
            if (aVar != null) {
                aVar.mo939a();
            } else {
                this.f642d = null;
            }
        }
    }

    /* renamed from: b */
    private void m813b(C0205b bVar) {
        if (bVar.f646b != -2) {
            int i = 2750;
            if (bVar.f646b > 0) {
                i = bVar.f646b;
            } else if (bVar.f646b == -1) {
                i = 1500;
            }
            this.f641c.removeCallbacksAndMessages(bVar);
            this.f641c.sendMessageDelayed(Message.obtain(this.f641c, 0, bVar), (long) i);
        }
    }

    /* renamed from: f */
    private boolean m814f(C0204a aVar) {
        return this.f642d != null && this.f642d.mo941a(aVar);
    }

    /* renamed from: g */
    private boolean m815g(C0204a aVar) {
        return this.f643e != null && this.f643e.mo941a(aVar);
    }

    /* renamed from: a */
    public void mo931a(C0204a aVar) {
        synchronized (this.f640b) {
            if (m814f(aVar)) {
                this.f642d = null;
                if (this.f643e != null) {
                    m812b();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo932a(C0204a aVar, int i) {
        C0205b bVar;
        synchronized (this.f640b) {
            if (m814f(aVar)) {
                bVar = this.f642d;
            } else if (m815g(aVar)) {
                bVar = this.f643e;
            }
            m811a(bVar, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo933a(C0205b bVar) {
        synchronized (this.f640b) {
            if (this.f642d == bVar || this.f643e == bVar) {
                m811a(bVar, 2);
            }
        }
    }

    /* renamed from: b */
    public void mo934b(C0204a aVar) {
        synchronized (this.f640b) {
            if (m814f(aVar)) {
                m813b(this.f642d);
            }
        }
    }

    /* renamed from: c */
    public void mo935c(C0204a aVar) {
        synchronized (this.f640b) {
            if (m814f(aVar) && !this.f642d.f647c) {
                this.f642d.f647c = true;
                this.f641c.removeCallbacksAndMessages(this.f642d);
            }
        }
    }

    /* renamed from: d */
    public void mo936d(C0204a aVar) {
        synchronized (this.f640b) {
            if (m814f(aVar) && this.f642d.f647c) {
                this.f642d.f647c = false;
                m813b(this.f642d);
            }
        }
    }

    /* renamed from: e */
    public boolean mo937e(C0204a aVar) {
        boolean z;
        synchronized (this.f640b) {
            if (!m814f(aVar)) {
                if (!m815g(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }
}
