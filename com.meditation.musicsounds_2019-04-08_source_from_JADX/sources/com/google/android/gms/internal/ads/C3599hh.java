package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.hh */
final class C3599hh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bitmap f14081a;

    /* renamed from: b */
    private final /* synthetic */ C3596he f14082b;

    C3599hh(C3596he heVar, Bitmap bitmap) {
        this.f14082b = heVar;
        this.f14081a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f14081a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f14082b.f14074l) {
            this.f14082b.f14065c.f11587g = new aed();
            this.f14082b.f14065c.f11587g.f11622c = byteArrayOutputStream.toByteArray();
            this.f14082b.f14065c.f11587g.f11621b = "image/png";
            this.f14082b.f14065c.f11587g.f11620a = Integer.valueOf(1);
        }
    }
}
