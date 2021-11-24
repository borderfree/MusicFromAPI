package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.dl */
public final /* synthetic */ class C4327dl {
    /* renamed from: a */
    public static <V> V m21259a(C4328dm<V> dmVar) {
        long clearCallingIdentity;
        try {
            return dmVar.mo14279a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = dmVar.mo14279a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
