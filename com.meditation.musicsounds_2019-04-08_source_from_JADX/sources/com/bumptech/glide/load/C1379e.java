package com.bumptech.glide.load;

import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.p019g.C0510m;
import com.bumptech.glide.p040g.C1250b;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.e */
public final class C1379e implements C1375c {

    /* renamed from: b */
    private final C0488a<C1376d<?>, Object> f4633b = new C1250b();

    /* renamed from: a */
    private static <T> void m7053a(C1376d<T> dVar, Object obj, MessageDigest messageDigest) {
        dVar.mo6056a(obj, messageDigest);
    }

    /* renamed from: a */
    public <T> C1379e mo6061a(C1376d<T> dVar, T t) {
        this.f4633b.put(dVar, t);
        return this;
    }

    /* renamed from: a */
    public <T> T mo6062a(C1376d<T> dVar) {
        return this.f4633b.containsKey(dVar) ? this.f4633b.get(dVar) : dVar.mo6055a();
    }

    /* renamed from: a */
    public void mo6063a(C1379e eVar) {
        this.f4633b.mo2008a((C0510m<? extends K, ? extends V>) eVar.f4633b);
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f4633b.size(); i++) {
            m7053a((C1376d) this.f4633b.mo2010b(i), this.f4633b.mo2011c(i), messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1379e)) {
            return false;
        }
        return this.f4633b.equals(((C1379e) obj).f4633b);
    }

    public int hashCode() {
        return this.f4633b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Options{values=");
        sb.append(this.f4633b);
        sb.append('}');
        return sb.toString();
    }
}
