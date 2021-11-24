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
import com.bumptech.glide.load.resource.bitmap.C1536t;
import com.bumptech.glide.p039f.C1230b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.d */
public class C1301d implements C1343n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f4537a;

    /* renamed from: com.bumptech.glide.load.b.a.d$a */
    public static class C1302a implements C1345o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f4538a;

        public C1302a(Context context) {
            this.f4538a = context;
        }

        /* renamed from: a */
        public C1343n<Uri, InputStream> mo5975a(C1351r rVar) {
            return new C1301d(this.f4538a);
        }
    }

    public C1301d(Context context) {
        this.f4537a = context.getApplicationContext();
    }

    /* renamed from: a */
    private boolean m6849a(C1379e eVar) {
        Long l = (Long) eVar.mo6062a(C1536t.f5010a);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: a */
    public C1344a<InputStream> mo5971a(Uri uri, int i, int i2, C1379e eVar) {
        if (!C1264b.m6730a(i, i2) || !m6849a(eVar)) {
            return null;
        }
        return new C1344a<>(new C1230b(uri), C1265c.m6737b(this.f4537a, uri));
    }

    /* renamed from: a */
    public boolean mo5973a(Uri uri) {
        return C1264b.m6732b(uri);
    }
}
