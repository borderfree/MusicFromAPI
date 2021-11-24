package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.resource.p051b.C1499d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
public class C1529p implements C1488f<Uri, Bitmap> {

    /* renamed from: a */
    private final C1499d f4998a;

    /* renamed from: b */
    private final C1398e f4999b;

    public C1529p(C1499d dVar, C1398e eVar) {
        this.f4998a = dVar;
        this.f4999b = eVar;
    }

    /* renamed from: a */
    public C1482s<Bitmap> mo6289a(Uri uri, int i, int i2, C1379e eVar) {
        C1482s a = this.f4998a.mo6289a(uri, i, i2, eVar);
        if (a == null) {
            return null;
        }
        return C1523k.m7596a(this.f4999b, (Drawable) a.mo6272d(), i, i2);
    }

    /* renamed from: a */
    public boolean mo6290a(Uri uri, C1379e eVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
