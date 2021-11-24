package com.facebook.ads.internal.p077s.p079b;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.s.b.f */
public class C1822f {

    /* renamed from: a */
    static final int f5955a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    static final ExecutorService f5956b = Executors.newFixedThreadPool(f5955a);

    /* renamed from: c */
    private static volatile boolean f5957c = true;

    /* renamed from: d */
    private final Bitmap f5958d;

    /* renamed from: e */
    private Bitmap f5959e;

    /* renamed from: f */
    private final C1816a f5960f = new C1819d();

    public C1822f(Bitmap bitmap) {
        this.f5958d = bitmap;
    }

    /* renamed from: a */
    public Bitmap mo7089a() {
        return this.f5959e;
    }

    /* renamed from: a */
    public Bitmap mo7090a(int i) {
        this.f5959e = this.f5960f.mo7078a(this.f5958d, (float) i);
        return this.f5959e;
    }
}
