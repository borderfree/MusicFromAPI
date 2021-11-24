package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.k */
final class C4804k implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4796f f17330a;

    /* renamed from: b */
    private final /* synthetic */ C4803j f17331b;

    C4804k(C4803j jVar, C4796f fVar) {
        this.f17331b = jVar;
        this.f17330a = fVar;
    }

    public final void run() {
        if (this.f17330a.mo15926c()) {
            this.f17331b.f17329c.mo15951f();
            return;
        }
        try {
            this.f17331b.f17329c.mo15948a(this.f17331b.f17328b.mo15911a(this.f17330a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f17331b.f17329c.mo15947a((Exception) e.getCause());
            } else {
                this.f17331b.f17329c.mo15947a((Exception) e);
            }
        } catch (Exception e2) {
            this.f17331b.f17329c.mo15947a(e2);
        }
    }
}
