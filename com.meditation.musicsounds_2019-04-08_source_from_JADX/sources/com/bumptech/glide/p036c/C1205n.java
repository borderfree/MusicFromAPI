package com.bumptech.glide.p036c;

import android.util.Log;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.request.C1589c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.c.n */
public class C1205n {

    /* renamed from: a */
    private final Set<C1589c> f4357a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C1589c> f4358b = new ArrayList();

    /* renamed from: c */
    private boolean f4359c;

    /* renamed from: a */
    private boolean m6529a(C1589c cVar, boolean z) {
        boolean z2 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f4357a.remove(cVar);
        if (!this.f4358b.remove(cVar) && !remove) {
            z2 = false;
        }
        if (z2) {
            cVar.mo6420c();
            if (z) {
                cVar.mo6426i();
            }
        }
        return z2;
    }

    /* renamed from: a */
    public void mo5784a() {
        this.f4359c = true;
        for (C1589c cVar : C1258j.m6705a((Collection<T>) this.f4357a)) {
            if (cVar.mo6421d()) {
                cVar.mo6419b();
                this.f4358b.add(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo5785a(C1589c cVar) {
        this.f4357a.add(cVar);
        if (!this.f4359c) {
            cVar.mo6414a();
            return;
        }
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f4358b.add(cVar);
    }

    /* renamed from: b */
    public void mo5786b() {
        this.f4359c = false;
        for (C1589c cVar : C1258j.m6705a((Collection<T>) this.f4357a)) {
            if (!cVar.mo6422e() && !cVar.mo6424g() && !cVar.mo6421d()) {
                cVar.mo6414a();
            }
        }
        this.f4358b.clear();
    }

    /* renamed from: b */
    public boolean mo5787b(C1589c cVar) {
        return m6529a(cVar, true);
    }

    /* renamed from: c */
    public void mo5788c() {
        for (C1589c a : C1258j.m6705a((Collection<T>) this.f4357a)) {
            m6529a(a, false);
        }
        this.f4358b.clear();
    }

    /* renamed from: d */
    public void mo5789d() {
        for (C1589c cVar : C1258j.m6705a((Collection<T>) this.f4357a)) {
            if (!cVar.mo6422e() && !cVar.mo6424g()) {
                cVar.mo6419b();
                if (!this.f4359c) {
                    cVar.mo6414a();
                } else {
                    this.f4358b.add(cVar);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f4357a.size());
        sb.append(", isPaused=");
        sb.append(this.f4359c);
        sb.append("}");
        return sb.toString();
    }
}
