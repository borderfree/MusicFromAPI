package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.p040g.C1254f;
import com.bumptech.glide.p040g.C1258j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.u */
final class C1484u implements C1375c {

    /* renamed from: b */
    private static final C1254f<Class<?>, byte[]> f4918b = new C1254f<>(50);

    /* renamed from: c */
    private final C1393b f4919c;

    /* renamed from: d */
    private final C1375c f4920d;

    /* renamed from: e */
    private final C1375c f4921e;

    /* renamed from: f */
    private final int f4922f;

    /* renamed from: g */
    private final int f4923g;

    /* renamed from: h */
    private final Class<?> f4924h;

    /* renamed from: i */
    private final C1379e f4925i;

    /* renamed from: j */
    private final C1490h<?> f4926j;

    C1484u(C1393b bVar, C1375c cVar, C1375c cVar2, int i, int i2, C1490h<?> hVar, Class<?> cls, C1379e eVar) {
        this.f4919c = bVar;
        this.f4920d = cVar;
        this.f4921e = cVar2;
        this.f4922f = i;
        this.f4923g = i2;
        this.f4926j = hVar;
        this.f4924h = cls;
        this.f4925i = eVar;
    }

    /* renamed from: a */
    private byte[] m7439a() {
        byte[] bArr = (byte[]) f4918b.mo5900b(this.f4924h);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f4924h.getName().getBytes(f4627a);
        f4918b.mo5901b(this.f4924h, bytes);
        return bytes;
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f4919c.mo6120b(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f4922f).putInt(this.f4923g).array();
        this.f4921e.mo5844a(messageDigest);
        this.f4920d.mo5844a(messageDigest);
        messageDigest.update(bArr);
        if (this.f4926j != null) {
            this.f4926j.mo5844a(messageDigest);
        }
        this.f4925i.mo5844a(messageDigest);
        messageDigest.update(m7439a());
        this.f4919c.mo6119a(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1484u)) {
            return false;
        }
        C1484u uVar = (C1484u) obj;
        return this.f4923g == uVar.f4923g && this.f4922f == uVar.f4922f && C1258j.m6709a((Object) this.f4926j, (Object) uVar.f4926j) && this.f4924h.equals(uVar.f4924h) && this.f4920d.equals(uVar.f4920d) && this.f4921e.equals(uVar.f4921e) && this.f4925i.equals(uVar.f4925i);
    }

    public int hashCode() {
        int hashCode = (((((this.f4920d.hashCode() * 31) + this.f4921e.hashCode()) * 31) + this.f4922f) * 31) + this.f4923g;
        if (this.f4926j != null) {
            hashCode = (hashCode * 31) + this.f4926j.hashCode();
        }
        return (((hashCode * 31) + this.f4924h.hashCode()) * 31) + this.f4925i.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(this.f4920d);
        sb.append(", signature=");
        sb.append(this.f4921e);
        sb.append(", width=");
        sb.append(this.f4922f);
        sb.append(", height=");
        sb.append(this.f4923g);
        sb.append(", decodedResourceClass=");
        sb.append(this.f4924h);
        sb.append(", transformation='");
        sb.append(this.f4926j);
        sb.append('\'');
        sb.append(", options=");
        sb.append(this.f4925i);
        sb.append('}');
        return sb.toString();
    }
}
