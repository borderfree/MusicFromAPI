package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.u */
final class C4814u implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4796f f17354a;

    /* renamed from: b */
    private final /* synthetic */ C4813t f17355b;

    C4814u(C4813t tVar, C4796f fVar) {
        this.f17355b = tVar;
        this.f17354a = fVar;
    }

    public final void run() {
        synchronized (this.f17355b.f17352b) {
            if (this.f17355b.f17353c != null) {
                this.f17355b.f17353c.mo15914a(this.f17354a.mo15927d());
            }
        }
    }
}
