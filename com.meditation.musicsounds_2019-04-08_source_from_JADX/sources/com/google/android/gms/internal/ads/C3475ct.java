package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ct */
final class C3475ct implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3467cl f13708a;

    C3475ct(C3467cl clVar) {
        this.f13708a = clVar;
    }

    public final void run() {
        synchronized (this.f13708a.f13693d) {
            if (this.f13708a.f13690a != null) {
                this.f13708a.mo10052h_();
                this.f13708a.m18258a(2, "Timed out waiting for ad response.");
            }
        }
    }
}
