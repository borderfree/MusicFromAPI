package com.bumptech.glide.load.resource.p053d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.resource.bitmap.C1510d;
import com.bumptech.glide.p040g.C1257i;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.d.f */
public class C1553f implements C1490h<C1549c> {

    /* renamed from: b */
    private final C1490h<Bitmap> f5039b;

    public C1553f(C1490h<Bitmap> hVar) {
        this.f5039b = (C1490h) C1257i.m6691a(hVar);
    }

    /* renamed from: a */
    public C1482s<C1549c> mo6292a(Context context, C1482s<C1549c> sVar, int i, int i2) {
        C1549c cVar = (C1549c) sVar.mo6272d();
        C1510d dVar = new C1510d(cVar.mo6365b(), C1186c.m6450a(context).mo5735a());
        C1482s a = this.f5039b.mo6292a(context, dVar, i, i2);
        if (!dVar.equals(a)) {
            dVar.mo6274f();
        }
        cVar.mo6364a(this.f5039b, (Bitmap) a.mo6272d());
        return sVar;
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        this.f5039b.mo5844a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1553f)) {
            return false;
        }
        return this.f5039b.equals(((C1553f) obj).f5039b);
    }

    public int hashCode() {
        return this.f5039b.hashCode();
    }
}
