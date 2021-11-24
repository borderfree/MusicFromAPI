package com.bumptech.glide.load.p044b.p045a;

import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p044b.C1329g;
import com.bumptech.glide.load.p044b.C1343n;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.load.p044b.C1345o;
import com.bumptech.glide.load.p044b.C1351r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.b.a.e */
public class C1303e implements C1343n<URL, InputStream> {

    /* renamed from: a */
    private final C1343n<C1329g, InputStream> f4539a;

    /* renamed from: com.bumptech.glide.load.b.a.e$a */
    public static class C1304a implements C1345o<URL, InputStream> {
        /* renamed from: a */
        public C1343n<URL, InputStream> mo5975a(C1351r rVar) {
            return new C1303e(rVar.mo6038a(C1329g.class, InputStream.class));
        }
    }

    public C1303e(C1343n<C1329g, InputStream> nVar) {
        this.f4539a = nVar;
    }

    /* renamed from: a */
    public C1344a<InputStream> mo5971a(URL url, int i, int i2, C1379e eVar) {
        return this.f4539a.mo5971a(new C1329g(url), i, i2, eVar);
    }

    /* renamed from: a */
    public boolean mo5973a(URL url) {
        return true;
    }
}
