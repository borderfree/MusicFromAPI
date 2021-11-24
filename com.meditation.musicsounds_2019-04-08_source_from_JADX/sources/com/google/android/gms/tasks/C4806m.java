package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.m */
final class C4806m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4796f f17335a;

    /* renamed from: b */
    private final /* synthetic */ C4805l f17336b;

    C4806m(C4805l lVar, C4796f fVar) {
        this.f17336b = lVar;
        this.f17335a = fVar;
    }

    public final void run() {
        try {
            C4796f fVar = (C4796f) this.f17336b.f17333b.mo15911a(this.f17335a);
            if (fVar == null) {
                this.f17336b.mo15913a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            fVar.mo15921a(C4798h.f17324b, (C4795e<? super TResult>) this.f17336b);
            fVar.mo15920a(C4798h.f17324b, (C4794d) this.f17336b);
            fVar.mo15918a(C4798h.f17324b, (C4792b) this.f17336b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f17336b.f17334c.mo15947a((Exception) e.getCause());
            } else {
                this.f17336b.f17334c.mo15947a((Exception) e);
            }
        } catch (Exception e2) {
            this.f17336b.f17334c.mo15947a(e2);
        }
    }
}
