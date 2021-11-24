package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.p040g.C1258j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
public abstract class C1511e implements C1490h<Bitmap> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo6316a(C1398e eVar, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final C1482s<Bitmap> mo6292a(Context context, C1482s<Bitmap> sVar, int i, int i2) {
        if (C1258j.m6708a(i, i2)) {
            C1398e a = C1186c.m6450a(context).mo5735a();
            Bitmap bitmap = (Bitmap) sVar.mo6272d();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a2 = mo6316a(a, bitmap, i, i2);
            return bitmap.equals(a2) ? sVar : C1510d.m7522a(a2, a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
}
