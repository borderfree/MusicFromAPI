package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.p132g.C4194e;

/* renamed from: com.google.android.gms.maps.model.b */
public final class C4603b {

    /* renamed from: a */
    private static C4194e f16618a;

    /* renamed from: a */
    private static C4194e m22865a() {
        return (C4194e) C3266s.m14914a(f16618a, (Object) "IBitmapDescriptorFactory is not initialized");
    }

    /* renamed from: a */
    public static C4602a m22866a(Bitmap bitmap) {
        try {
            return new C4602a(m22865a().mo14036a(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static void m22867a(C4194e eVar) {
        if (f16618a == null) {
            f16618a = (C4194e) C3266s.m14913a(eVar);
        }
    }
}
