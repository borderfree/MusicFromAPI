package com.bumptech.glide.load.engine.p046a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p040g.C1258j;

/* renamed from: com.bumptech.glide.load.engine.a.c */
class C1394c implements C1410l {

    /* renamed from: a */
    private final C1396b f4694a = new C1396b();

    /* renamed from: b */
    private final C1401h<C1395a, Bitmap> f4695b = new C1401h<>();

    /* renamed from: com.bumptech.glide.load.engine.a.c$a */
    static class C1395a implements C1411m {

        /* renamed from: a */
        private final C1396b f4696a;

        /* renamed from: b */
        private int f4697b;

        /* renamed from: c */
        private int f4698c;

        /* renamed from: d */
        private Config f4699d;

        public C1395a(C1396b bVar) {
            this.f4696a = bVar;
        }

        /* renamed from: a */
        public void mo6128a() {
            this.f4696a.mo6136a(this);
        }

        /* renamed from: a */
        public void mo6129a(int i, int i2, Config config) {
            this.f4697b = i;
            this.f4698c = i2;
            this.f4699d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1395a)) {
                return false;
            }
            C1395a aVar = (C1395a) obj;
            return this.f4697b == aVar.f4697b && this.f4698c == aVar.f4698c && this.f4699d == aVar.f4699d;
        }

        public int hashCode() {
            return (((this.f4697b * 31) + this.f4698c) * 31) + (this.f4699d != null ? this.f4699d.hashCode() : 0);
        }

        public String toString() {
            return C1394c.m7125c(this.f4697b, this.f4698c, this.f4699d);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a.c$b */
    static class C1396b extends C1397d<C1395a> {
        C1396b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1395a mo6135b() {
            return new C1395a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1395a mo6134a(int i, int i2, Config config) {
            C1395a aVar = (C1395a) mo6137c();
            aVar.mo6129a(i, i2, config);
            return aVar;
        }
    }

    C1394c() {
    }

    /* renamed from: c */
    static String m7125c(int i, int i2, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("], ");
        sb.append(config);
        return sb.toString();
    }

    /* renamed from: d */
    private static String m7126d(Bitmap bitmap) {
        return m7125c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public Bitmap mo6121a() {
        return (Bitmap) this.f4695b.mo6145a();
    }

    /* renamed from: a */
    public Bitmap mo6122a(int i, int i2, Config config) {
        return (Bitmap) this.f4695b.mo6146a(this.f4694a.mo6134a(i, i2, config));
    }

    /* renamed from: a */
    public void mo6123a(Bitmap bitmap) {
        this.f4695b.mo6147a(this.f4694a.mo6134a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: b */
    public String mo6124b(int i, int i2, Config config) {
        return m7125c(i, i2, config);
    }

    /* renamed from: b */
    public String mo6125b(Bitmap bitmap) {
        return m7126d(bitmap);
    }

    /* renamed from: c */
    public int mo6126c(Bitmap bitmap) {
        return C1258j.m6700a(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeStrategy:\n  ");
        sb.append(this.f4695b);
        return sb.toString();
    }
}
