package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.o */
final class C4808o implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4807n f17340a;

    C4808o(C4807n nVar) {
        this.f17340a = nVar;
    }

    public final void run() {
        synchronized (this.f17340a.f17338b) {
            if (this.f17340a.f17339c != null) {
                this.f17340a.f17339c.mo15912a();
            }
        }
    }
}
