package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p046a.C1398e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
public class C1514h extends C1511e {

    /* renamed from: b */
    private static final byte[] f4969b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f4627a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo6316a(C1398e eVar, Bitmap bitmap, int i, int i2) {
        return C1532r.m7636c(eVar, bitmap, i, i2);
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        messageDigest.update(f4969b);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1514h;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
    }
}
