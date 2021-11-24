package com.bumptech.glide.load.engine.p049d;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.engine.p047b.C1430h;

/* renamed from: com.bumptech.glide.load.engine.d.a */
public final class C1450a {

    /* renamed from: a */
    private final C1430h f4800a;

    /* renamed from: b */
    private final C1398e f4801b;

    /* renamed from: c */
    private final DecodeFormat f4802c;

    /* renamed from: d */
    private final Handler f4803d = new Handler(Looper.getMainLooper());

    public C1450a(C1430h hVar, C1398e eVar, DecodeFormat decodeFormat) {
        this.f4800a = hVar;
        this.f4801b = eVar;
        this.f4802c = decodeFormat;
    }
}
