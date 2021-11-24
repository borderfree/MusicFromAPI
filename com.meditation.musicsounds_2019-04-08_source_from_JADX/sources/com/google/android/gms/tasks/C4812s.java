package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.s */
final class C4812s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4796f f17349a;

    /* renamed from: b */
    private final /* synthetic */ C4811r f17350b;

    C4812s(C4811r rVar, C4796f fVar) {
        this.f17350b = rVar;
        this.f17349a = fVar;
    }

    public final void run() {
        synchronized (this.f17350b.f17347b) {
            if (this.f17350b.f17348c != null) {
                this.f17350b.f17348c.mo15913a(this.f17349a.mo15928e());
            }
        }
    }
}
