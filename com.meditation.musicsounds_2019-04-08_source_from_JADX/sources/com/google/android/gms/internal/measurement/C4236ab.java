package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ab */
final class C4236ab implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4268bg f15695a;

    /* renamed from: b */
    private final /* synthetic */ C4235aa f15696b;

    C4236ab(C4235aa aaVar, C4268bg bgVar) {
        this.f15696b = aaVar;
        this.f15695a = bgVar;
    }

    public final void run() {
        if (!this.f15696b.f15692a.mo14870b()) {
            this.f15696b.f15692a.mo14815c("Connected to service after a timeout");
            this.f15696b.f15692a.m22375a(this.f15695a);
        }
    }
}
