package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.q */
final class C4810q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4796f f17344a;

    /* renamed from: b */
    private final /* synthetic */ C4809p f17345b;

    C4810q(C4809p pVar, C4796f fVar) {
        this.f17345b = pVar;
        this.f17344a = fVar;
    }

    public final void run() {
        synchronized (this.f17345b.f17342b) {
            if (this.f17345b.f17343c != null) {
                this.f17345b.f17343c.mo11008a(this.f17344a);
            }
        }
    }
}
