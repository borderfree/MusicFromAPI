package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.C1477o;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.p040g.C1257i;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
public final class C1528o implements C1477o, C1482s<BitmapDrawable> {

    /* renamed from: a */
    private final Resources f4996a;

    /* renamed from: b */
    private final C1482s<Bitmap> f4997b;

    private C1528o(Resources resources, C1482s<Bitmap> sVar) {
        this.f4996a = (Resources) C1257i.m6691a(resources);
        this.f4997b = (C1482s) C1257i.m6691a(sVar);
    }

    /* renamed from: a */
    public static C1482s<BitmapDrawable> m7608a(Resources resources, C1482s<Bitmap> sVar) {
        if (sVar == null) {
            return null;
        }
        return new C1528o(resources, sVar);
    }

    /* renamed from: a */
    public void mo6278a() {
        if (this.f4997b instanceof C1477o) {
            ((C1477o) this.f4997b).mo6278a();
        }
    }

    /* renamed from: b */
    public BitmapDrawable mo6272d() {
        return new BitmapDrawable(this.f4996a, (Bitmap) this.f4997b.mo6272d());
    }

    /* renamed from: c */
    public Class<BitmapDrawable> mo6271c() {
        return BitmapDrawable.class;
    }

    /* renamed from: e */
    public int mo6273e() {
        return this.f4997b.mo6273e();
    }

    /* renamed from: f */
    public void mo6274f() {
        this.f4997b.mo6274f();
    }
}
