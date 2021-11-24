package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.p040g.C1235a;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
public class C1512f implements C1488f<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C1520j f4967a;

    public C1512f(C1520j jVar) {
        this.f4967a = jVar;
    }

    /* renamed from: a */
    public C1482s<Bitmap> mo6289a(ByteBuffer byteBuffer, int i, int i2, C1379e eVar) {
        return this.f4967a.mo6328a(C1235a.m6639b(byteBuffer), i, i2, eVar);
    }

    /* renamed from: a */
    public boolean mo6290a(ByteBuffer byteBuffer, C1379e eVar) {
        return this.f4967a.mo6331a(byteBuffer);
    }
}
