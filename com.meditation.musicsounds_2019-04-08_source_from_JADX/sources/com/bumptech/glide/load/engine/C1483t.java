package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1451e.C1452a;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.t */
class C1483t implements C1273a<Object>, C1451e {

    /* renamed from: a */
    private final C1452a f4908a;

    /* renamed from: b */
    private final C1453f<?> f4909b;

    /* renamed from: c */
    private int f4910c;

    /* renamed from: d */
    private int f4911d = -1;

    /* renamed from: e */
    private C1375c f4912e;

    /* renamed from: f */
    private List<C1343n<File, ?>> f4913f;

    /* renamed from: g */
    private int f4914g;

    /* renamed from: h */
    private volatile C1344a<?> f4915h;

    /* renamed from: i */
    private File f4916i;

    /* renamed from: j */
    private C1484u f4917j;

    C1483t(C1453f<?> fVar, C1452a aVar) {
        this.f4909b = fVar;
        this.f4908a = aVar;
    }

    /* renamed from: c */
    private boolean m7434c() {
        return this.f4914g < this.f4913f.size();
    }

    /* renamed from: a */
    public void mo5945a(Exception exc) {
        this.f4908a.mo6068a(this.f4917j, exc, this.f4915h.f4587c, DataSource.RESOURCE_DISK_CACHE);
    }

    /* renamed from: a */
    public void mo5946a(Object obj) {
        this.f4908a.mo6069a(this.f4912e, obj, this.f4915h.f4587c, DataSource.RESOURCE_DISK_CACHE, this.f4917j);
    }

    /* renamed from: a */
    public boolean mo6170a() {
        List n = this.f4909b.mo6238n();
        boolean z = false;
        if (n.isEmpty()) {
            return false;
        }
        List k = this.f4909b.mo6235k();
        if (k.isEmpty() && File.class.equals(this.f4909b.mo6234j())) {
            return false;
        }
        while (true) {
            if (this.f4913f == null || !m7434c()) {
                this.f4911d++;
                if (this.f4911d >= k.size()) {
                    this.f4910c++;
                    if (this.f4910c >= n.size()) {
                        return false;
                    }
                    this.f4911d = 0;
                }
                C1375c cVar = (C1375c) n.get(this.f4910c);
                Class cls = (Class) k.get(this.f4911d);
                C1375c cVar2 = cVar;
                C1484u uVar = new C1484u(this.f4909b.mo6233i(), cVar2, this.f4909b.mo6230f(), this.f4909b.mo6231g(), this.f4909b.mo6232h(), this.f4909b.mo6227c(cls), cls, this.f4909b.mo6229e());
                this.f4917j = uVar;
                this.f4916i = this.f4909b.mo6223b().mo6172a(this.f4917j);
                if (this.f4916i != null) {
                    this.f4912e = cVar;
                    this.f4913f = this.f4909b.mo6217a(this.f4916i);
                    this.f4914g = 0;
                }
            } else {
                this.f4915h = null;
                while (!z && m7434c()) {
                    List<C1343n<File, ?>> list = this.f4913f;
                    int i = this.f4914g;
                    this.f4914g = i + 1;
                    this.f4915h = ((C1343n) list.get(i)).mo5971a(this.f4916i, this.f4909b.mo6231g(), this.f4909b.mo6232h(), this.f4909b.mo6229e());
                    if (this.f4915h != null && this.f4909b.mo6222a(this.f4915h.f4587c.mo5924a())) {
                        this.f4915h.f4587c.mo5931a(this.f4909b.mo6228d(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: b */
    public void mo6171b() {
        C1344a<?> aVar = this.f4915h;
        if (aVar != null) {
            aVar.f4587c.mo5933c();
        }
    }
}
