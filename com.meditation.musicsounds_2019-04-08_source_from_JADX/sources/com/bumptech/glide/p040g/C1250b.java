package com.bumptech.glide.p040g;

import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.p019g.C0510m;

/* renamed from: com.bumptech.glide.g.b */
public final class C1250b<K, V> extends C0488a<K, V> {

    /* renamed from: i */
    private int f4461i;

    /* renamed from: a */
    public V mo2006a(int i, V v) {
        this.f4461i = 0;
        return super.mo2006a(i, v);
    }

    /* renamed from: a */
    public void mo2008a(C0510m<? extends K, ? extends V> mVar) {
        this.f4461i = 0;
        super.mo2008a(mVar);
    }

    public void clear() {
        this.f4461i = 0;
        super.clear();
    }

    /* renamed from: d */
    public V mo2015d(int i) {
        this.f4461i = 0;
        return super.mo2015d(i);
    }

    public int hashCode() {
        if (this.f4461i == 0) {
            this.f4461i = super.hashCode();
        }
        return this.f4461i;
    }

    public V put(K k, V v) {
        this.f4461i = 0;
        return super.put(k, v);
    }
}
