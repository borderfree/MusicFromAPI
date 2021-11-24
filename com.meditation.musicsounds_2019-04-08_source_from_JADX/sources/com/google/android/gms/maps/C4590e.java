package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.maps.model.C4603b;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p133a.C4575w;
import com.google.android.gms.maps.p133a.C4578z;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.maps.e */
public final class C4590e {
    @GuardedBy("MapsInitializer.class")

    /* renamed from: a */
    private static boolean f16576a = false;

    /* renamed from: a */
    public static synchronized int m22824a(Context context) {
        synchronized (C4590e.class) {
            C3266s.m14914a(context, (Object) "Context is null");
            if (f16576a) {
                return 0;
            }
            try {
                C4578z a = C4575w.m22771a(context);
                try {
                    C4579b.m22789a(a.mo15048a());
                    C4603b.m22867a(a.mo15051b());
                    f16576a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.errorCode;
            }
        }
    }
}
