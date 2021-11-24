package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.request.p055a.C1578g;
import com.bumptech.glide.request.p055a.C1579h;
import com.bumptech.glide.request.p056b.C1586b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.request.e */
public class C1591e<R> implements C1583b<R>, C1593f<R>, Runnable {

    /* renamed from: a */
    private static final C1592a f5129a = new C1592a();

    /* renamed from: b */
    private final Handler f5130b;

    /* renamed from: c */
    private final int f5131c;

    /* renamed from: d */
    private final int f5132d;

    /* renamed from: e */
    private final boolean f5133e;

    /* renamed from: f */
    private final C1592a f5134f;

    /* renamed from: g */
    private R f5135g;

    /* renamed from: h */
    private C1589c f5136h;

    /* renamed from: i */
    private boolean f5137i;

    /* renamed from: j */
    private boolean f5138j;

    /* renamed from: k */
    private boolean f5139k;

    /* renamed from: l */
    private GlideException f5140l;

    /* renamed from: com.bumptech.glide.request.e$a */
    static class C1592a {
        C1592a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6464a(Object obj) {
            obj.notifyAll();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6465a(Object obj, long j) {
            obj.wait(j);
        }
    }

    public C1591e(Handler handler, int i, int i2) {
        this(handler, i, i2, true, f5129a);
    }

    C1591e(Handler handler, int i, int i2, boolean z, C1592a aVar) {
        this.f5130b = handler;
        this.f5131c = i;
        this.f5132d = i2;
        this.f5133e = z;
        this.f5134f = aVar;
    }

    /* renamed from: a */
    private synchronized R m7885a(Long l) {
        if (this.f5133e && !isDone()) {
            C1258j.m6711b();
        }
        if (this.f5137i) {
            throw new CancellationException();
        } else if (this.f5139k) {
            throw new ExecutionException(this.f5140l);
        } else if (this.f5138j) {
            return this.f5135g;
        } else {
            if (l == null) {
                this.f5134f.mo6465a(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f5134f.mo6465a(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f5139k) {
                throw new ExecutionException(this.f5140l);
            } else if (this.f5137i) {
                throw new CancellationException();
            } else if (this.f5138j) {
                return this.f5135g;
            } else {
                throw new TimeoutException();
            }
        }
    }

    /* renamed from: b */
    private void m7886b() {
        this.f5130b.post(this);
    }

    /* renamed from: a */
    public C1589c mo6436a() {
        return this.f5136h;
    }

    /* renamed from: a */
    public void mo6437a(Drawable drawable) {
    }

    /* renamed from: a */
    public void mo6446a(C1578g gVar) {
        gVar.mo6415a(this.f5131c, this.f5132d);
    }

    /* renamed from: a */
    public void mo6438a(C1589c cVar) {
        this.f5136h = cVar;
    }

    /* renamed from: a */
    public synchronized void mo6401a(R r, C1586b<? super R> bVar) {
    }

    /* renamed from: a */
    public synchronized boolean mo6456a(GlideException glideException, Object obj, C1579h<R> hVar, boolean z) {
        this.f5139k = true;
        this.f5140l = glideException;
        this.f5134f.mo6464a(this);
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo6457a(R r, Object obj, C1579h<R> hVar, DataSource dataSource, boolean z) {
        this.f5138j = true;
        this.f5135g = r;
        this.f5134f.mo6464a(this);
        return false;
    }

    /* renamed from: b */
    public void mo6439b(Drawable drawable) {
    }

    /* renamed from: b */
    public void mo6447b(C1578g gVar) {
    }

    /* renamed from: c */
    public void mo5758c() {
    }

    /* renamed from: c */
    public synchronized void mo6440c(Drawable drawable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x000a:
            r0 = 1
            r2.f5137i = r0     // Catch:{ all -> 0x0019 }
            com.bumptech.glide.request.e$a r1 = r2.f5134f     // Catch:{ all -> 0x0019 }
            r1.mo6464a(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            r2.m7886b()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r2)
            return r0
        L_0x0019:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C1591e.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public void mo5759d() {
    }

    /* renamed from: e */
    public void mo5760e() {
    }

    public R get() {
        try {
            return m7885a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public R get(long j, TimeUnit timeUnit) {
        return m7885a(Long.valueOf(timeUnit.toMillis(j)));
    }

    public synchronized boolean isCancelled() {
        return this.f5137i;
    }

    public synchronized boolean isDone() {
        return this.f5137i || this.f5138j || this.f5139k;
    }

    public void run() {
        if (this.f5136h != null) {
            this.f5136h.mo6420c();
            this.f5136h = null;
        }
    }
}
