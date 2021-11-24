package com.bumptech.glide.p039f;

import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.p040g.C1257i;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.f.b */
public final class C1230b implements C1375c {

    /* renamed from: b */
    private final Object f4432b;

    public C1230b(Object obj) {
        this.f4432b = C1257i.m6691a(obj);
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        messageDigest.update(this.f4432b.toString().getBytes(f4627a));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1230b)) {
            return false;
        }
        return this.f4432b.equals(((C1230b) obj).f4432b);
    }

    public int hashCode() {
        return this.f4432b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectKey{object=");
        sb.append(this.f4432b);
        sb.append('}');
        return sb.toString();
    }
}
