package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p009v4.p019g.C0505k.C0506a;
import android.util.Log;
import com.bumptech.glide.C1216e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1462i;
import com.bumptech.glide.load.engine.C1462i.C1468d;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.p051b.C1496a;
import com.bumptech.glide.p040g.C1253e;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.p040g.p041a.C1238a;
import com.bumptech.glide.p040g.p041a.C1238a.C1242a;
import com.bumptech.glide.p040g.p041a.C1238a.C1244c;
import com.bumptech.glide.p040g.p041a.C1247c;
import com.bumptech.glide.request.p055a.C1578g;
import com.bumptech.glide.request.p055a.C1579h;
import com.bumptech.glide.request.p056b.C1588c;

public final class SingleRequest<R> implements C1244c, C1578g, C1589c, C1595h {

    /* renamed from: a */
    private static final C0506a<SingleRequest<?>> f5078a = C1238a.m6643a(150, (C1242a<T>) new C1242a<SingleRequest<?>>() {
        /* renamed from: a */
        public SingleRequest<?> mo5874b() {
            return new SingleRequest<>();
        }
    });

    /* renamed from: c */
    private static final boolean f5079c = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f5080A;

    /* renamed from: B */
    private int f5081B;

    /* renamed from: b */
    private boolean f5082b;

    /* renamed from: d */
    private final String f5083d;

    /* renamed from: e */
    private final C1247c f5084e;

    /* renamed from: f */
    private C1593f<R> f5085f;

    /* renamed from: g */
    private C1590d f5086g;

    /* renamed from: h */
    private Context f5087h;

    /* renamed from: i */
    private C1216e f5088i;

    /* renamed from: j */
    private Object f5089j;

    /* renamed from: k */
    private Class<R> f5090k;

    /* renamed from: l */
    private C1594g f5091l;

    /* renamed from: m */
    private int f5092m;

    /* renamed from: n */
    private int f5093n;

    /* renamed from: o */
    private Priority f5094o;

    /* renamed from: p */
    private C1579h<R> f5095p;

    /* renamed from: q */
    private C1593f<R> f5096q;

    /* renamed from: r */
    private C1462i f5097r;

    /* renamed from: s */
    private C1588c<? super R> f5098s;

    /* renamed from: t */
    private C1482s<R> f5099t;

    /* renamed from: u */
    private C1468d f5100u;

    /* renamed from: v */
    private long f5101v;

    /* renamed from: w */
    private Status f5102w;

    /* renamed from: x */
    private Drawable f5103x;

    /* renamed from: y */
    private Drawable f5104y;

    /* renamed from: z */
    private Drawable f5105z;

    private enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    SingleRequest() {
        this.f5083d = f5079c ? String.valueOf(super.hashCode()) : null;
        this.f5084e = C1247c.m6662a();
    }

    /* renamed from: a */
    private static int m7751a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: a */
    private Drawable m7752a(int i) {
        return C1496a.m7473a((Context) this.f5088i, i, this.f5091l.mo6510t() != null ? this.f5091l.mo6510t() : this.f5087h.getTheme());
    }

