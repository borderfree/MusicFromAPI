package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class agb extends Thread {

    /* renamed from: a */
    private static final boolean f11953a = C3504dv.f13779a;

    /* renamed from: b */
    private final BlockingQueue<auc<?>> f11954b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<auc<?>> f11955c;

    /* renamed from: d */
    private final C4109yy f11956d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3387a f11957e;

    /* renamed from: f */
    private volatile boolean f11958f = false;

    /* renamed from: g */
    private final aid f11959g;

    public agb(BlockingQueue<auc<?>> blockingQueue, BlockingQueue<auc<?>> blockingQueue2, C4109yy yyVar, C3387a aVar) {
        this.f11954b = blockingQueue;
        this.f11955c = blockingQueue2;
        this.f11956d = yyVar;
        this.f11957e = aVar;
        this.f11959g = new aid(this);
    }

    /* renamed from: b */
    private final void m16177b() {
        auc auc = (auc) this.f11954b.take();
        auc.mo12498b("cache-queue-take");
        auc.mo12505g();
        afd a = this.f11956d.mo13210a(auc.mo12503e());
        if (a == null) {
            auc.mo12498b("cache-miss");
            if (!this.f11959g.m16312b(auc)) {
                this.f11955c.put(auc);
            }
        } else if (a.mo11841a()) {
            auc.mo12498b("cache-hit-expired");
            auc.mo12489a(a);
            if (!this.f11959g.m16312b(auc)) {
                this.f11955c.put(auc);
            }
        } else {
            auc.mo12498b("cache-hit");
            bae a2 = auc.mo12491a(new asc(a.f11859a, a.f11865g));
            auc.mo12498b("cache-hit-parsed");
            if (a.f11864f < System.currentTimeMillis()) {
                auc.mo12498b("cache-hit-refresh-needed");
                auc.mo12489a(a);
                a2.f13446d = true;
                if (!this.f11959g.m16312b(auc)) {
                    this.f11957e.mo11428a(auc, a2, new ahc(this, auc));
                    return;
                }
            }
            this.f11957e.mo11427a(auc, a2);
        }
    }

    /* renamed from: a */
    public final void mo11885a() {
        this.f11958f = true;
        interrupt();
    }

    public final void run() {
        if (f11953a) {
            C3504dv.m18310a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f11956d.mo13211a();
        while (true) {
            try {
                m16177b();
            } catch (InterruptedException unused) {
                if (this.f11958f) {
                    return;
                }
            }
        }
    }
}
