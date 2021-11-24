package com.bumptech.glide.load;

import com.bumptech.glide.p040g.C1257i;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.d */
public final class C1376d<T> {

    /* renamed from: a */
    private static final C1378a<Object> f4628a = new C1378a<Object>() {
        /* renamed from: a */
        public void mo6060a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };

    /* renamed from: b */
    private final T f4629b;

    /* renamed from: c */
    private final C1378a<T> f4630c;

    /* renamed from: d */
    private final String f4631d;

    /* renamed from: e */
    private volatile byte[] f4632e;

    /* renamed from: com.bumptech.glide.load.d$a */
    public interface C1378a<T> {
        /* renamed from: a */
        void mo6060a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C1376d(String str, T t, C1378a<T> aVar) {
        this.f4631d = C1257i.m6693a(str);
        this.f4629b = t;
        this.f4630c = (C1378a) C1257i.m6691a(aVar);
    }

    /* renamed from: a */
    public static <T> C1376d<T> m7044a(String str) {
        return new C1376d<>(str, null, m7048c());
    }

    /* renamed from: a */
    public static <T> C1376d<T> m7045a(String str, T t) {
        return new C1376d<>(str, t, m7048c());
    }

    /* renamed from: a */
    public static <T> C1376d<T> m7046a(String str, T t, C1378a<T> aVar) {
        return new C1376d<>(str, t, aVar);
    }

    /* renamed from: b */
    private byte[] m7047b() {
        if (this.f4632e == null) {
            this.f4632e = this.f4631d.getBytes(C1375c.f4627a);
        }
        return this.f4632e;
    }

    /* renamed from: c */
    private static <T> C1378a<T> m7048c() {
        return f4628a;
    }

    /* renamed from: a */
    public T mo6055a() {
        return this.f4629b;
    }

    /* renamed from: a */
    public void mo6056a(T t, MessageDigest messageDigest) {
        this.f4630c.mo6060a(m7047b(), t, messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1376d)) {
            return false;
        }
        return this.f4631d.equals(((C1376d) obj).f4631d);
    }

    public int hashCode() {
        return this.f4631d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Option{key='");
        sb.append(this.f4631d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
