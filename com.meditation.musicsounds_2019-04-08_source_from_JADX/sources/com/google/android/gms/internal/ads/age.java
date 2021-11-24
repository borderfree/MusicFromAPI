package com.google.android.gms.internal.ads;

final class age implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f11962a;

    /* renamed from: b */
    private final /* synthetic */ boolean f11963b;

    /* renamed from: c */
    private final /* synthetic */ aga f11964c;

    age(aga aga, int i, boolean z) {
        this.f11964c = aga;
        this.f11962a = i;
        this.f11963b = z;
    }

    public final void run() {
        C4110yz b = this.f11964c.mo11870b(this.f11962a, this.f11963b);
        this.f11964c.f11943k = b;
        if (aga.m16153b(this.f11962a, b)) {
            this.f11964c.mo11868a(this.f11962a + 1, this.f11963b);
        }
    }
}
