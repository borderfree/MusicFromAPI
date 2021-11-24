package com.bumptech.glide.load.resource.p054e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.resource.p050a.C1494b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.resource.e.a */
public class C1562a implements C1566e<Bitmap, byte[]> {

    /* renamed from: a */
    private final CompressFormat f5067a;

    /* renamed from: b */
    private final int f5068b;

    public C1562a() {
        this(CompressFormat.JPEG, 100);
    }

    public C1562a(CompressFormat compressFormat, int i) {
        this.f5067a = compressFormat;
        this.f5068b = i;
    }

    /* renamed from: a */
    public C1482s<byte[]> mo6409a(C1482s<Bitmap> sVar, C1379e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) sVar.mo6272d()).compress(this.f5067a, this.f5068b, byteArrayOutputStream);
        sVar.mo6274f();
        return new C1494b(byteArrayOutputStream.toByteArray());
    }
}
