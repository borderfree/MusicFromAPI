package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C1261a;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1451e.C1452a;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p040g.C1253e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.w */
class C1487w implements C1273a<Object>, C1451e, C1452a {

    /* renamed from: a */
    private final C1453f<?> f4929a;

    /* renamed from: b */
    private final C1452a f4930b;

    /* renamed from: c */
    private int f4931c;

    /* renamed from: d */
    private C1416b f4932d;

    /* renamed from: e */
    private Object f4933e;

    /* renamed from: f */
    private volatile C1344a<?> f4934f;

    /* renamed from: g */
    private C1439c f4935g;

    C1487w(C1453f<?> fVar, C1452a aVar) {
        this.f4929a = fVar;
        this.f4930b = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m7442b(Object obj) {
        long a = C1253e.m6677a();
        try {
            C1261a a2 = this.f4929a.mo6216a(obj);
            C1449d dVar = new C1449d(a2, obj, this.f4929a.mo6229e());
            this.f4935g = new C1439c(this.f4934f.f4585a, this.f4929a.mo6230f());
            this.f4929a.mo6223b().mo6173a(this.f4935g, dVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.f4935g);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(a2);
                sb.append(", duration: ");
                sb.append(C1253e.m6676a(a));
                Log.v("SourceGenerator", sb.toString());
            }
            this.f4934f.f4587c.mo5932b();
            this.f4932d = new C1416b(Collections.singletonList(this.f4934f.f4585a), this.f4929a, this);
        } catch (Throwable th) {
            this.f4934f.f4587c.mo5932b();
            throw th;
        }
    }

    /* renamed from: d */
    private boolean m7443d() {
        return this.f4931c < this.f4929a.mo6237m().size();
    }

    /* renamed from: a */
    public void mo6068a(C1375c cVar, Exception exc, C1272d<?> dVar, DataSource dataSource) {
        this.f4930b.mo6068a(cVar, exc, dVar, this.f4934f.f4587c.mo5934d());
    }

    /* renamed from: a */
    public void mo6069a(C1375c cVar, Object obj, C1272d<?> dVar, DataSource dataSource, C1375c cVar2) {
        this.f4930b.mo6069a(cVar, obj, dVar, this.f4934f.f4587c.mo5934d(), cVar);
    }

    /* renamed from: a */
    public void mo5945a(Exception exc) {
        this.f4930b.mo6068a(this.f4935g, exc, this.f4934f.f4587c, this.f4934f.f4587c.mo5934d());
    }

    /* renamed from: a */
    public void mo5946a(Object obj) {
        C1456h c = this.f4929a.mo6226c();
        if (obj == null || !c.mo6242a(this.f4934f.f4587c.mo5934d())) {
            this.f4930b.mo6069a(this.f4934f.f4585a, obj, this.f4934f.f4587c, this.f4934f.f4587c.mo5934d(), this.f4935g);
            return;
        }
        this.f4933e = obj;
        this.f4930b.mo6073c();
    }

    /* renamed from: a */
    public boolean mo6170a() {
        if (this.f4933e != null) {
            Object obj = this.f4933e;
            this.f4933e = null;
            m7442b(obj);
        }
        if (this.f4932d != null && this.f4932d.mo6170a()) {
            return true;
        }
        this.f4932d = null;
        this.f4934f = null;
        boolean z = false;
        while (!z && m7443d()) {
            List m = this.f4929a.mo6237m();
            int i = this.f4931c;
            this.f4931c = i + 1;
            this.f4934f = (C1344a) m.get(i);
            if (this.f4934f != null && (this.f4929a.mo6226c().mo6242a(this.f4934f.f4587c.mo5934d()) || this.f4929a.mo6222a(this.f4934f.f4587c.mo5924a()))) {
                this.f4934f.f4587c.mo5931a(this.f4929a.mo6228d(), this);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo6171b() {
        C1344a<?> aVar = this.f4934f;
        if (aVar != null) {
            aVar.f4587c.mo5933c();
        }
    }

    /* renamed from: c */
    public void mo6073c() {
        throw new UnsupportedOperationException();
    }
}
