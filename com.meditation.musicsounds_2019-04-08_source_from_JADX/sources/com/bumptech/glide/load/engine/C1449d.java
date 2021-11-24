package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1261a;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.engine.p047b.C1417a.C1419b;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.d */
class C1449d<DataType> implements C1419b {

    /* renamed from: a */
    private final C1261a<DataType> f4797a;

    /* renamed from: b */
    private final DataType f4798b;

    /* renamed from: c */
    private final C1379e f4799c;

    C1449d(C1261a<DataType> aVar, DataType datatype, C1379e eVar) {
        this.f4797a = aVar;
        this.f4798b = datatype;
        this.f4799c = eVar;
    }

    /* renamed from: a */
    public boolean mo6175a(File file) {
        return this.f4797a.mo5922a(this.f4798b, file, this.f4799c);
    }
}
