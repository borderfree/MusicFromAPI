package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.C1477o;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
public class C1510d implements C1477o, C1482s<Bitmap> {

    /* renamed from: a */
    private final Bitmap f4965a;

    /* renamed from: b */
    private final C1398e f4966b;

    public C1510d(Bitmap bitmap, C1398e eVar) {
        this.f4965a = (Bitmap) C1257i.m6692a(bitmap, "Bitmap must not be null");
        this.f4966b = (C1398e) C1257i.m6692a(eVar, "BitmapPool must not be null");
    }

    /* renamed from: a */
    public static C1510d m7522a(Bitmap bitmap, C1398e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1510d(bitmap, eVar);
    }

    /* renamed from: a */
    public void mo6278a() {
        this.f4965a.prepareToDraw();
    }

    /* renamed from: b */
    public Bitmap mo6272d() {
        return this.f4965a;
    }

    /* renamed from: c */
    public Class<Bitmap> mo6271c() {
        return Bitmap.class;
    }

    /* renamed from: e */
    public int mo6273e() {
        return C1258j.m6700a(this.f4965a);
    }

    /* renamed from: f */
    public void mo6274f() {
        this.f4966b.mo6141a(this.f4965a);
    }
}