    /* renamed from: a */
    public static <R> SingleRequest<R> m7753a(Context context, C1216e eVar, Object obj, Class<R> cls, C1594g gVar, int i, int i2, Priority priority, C1579h<R> hVar, C1593f<R> fVar, C1593f<R> fVar2, C1590d dVar, C1462i iVar, C1588c<? super R> cVar) {
        SingleRequest<R> singleRequest = (SingleRequest) f5078a.mo2001a();
        if (singleRequest == null) {
            singleRequest = new SingleRequest<>();
        }
        singleRequest.m7758b(context, eVar, obj, cls, gVar, i, i2, priority, hVar, fVar, fVar2, dVar, iVar, cVar);
        return singleRequest;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m7754a(GlideException glideException, int i) {
        this.f5084e.mo5878b();
        int e = this.f5088i.mo5811e();
        if (e <= i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Load failed for ");
            sb.append(this.f5089j);
            sb.append(" with size [");
            sb.append(this.f5080A);
            sb.append("x");
            sb.append(this.f5081B);
            sb.append("]");
            Log.w("Glide", sb.toString(), glideException);
            if (e <= 4) {
                glideException.logRootCauses("Glide");
            }
        }
        this.f5100u = null;
        this.f5102w = Status.FAILED;
        this.f5082b = true;
        try {
            if ((this.f5096q == null || !this.f5096q.mo6456a(glideException, this.f5089j, this.f5095p, m7767s())) && (this.f5085f == null || !this.f5085f.mo6456a(glideException, this.f5089j, this.f5095p, m7767s()))) {
                m7763o();
            }
            this.f5082b = false;
            m7769u();
        } catch (Throwable th) {
            this.f5082b = false;
            throw th;
        }
    }

    /* renamed from: a */
    private void m7755a(C1482s<?> sVar) {
        this.f5097r.mo6249a(sVar);
        this.f5099t = null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0092, code lost:
        if (r7.f5085f.mo6457a(r9, r7.f5089j, r7.f5095p, r10, r6) == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x007f, code lost:
        if (r7.f5096q.mo6457a(r9, r7.f5089j, r7.f5095p, r10, r6) == false) goto L_0x0081;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7756a(com.bumptech.glide.load.engine.C1482s<R> r8, R r9, com.bumptech.glide.load.DataSource r10) {
        /*
            r7 = this;
            boolean r6 = r7.m7767s()
            com.bumptech.glide.request.SingleRequest$Status r0 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE
            r7.f5102w = r0
            r7.f5099t = r8
            com.bumptech.glide.e r8 = r7.f5088i
            int r8 = r8.mo5811e()
            r0 = 3
            if (r8 > r0) goto L_0x006a
            java.lang.String r8 = "Glide"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Finished loading "
            r0.append(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " from "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " for "
            r0.append(r1)
            java.lang.Object r1 = r7.f5089j
            r0.append(r1)
            java.lang.String r1 = " with size ["
            r0.append(r1)
            int r1 = r7.f5080A
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r7.f5081B
            r0.append(r1)
            java.lang.String r1 = "] in "
            r0.append(r1)
            long r1 = r7.f5101v
            double r1 = com.bumptech.glide.p040g.C1253e.m6676a(r1)
            r0.append(r1)
            java.lang.String r1 = " ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r8, r0)
        L_0x006a:
            r8 = 1
            r7.f5082b = r8
            r8 = 0
            com.bumptech.glide.request.f<R> r0 = r7.f5096q     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0081
            com.bumptech.glide.request.f<R> r0 = r7.f5096q     // Catch:{ all -> 0x00a5 }
            java.lang.Object r2 = r7.f5089j     // Catch:{ all -> 0x00a5 }
            com.bumptech.glide.request.a.h<R> r3 = r7.f5095p     // Catch:{ all -> 0x00a5 }
            r1 = r9
            r4 = r10
            r5 = r6
            boolean r0 = r0.mo6457a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x009f
        L_0x0081:
            com.bumptech.glide.request.f<R> r0 = r7.f5085f     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0094
            com.bumptech.glide.request.f<R> r0 = r7.f5085f     // Catch:{ all -> 0x00a5 }
            java.lang.Object r2 = r7.f5089j     // Catch:{ all -> 0x00a5 }
            com.bumptech.glide.request.a.h<R> r3 = r7.f5095p     // Catch:{ all -> 0x00a5 }
            r1 = r9
            r4 = r10
            r5 = r6
            boolean r0 = r0.mo6457a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x009f
        L_0x0094:
            com.bumptech.glide.request.b.c<? super R> r0 = r7.f5098s     // Catch:{ all -> 0x00a5 }
            com.bumptech.glide.request.b.b r10 = r0.mo6455a(r10, r6)     // Catch:{ all -> 0x00a5 }
            com.bumptech.glide.request.a.h<R> r0 = r7.f5095p     // Catch:{ all -> 0x00a5 }
            r0.mo6401a(r9, r10)     // Catch:{ all -> 0x00a5 }
        L_0x009f:
            r7.f5082b = r8
            r7.m7768t()
            return
        L_0x00a5:
            r9 = move-exception
            r7.f5082b = r8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.m7756a(com.bumptech.glide.load.engine.s, java.lang.Object, com.bumptech.glide.load.DataSource):void");
    }

    /* renamed from: a */
    private void m7757a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f5083d);
        Log.v("Request", sb.toString());
    }

    /* renamed from: b */
    private void m7758b(Context context, C1216e eVar, Object obj, Class<R> cls, C1594g gVar, int i, int i2, Priority priority, C1579h<R> hVar, C1593f<R> fVar, C1593f<R> fVar2, C1590d dVar, C1462i iVar, C1588c<? super R> cVar) {
        this.f5087h = context;
        this.f5088i = eVar;
        this.f5089j = obj;
        this.f5090k = cls;
        this.f5091l = gVar;
        this.f5092m = i;
        this.f5093n = i2;
        this.f5094o = priority;
        this.f5095p = hVar;
        this.f5085f = fVar;
        this.f5096q = fVar2;
        this.f5086g = dVar;
        this.f5097r = iVar;
        this.f5098s = cVar;
        this.f5102w = Status.PENDING;
    }

    /* renamed from: k */
    private void m7759k() {
        if (this.f5082b) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: l */
    private Drawable m7760l() {
        if (this.f5103x == null) {
            this.f5103x = this.f5091l.mo6504n();
            if (this.f5103x == null && this.f5091l.mo6505o() > 0) {
                this.f5103x = m7752a(this.f5091l.mo6505o());
            }
        }
        return this.f5103x;
    }

    /* renamed from: m */
    private Drawable m7761m() {
        if (this.f5104y == null) {
            this.f5104y = this.f5091l.mo6507q();
            if (this.f5104y == null && this.f5091l.mo6506p() > 0) {
                this.f5104y = m7752a(this.f5091l.mo6506p());
            }
        }
        return this.f5104y;
    }

    /* renamed from: n */
    private Drawable m7762n() {
        if (this.f5105z == null) {
            this.f5105z = this.f5091l.mo6509s();
            if (this.f5105z == null && this.f5091l.mo6508r() > 0) {
                this.f5105z = m7752a(this.f5091l.mo6508r());
            }
        }
        return this.f5105z;
    }

    /* renamed from: o */
    private void m7763o() {
        if (m7766r()) {
            Drawable drawable = null;
            if (this.f5089j == null) {
                drawable = m7762n();
            }
            if (drawable == null) {
                drawable = m7760l();
            }
            if (drawable == null) {
                drawable = m7761m();
            }
            this.f5095p.mo6440c(drawable);
        }
    }

    /* renamed from: p */
    private boolean m7764p() {
        return this.f5086g == null || this.f5086g.mo6430b(this);
    }

    /* renamed from: q */
    private boolean m7765q() {
        return this.f5086g == null || this.f5086g.mo6432d(this);
    }

    /* renamed from: r */
    private boolean m7766r() {
        return this.f5086g == null || this.f5086g.mo6431c(this);
    }

    /* renamed from: s */
    private boolean m7767s() {
        return this.f5086g == null || !this.f5086g.mo6435j();
    }

    /* renamed from: t */
    private void m7768t() {
        if (this.f5086g != null) {
            this.f5086g.mo6433e(this);
        }
    }

    /* renamed from: u */
    private void m7769u() {
        if (this.f5086g != null) {
            this.f5086g.mo6434f(this);
        }
    }

    /* renamed from: a */
    public void mo6414a() {
        m7759k();
        this.f5084e.mo5878b();
        this.f5101v = C1253e.m6677a();
        if (this.f5089j == null) {
            if (C1258j.m6708a(this.f5092m, this.f5093n)) {
                this.f5080A = this.f5092m;
                this.f5081B = this.f5093n;
            }
            m7754a(new GlideException("Received null model"), m7762n() == null ? 5 : 3);
        } else if (this.f5102w == Status.RUNNING) {
            throw new IllegalArgumentException("Cannot restart a running request");
        } else if (this.f5102w == Status.COMPLETE) {
            mo6417a(this.f5099t, DataSource.MEMORY_CACHE);
        } else {
            this.f5102w = Status.WAITING_FOR_SIZE;
            if (C1258j.m6708a(this.f5092m, this.f5093n)) {
                mo6415a(this.f5092m, this.f5093n);
            } else {
                this.f5095p.mo6446a((C1578g) this);
            }
            if ((this.f5102w == Status.RUNNING || this.f5102w == Status.WAITING_FOR_SIZE) && m7766r()) {
                this.f5095p.mo6439b(m7761m());
            }
            if (f5079c) {
                StringBuilder sb = new StringBuilder();
                sb.append("finished run method in ");
                sb.append(C1253e.m6676a(this.f5101v));
                m7757a(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo6415a(int i, int i2) {
        this.f5084e.mo5878b();
        if (f5079c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Got onSizeReady in ");
            sb.append(C1253e.m6676a(this.f5101v));
            m7757a(sb.toString());
        }
        if (this.f5102w == Status.WAITING_FOR_SIZE) {
            this.f5102w = Status.RUNNING;
            float B = this.f5091l.mo6467B();
            this.f5080A = m7751a(i, B);
            this.f5081B = m7751a(i2, B);
            if (f5079c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("finished setup for calling load in ");
                sb2.append(C1253e.m6676a(this.f5101v));
                m7757a(sb2.toString());
            }
            C1462i iVar = this.f5097r;
            C1216e eVar = this.f5088i;
            C1468d a = iVar.mo6245a(eVar, this.f5089j, this.f5091l.mo6512v(), this.f5080A, this.f5081B, this.f5091l.mo6502l(), this.f5090k, this.f5094o, this.f5091l.mo6503m(), this.f5091l.mo6499i(), this.f5091l.mo6500j(), this.f5091l.mo6468C(), this.f5091l.mo6501k(), this.f5091l.mo6511u(), this.f5091l.mo6469D(), this.f5091l.mo6470E(), this.f5091l.mo6471F(), this);
            this.f5100u = a;
            if (this.f5102w != Status.RUNNING) {
                this.f5100u = null;
            }
            if (f5079c) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("finished onSizeReady in ");
                sb3.append(C1253e.m6676a(this.f5101v));
                m7757a(sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo6416a(GlideException glideException) {
        m7754a(glideException, 5);
    }

    /* renamed from: a */
    public void mo6417a(C1482s<?> sVar, DataSource dataSource) {
        this.f5084e.mo5878b();
        this.f5100u = null;
        if (sVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected to receive a Resource<R> with an object of ");
            sb.append(this.f5090k);
            sb.append(" inside, but instead got null.");
            mo6416a(new GlideException(sb.toString()));
            return;
        }
        Object d = sVar.mo6272d();
        if (d == null || !this.f5090k.isAssignableFrom(d.getClass())) {
            m7755a(sVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected to receive an object of ");
            sb2.append(this.f5090k);
            sb2.append(" but instead got ");
            sb2.append(d != null ? d.getClass() : "");
            sb2.append("{");
            sb2.append(d);
            sb2.append("} inside Resource{");
            sb2.append(sVar);
            sb2.append("}.");
            sb2.append(d != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
            mo6416a(new GlideException(sb2.toString()));
        } else if (!m7764p()) {
            m7755a(sVar);
            this.f5102w = Status.COMPLETE;
        } else {
            m7756a(sVar, d, dataSource);
        }
    }

    /* renamed from: a */
    public boolean mo6418a(C1589c cVar) {
        if (!(cVar instanceof SingleRequest)) {
            return false;
        }
        SingleRequest singleRequest = (SingleRequest) cVar;
        if (this.f5092m != singleRequest.f5092m || this.f5093n != singleRequest.f5093n || !C1258j.m6713b(this.f5089j, singleRequest.f5089j) || !this.f5090k.equals(singleRequest.f5090k) || !this.f5091l.equals(singleRequest.f5091l) || this.f5094o != singleRequest.f5094o) {
            return false;
        }
        if (this.f5096q != null) {
            if (singleRequest.f5096q == null) {
                return false;
            }
        } else if (singleRequest.f5096q != null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo6419b() {
        mo6420c();
        this.f5102w = Status.PAUSED;
    }

    /* renamed from: c */
    public void mo6420c() {
        C1258j.m6707a();
        m7759k();
        this.f5084e.mo5878b();
        if (this.f5102w != Status.CLEARED) {
            mo6427j();
            if (this.f5099t != null) {
                m7755a(this.f5099t);
            }
            if (m7765q()) {
                this.f5095p.mo6437a(m7761m());
            }
            this.f5102w = Status.CLEARED;
        }
    }

    /* renamed from: c_ */
    public C1247c mo5876c_() {
        return this.f5084e;
    }

    /* renamed from: d */
    public boolean mo6421d() {
        return this.f5102w == Status.RUNNING || this.f5102w == Status.WAITING_FOR_SIZE;
    }

    /* renamed from: e */
    public boolean mo6422e() {
        return this.f5102w == Status.COMPLETE;
    }

    /* renamed from: f */
    public boolean mo6423f() {
        return mo6422e();
    }

    /* renamed from: g */
    public boolean mo6424g() {
        return this.f5102w == Status.CANCELLED || this.f5102w == Status.CLEARED;
    }

    /* renamed from: h */
    public boolean mo6425h() {
        return this.f5102w == Status.FAILED;
    }

    /* renamed from: i */
    public void mo6426i() {
        m7759k();
        this.f5087h = null;
        this.f5088i = null;
        this.f5089j = null;
        this.f5090k = null;
        this.f5091l = null;
        this.f5092m = -1;
        this.f5093n = -1;
        this.f5095p = null;
        this.f5096q = null;
        this.f5085f = null;
        this.f5086g = null;
        this.f5098s = null;
        this.f5100u = null;
        this.f5103x = null;
        this.f5104y = null;
        this.f5105z = null;
        this.f5080A = -1;
        this.f5081B = -1;
        f5078a.mo2002a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo6427j() {
        m7759k();
        this.f5084e.mo5878b();
        this.f5095p.mo6447b((C1578g) this);
        this.f5102w = Status.CANCELLED;
        if (this.f5100u != null) {
            this.f5100u.mo6254a();
            this.f5100u = null;
        }
    }
}
