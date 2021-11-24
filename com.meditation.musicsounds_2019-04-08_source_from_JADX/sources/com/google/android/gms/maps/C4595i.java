package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p133a.C4558f;

/* renamed from: com.google.android.gms.maps.i */
public final class C4595i {

    /* renamed from: a */
    private final C4558f f16578a;

    C4595i(C4558f fVar) {
        this.f16578a = fVar;
    }

    /* renamed from: a */
    public final void mo15130a(boolean z) {
        try {
            this.f16578a.mo15087a(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo15131b(boolean z) {
        try {
            this.f16578a.mo15088b(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
