package com.google.android.exoplayer2.text.p109a;

import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.text.C2768d;
import com.google.android.exoplayer2.text.C2776e;
import com.google.android.exoplayer2.text.C2794g;
import com.google.android.exoplayer2.text.C2795h;
import java.util.LinkedList;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.text.a.d */
abstract class C2749d implements C2776e {

    /* renamed from: a */
    private final LinkedList<C2794g> f9479a = new LinkedList<>();

    /* renamed from: b */
    private final LinkedList<C2795h> f9480b;

    /* renamed from: c */
    private final TreeSet<C2794g> f9481c;

    /* renamed from: d */
    private C2794g f9482d;

    /* renamed from: e */
    private long f9483e;

    public C2749d() {
        for (int i = 0; i < 10; i++) {
            this.f9479a.add(new C2794g());
        }
        this.f9480b = new LinkedList<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f9480b.add(new C2750e(this));
        }
        this.f9481c = new TreeSet<>();
    }

    /* renamed from: c */
    private void m13074c(C2794g gVar) {
        gVar.mo8641a();
        this.f9479a.add(gVar);
    }

    /* renamed from: a */
    public void mo9383a(long j) {
        this.f9483e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9384a(C2794g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9422a(C2795h hVar) {
        hVar.mo8641a();
        this.f9480b.add(hVar);
    }

    /* renamed from: b */
    public void mo8652a(C2794g gVar) {
        boolean z = false;
        C2488a.m11666a(gVar != null);
        if (gVar == this.f9482d) {
            z = true;
        }
        C2488a.m11666a(z);
        if (gVar.mo8648g_()) {
            m13074c(gVar);
        } else {
            this.f9481c.add(gVar);
        }
        this.f9482d = null;
    }

    /* renamed from: c */
    public void mo8654c() {
        this.f9483e = 0;
        while (!this.f9481c.isEmpty()) {
            m13074c((C2794g) this.f9481c.pollFirst());
        }
        if (this.f9482d != null) {
            m13074c(this.f9482d);
            this.f9482d = null;
        }
    }

    /* renamed from: d */
    public void mo8655d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo9386e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C2768d mo9387f();

    /* renamed from: g */
    public C2795h mo8653b() {
        C2795h hVar;
        if (this.f9480b.isEmpty()) {
            return null;
        }
        while (!this.f9481c.isEmpty() && ((C2794g) this.f9481c.first()).f7789c <= this.f9483e) {
            C2794g gVar = (C2794g) this.f9481c.pollFirst();
            if (gVar.mo8645c()) {
                hVar = (C2795h) this.f9480b.pollFirst();
                hVar.mo8643b(4);
            } else {
                mo9384a(gVar);
                if (mo9386e()) {
                    C2768d f = mo9387f();
                    if (!gVar.mo8648g_()) {
                        hVar = (C2795h) this.f9480b.pollFirst();
                        hVar.mo9516a(gVar.f7789c, f, Long.MAX_VALUE);
                    }
                }
                m13074c(gVar);
            }
            m13074c(gVar);
            return hVar;
        }
        return null;
    }

    /* renamed from: h */
    public C2794g mo8651a() {
        C2488a.m11668b(this.f9482d == null);
        if (this.f9479a.isEmpty()) {
            return null;
        }
        this.f9482d = (C2794g) this.f9479a.pollFirst();
        return this.f9482d;
    }
}
