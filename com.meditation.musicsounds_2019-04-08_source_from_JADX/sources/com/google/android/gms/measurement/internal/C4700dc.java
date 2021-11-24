package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.dc */
final class C4700dc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f16950a;

    /* renamed from: b */
    private final /* synthetic */ String f16951b;

    /* renamed from: c */
    private final /* synthetic */ String f16952c;

    /* renamed from: d */
    private final /* synthetic */ String f16953d;

    /* renamed from: e */
    private final /* synthetic */ boolean f16954e;

    /* renamed from: f */
    private final /* synthetic */ zzk f16955f;

    /* renamed from: g */
    private final /* synthetic */ C4689cs f16956g;

    C4700dc(C4689cs csVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzk zzk) {
        this.f16956g = csVar;
        this.f16950a = atomicReference;
        this.f16951b = str;
        this.f16952c = str2;
        this.f16953d = str3;
        this.f16954e = z;
        this.f16955f = zzk;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List a;
        synchronized (this.f16950a) {
            try {
                C4758i d = this.f16956g.f16905b;
                if (d == null) {
                    this.f16956g.mo15253r().mo15852u_().mo15861a("Failed to get user properties", C4767r.m23924a(this.f16951b), this.f16952c, this.f16953d);
                    this.f16950a.set(Collections.emptyList());
                    this.f16950a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f16951b)) {
                    atomicReference2 = this.f16950a;
                    a = d.mo15360a(this.f16952c, this.f16953d, this.f16954e, this.f16955f);
                } else {
                    atomicReference2 = this.f16950a;
                    a = d.mo15359a(this.f16951b, this.f16952c, this.f16953d, this.f16954e);
                }
                atomicReference2.set(a);
                this.f16956g.m23260I();
                atomicReference = this.f16950a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f16956g.mo15253r().mo15852u_().mo15861a("Failed to get user properties", C4767r.m23924a(this.f16951b), this.f16952c, e);
                    this.f16950a.set(Collections.emptyList());
                    atomicReference = this.f16950a;
                } catch (Throwable th) {
                    this.f16950a.notify();
                    throw th;
                }
            }
        }
    }
}
