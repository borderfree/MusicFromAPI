package com.bumptech.glide.load.p044b;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p039f.C1230b;

/* renamed from: com.bumptech.glide.load.b.v */
public class C1365v<Model> implements C1343n<Model, Model> {

    /* renamed from: a */
    private static final C1365v<?> f4617a = new C1365v<>();

    /* renamed from: com.bumptech.glide.load.b.v$a */
    public static class C1366a<Model> implements C1345o<Model, Model> {

        /* renamed from: a */
        private static final C1366a<?> f4618a = new C1366a<>();

        /* renamed from: a */
        public static <T> C1366a<T> m7020a() {
            return f4618a;
        }

        /* renamed from: a */
        public C1343n<Model, Model> mo5975a(C1351r rVar) {
            return C1365v.m7017a();
        }
    }

    /* renamed from: com.bumptech.glide.load.b.v$b */
    private static class C1367b<Model> implements C1272d<Model> {

        /* renamed from: a */
        private final Model f4619a;

        C1367b(Model model) {
            this.f4619a = model;
        }

        /* renamed from: a */
        public Class<Model> mo5924a() {
            return this.f4619a.getClass();
        }

        /* renamed from: a */
        public void mo5931a(Priority priority, C1273a<? super Model> aVar) {
            aVar.mo5946a(this.f4619a);
        }

        /* renamed from: b */
        public void mo5932b() {
        }

        /* renamed from: c */
        public void mo5933c() {
        }

        /* renamed from: d */
        public DataSource mo5934d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: a */
    public static <T> C1365v<T> m7017a() {
        return f4617a;
    }

    /* renamed from: a */
    public C1344a<Model> mo5971a(Model model, int i, int i2, C1379e eVar) {
        return new C1344a<>(new C1230b(model), new C1367b(model));
    }

    /* renamed from: a */
    public boolean mo5973a(Model model) {
        return true;
    }
}
