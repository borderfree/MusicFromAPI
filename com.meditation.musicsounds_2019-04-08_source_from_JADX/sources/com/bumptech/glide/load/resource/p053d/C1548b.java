package com.bumptech.glide.load.resource.p053d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.p035b.C1180a.C1181a;

/* renamed from: com.bumptech.glide.load.resource.d.b */
public final class C1548b implements C1181a {

    /* renamed from: a */
    private final C1398e f5026a;

    /* renamed from: b */
    private final C1393b f5027b;

    public C1548b(C1398e eVar, C1393b bVar) {
        this.f5026a = eVar;
        this.f5027b = bVar;
    }

    /* renamed from: a */
    public Bitmap mo5720a(int i, int i2, Config config) {
        return this.f5026a.mo6142b(i, i2, config);
    }

    /* renamed from: a */
    public void mo5721a(Bitmap bitmap) {
        this.f5026a.mo6141a(bitmap);
    }

    /* renamed from: a */
    public void mo5722a(byte[] bArr) {
        if (this.f5027b != null) {
            this.f5027b.mo6119a(bArr);
        }
    }

    /* renamed from: a */
    public void mo5723a(int[] iArr) {
        if (this.f5027b != null) {
            this.f5027b.mo6119a(iArr);
        }
    }

    /* renamed from: a */
    public byte[] mo5724a(int i) {
        return this.f5027b == null ? new byte[i] : (byte[]) this.f5027b.mo6116a(i, byte[].class);
    }

    /* renamed from: b */
    public int[] mo5725b(int i) {
        return this.f5027b == null ? new int[i] : (int[]) this.f5027b.mo6116a(i, int[].class);
    }
}
