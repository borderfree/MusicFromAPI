package com.bumptech.glide.load.p044b.p045a;

import com.bumptech.glide.load.C1376d;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p042a.C1282j;
import com.bumptech.glide.load.p044b.C1329g;
import com.bumptech.glide.load.p044b.C1340m;
import com.bumptech.glide.load.p044b.C1343n;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.load.p044b.C1345o;
import com.bumptech.glide.load.p044b.C1351r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.a */
public class C1295a implements C1343n<C1329g, InputStream> {

    /* renamed from: a */
    public static final C1376d<Integer> f4530a = C1376d.m7045a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));

    /* renamed from: b */
    private final C1340m<C1329g, C1329g> f4531b;

    /* renamed from: com.bumptech.glide.load.b.a.a$a */
    public static class C1296a implements C1345o<C1329g, InputStream> {

        /* renamed from: a */
        private final C1340m<C1329g, C1329g> f4532a = new C1340m<>(500);

        /* renamed from: a */
        public C1343n<C1329g, InputStream> mo5975a(C1351r rVar) {
            return new C1295a(this.f4532a);
        }
    }

    public C1295a() {
        this(null);
    }

    public C1295a(C1340m<C1329g, C1329g> mVar) {
        this.f4531b = mVar;
    }

    /* renamed from: a */
    public C1344a<InputStream> mo5971a(C1329g gVar, int i, int i2, C1379e eVar) {
        if (this.f4531b != null) {
            C1329g gVar2 = (C1329g) this.f4531b.mo6025a(gVar, 0, 0);
            if (gVar2 == null) {
                this.f4531b.mo6026a(gVar, 0, 0, gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new C1344a<>(gVar, new C1282j(gVar, ((Integer) eVar.mo6062a(f4530a)).intValue()));
    }

    /* renamed from: a */
    public boolean mo5973a(C1329g gVar) {
        return true;
    }
}
