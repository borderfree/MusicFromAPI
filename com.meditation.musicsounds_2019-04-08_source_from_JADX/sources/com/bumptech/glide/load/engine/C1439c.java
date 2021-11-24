package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1375c;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.c */
final class C1439c implements C1375c {

    /* renamed from: b */
    private final C1375c f4782b;

    /* renamed from: c */
    private final C1375c f4783c;

    C1439c(C1375c cVar, C1375c cVar2) {
        this.f4782b = cVar;
        this.f4783c = cVar2;
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        this.f4782b.mo5844a(messageDigest);
        this.f4783c.mo5844a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1439c)) {
            return false;
        }
        C1439c cVar = (C1439c) obj;
        return this.f4782b.equals(cVar.f4782b) && this.f4783c.equals(cVar.f4783c);
    }

    public int hashCode() {
        return (this.f4782b.hashCode() * 31) + this.f4783c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataCacheKey{sourceKey=");
        sb.append(this.f4782b);
        sb.append(", signature=");
        sb.append(this.f4783c);
        sb.append('}');
        return sb.toString();
    }
}
