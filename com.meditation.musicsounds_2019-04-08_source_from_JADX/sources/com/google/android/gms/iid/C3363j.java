package com.google.android.gms.iid;

import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.iid.j */
abstract class C3363j {
    @GuardedBy("SdkFlagFactory.class")

    /* renamed from: a */
    private static C3363j f11295a;

    C3363j() {
    }

    /* renamed from: a */
    static synchronized C3363j m15224a() {
        C3363j jVar;
        synchronized (C3363j.class) {
            if (f11295a == null) {
                f11295a = new C3357d();
            }
            jVar = f11295a;
        }
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C3364k<Boolean> mo11381a(String str, boolean z);
}
