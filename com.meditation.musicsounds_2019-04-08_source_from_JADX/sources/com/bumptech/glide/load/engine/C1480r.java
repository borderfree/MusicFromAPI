package com.bumptech.glide.load.engine;

import android.support.p009v4.p019g.C0505k.C0506a;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.p041a.C1238a;
import com.bumptech.glide.p040g.p041a.C1238a.C1242a;
import com.bumptech.glide.p040g.p041a.C1238a.C1244c;
import com.bumptech.glide.p040g.p041a.C1247c;

/* renamed from: com.bumptech.glide.load.engine.r */
final class C1480r<Z> implements C1244c, C1482s<Z> {

    /* renamed from: a */
    private static final C0506a<C1480r<?>> f4903a = C1238a.m6646b(20, new C1242a<C1480r<?>>() {
        /* renamed from: a */
        public C1480r<?> mo5874b() {
            return new C1480r<>();
        }
    });

    /* renamed from: b */
    private final C1247c f4904b = C1247c.m6662a();

    /* renamed from: c */
    private C1482s<Z> f4905c;

    /* renamed from: d */
    private boolean f4906d;

    /* renamed from: e */
    private boolean f4907e;

    C1480r() {
    }

    /* renamed from: a */
    static <Z> C1480r<Z> m7419a(C1482s<Z> sVar) {
        C1480r<Z> rVar = (C1480r) C1257i.m6691a((C1480r) f4903a.mo2001a());
        rVar.m7421b(sVar);
        return rVar;
    }

    /* renamed from: b */
    private void m7420b() {
        this.f4905c = null;
        f4903a.mo2002a(this);
    }

    /* renamed from: b */
    private void m7421b(C1482s<Z> sVar) {
        this.f4907e = false;
        this.f4906d = true;
        this.f4905c = sVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo6284a() {
        this.f4904b.mo5878b();
        if (this.f4906d) {
            this.f4906d = false;
            if (this.f4907e) {
                mo6274f();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    /* renamed from: c */
    public Class<Z> mo6271c() {
        return this.f4905c.mo6271c();
    }

    /* renamed from: c_ */
    public C1247c mo5876c_() {
        return this.f4904b;
    }

    /* renamed from: d */
    public Z mo6272d() {
        return this.f4905c.mo6272d();
    }

    /* renamed from: e */
    public int mo6273e() {
        return this.f4905c.mo6273e();
    }

    /* renamed from: f */
    public synchronized void mo6274f() {
        this.f4904b.mo5878b();
        this.f4907e = true;
        if (!this.f4906d) {
            this.f4905c.mo6274f();
            m7420b();
        }
    }
}
