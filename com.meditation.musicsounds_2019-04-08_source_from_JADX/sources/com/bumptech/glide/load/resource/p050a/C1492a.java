package com.bumptech.glide.load.resource.p050a;

import com.bumptech.glide.load.p042a.C1274e;
import com.bumptech.glide.load.p042a.C1274e.C1275a;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.a.a */
public class C1492a implements C1274e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f4937a;

    /* renamed from: com.bumptech.glide.load.resource.a.a$a */
    public static class C1493a implements C1275a<ByteBuffer> {
        /* renamed from: a */
        public C1274e<ByteBuffer> mo5949a(ByteBuffer byteBuffer) {
            return new C1492a(byteBuffer);
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo5950a() {
            return ByteBuffer.class;
        }
    }

    public C1492a(ByteBuffer byteBuffer) {
        this.f4937a = byteBuffer;
    }

    /* renamed from: b */
    public void mo5948b() {
    }

    /* renamed from: c */
    public ByteBuffer mo5947a() {
        this.f4937a.position(0);
        return this.f4937a;
    }
}
