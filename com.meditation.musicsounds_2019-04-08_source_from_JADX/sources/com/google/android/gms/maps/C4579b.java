package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p133a.C4545a;

/* renamed from: com.google.android.gms.maps.b */
public final class C4579b {

    /* renamed from: a */
    private static C4545a f16572a;

    /* renamed from: a */
    private static C4545a m22783a() {
        return (C4545a) C3266s.m14914a(f16572a, (Object) "CameraUpdateFactory is not initialized");
    }

    /* renamed from: a */
    public static C4544a m22784a(float f) {
        try {
            return new C4544a(m22783a().mo15043a(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C4544a m22785a(CameraPosition cameraPosition) {
        try {
            return new C4544a(m22783a().mo15044a(cameraPosition));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C4544a m22786a(LatLng latLng) {
        try {
            return new C4544a(m22783a().mo15045a(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C4544a m22787a(LatLng latLng, float f) {
        try {
            return new C4544a(m22783a().mo15046a(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C4544a m22788a(LatLngBounds latLngBounds, int i) {
        try {
            return new C4544a(m22783a().mo15047a(latLngBounds, i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static void m22789a(C4545a aVar) {
        f16572a = (C4545a) C3266s.m14913a(aVar);
    }
}
