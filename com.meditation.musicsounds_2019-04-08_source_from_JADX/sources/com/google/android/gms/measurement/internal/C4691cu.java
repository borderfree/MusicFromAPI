package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cu */
final class C4691cu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f16912a;

    /* renamed from: b */
    private final /* synthetic */ zzk f16913b;

    /* renamed from: c */
    private final /* synthetic */ C4689cs f16914c;

    C4691cu(C4689cs csVar, AtomicReference atomicReference, zzk zzk) {
        this.f16914c = csVar;
        this.f16912a = atomicReference;
        this.f16913b = zzk;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f16912a) {
            try {
                C4758i d = this.f16914c.f16905b;
                if (d == null) {
                    this.f16914c.mo15253r().mo15852u_().mo15858a("Failed to get app instance id");
                    this.f16912a.notify();
                    return;
                }
                this.f16912a.set(d.mo15371c(this.f16913b));
                String str = (String) this.f16912a.get();
                if (str != null) {
                    this.f16914c.mo15241f().mo15411a(str);
                    this.f16914c.mo15254s().f16654j.mo15288a(str);
                }
                this.f16914c.m23260I();
                atomicReference = this.f16912a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f16914c.mo15253r().mo15852u_().mo15859a("Failed to get app instance id", e);
                    atomicReference = this.f16912a;
                } catch (Throwable th) {
                    this.f16912a.notify();
                    throw th;
                }
            }
        }
    }
}
