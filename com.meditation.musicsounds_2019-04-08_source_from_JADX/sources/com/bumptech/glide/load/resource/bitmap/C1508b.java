package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1489g;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1398e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public class C1508b implements C1489g<BitmapDrawable> {

    /* renamed from: a */
    private final C1398e f4960a;

    /* renamed from: b */
    private final C1489g<Bitmap> f4961b;

    public C1508b(C1398e eVar, C1489g<Bitmap> gVar) {
        this.f4960a = eVar;
        this.f4961b = gVar;
    }

    /* renamed from: a */
    public EncodeStrategy mo6291a(C1379e eVar) {
        return this.f4961b.mo6291a(eVar);
    }

    /* renamed from: a */
    public boolean mo5922a(C1482s<BitmapDrawable> sVar, File file, C1379e eVar) {
        return this.f4961b.mo5922a(new C1510d(((BitmapDrawable) sVar.mo6272d()).getBitmap(), this.f4960a), file, eVar);
    }
}
