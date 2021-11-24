package com.bumptech.glide.p036c;

import com.bumptech.glide.p040g.C1258j;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.c.a */
class C1187a implements C1196h {

    /* renamed from: a */
    private final Set<C1197i> f4332a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f4333b;

    /* renamed from: c */
    private boolean f4334c;

    C1187a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5750a() {
        this.f4333b = true;
        for (C1197i c : C1258j.m6705a((Collection<T>) this.f4332a)) {
            c.mo5758c();
        }
    }

    /* renamed from: a */
    public void mo5751a(C1197i iVar) {
        this.f4332a.add(iVar);
        if (this.f4334c) {
            iVar.mo5760e();
        } else if (this.f4333b) {
            iVar.mo5758c();
        } else {
            iVar.mo5759d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5752b() {
        this.f4333b = false;
        for (C1197i d : C1258j.m6705a((Collection<T>) this.f4332a)) {
            d.mo5759d();
        }
    }

    /* renamed from: b */
    public void mo5753b(C1197i iVar) {
        this.f4332a.remove(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5754c() {
        this.f4334c = true;
        for (C1197i e : C1258j.m6705a((Collection<T>) this.f4332a)) {
            e.mo5760e();
        }
    }
}
