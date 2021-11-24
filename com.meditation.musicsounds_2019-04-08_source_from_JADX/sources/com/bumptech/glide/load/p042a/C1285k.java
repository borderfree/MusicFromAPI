package com.bumptech.glide.load.p042a;

import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.p042a.C1274e.C1275a;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.k */
public final class C1285k implements C1274e<InputStream> {

    /* renamed from: a */
    private final RecyclableBufferedInputStream f4519a;

    /* renamed from: com.bumptech.glide.load.a.k$a */
    public static final class C1286a implements C1275a<InputStream> {

        /* renamed from: a */
        private final C1393b f4520a;

        public C1286a(C1393b bVar) {
            this.f4520a = bVar;
        }

        /* renamed from: a */
        public C1274e<InputStream> mo5949a(InputStream inputStream) {
            return new C1285k(inputStream, this.f4520a);
        }

        /* renamed from: a */
        public Class<InputStream> mo5950a() {
            return InputStream.class;
        }
    }

    C1285k(InputStream inputStream, C1393b bVar) {
        this.f4519a = new RecyclableBufferedInputStream(inputStream, bVar);
        this.f4519a.mark(5242880);
    }

    /* renamed from: b */
    public void mo5948b() {
        this.f4519a.mo6305b();
    }

    /* renamed from: c */
    public InputStream mo5947a() {
        this.f4519a.reset();
        return this.f4519a;
    }
}
