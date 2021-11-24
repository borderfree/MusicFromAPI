package com.bumptech.glide.load.p044b.p045a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p042a.p043a.C1264b;
import com.bumptech.glide.load.p042a.p043a.C1265c;
import com.bumptech.glide.load.p044b.C1343n;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.load.p044b.C1345o;
import com.bumptech.glide.load.p044b.C1351r;
import com.bumptech.glide.p039f.C1230b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.c */
public class C1299c implements C1343n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f4535a;

    /* renamed from: com.bumptech.glide.load.b.a.c$a */
    public static class C1300a implements C1345o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f4536a;

        public C1300a(Context context) {
            this.f4536a = context;
        }

        /* renamed from: a */
        public C1343n<Uri, InputStream> mo5975a(C1351r rVar) {
            return new C1299c(this.f4536a);
        }
    }

    public C1299c(Context context) {
        this.f4535a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C1344a<InputStream> mo5971a(Uri uri, int i, int i2, C1379e eVar) {
        if (C1264b.m6730a(i, i2)) {
            return new C1344a<>(new C1230b(uri), C1265c.m6735a(this.f4535a, uri));
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo5973a(Uri uri) {
        return C1264b.m6733c(uri);
    }
}
