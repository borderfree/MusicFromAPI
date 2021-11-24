package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.l */
public final class C2948l {

    /* renamed from: a */
    private final C2951o f10390a;

    /* renamed from: b */
    private final C3300e f10391b;

    /* renamed from: c */
    private boolean f10392c;

    /* renamed from: d */
    private long f10393d;

    /* renamed from: e */
    private long f10394e;

    /* renamed from: f */
    private long f10395f;

    /* renamed from: g */
    private long f10396g;

    /* renamed from: h */
    private long f10397h;

    /* renamed from: i */
    private boolean f10398i;

    /* renamed from: j */
    private final Map<Class<? extends C2950n>, C2950n> f10399j;

    /* renamed from: k */
    private final List<C2959t> f10400k;

    private C2948l(C2948l lVar) {
        this.f10390a = lVar.f10390a;
        this.f10391b = lVar.f10391b;
        this.f10393d = lVar.f10393d;
        this.f10394e = lVar.f10394e;
        this.f10395f = lVar.f10395f;
        this.f10396g = lVar.f10396g;
        this.f10397h = lVar.f10397h;
        this.f10400k = new ArrayList(lVar.f10400k);
        this.f10399j = new HashMap(lVar.f10399j.size());
        for (Entry entry : lVar.f10399j.entrySet()) {
            C2950n c = m13798c((Class) entry.getKey());
            ((C2950n) entry.getValue()).mo10641a(c);
            this.f10399j.put((Class) entry.getKey(), c);
        }
    }

    C2948l(C2951o oVar, C3300e eVar) {
        C3266s.m14913a(oVar);
        C3266s.m14913a(eVar);
        this.f10390a = oVar;
        this.f10391b = eVar;
        this.f10396g = 1800000;
        this.f10397h = 3024000000L;
        this.f10399j = new HashMap();
        this.f10400k = new ArrayList();
    }

    @TargetApi(19)
    /* renamed from: c */
    private static <T extends C2950n> T m13798c(Class<T> cls) {
        try {
            return (C2950n) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            } else if (VERSION.SDK_INT < 19 || !(e instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e);
            } else {
                throw new IllegalArgumentException("Linkage exception", e);
            }
        }
    }

    /* renamed from: a */
    public final C2948l mo10626a() {
        return new C2948l(this);
    }

    /* renamed from: a */
    public final <T extends C2950n> T mo10627a(Class<T> cls) {
        return (C2950n) this.f10399j.get(cls);
    }

    /* renamed from: a */
    public final void mo10628a(long j) {
        this.f10394e = j;
    }

    /* renamed from: a */
    public final void mo10629a(C2950n nVar) {
        C3266s.m14913a(nVar);
        Class cls = nVar.getClass();
        if (cls.getSuperclass() == C2950n.class) {
            nVar.mo10641a(mo10630b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final <T extends C2950n> T mo10630b(Class<T> cls) {
        T t = (C2950n) this.f10399j.get(cls);
        if (t != null) {
            return t;
        }
        T c = m13798c(cls);
        this.f10399j.put(cls, c);
        return c;
    }

    /* renamed from: b */
    public final Collection<C2950n> mo10631b() {
        return this.f10399j.values();
    }

    /* renamed from: c */
    public final List<C2959t> mo10632c() {
        return this.f10400k;
    }

    /* renamed from: d */
    public final long mo10633d() {
        return this.f10393d;
    }

    /* renamed from: e */
    public final void mo10634e() {
        this.f10390a.mo10643h().mo10646a(this);
    }

    /* renamed from: f */
    public final boolean mo10635f() {
        return this.f10392c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo10636g() {
        this.f10395f = this.f10391b.mo11327b();
        this.f10393d = this.f10394e != 0 ? this.f10394e : this.f10391b.mo11326a();
        this.f10392c = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final C2951o mo10637h() {
        return this.f10390a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo10638i() {
        return this.f10398i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo10639j() {
        this.f10398i = true;
    }
}
