package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.a */
final class C1387a {

    /* renamed from: a */
    final Map<C1375c, C1391b> f4681a = new HashMap();

    /* renamed from: b */
    private final boolean f4682b;

    /* renamed from: c */
    private final Handler f4683c = new Handler(Looper.getMainLooper(), new Callback() {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            C1387a.this.mo6105a((C1391b) message.obj);
            return true;
        }
    });

    /* renamed from: d */
    private C1476a f4684d;

    /* renamed from: e */
    private ReferenceQueue<C1475n<?>> f4685e;

    /* renamed from: f */
    private Thread f4686f;

    /* renamed from: g */
    private volatile boolean f4687g;

    /* renamed from: h */
    private volatile C1390a f4688h;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    interface C1390a {
        /* renamed from: a */
        void mo6110a();
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    static final class C1391b extends WeakReference<C1475n<?>> {

        /* renamed from: a */
        final C1375c f4691a;

        /* renamed from: b */
        final boolean f4692b;

        /* renamed from: c */
        C1482s<?> f4693c;

        C1391b(C1375c cVar, C1475n<?> nVar, ReferenceQueue<? super C1475n<?>> referenceQueue, boolean z) {
            super(nVar, referenceQueue);
            this.f4691a = (C1375c) C1257i.m6691a(cVar);
            this.f4693c = (!nVar.mo6270b() || !z) ? null : (C1482s) C1257i.m6691a(nVar.mo6268a());
            this.f4692b = nVar.mo6270b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6111a() {
            this.f4693c = null;
            clear();
        }
    }

    C1387a(boolean z) {
        this.f4682b = z;
    }

    /* renamed from: b */
    private ReferenceQueue<C1475n<?>> m7107b() {
        if (this.f4685e == null) {
            this.f4685e = new ReferenceQueue<>();
            this.f4686f = new Thread(new Runnable() {
                public void run() {
                    Process.setThreadPriority(10);
                    C1387a.this.mo6102a();
                }
            }, "glide-active-resources");
            this.f4686f.start();
        }
        return this.f4685e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6102a() {
        while (!this.f4687g) {
            try {
                this.f4683c.obtainMessage(1, (C1391b) this.f4685e.remove()).sendToTarget();
                C1390a aVar = this.f4688h;
                if (aVar != null) {
                    aVar.mo6110a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6103a(C1375c cVar) {
        C1391b bVar = (C1391b) this.f4681a.remove(cVar);
        if (bVar != null) {
            bVar.mo6111a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6104a(C1375c cVar, C1475n<?> nVar) {
        C1391b bVar = (C1391b) this.f4681a.put(cVar, new C1391b(cVar, nVar, m7107b(), this.f4682b));
        if (bVar != null) {
            bVar.mo6111a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6105a(C1391b bVar) {
        C1258j.m6707a();
        this.f4681a.remove(bVar.f4691a);
        if (bVar.f4692b && bVar.f4693c != null) {
            C1475n nVar = new C1475n(bVar.f4693c, true, false);
            nVar.mo6269a(bVar.f4691a, this.f4684d);
            this.f4684d.mo6246a(bVar.f4691a, nVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6106a(C1476a aVar) {
        this.f4684d = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1475n<?> mo6107b(C1375c cVar) {
        C1391b bVar = (C1391b) this.f4681a.get(cVar);
        if (bVar == null) {
            return null;
        }
        C1475n<?> nVar = (C1475n) bVar.get();
        if (nVar == null) {
            mo6105a(bVar);
        }
        return nVar;
    }
}
