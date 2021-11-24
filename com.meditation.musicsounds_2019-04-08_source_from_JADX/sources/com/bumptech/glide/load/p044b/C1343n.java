package com.bumptech.glide.load.p044b;

import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.p040g.C1257i;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b.n */
public interface C1343n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.b.n$a */
    public static class C1344a<Data> {

        /* renamed from: a */
        public final C1375c f4585a;

        /* renamed from: b */
        public final List<C1375c> f4586b;

        /* renamed from: c */
        public final C1272d<Data> f4587c;

        public C1344a(C1375c cVar, C1272d<Data> dVar) {
            this(cVar, Collections.emptyList(), dVar);
        }

        public C1344a(C1375c cVar, List<C1375c> list, C1272d<Data> dVar) {
            this.f4585a = (C1375c) C1257i.m6691a(cVar);
            this.f4586b = (List) C1257i.m6691a(list);
            this.f4587c = (C1272d) C1257i.m6691a(dVar);
        }
    }

    /* renamed from: a */
    C1344a<Data> mo5971a(Model model, int i, int i2, C1379e eVar);

    /* renamed from: a */
    boolean mo5973a(Model model);
}
