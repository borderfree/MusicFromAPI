package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.db */
final class C4699db implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f16944a;

    /* renamed from: b */
    private final /* synthetic */ String f16945b;

    /* renamed from: c */
    private final /* synthetic */ String f16946c;

    /* renamed from: d */
    private final /* synthetic */ String f16947d;

    /* renamed from: e */
    private final /* synthetic */ zzk f16948e;

    /* renamed from: f */
    private final /* synthetic */ C4689cs f16949f;

    C4699db(C4689cs csVar, AtomicReference atomicReference, String str, String str2, String str3, zzk zzk) {
        this.f16949f = csVar;
        this.f16944a = atomicReference;
        this.f16945b = str;
        this.f16946c = str2;
        this.f16947d = str3;
        this.f16948e = zzk;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List a;
        synchronized (this.f16944a) {
            try {
                C4758i d = this.f16949f.f16905b;
                if (d == null) {
                    this.f16949f.mo15253r().mo15852u_().mo15861a("Failed to get conditional properties", C4767r.m23924a(this.f16945b), this.f16946c, this.f16947d);
                    this.f16944a.set(Collections.emptyList());
                    this.f16944a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f16945b)) {
                    atomicReference2 = this.f16944a;
                    a = d.mo15357a(this.f16946c, this.f16947d, this.f16948e);
                } else {
                    atomicReference2 = this.f16944a;
                    a = d.mo15358a(this.f16945b, this.f16946c, this.f16947d);
                }
                atomicReference2.set(a);
                this.f16949f.m23260I();
                atomicReference = this.f16944a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f16949f.mo15253r().mo15852u_().mo15861a("Failed to get conditional properties", C4767r.m23924a(this.f16945b), this.f16946c, e);
                    this.f16944a.set(Collections.emptyList());
                    atomicReference = this.f16944a;
                } catch (Throwable th) {
                    this.f16944a.notify();
                    throw th;
                }
            }
        }
    }
}
