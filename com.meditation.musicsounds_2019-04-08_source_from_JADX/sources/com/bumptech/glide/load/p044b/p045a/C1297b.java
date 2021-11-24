package com.bumptech.glide.load.p044b.p045a;

import android.net.Uri;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p044b.C1329g;
import com.bumptech.glide.load.p044b.C1343n;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.load.p044b.C1345o;
import com.bumptech.glide.load.p044b.C1351r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.a.b */
public class C1297b implements C1343n<Uri, InputStream> {

    /* renamed from: a */
    private static final Set<String> f4533a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: b */
    private final C1343n<C1329g, InputStream> f4534b;

    /* renamed from: com.bumptech.glide.load.b.a.b$a */
    public static class C1298a implements C1345o<Uri, InputStream> {
        /* renamed from: a */
        public C1343n<Uri, InputStream> mo5975a(C1351r rVar) {
            return new C1297b(rVar.mo6038a(C1329g.class, InputStream.class));
        }
    }

    public C1297b(C1343n<C1329g, InputStream> nVar) {
        this.f4534b = nVar;
    }

    /* renamed from: a */
    public C1344a<InputStream> mo5971a(Uri uri, int i, int i2, C1379e eVar) {
        return this.f4534b.mo5971a(new C1329g(uri.toString()), i, i2, eVar);
    }

    /* renamed from: a */
    public boolean mo5973a(Uri uri) {
        return f4533a.contains(uri.getScheme());
    }
}
