package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.p009v4.p019g.C0505k.C0506a;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.p048c.C1440a;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.p040g.p041a.C1238a.C1244c;
import com.bumptech.glide.p040g.p041a.C1247c;
import com.bumptech.glide.request.C1595h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.j */
class C1469j<R> implements C1244c, C1381a<R> {

    /* renamed from: a */
    private static final C1470a f4856a = new C1470a();

    /* renamed from: b */
    private static final Handler f4857b = new Handler(Looper.getMainLooper(), new C1471b());

    /* renamed from: c */
    private final List<C1595h> f4858c;

    /* renamed from: d */
    private final C1247c f4859d;

    /* renamed from: e */
    private final C0506a<C1469j<?>> f4860e;

    /* renamed from: f */
    private final C1470a f4861f;

    /* renamed from: g */
    private final C1472k f4862g;

    /* renamed from: h */
    private final C1440a f4863h;

    /* renamed from: i */
    private final C1440a f4864i;

    /* renamed from: j */
    private final C1440a f4865j;

    /* renamed from: k */
    private final C1440a f4866k;

    /* renamed from: l */
    private C1375c f4867l;

    /* renamed from: m */
    private boolean f4868m;

    /* renamed from: n */
    private boolean f4869n;

    /* renamed from: o */
    private boolean f4870o;

    /* renamed from: p */
    private boolean f4871p;

    /* renamed from: q */
    private C1482s<?> f4872q;

    /* renamed from: r */
    private DataSource f4873r;

    /* renamed from: s */
    private boolean f4874s;

    /* renamed from: t */
    private GlideException f4875t;

    /* renamed from: u */
    private boolean f4876u;

    /* renamed from: v */
    private List<C1595h> f4877v;

    /* renamed from: w */
    private C1475n<?> f4878w;

    /* renamed from: x */
    private DecodeJob<R> f4879x;

    /* renamed from: y */
    private volatile boolean f4880y;

    /* renamed from: com.bumptech.glide.load.engine.j$a */
    static class C1470a {
        C1470a() {
        }

