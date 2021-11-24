package com.bumptech.glide.load.p044b;

import android.support.p009v4.p019g.C0505k.C0506a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p040g.C1257i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b.q */
class C1349q<Model, Data> implements C1343n<Model, Data> {

    /* renamed from: a */
    private final List<C1343n<Model, Data>> f4592a;

    /* renamed from: b */
    private final C0506a<List<Throwable>> f4593b;

    /* renamed from: com.bumptech.glide.load.b.q$a */
    static class C1350a<Data> implements C1272d<Data>, C1273a<Data> {

        /* renamed from: a */
        private final List<C1272d<Data>> f4594a;

        /* renamed from: b */
        private final C0506a<List<Throwable>> f4595b;

        /* renamed from: c */
        private int f4596c = 0;

        /* renamed from: d */
        private Priority f4597d;

        /* renamed from: e */
        private C1273a<? super Data> f4598e;

        /* renamed from: f */
        private List<Throwable> f4599f;

        C1350a(List<C1272d<Data>> list, C0506a<List<Throwable>> aVar) {
            this.f4595b = aVar;
            C1257i.m6694a(list);
            this.f4594a = list;
        }

        /* renamed from: e */
        private void m6977e() {
            if (this.f4596c < this.f4594a.size() - 1) {
                this.f4596c++;
                mo5931a(this.f4597d, this.f4598e);
                return;
            }
            C1257i.m6691a(this.f4599f);
            this.f4598e.mo5945a((Exception) new GlideException("Fetch failed", (List<Throwable>) new ArrayList<Throwable>(this.f4599f)));
        }

        /* renamed from: a */
        public Class<Data> mo5924a() {
            return ((C1272d) this.f4594a.get(0)).mo5924a();
        }

        /* renamed from: a */
        public void mo5931a(Priority priority, C1273a<? super Data> aVar) {
            this.f4597d = priority;
            this.f4598e = aVar;
            this.f4599f = (List) this.f4595b.mo2001a();
            ((C1272d) this.f4594a.get(this.f4596c)).mo5931a(priority, this);
        }

        /* renamed from: a */
        public void mo5945a(Exception exc) {
            ((List) C1257i.m6691a(this.f4599f)).add(exc);
            m6977e();
        }

        /* renamed from: a */
        public void mo5946a(Data data) {
            if (data != null) {
                this.f4598e.mo5946a(data);
            } else {
                m6977e();
            }
        }

        /* renamed from: b */
        public void mo5932b() {
            if (this.f4599f != null) {
                this.f4595b.mo2002a(this.f4599f);
            }
            this.f4599f = null;
            for (C1272d b : this.f4594a) {
                b.mo5932b();
            }
        }

        /* renamed from: c */
        public void mo5933c() {
            for (C1272d c : this.f4594a) {
                c.mo5933c();
            }
        }

        /* renamed from: d */
        public DataSource mo5934d() {
            return ((C1272d) this.f4594a.get(0)).mo5934d();
        }
    }

    C1349q(List<C1343n<Model, Data>> list, C0506a<List<Throwable>> aVar) {
        this.f4592a = list;
        this.f4593b = aVar;
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(Model model, int i, int i2, C1379e eVar) {
        int size = this.f4592a.size();
        ArrayList arrayList = new ArrayList(size);
        C1375c cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1343n nVar = (C1343n) this.f4592a.get(i3);
            if (nVar.mo5973a(model)) {
                C1344a a = nVar.mo5971a(model, i, i2, eVar);
                if (a != null) {
                    cVar = a.f4585a;
                    arrayList.add(a.f4587c);
                }
            }
        }
        if (arrayList.isEmpty() || cVar == null) {
            return null;
        }
        return new C1344a<>(cVar, new C1350a(arrayList, this.f4593b));
    }

    /* renamed from: a */
    public boolean mo5973a(Model model) {
        for (C1343n a : this.f4592a) {
            if (a.mo5973a(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.f4592a.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
