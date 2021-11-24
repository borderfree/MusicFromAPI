package com.bumptech.glide.load.engine.p047b;

import com.bumptech.glide.load.engine.p047b.C1417a.C1418a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.b.d */
public class C1424d implements C1418a {

    /* renamed from: a */
    private final long f4753a;

    /* renamed from: b */
    private final C1425a f4754b;

    /* renamed from: com.bumptech.glide.load.engine.b.d$a */
    public interface C1425a {
        /* renamed from: a */
        File mo6180a();
    }

    public C1424d(C1425a aVar, long j) {
        this.f4753a = j;
        this.f4754b = aVar;
    }

    /* renamed from: a */
    public C1417a mo6174a() {
        File a = this.f4754b.mo6180a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C1426e.m7256a(a, this.f4753a);
        }
        return null;
    }
}
