package com.bumptech.glide.load.p044b;

import android.net.Uri;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.x */
public class C1373x<Data> implements C1343n<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f4625a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: b */
    private final C1343n<C1329g, Data> f4626b;

    /* renamed from: com.bumptech.glide.load.b.x$a */
    public static class C1374a implements C1345o<Uri, InputStream> {
        /* renamed from: a */
        public C1343n<Uri, InputStream> mo5975a(C1351r rVar) {
            return new C1373x(rVar.mo6038a(C1329g.class, InputStream.class));
        }
    }

    public C1373x(C1343n<C1329g, Data> nVar) {
        this.f4626b = nVar;
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(Uri uri, int i, int i2, C1379e eVar) {
        return this.f4626b.mo5971a(new C1329g(uri.toString()), i, i2, eVar);
    }

    /* renamed from: a */
    public boolean mo5973a(Uri uri) {
        return f4625a.contains(uri.getScheme());
    }
}
