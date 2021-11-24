package com.facebook.ads.internal.p077s.p078a;

import android.os.Handler;

/* renamed from: com.facebook.ads.internal.s.a.f */
public class C1792f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f5838a;

    /* renamed from: b */
    private final C1794a f5839b;

    /* renamed from: c */
    private int f5840c;

    /* renamed from: d */
    private boolean f5841d;

    /* renamed from: e */
    private boolean f5842e;

    /* renamed from: com.facebook.ads.internal.s.a.f$a */
    public interface C1794a {
        /* renamed from: a */
        void mo7063a();

        /* renamed from: a */
        void mo7064a(int i);
    }

    public C1792f(int i, C1794a aVar) {
        this(i, aVar, new Handler());
    }

    C1792f(int i, C1794a aVar, Handler handler) {
        this.f5841d = false;
        this.f5840c = i;
        this.f5839b = aVar;
        this.f5838a = handler;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m8892f() {
        this.f5840c--;
        this.f5839b.mo7064a(this.f5840c);
        if (this.f5840c == 0 && !this.f5842e) {
            this.f5842e = true;
            this.f5839b.mo7063a();
            this.f5841d = false;
        }
    }

    /* renamed from: a */
    public boolean mo7057a() {
        if (mo7060d() && !this.f5842e) {
            this.f5839b.mo7063a();
        }
        if (mo7060d() || mo7059c()) {
            return false;
        }
        this.f5841d = true;
        this.f5839b.mo7064a(this.f5840c);
        this.f5838a.postDelayed(new Runnable() {
            public void run() {
                if (C1792f.this.mo7059c()) {
                    C1792f.this.m8892f();
                    C1792f.this.f5838a.postDelayed(this, 1000);
                }
            }
        }, 1000);
        return true;
    }

    /* renamed from: b */
    public boolean mo7058b() {
        if (!mo7059c()) {
            return false;
        }
        this.f5841d = false;
        return true;
    }

    /* renamed from: c */
    public boolean mo7059c() {
        return this.f5841d;
    }

    /* renamed from: d */
    public boolean mo7060d() {
        return this.f5840c <= 0;
    }

    /* renamed from: e */
    public int mo7061e() {
        return this.f5840c;
    }
}
