package com.bumptech.glide.p040g;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.g.f */
public class C1254f<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f4468a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f4469b;

    /* renamed from: c */
    private long f4470c;

    /* renamed from: d */
    private long f4471d;

    public C1254f(long j) {
        this.f4469b = j;
        this.f4470c = j;
    }

    /* renamed from: c */
    private void m6678c() {
        mo5897a(this.f4470c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo5895a(Y y) {
        return 1;
    }

    /* renamed from: a */
    public void mo5896a() {
        mo5897a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo5897a(long j) {
        while (this.f4471d > j) {
            Iterator it = this.f4468a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            Object value = entry.getValue();
            this.f4471d -= (long) mo5895a((Y) value);
            Object key = entry.getKey();
            it.remove();
            mo5898a(key, value);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5898a(T t, Y y) {
    }

    /* renamed from: b */
    public synchronized long mo5899b() {
        return this.f4470c;
    }

    /* renamed from: b */
    public synchronized Y mo5900b(T t) {
        return this.f4468a.get(t);
    }

    /* renamed from: b */
    public synchronized Y mo5901b(T t, Y y) {
        long a = (long) mo5895a(y);
        if (a >= this.f4470c) {
            mo5898a(t, y);
            return null;
        }
        if (y != null) {
            this.f4471d += a;
        }
        Y put = this.f4468a.put(t, y);
        if (put != null) {
            this.f4471d -= (long) mo5895a(put);
            if (!put.equals(y)) {
                mo5898a(t, put);
            }
        }
        m6678c();
        return put;
    }

    /* renamed from: c */
    public synchronized Y mo5902c(T t) {
        Y remove;
        remove = this.f4468a.remove(t);
        if (remove != null) {
            this.f4471d -= (long) mo5895a(remove);
        }
        return remove;
    }
}
