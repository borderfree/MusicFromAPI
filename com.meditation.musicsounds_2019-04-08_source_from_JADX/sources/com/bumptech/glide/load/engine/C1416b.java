package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1451e.C1452a;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.b */
class C1416b implements C1273a<Object>, C1451e {

    /* renamed from: a */
    private final List<C1375c> f4739a;

    /* renamed from: b */
    private final C1453f<?> f4740b;

    /* renamed from: c */
    private final C1452a f4741c;

    /* renamed from: d */
    private int f4742d;

    /* renamed from: e */
    private C1375c f4743e;

    /* renamed from: f */
    private List<C1343n<File, ?>> f4744f;

    /* renamed from: g */
    private int f4745g;

    /* renamed from: h */
    private volatile C1344a<?> f4746h;

    /* renamed from: i */
    private File f4747i;

    C1416b(C1453f<?> fVar, C1452a aVar) {
        this(fVar.mo6238n(), fVar, aVar);
    }

    C1416b(List<C1375c> list, C1453f<?> fVar, C1452a aVar) {
        this.f4742d = -1;
        this.f4739a = list;
        this.f4740b = fVar;
        this.f4741c = aVar;
    }

    /* renamed from: c */
    private boolean m7238c() {
        return this.f4745g < this.f4744f.size();
    }

    /* renamed from: a */
    public void mo5945a(Exception exc) {
        this.f4741c.mo6068a(this.f4743e, exc, this.f4746h.f4587c, DataSource.DATA_DISK_CACHE);
    }

    /* renamed from: a */
    public void mo5946a(Object obj) {
        this.f4741c.mo6069a(this.f4743e, obj, this.f4746h.f4587c, DataSource.DATA_DISK_CACHE, this.f4743e);
    }

    /* renamed from: a */
    public boolean mo6170a() {
        while (true) {
            boolean z = false;
            if (this.f4744f == null || !m7238c()) {
                this.f4742d++;
                if (this.f4742d >= this.f4739a.size()) {
                    return false;
                }
                C1375c cVar = (C1375c) this.f4739a.get(this.f4742d);
                this.f4747i = this.f4740b.mo6223b().mo6172a(new C1439c(cVar, this.f4740b.mo6230f()));
                if (this.f4747i != null) {
                    this.f4743e = cVar;
                    this.f4744f = this.f4740b.mo6217a(this.f4747i);
                    this.f4745g = 0;
                }
            } else {
                this.f4746h = null;
                while (!z && m7238c()) {
                    List<C1343n<File, ?>> list = this.f4744f;
                    int i = this.f4745g;
                    this.f4745g = i + 1;
                    this.f4746h = ((C1343n) list.get(i)).mo5971a(this.f4747i, this.f4740b.mo6231g(), this.f4740b.mo6232h(), this.f4740b.mo6229e());
                    if (this.f4746h != null && this.f4740b.mo6222a(this.f4746h.f4587c.mo5924a())) {
                        this.f4746h.f4587c.mo5931a(this.f4740b.mo6228d(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: b */
    public void mo6171b() {
        C1344a<?> aVar = this.f4746h;
        if (aVar != null) {
            aVar.f4587c.mo5933c();
        }
    }
}
