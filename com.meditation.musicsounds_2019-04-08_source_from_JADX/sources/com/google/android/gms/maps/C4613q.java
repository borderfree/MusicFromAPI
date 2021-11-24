package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.C4588d.C4589a;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p133a.C4563k;

/* renamed from: com.google.android.gms.maps.q */
final class C4613q implements C4589a {

    /* renamed from: a */
    private final /* synthetic */ C4563k f16623a;

    C4613q(C4612p pVar, C4563k kVar) {
        this.f16623a = kVar;
    }

    /* renamed from: a */
    public final void mo15127a(Location location) {
        try {
            this.f16623a.mo15090a(location);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
