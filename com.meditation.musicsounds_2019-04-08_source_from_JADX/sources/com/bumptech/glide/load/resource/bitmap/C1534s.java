package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.p040g.C1258j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.s */
public final class C1534s implements C1488f<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.s$a */
    private static final class C1535a implements C1482s<Bitmap> {

        /* renamed from: a */
        private final Bitmap f5009a;

        C1535a(Bitmap bitmap) {
            this.f5009a = bitmap;
        }

        /* renamed from: a */
        public Bitmap mo6272d() {
            return this.f5009a;
        }

        /* renamed from: c */
        public Class<Bitmap> mo6271c() {
            return Bitmap.class;
        }

        /* renamed from: e */
        public int mo6273e() {
            return C1258j.m6700a(this.f5009a);
        }

        /* renamed from: f */
        public void mo6274f() {
        }
    }

    /* renamed from: a */
    public C1482s<Bitmap> mo6289a(Bitmap bitmap, int i, int i2, C1379e eVar) {
        return new C1535a(bitmap);
    }

    /* renamed from: a */
    public boolean mo6290a(Bitmap bitmap, C1379e eVar) {
        return true;
    }
}
