package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3252m.C3253a;

/* renamed from: com.google.android.gms.common.internal.a */
public class C3188a extends C3253a {
    /* renamed from: a */
    public static Account m14691a(C3252m mVar) {
        if (mVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return mVar.mo11154a();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Account mo11154a() {
        throw new NoSuchMethodError();
    }

    public boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
