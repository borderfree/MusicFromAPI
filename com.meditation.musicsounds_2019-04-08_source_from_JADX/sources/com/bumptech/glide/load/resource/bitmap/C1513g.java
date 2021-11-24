package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p046a.C1398e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
public class C1513g extends C1511e {

    /* renamed from: b */
    private static final byte[] f4968b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f4627a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo6316a(C1398e eVar, Bitmap bitmap, int i, int i2) {
        return C1532r.m7628a(eVar, bitmap, i, i2);
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        messageDigest.update(f4968b);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1513g;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterCrop".hashCode();
    }
}
