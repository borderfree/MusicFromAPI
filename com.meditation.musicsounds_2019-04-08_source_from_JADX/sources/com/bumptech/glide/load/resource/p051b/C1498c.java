package com.bumptech.glide.load.resource.p051b;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.C1482s;

/* renamed from: com.bumptech.glide.load.resource.b.c */
final class C1498c extends C1497b<Drawable> {
    private C1498c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    static C1482s<Drawable> m7481a(Drawable drawable) {
        if (drawable != null) {
            return new C1498c(drawable);
        }
        return null;
    }

    /* renamed from: c */
    public Class<Drawable> mo6271c() {
        return this.f4941a.getClass();
    }

    /* renamed from: e */
    public int mo6273e() {
        return Math.max(1, this.f4941a.getIntrinsicWidth() * this.f4941a.getIntrinsicHeight() * 4);
    }

    /* renamed from: f */
    public void mo6274f() {
    }
}