        /* renamed from: a */
        public <R> C1475n<R> mo6264a(C1482s<R> sVar, boolean z) {
            return new C1475n<>(sVar, z, true);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$b */
    private static class C1471b implements Callback {
        C1471b() {
        }

        public boolean handleMessage(Message message) {
            C1469j jVar = (C1469j) message.obj;
            switch (message.what) {
                case 1:
                    jVar.mo6261c();
                    break;
                case 2:
                    jVar.mo6263f();
                    break;
                case 3:
                    jVar.mo6262e();
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unrecognized message: ");
                    sb.append(message.what);
                    throw new IllegalStateException(sb.toString());
            }
            return true;
        }
    }

    C1469j(C1440a aVar, C1440a aVar2, C1440a aVar3, C1440a aVar4, C1472k kVar, C0506a<C1469j<?>> aVar5) {
        this(aVar, aVar2, aVar3, aVar4, kVar, aVar5, f4856a);
    }

    C1469j(C1440a aVar, C1440a aVar2, C1440a aVar3, C1440a aVar4, C1472k kVar, C0506a<C1469j<?>> aVar5, C1470a aVar6) {
        this.f4858c = new ArrayList(2);
        this.f4859d = C1247c.m6662a();
        this.f4863h = aVar;
        this.f4864i = aVar2;
        this.f4865j = aVar3;
        this.f4866k = aVar4;
        this.f4862g = kVar;
        this.f4860e = aVar5;
        this.f4861f = aVar6;
    }

    /* renamed from: a */
    private void m7380a(boolean z) {
        C1258j.m6707a();
        this.f4858c.clear();
        this.f4867l = null;
        this.f4878w = null;
        this.f4872q = null;
        if (this.f4877v != null) {
            this.f4877v.clear();
        }
        this.f4876u = false;
        this.f4880y = false;
        this.f4874s = false;
        this.f4879x.mo6070a(z);
        this.f4879x = null;
        this.f4875t = null;
        this.f4873r = null;
        this.f4860e.mo2002a(this);
    }

    /* renamed from: c */
    private void m7381c(C1595h hVar) {
        if (this.f4877v == null) {
            this.f4877v = new ArrayList(2);
        }
        if (!this.f4877v.contains(hVar)) {
            this.f4877v.add(hVar);
        }
    }

    /* renamed from: d */
    private boolean m7382d(C1595h hVar) {
        return this.f4877v != null && this.f4877v.contains(hVar);
    }

    /* renamed from: g */
    private C1440a m7383g() {
        return this.f4869n ? this.f4865j : this.f4870o ? this.f4866k : this.f4864i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1469j<R> mo6255a(C1375c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4867l = cVar;
        this.f4868m = z;
        this.f4869n = z2;
        this.f4870o = z3;
        this.f4871p = z4;
        return this;
    }

    /* renamed from: a */
    public void mo6076a(DecodeJob<?> decodeJob) {
        m7383g().execute(decodeJob);
    }

    /* renamed from: a */
    public void mo6077a(GlideException glideException) {
        this.f4875t = glideException;
        f4857b.obtainMessage(2, this).sendToTarget();
    }

    /* renamed from: a */
    public void mo6078a(C1482s<R> sVar, DataSource dataSource) {
        this.f4872q = sVar;
        this.f4873r = dataSource;
        f4857b.obtainMessage(1, this).sendToTarget();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6256a(C1595h hVar) {
        C1258j.m6707a();
        this.f4859d.mo5878b();
        if (this.f4874s) {
            hVar.mo6417a(this.f4878w, this.f4873r);
        } else if (this.f4876u) {
            hVar.mo6416a(this.f4875t);
        } else {
            this.f4858c.add(hVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6257a() {
        return this.f4871p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6258b() {
        if (!this.f4876u && !this.f4874s && !this.f4880y) {
            this.f4880y = true;
            this.f4879x.mo6072b();
            this.f4862g.mo6247a(this, this.f4867l);
        }
    }

    /* renamed from: b */
    public void mo6259b(DecodeJob<R> decodeJob) {
        this.f4879x = decodeJob;
        (decodeJob.mo6071a() ? this.f4863h : m7383g()).execute(decodeJob);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6260b(C1595h hVar) {
        C1258j.m6707a();
        this.f4859d.mo5878b();
        if (this.f4874s || this.f4876u) {
            m7381c(hVar);
            return;
        }
        this.f4858c.remove(hVar);
        if (this.f4858c.isEmpty()) {
            mo6258b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6261c() {
        this.f4859d.mo5878b();
        if (this.f4880y) {
            this.f4872q.mo6274f();
        } else if (this.f4858c.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else if (!this.f4874s) {
            this.f4878w = this.f4861f.mo6264a(this.f4872q, this.f4868m);
            this.f4874s = true;
            this.f4878w.mo6275g();
            this.f4862g.mo6248a(this, this.f4867l, this.f4878w);
            int size = this.f4858c.size();
            for (int i = 0; i < size; i++) {
                C1595h hVar = (C1595h) this.f4858c.get(i);
                if (!m7382d(hVar)) {
                    this.f4878w.mo6275g();
                    hVar.mo6417a(this.f4878w, this.f4873r);
                }
            }
            this.f4878w.mo6276h();
        } else {
            throw new IllegalStateException("Already have resource");
        }
        m7380a(false);
    }

    /* renamed from: c_ */
    public C1247c mo5876c_() {
        return this.f4859d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6262e() {
        this.f4859d.mo5878b();
        if (this.f4880y) {
            this.f4862g.mo6247a(this, this.f4867l);
            m7380a(false);
            return;
        }
        throw new IllegalStateException("Not cancelled");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo6263f() {
        this.f4859d.mo5878b();
        if (this.f4880y) {
            m7380a(false);
        } else if (this.f4858c.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        } else if (!this.f4876u) {
            this.f4876u = true;
            this.f4862g.mo6248a(this, this.f4867l, null);
            for (C1595h hVar : this.f4858c) {
                if (!m7382d(hVar)) {
                    hVar.mo6416a(this.f4875t);
                }
            }
            m7380a(false);
        } else {
            throw new IllegalStateException("Already failed once");
        }
    }
}
