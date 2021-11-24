package com.bumptech.glide.p036c;

import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.request.p055a.C1579h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.c.p */
public final class C1208p implements C1197i {

    /* renamed from: a */
    private final Set<C1579h<?>> f4367a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public List<C1579h<?>> mo5795a() {
        return C1258j.m6705a((Collection<T>) this.f4367a);
    }

    /* renamed from: a */
    public void mo5796a(C1579h<?> hVar) {
        this.f4367a.add(hVar);
    }

    /* renamed from: b */
    public void mo5797b() {
        this.f4367a.clear();
    }

    /* renamed from: b */
    public void mo5798b(C1579h<?> hVar) {
        this.f4367a.remove(hVar);
    }

    /* renamed from: c */
    public void mo5758c() {
        for (C1579h c : C1258j.m6705a((Collection<T>) this.f4367a)) {
            c.mo5758c();
        }
    }

    /* renamed from: d */
    public void mo5759d() {
        for (C1579h d : C1258j.m6705a((Collection<T>) this.f4367a)) {
            d.mo5759d();
        }
    }

    /* renamed from: e */
    public void mo5760e() {
        for (C1579h e : C1258j.m6705a((Collection<T>) this.f4367a)) {
            e.mo5760e();
        }
    }
}
