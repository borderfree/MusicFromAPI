package com.bumptech.glide.p040g;

/* renamed from: com.bumptech.glide.g.h */
public class C1256h {

    /* renamed from: a */
    private Class<?> f4473a;

    /* renamed from: b */
    private Class<?> f4474b;

    /* renamed from: c */
    private Class<?> f4475c;

    public C1256h() {
    }

    public C1256h(Class<?> cls, Class<?> cls2) {
        mo5909a(cls, cls2);
    }

    public C1256h(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo5910a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void mo5909a(Class<?> cls, Class<?> cls2) {
        mo5910a(cls, cls2, null);
    }

    /* renamed from: a */
    public void mo5910a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f4473a = cls;
        this.f4474b = cls2;
        this.f4475c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1256h hVar = (C1256h) obj;
        return this.f4473a.equals(hVar.f4473a) && this.f4474b.equals(hVar.f4474b) && C1258j.m6709a((Object) this.f4475c, (Object) hVar.f4475c);
    }

    public int hashCode() {
        return (((this.f4473a.hashCode() * 31) + this.f4474b.hashCode()) * 31) + (this.f4475c != null ? this.f4475c.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiClassKey{first=");
        sb.append(this.f4473a);
        sb.append(", second=");
        sb.append(this.f4474b);
        sb.append('}');
        return sb.toString();
    }
}
