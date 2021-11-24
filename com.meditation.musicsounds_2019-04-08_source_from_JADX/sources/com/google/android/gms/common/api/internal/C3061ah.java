package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.ah */
abstract class C3061ah implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3161x f10650a;

    private C3061ah(C3161x xVar) {
        this.f10650a = xVar;
    }

    /* synthetic */ C3061ah(C3161x xVar, C3162y yVar) {
        this(xVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10893a();

    public void run() {
        this.f10650a.f10919b.lock();
        try {
            if (!Thread.interrupted()) {
                mo10893a();
            }
        } catch (RuntimeException e) {
            this.f10650a.f10918a.mo10923a(e);
        } catch (Throwable th) {
            this.f10650a.f10919b.unlock();
            throw th;
        }
        this.f10650a.f10919b.unlock();
    }
}
