package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p046a.C1398e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
public class C1526m extends C1511e {

    /* renamed from: b */
    private static final byte[] f4991b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f4627a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo6316a(C1398e eVar, Bitmap bitmap, int i, int i2) {
        return C1532r.m7634b(eVar, bitmap, i, i2);
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        messageDigest.update(f4991b);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1526m;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }
}
