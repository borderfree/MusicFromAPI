package com.google.android.gms.internal.ads;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.it */
public abstract class C3638it implements C3673ka<C3751my> {

    /* renamed from: a */
    private final Runnable f14237a = new C3639iu(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile Thread f14238b;

    /* renamed from: c */
    private boolean f14239c = false;

    public C3638it() {
    }

    public C3638it(boolean z) {
    }

    /* renamed from: a */
    public abstract void mo10051a();

    /* renamed from: b */
    public final void mo11912b() {
        mo10052h_();
        if (this.f14238b != null) {
            this.f14238b.interrupt();
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo11913c() {
        return this.f14239c ? C3651jf.m18858b(this.f14237a) : C3651jf.m18855a(this.f14237a);
    }

    /* renamed from: h */
    public final C3751my mo13086h() {
        return this.f14239c ? C3651jf.m18858b(this.f14237a) : C3651jf.m18855a(this.f14237a);
    }

    /* renamed from: h_ */
    public abstract void mo10052h_();
}
