package com.bumptech.glide.load.resource.p054e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.resource.bitmap.C1510d;
import com.bumptech.glide.load.resource.p053d.C1549c;

/* renamed from: com.bumptech.glide.load.resource.e.c */
public final class C1564c implements C1566e<Drawable, byte[]> {

    /* renamed from: a */
    private final C1398e f5070a;

    /* renamed from: b */
    private final C1566e<Bitmap, byte[]> f5071b;

    /* renamed from: c */
    private final C1566e<C1549c, byte[]> f5072c;

    public C1564c(C1398e eVar, C1566e<Bitmap, byte[]> eVar2, C1566e<C1549c, byte[]> eVar3) {
        this.f5070a = eVar;
        this.f5071b = eVar2;
        this.f5072c = eVar3;
    }

    /* renamed from: a */
    private static C1482s<C1549c> m7741a(C1482s<Drawable> sVar) {
        return sVar;
    }

    /* renamed from: a */
    public C1482s<byte[]> mo6409a(C1482s<Drawable> sVar, C1379e eVar) {
        Drawable drawable = (Drawable) sVar.mo6272d();
        if (drawable instanceof BitmapDrawable) {
            return this.f5071b.mo6409a(C1510d.m7522a(((BitmapDrawable) drawable).getBitmap(), this.f5070a), eVar);
        }
        if (drawable instanceof C1549c) {
            return this.f5072c.mo6409a(m7741a(sVar), eVar);
        }
        return null;
    }
}
