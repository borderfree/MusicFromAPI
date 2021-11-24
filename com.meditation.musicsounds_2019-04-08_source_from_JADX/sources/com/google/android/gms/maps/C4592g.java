package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.p133a.C4557e;

/* renamed from: com.google.android.gms.maps.g */
public final class C4592g {

    /* renamed from: a */
    private final C4557e f16577a;

    C4592g(C4557e eVar) {
        this.f16577a = eVar;
    }

    /* renamed from: a */
    public final VisibleRegion mo15129a() {
        try {
            return this.f16577a.mo15086a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
