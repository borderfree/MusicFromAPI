package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3135d.C3136a;
import com.google.android.gms.tasks.C4797g;

/* renamed from: com.google.android.gms.common.api.internal.by */
abstract class C3106by<T> extends C3092bk {

    /* renamed from: a */
    protected final C4797g<T> f10763a;

    public C3106by(int i, C4797g<T> gVar) {
        super(i);
        this.f10763a = gVar;
    }

    /* renamed from: a */
    public void mo10912a(Status status) {
        this.f10763a.mo15932b((Exception) new ApiException(status));
    }

    /* renamed from: a */
    public final void mo10913a(C3136a<?> aVar) {
        try {
            mo10978d(aVar);
        } catch (DeadObjectException e) {
            mo10912a(C3067an.m14167b(e));
            throw e;
        } catch (RemoteException e2) {
            mo10912a(C3067an.m14167b(e2));
        } catch (RuntimeException e3) {
            mo10915a(e3);
        }
    }

    /* renamed from: a */
    public void mo10914a(C3153p pVar, boolean z) {
    }

    /* renamed from: a */
    public void mo10915a(RuntimeException runtimeException) {
        this.f10763a.mo15932b((Exception) runtimeException);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo10978d(C3136a<?> aVar);
}
