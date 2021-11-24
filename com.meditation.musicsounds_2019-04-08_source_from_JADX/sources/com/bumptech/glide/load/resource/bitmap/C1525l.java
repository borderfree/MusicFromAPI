package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.engine.C1482s;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
public class C1525l implements C1490h<Drawable> {

    /* renamed from: b */
    private final C1490h<Bitmap> f4989b;

    /* renamed from: c */
    private final boolean f4990c;

    public C1525l(C1490h<Bitmap> hVar, boolean z) {
        this.f4989b = hVar;
        this.f4990c = z;
    }

    /* renamed from: a */
    private C1482s<Drawable> m7599a(Context context, C1482s<Bitmap> sVar) {
        return C1528o.m7608a(context.getResources(), sVar);
    }

    /* renamed from: a */
    public C1482s<Drawable> mo6292a(Context context, C1482s<Drawable> sVar, int i, int i2) {
        Drawable drawable = (Drawable) sVar.mo6272d();
        C1482s a = C1523k.m7596a(C1186c.m6450a(context).mo5735a(), drawable, i, i2);
        if (a != null) {
            C1482s a2 = this.f4989b.mo6292a(context, a, i, i2);
            if (!a2.equals(a)) {
                return m7599a(context, a2);
            }
            a2.mo6274f();
            return sVar;
        } else if (!this.f4990c) {
            return sVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(drawable);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public C1490h<BitmapDrawable> mo6334a() {
        return this;
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        this.f4989b.mo5844a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1525l)) {
            return false;
        }
        return this.f4989b.equals(((C1525l) obj).f4989b);
    }

    public int hashCode() {
        return this.f4989b.hashCode();
    }
}
