package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.p040g.C1257i;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.l */
class C1473l implements C1375c {

    /* renamed from: b */
    private final Object f4881b;

    /* renamed from: c */
    private final int f4882c;

    /* renamed from: d */
    private final int f4883d;

    /* renamed from: e */
    private final Class<?> f4884e;

    /* renamed from: f */
    private final Class<?> f4885f;

    /* renamed from: g */
    private final C1375c f4886g;

    /* renamed from: h */
    private final Map<Class<?>, C1490h<?>> f4887h;

    /* renamed from: i */
    private final C1379e f4888i;

    /* renamed from: j */
    private int f4889j;

    C1473l(Object obj, C1375c cVar, int i, int i2, Map<Class<?>, C1490h<?>> map, Class<?> cls, Class<?> cls2, C1379e eVar) {
        this.f4881b = C1257i.m6691a(obj);
        this.f4886g = (C1375c) C1257i.m6692a(cVar, "Signature must not be null");
        this.f4882c = i;
        this.f4883d = i2;
        this.f4887h = (Map) C1257i.m6691a(map);
        this.f4884e = (Class) C1257i.m6692a(cls, "Resource class must not be null");
        this.f4885f = (Class) C1257i.m6692a(cls2, "Transcode class must not be null");
        this.f4888i = (C1379e) C1257i.m6691a(eVar);
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1473l)) {
            return false;
        }
        C1473l lVar = (C1473l) obj;
        return this.f4881b.equals(lVar.f4881b) && this.f4886g.equals(lVar.f4886g) && this.f4883d == lVar.f4883d && this.f4882c == lVar.f4882c && this.f4887h.equals(lVar.f4887h) && this.f4884e.equals(lVar.f4884e) && this.f4885f.equals(lVar.f4885f) && this.f4888i.equals(lVar.f4888i);
    }

    public int hashCode() {
        if (this.f4889j == 0) {
            this.f4889j = this.f4881b.hashCode();
            this.f4889j = (this.f4889j * 31) + this.f4886g.hashCode();
            this.f4889j = (this.f4889j * 31) + this.f4882c;
            this.f4889j = (this.f4889j * 31) + this.f4883d;
            this.f4889j = (this.f4889j * 31) + this.f4887h.hashCode();
            this.f4889j = (this.f4889j * 31) + this.f4884e.hashCode();
            this.f4889j = (this.f4889j * 31) + this.f4885f.hashCode();
            this.f4889j = (this.f4889j * 31) + this.f4888i.hashCode();
        }
        return this.f4889j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EngineKey{model=");
        sb.append(this.f4881b);
        sb.append(", width=");
        sb.append(this.f4882c);
        sb.append(", height=");
        sb.append(this.f4883d);
        sb.append(", resourceClass=");
        sb.append(this.f4884e);
        sb.append(", transcodeClass=");
        sb.append(this.f4885f);
        sb.append(", signature=");
        sb.append(this.f4886g);
        sb.append(", hashCode=");
        sb.append(this.f4889j);
        sb.append(", transformations=");
        sb.append(this.f4887h);
        sb.append(", options=");
        sb.append(this.f4888i);
        sb.append('}');
        return sb.toString();
    }
}
