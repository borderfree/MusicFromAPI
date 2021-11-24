package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3135d.C3136a;
import com.google.android.gms.common.util.C3309n;

/* renamed from: com.google.android.gms.common.api.internal.an */
public abstract class C3067an {

    /* renamed from: a */
    private final int f10682a;

    public C3067an(int i) {
        this.f10682a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Status m14167b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C3309n.m15071c() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo10912a(Status status);

    /* renamed from: a */
    public abstract void mo10913a(C3136a<?> aVar);

    /* renamed from: a */
    public abstract void mo10914a(C3153p pVar, boolean z);

    /* renamed from: a */
    public abstract void mo10915a(RuntimeException runtimeException);
}
