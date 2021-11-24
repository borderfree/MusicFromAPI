package com.bumptech.glide.load.p044b;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p039f.C1230b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.b */
public class C1305b<Data> implements C1343n<byte[], Data> {

    /* renamed from: a */
    private final C1308b<Data> f4540a;

    /* renamed from: com.bumptech.glide.load.b.b$a */
    public static class C1306a implements C1345o<byte[], ByteBuffer> {
        /* renamed from: a */
        public C1343n<byte[], ByteBuffer> mo5975a(C1351r rVar) {
            return new C1305b(new C1308b<ByteBuffer>() {
                /* renamed from: a */
                public Class<ByteBuffer> mo5988a() {
                    return ByteBuffer.class;
                }

                /* renamed from: a */
                public ByteBuffer mo5990b(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    /* renamed from: com.bumptech.glide.load.b.b$b */
    public interface C1308b<Data> {
        /* renamed from: a */
        Class<Data> mo5988a();

        /* renamed from: b */
        Data mo5990b(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.b.b$c */
    private static class C1309c<Data> implements C1272d<Data> {

        /* renamed from: a */
        private final byte[] f4542a;

        /* renamed from: b */
        private final C1308b<Data> f4543b;

        C1309c(byte[] bArr, C1308b<Data> bVar) {
            this.f4542a = bArr;
            this.f4543b = bVar;
        }

        /* renamed from: a */
        public Class<Data> mo5924a() {
            return this.f4543b.mo5988a();
        }

        /* renamed from: a */
        public void mo5931a(Priority priority, C1273a<? super Data> aVar) {
            aVar.mo5946a(this.f4543b.mo5990b(this.f4542a));
        }

        /* renamed from: b */
        public void mo5932b() {
        }

        /* renamed from: c */
        public void mo5933c() {
        }

        /* renamed from: d */
        public DataSource mo5934d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.b$d */
    public static class C1310d implements C1345o<byte[], InputStream> {
        /* renamed from: a */
        public C1343n<byte[], InputStream> mo5975a(C1351r rVar) {
            return new C1305b(new C1308b<InputStream>() {
                /* renamed from: a */
                public InputStream mo5990b(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }

                /* renamed from: a */
                public Class<InputStream> mo5988a() {
                    return InputStream.class;
                }
            });
        }
    }

    public C1305b(C1308b<Data> bVar) {
        this.f4540a = bVar;
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(byte[] bArr, int i, int i2, C1379e eVar) {
        return new C1344a<>(new C1230b(bArr), new C1309c(bArr, this.f4540a));
    }

    /* renamed from: a */
    public boolean mo5973a(byte[] bArr) {
        return true;
    }
}
